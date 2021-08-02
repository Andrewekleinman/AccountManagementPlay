// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:20
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:20
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.createOrLog()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.HomeController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create2""", """controllers.HomeController.create2(firstname:String, lastname:String, phone:String, email:String, username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """log""", """controllers.HomeController.log()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """log2""", """controllers.HomeController.log2(username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newAccount""", """controllers.HomeController.newAccount(firstname:String, lastname:String, phone:String, email:String, username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logAttempt""", """controllers.HomeController.logAttempt(username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nothing""", """controllers.HomeController.nothing()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_createOrLog0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_createOrLog0_invoker = createInvoker(
    HomeController_1.createOrLog(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createOrLog",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_create1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_HomeController_create1_invoker = createInvoker(
    HomeController_1.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Nil,
      "GET",
      this.prefix + """create""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_create22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create2")))
  )
  private[this] lazy val controllers_HomeController_create22_invoker = createInvoker(
    HomeController_1.create2(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create2",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """create2""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_log3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("log")))
  )
  private[this] lazy val controllers_HomeController_log3_invoker = createInvoker(
    HomeController_1.log(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "log",
      Nil,
      "GET",
      this.prefix + """log""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_log24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("log2")))
  )
  private[this] lazy val controllers_HomeController_log24_invoker = createInvoker(
    HomeController_1.log2(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "log2",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """log2""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_newAccount5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newAccount")))
  )
  private[this] lazy val controllers_HomeController_newAccount5_invoker = createInvoker(
    HomeController_1.newAccount(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newAccount",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """newAccount""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_logAttempt6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logAttempt")))
  )
  private[this] lazy val controllers_HomeController_logAttempt6_invoker = createInvoker(
    HomeController_1.logAttempt(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logAttempt",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """logAttempt""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_nothing7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nothing")))
  )
  private[this] lazy val controllers_HomeController_nothing7_invoker = createInvoker(
    HomeController_1.nothing(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "nothing",
      Nil,
      "GET",
      this.prefix + """nothing""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_createOrLog0_route(params@_) =>
      call { 
        controllers_HomeController_createOrLog0_invoker.call(HomeController_1.createOrLog())
      }
  
    // @LINE:8
    case controllers_HomeController_create1_route(params@_) =>
      call { 
        controllers_HomeController_create1_invoker.call(HomeController_1.create())
      }
  
    // @LINE:9
    case controllers_HomeController_create22_route(params@_) =>
      call(params.fromQuery[String]("firstname", None), params.fromQuery[String]("lastname", None), params.fromQuery[String]("phone", None), params.fromQuery[String]("email", None), params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (firstname, lastname, phone, email, username, password) =>
        controllers_HomeController_create22_invoker.call(HomeController_1.create2(firstname, lastname, phone, email, username, password))
      }
  
    // @LINE:10
    case controllers_HomeController_log3_route(params@_) =>
      call { 
        controllers_HomeController_log3_invoker.call(HomeController_1.log())
      }
  
    // @LINE:11
    case controllers_HomeController_log24_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (username, password) =>
        controllers_HomeController_log24_invoker.call(HomeController_1.log2(username, password))
      }
  
    // @LINE:12
    case controllers_HomeController_newAccount5_route(params@_) =>
      call(params.fromQuery[String]("firstname", None), params.fromQuery[String]("lastname", None), params.fromQuery[String]("phone", None), params.fromQuery[String]("email", None), params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (firstname, lastname, phone, email, username, password) =>
        controllers_HomeController_newAccount5_invoker.call(HomeController_1.newAccount(firstname, lastname, phone, email, username, password))
      }
  
    // @LINE:13
    case controllers_HomeController_logAttempt6_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (username, password) =>
        controllers_HomeController_logAttempt6_invoker.call(HomeController_1.logAttempt(username, password))
      }
  
    // @LINE:14
    case controllers_HomeController_nothing7_route(params@_) =>
      call { 
        controllers_HomeController_nothing7_invoker.call(HomeController_1.nothing())
      }
  
    // @LINE:20
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
