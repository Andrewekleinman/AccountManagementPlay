
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
  """),format.raw/*4.3*/("""you are logged in as """),_display_(/*4.25*/username),format.raw/*4.33*/("""
  """)))}),format.raw/*5.4*/("""
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
                  HASH: 9838b75b8948244b9757e1d39b0854bb086cbfec
                  MATRIX: 732->1|845->19|877->26|896->37|935->39|965->43|1013->65|1041->73|1075->78
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5
                  -- GENERATED --
              */
          