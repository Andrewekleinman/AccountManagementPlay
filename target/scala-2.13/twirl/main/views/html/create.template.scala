
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
  """),format.raw/*4.3*/("""<center>
    <br>
  <div class="CreateAccount">
  <div>
    <label><b>Username</b></label>
    <input id="username" type="text" v-model = "input.username" placeholder="Username" size="21" required>
  </div>
  <div>
    <label><b>Password</b></label>
    <input id="password" type="password" v-model = "input.password" placeholder="Password" size="21" required>
  </div>
  <div>
    <label><b>First Name</b></label>
    <input id="firstname" type="text" v-model = "input.firstname" placeholder="First Name"  size="20" required>
  </div>
  <div>
    <label><b>Last Name</b></label>
    <input id="lastname" type="text" v-model = "input.lastname" placeholder="Last Name" required>
  </div>
  <div>
    <label><b>Email</b></label>
    <input id="email" type="email" v-model = "input.email" placeholder="Email" size="25" required>
  </div>
    <div>
    <label><b>Phone</b></label>
    <input id="phoneNumber" type="text" v-model = "input.phone" placeholder="Phone Number (Numeric)" size="24" required>
  </div>
  <button onclick="window.location.href = '/newAccount?firstname='+document.getElementById('firstname').value
          +'&lastname='+document.getElementById('lastname').value
          +'&phone='+document.getElementById('phoneNumber').value+'&email='+document.getElementById('email').value+'&username='+document.getElementById('username').value+'&password='+document.getElementById('password').value">Create Account</button>
  <div class="container" style="background-color:#f1f1f1">
    <button onclick="window.location.href='/'">Cancel</button>
  </div>
  </div>
  </center>
  <script>
          var encryptor = new StandardPBEStringEncryptor();
          String.prototype.hashCode = function() """),format.raw/*41.50*/("""{"""),format.raw/*41.51*/("""
            """),format.raw/*42.13*/("""var hash = 0;
            if (this.length == 0) """),format.raw/*43.35*/("""{"""),format.raw/*43.36*/("""
              """),format.raw/*44.15*/("""return hash;
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""for (var i = 0; i < this.length; i++) """),format.raw/*46.51*/("""{"""),format.raw/*46.52*/("""
              """),format.raw/*47.15*/("""var char = this.charCodeAt(i);
              hash = ((hash<<5)-hash)+char;
              hash = hash & hash; // Convert to 32bit integer
            """),format.raw/*50.13*/("""}"""),format.raw/*50.14*/("""
            """),format.raw/*51.13*/("""return hash;
          """),format.raw/*52.11*/("""}"""),format.raw/*52.12*/("""
  """),format.raw/*53.3*/("""</script>
  """)))}),format.raw/*54.4*/("""
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
                  HASH: b417b2c7db50770dc9a6fa6b7e1c765c389a5e32
                  MATRIX: 723->1|819->3|851->10|873->24|912->26|942->30|2712->1772|2741->1773|2783->1787|2860->1836|2889->1837|2933->1853|2987->1879|3016->1880|3058->1894|3124->1932|3153->1933|3197->1949|3377->2101|3406->2102|3448->2116|3500->2140|3529->2141|3560->2145|3604->2159
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|66->41|66->41|67->42|68->43|68->43|69->44|70->45|70->45|71->46|71->46|71->46|72->47|75->50|75->50|76->51|77->52|77->52|78->53|79->54
                  -- GENERATED --
              */
          