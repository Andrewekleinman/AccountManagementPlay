
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

object log extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

  """),_display_(/*3.4*/main("log")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<div class="Login">
    <div>
      <label><b>Username</b></label>
      <input id="username" type="text" v-model = "input.username" placeholder="Enter Username" required>
    </div>
    <div>
      <label><b>Password</b></label>
      <input id="password" type="password" v-model = "input.password" placeholder="Enter Password" required>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/log.scala.html
                  HASH: a2ad54f1d44e7222b9b98aea33dc99a4ca522c1c
                  MATRIX: 720->1|816->3|848->10|867->21|906->23|936->27|1861->922
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|52->27
                  -- GENERATED --
              */
          