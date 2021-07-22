
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

  """),_display_(/*3.4*/main("createorlog")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<div>
      Create Account or Log In
      <p></p>
      <button onclick="window.location.href = '/CreateAccount'">Create Account</button>
      <button onclick="window.location.href = '/LogIn'">Log In</button>
    </div>
  """)))}),format.raw/*10.4*/("""
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
                  HASH: 024395d651f1c4b577039185d8b0eceddbb717b0
                  MATRIX: 722->1|818->3|850->10|871->23|910->25|942->31|1203->262
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|35->10
                  -- GENERATED --
              */
