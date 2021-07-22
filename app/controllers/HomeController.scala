package controllers

import javax.inject._
import play.api._
import play.api.mvc._

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

         // Ok(views.html.log())

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
    try {
      val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
      if(username != null && phone != null && email != null && password != null && name != null) {
        //if(phoneFormat(phone)){
        //if(emailFormat(email)){
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
          Ok(views.html.log())
        }
        else println("That username already exists")
      }
      else println("Please fill in all fields")
    } finally {
      conn.close()
    }

    Ok(views.html.create())
  }

  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }

  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

}
