
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

object commonSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
"""),format.raw/*3.1*/("""<h3>Table of Contents</h3>
<ul>
  <li><a href=""""),_display_(/*5.17*/routes/*5.23*/.HomeController.explore()),format.raw/*5.48*/("""">Play application overview</a>
  <li><a href=""""),_display_(/*6.17*/routes/*6.23*/.HomeController.tutorial()),format.raw/*6.49*/("""">Implementing Hello World</a>
</ul>
<h3>Related Resources</h3>
<ul>
  <li><a href="https://playframework.com/documentation/"""),_display_(/*10.57*/version),format.raw/*10.64*/("""" target="_blank">Play documentation</a></li>
  <li><a href="https://discuss.lightbend.com/c/play/" target="_blank">Forum</a></li>
  <li><a href="//gitter.im/playframework/playframework" target="_blank">Gitter Channel</a></li>
  <li><a href="//stackoverflow.com/questions/tagged/playframework" target="_blank">Stackoverflow</a></li>
  <li><a href="//lightbend.com/how" target="_blank">Professional support</a></li>
</ul>
""")))}),format.raw/*16.2*/("""
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
                  SOURCE: app/views/commonSidebar.scala.html
                  HASH: 4be81cf8e32f17b9ecb8a67039e2a4f08df3ce42
                  MATRIX: 730->1|826->3|854->6|901->45|951->58|979->60|1055->110|1069->116|1114->141|1189->190|1203->196|1249->222|1405->351|1433->358|1891->786
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|30->5|30->5|30->5|31->6|31->6|31->6|35->10|35->10|41->16
                  -- GENERATED --
              */
          