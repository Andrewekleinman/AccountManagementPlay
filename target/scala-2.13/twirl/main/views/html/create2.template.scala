
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

object create2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(firstname:String,lastname:String,phone:String,email:String,username:String,password:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

  """),_display_(/*3.4*/main("create2")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
  """),format.raw/*4.3*/("""<div class="CreateAccount">
  <div>
    <label><b>Username</b></label>
    <input id="username" type="text" v-model = "input.username" value=""""),_display_(/*7.73*/username),format.raw/*7.81*/("""" placeholder="Enter Username" required>
  </div>
  <div>
    <label><b>Password</b></label>
    <input id="password" type="password" v-model = "input.password" value=""""),_display_(/*11.77*/password),format.raw/*11.85*/("""" placeholder="Enter Password" required>
  </div>
  <div>
    <label><b>First Name</b></label>
    <input id="firstname" type="text" v-model = "input.firstname" value=""""),_display_(/*15.75*/firstname),format.raw/*15.84*/("""" placeholder="Enter First Name" required>
  </div>
  <div>
    <label><b>Last Name</b></label>
    <input id="lastname" type="text" v-model = "input.lastname" value=""""),_display_(/*19.73*/lastname),format.raw/*19.81*/("""" placeholder="Enter Last Name"required>
  </div>
  <div>
    <label><b>Email</b></label>
    <input id="email" type="email" value=""""),_display_(/*23.44*/email),format.raw/*23.49*/("""" placeholder="Enter Email" required>
  </div>
    <div>
    <label><b>Phone</b></label>
    <input id="phoneNumber" type="text" v-model = "input.phone" value=""""),_display_(/*27.73*/phone),format.raw/*27.78*/("""" placeholder="Enter Phone Number" required>
  </div>
  <div>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>


  <button onclick="window.location.href = '/newAccount?firstname='+document.getElementById('firstname').value
          +'&lastname='+document.getElementById('lastname').value
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

  def render(firstname:String,lastname:String,phone:String,email:String,username:String,password:String): play.twirl.api.HtmlFormat.Appendable = apply(firstname,lastname,phone,email,username,password)

  def f:((String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (firstname,lastname,phone,email,username,password) => apply(firstname,lastname,phone,email,username,password)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/create2.scala.html
                  HASH: 44fe827b570827d2acfaf386a55cc7f2d73490fc
                  MATRIX: 766->1|953->93|985->100|1008->115|1047->117|1077->121|1249->267|1277->275|1477->448|1506->456|1706->629|1736->638|1935->810|1964->818|2128->955|2154->960|2346->1125|2372->1130|3255->1985|3284->1986|3326->2000|3403->2049|3432->2050|3476->2066|3530->2092|3559->2093|3601->2107|3667->2145|3696->2146|3740->2162|3920->2314|3949->2315|3991->2329|4043->2353|4072->2354|4103->2358|4147->2372
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|32->7|32->7|36->11|36->11|40->15|40->15|44->19|44->19|48->23|48->23|52->27|52->27|70->45|70->45|71->46|72->47|72->47|73->48|74->49|74->49|75->50|75->50|75->50|76->51|79->54|79->54|80->55|81->56|81->56|82->57|83->58
                  -- GENERATED --
              */
          