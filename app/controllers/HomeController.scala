package controllers

import com.google.i18n.phonenumbers.PhoneNumberUtil
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.routing.sird.?
import java.security.MessageDigest
import java.util
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import org.apache.commons.codec.binary.Base64

import java.sql.{Connection, DriverManager, ResultSet}
import javax.crypto.Cipher
import scala.language.postfixOps


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  object pgconn extends App {
    println("Postgres connector")
  }
  def nothing()= Action { implicit request: Request[AnyContent] =>
    Ok
  }
  def createOrLog() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.createorlog())
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.create())
  }
  def create2(firstname:String,lastname:String,phone:String,email:String,username:String,password:String) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.create2(firstname,lastname,phone,email,username,password))
  }

  def log() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.log())
  }
  def log2(username:String,password:String) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.log2(username,password))
  }

  def logAttempt(username: String, password:String)= Action { implicit request: Request[AnyContent] =>
    val con_st = "jdbc:postgresql://localhost:5433/users?user=postgres&password=XSW@3edc"
    val conn = DriverManager.getConnection(con_st)
    var valid = false;
    try {
      val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
        var rs = stm.executeQuery("SELECT * from users")
        def hashpass = Encryption.encrypt("key",password)
        while (rs.next) {
          if (rs.getString("username") == username) {
            if(rs.getString("password") == hashpass){
              valid = true;
            }
          }
        }
    } finally {
      conn.close()
    }
    if(valid == true){
      Ok(views.html.loggedIn(username))
    }
    else {
      println("invalid username or password")
      Redirect(routes.HomeController.log2(username,password))
        .flashing("error" -> "Invalid username/password.")
    }
  }

  def newAccount(firstname:String,lastname:String,phone:String,email:String,username:String,password:String) = Action { implicit request: Request[AnyContent] =>
    val con_st = "jdbc:postgresql://localhost:5433/users?user=postgres&password=XSW@3edc"
    val conn = DriverManager.getConnection(con_st)
    var unique = true;
    var created = false;
    try {
      val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
      if (username != "" && phone != "" && email != "" && password != "" && firstname != "" && lastname != "") {
        //if(phoneFormat(phone)){
        if (checkEmail(email)) {
          if(checkPhone(phone)) {
            var rs = stm.executeQuery("SELECT * from users")

            while (rs.next) {
              if (rs.getString("username") == username) {
                unique = false
              }
            }
            if (unique) {
              def hashpass = Encryption.encrypt("key",password)
              stm.execute("insert into users (firstname,lastname, phoneNumber, email, username, password) values ('" + firstname + "', '" + lastname + "', '" + phone + "', '" + email + "', '" + username + "', '" + hashpass + "');")
              rs = stm.executeQuery("SELECT * from users")

              while (rs.next) {
                println(rs.getString("firstname")+ ", " + rs.getString("lastname") + ", " + rs.getString("phoneNumber") + ", " + rs.getString("email") + ", " + rs.getString("username") + ", " + rs.getString("password"))
              }
              created = true;
            }
            else println("That username already exists")
          }
          else println("invalid phone number")
        }
        else println("Invalid email format")
      }
      else println("Please fill in all fields")
    } finally {
      conn.close()
    }
    if(created){
      Ok(views.html.loggedIn(username))
    }
    else
      Redirect(routes.HomeController.create2(firstname,lastname,phone,email,username,password))
        .flashing("error" -> "Invalid username/password.")
  }


  private val emailRegex = """^[a-zA-Z0-9\.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""".r
  def checkEmail(e: String): Boolean = e match{
    case null                                           => false
    case e if e.trim.isEmpty                            => false
    case e if emailRegex.findFirstMatchIn(e).isDefined  => true
    case _                                              => false
  }
  def checkPhone(phone: String):Boolean = {
    if(phone.size>=6 && phone.size <= 18 && phone.forall(_.isDigit))
      return true
    return false
  }
  object Encryption {
    def encrypt(key: String, value: String): String = {
      val cipher: Cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
      cipher.init(Cipher.ENCRYPT_MODE, keyToSpec(key))
      Base64.encodeBase64String(cipher.doFinal(value.getBytes("UTF-8")))
    }

    def decrypt(key: String, encryptedValue: String): String = {
      val cipher: Cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING")
      cipher.init(Cipher.DECRYPT_MODE, keyToSpec(key))
      new String(cipher.doFinal(Base64.decodeBase64(encryptedValue)))
    }

    def keyToSpec(key: String): SecretKeySpec = {
      var keyBytes: Array[Byte] = (SALT + key).getBytes("UTF-8")
      val sha: MessageDigest = MessageDigest.getInstance("SHA-1")
      keyBytes = sha.digest(keyBytes)
      keyBytes = util.Arrays.copyOf(keyBytes, 16)
      new SecretKeySpec(keyBytes, "AES")
    }

    private val SALT: String =
      "jMhKlOuJnM34G6NHkqo9V010GhLAqOpF0BePojHgh1HgNg8^72k"
  }
}
