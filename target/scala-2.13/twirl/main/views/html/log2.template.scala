
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
  """),format.raw/*4.3*/("""<div class="Login">
    <div>
      <label><b>Username</b></label>
      <input id="username" type="text" v-model = "input.username" value=""""),_display_(/*7.75*/username),format.raw/*7.83*/("""" placeholder="Enter Username" required>
    </div>
    <div>
      <label><b>Password</b></label>
      <input id="password" type="password" v-model = "input.password" value=""""),_display_(/*11.79*/password),format.raw/*11.87*/("""" placeholder="Enter Password" required>
    </div>
    <div>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>
    <div>
      <button onclick="window.location.href = '/logAttempt?username='+document.getElementById('username').value+'&password='+document.getElementById('password').value">Log In</button>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button onclick="window.location.href='/'">Cancel</button>
      <a href="#">Forgot password?</a>
    </div>
  </div>
  """)))}),format.raw/*27.4*/("""
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
                  HASH: 33b170d5a56cef2f26b3c5d55858b2da49efd35f
                  MATRIX: 735->1|863->34|895->41|914->52|953->54|983->58|1153->202|1181->210|1389->391|1418->399|2038->989
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|32->7|32->7|36->11|36->11|52->27
                  -- GENERATED --
              */
          