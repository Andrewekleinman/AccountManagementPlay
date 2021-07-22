package controllers

import com.google.i18n.phonenumbers.PhoneNumberUtil
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.routing.sird.?

import java.sql.{Connection, DriverManager, ResultSet}
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

  def log() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.log())
  }

  def logAttempt(username: String, password:String)= Action { implicit request: Request[AnyContent] =>
    val con_st = "jdbc:postgresql://localhost:5433/users?user=postgres&password=XSW@3edc"
    val conn = DriverManager.getConnection(con_st)
    var valid = false;
    try {
      val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
        var rs = stm.executeQuery("SELECT * from users")
        while (rs.next) {
          if (rs.getString("username") == username) {
            if(rs.getString("password") == password){
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
      Ok(views.html.log())
    }
  }

  def newAccount(name:String,phone:String,email:String,username:String,password:String) = Action { implicit request: Request[AnyContent] =>
    val con_st = "jdbc:postgresql://localhost:5433/users?user=postgres&password=XSW@3edc"
    val conn = DriverManager.getConnection(con_st)
    var unique = true;
    var created = false;
    try {
      val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
      if (username != "" && phone != "" && email != "" && password != "" && name != "") {
        //if(phoneFormat(phone)){
        if (checkEmail(email)) {
          var rs = stm.executeQuery("SELECT * from users")

          while (rs.next) {
            if (rs.getString("username") == username) {
              unique = false
            }
          }
          if (unique) {
            stm.execute("insert into users (name, phoneNumber, email, username, password) values ('" + name + "', '" + phone + "', '" + email + "', '" + username + "', '" + password + "');")
            rs = stm.executeQuery("SELECT * from users")

            while (rs.next) {
              println(rs.getString("name") + ", " + rs.getString("phoneNumber") + ", " + rs.getString("email") + ", " + rs.getString("username") + ", " + rs.getString("password"))
            }
            created = true;
          }
          else println("That username already exists")
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
      Ok(views.html.create())
  }

  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }

  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }
  private val emailRegex = """^[a-zA-Z0-9\.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""".r
  def checkEmail(e: String): Boolean = e match{
    case null                                           => false
    case e if e.trim.isEmpty                            => false
    case e if emailRegex.findFirstMatchIn(e).isDefined  => true
    case _                                              => false
  }
  def checkPhone(phone: String):Boolean = {
    var phoneUtil = PhoneNumberUtil.getInstance()
    var numberProto = phoneUtil.parse("phone_number", "")
    phoneUtil.isValidNumber(numberProto) == true
  }


}
