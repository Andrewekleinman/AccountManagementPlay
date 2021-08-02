
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

object createorlog extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

  """),_display_(/*3.4*/main("createorlog")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<center>
      <br>
    <div>
      Create Account or Log In
      <p></p>
      <button onclick="window.location.href = '/create'">Create Account</button>
      <button onclick="window.location.href = '/log'">Log In</button>
    </div>
    </center>
  """)))}),format.raw/*13.4*/("""
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
                  SOURCE: app/views/createorlog.scala.html
                  HASH: bfe1be1332ca0f04a2110f076ac83b854196bf73
                  MATRIX: 728->1|824->3|856->10|883->29|922->31|954->37|1247->300
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|38->13
                  -- GENERATED --
              */
          