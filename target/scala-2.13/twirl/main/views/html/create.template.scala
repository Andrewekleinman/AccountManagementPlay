
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

  """),_display_(/*3.4*/main("create")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.3*/("""<div class="CreateAccount">
  <div>
    <label><b>Username</b></label>
    <input id="username" type="text" v-model = "input.username" placeholder="Enter Username" required>
  </div>
  <div>
    <label><b>Password</b></label>
    <input id="password" type="password" v-model = "input.password" placeholder="Enter Password" required>
  </div>
  <div>
    <label><b>First Name</b></label>
    <input id="firstname" type="text" v-model = "input.firstname" placeholder="Enter First Name"  required>
  </div>
  <div>
    <label><b>Last Name</b></label>
    <input id="lastname" type="text" v-model = "input.lastname" placeholder="Enter Last Name" required>
  </div>
  <div>
    <label><b>Email</b></label>
    <input id="email" type="email" v-model = "input.email" placeholder="Enter Email" required>
  </div>
    <div>
    <label><b>Phone</b></label>
    <input id="phoneNumber" type="text" v-model = "input.phone" placeholder="Enter Phone number" required>
  </div>
  <div>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>


  <button onclick="window.location.href = '/newAccount?name='+document.getElementById('firstname').value
          +' '+document.getElementById('lastname').value
          +'&phone='+document.getElementById('phoneNumber').value+'&email='+document.getElementById('email').value+'&username='+document.getElementById('username').value+'&password='+document.getElementById('password').value">Create Account</button>
  <div class="container" style="background-color:#f1f1f1">
    <button onclick="window.location.href='/'">Cancel</button>
    <a href="#">Forgot password?</a>
  </div>
  </div>
  <script>
          String.prototype.hashCode = function() """),format.raw/*45.50*/("""{"""),format.raw/*45.51*/("""
            """),format.raw/*46.13*/("""var hash = 0;
            if (this.length == 0) """),format.raw/*47.35*/("""{"""),format.raw/*47.36*/("""
              """),format.raw/*48.15*/("""return hash;
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/("""
            """),format.raw/*50.13*/("""for (var i = 0; i < this.length; i++) """),format.raw/*50.51*/("""{"""),format.raw/*50.52*/("""
              """),format.raw/*51.15*/("""var char = this.charCodeAt(i);
              hash = ((hash<<5)-hash)+char;
              hash = hash & hash; // Convert to 32bit integer
            """),format.raw/*54.13*/("""}"""),format.raw/*54.14*/("""
            """),format.raw/*55.13*/("""return hash;
          """),format.raw/*56.11*/("""}"""),format.raw/*56.12*/("""
  """),format.raw/*57.3*/("""</script>
  """)))}),format.raw/*58.4*/("""
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
                  SOURCE: app/views/create.scala.html
                  HASH: d859f7c68d5786f327f9633c97dac36b801f49b9
                  MATRIX: 723->1|819->3|851->10|873->24|912->26|942->30|2743->1803|2772->1804|2814->1818|2891->1867|2920->1868|2964->1884|3018->1910|3047->1911|3089->1925|3155->1963|3184->1964|3228->1980|3408->2132|3437->2133|3479->2147|3531->2171|3560->2172|3591->2176|3635->2190
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|70->45|70->45|71->46|72->47|72->47|73->48|74->49|74->49|75->50|75->50|75->50|76->51|79->54|79->54|80->55|81->56|81->56|82->57|83->58
                  -- GENERATED --
              */
          