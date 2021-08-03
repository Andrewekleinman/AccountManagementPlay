
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

object loggedIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

  """),_display_(/*3.4*/main("log")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<br>
    <center>
  you are logged in as """),_display_(/*6.25*/username),format.raw/*6.33*/("""
    """),format.raw/*7.5*/("""</center>
  """)))}),format.raw/*8.4*/("""
"""))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/loggedIn.scala.html
                  HASH: 8d9aeb2c3575405abe30a8fc5cf96aebeea1bab1
                  MATRIX: 732->1|845->19|877->26|896->37|935->39|967->45|1037->89|1065->97|1097->103|1140->117
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|31->6|31->6|32->7|33->8
                  -- GENERATED --
              */
          