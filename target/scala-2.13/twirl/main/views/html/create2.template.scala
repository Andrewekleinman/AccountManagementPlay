
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

  """),format.raw/*54.3*/("""</script>
  """)))}),format.raw/*55.4*/("""
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
                  HASH: a860329554996b4c057f0f3e6b5c2d3f2847b946
                  MATRIX: 766->1|953->93|985->100|1008->115|1047->117|1077->121|2910->1926|2939->1927|2981->1941|3058->1990|3087->1991|3131->2007|3185->2033|3214->2034|3256->2048|3322->2086|3351->2087|3395->2103|3575->2255|3604->2256|3646->2270|3698->2294|3727->2295|3760->2301|3804->2315
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|66->41|66->41|67->42|68->43|68->43|69->44|70->45|70->45|71->46|71->46|71->46|72->47|75->50|75->50|76->51|77->52|77->52|79->54|80->55
                  -- GENERATED --
              */
          