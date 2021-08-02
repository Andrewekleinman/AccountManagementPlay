
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object log2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username:String,password:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

  """),_display_(/*3.4*/main("log")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<center>
    <br>
  <div class="Login">
    <div>
      <label><b>Username</b></label>
      <input id="username" type="text" v-model = "input.username" value=""""),_display_(/*9.75*/username),format.raw/*9.83*/("""" placeholder="Enter Username" required>
    </div>
    <div>
      <label><b>Password</b></label>
      <input id="password" type="password" v-model = "input.password" value=""""),_display_(/*13.79*/password),format.raw/*13.87*/("""" placeholder="Enter Password" required>
    </div>
    <div>
      <button onclick="window.location.href = '/logAttempt?username='+document.getElementById('username').value+'&password='+document.getElementById('password').value">Log In</button>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button onclick="window.location.href='/'">Cancel</button>
    </div>
  </div>
  </center>
  """)))}),format.raw/*24.4*/("""
"""))
      }
    }
  }

  def render(username:String,password:String): play.twirl.api.HtmlFormat.Appendable = apply(username,password)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (username,password) => apply(username,password)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/log2.scala.html
                  HASH: 3589dc78e87e358c4c6edc3022704dc675b92a5f
                  MATRIX: 735->1|863->34|895->41|914->52|953->54|983->58|1175->224|1203->232|1411->413|1440->421|1900->851
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|34->9|34->9|38->13|38->13|49->24
                  -- GENERATED --
              */
          