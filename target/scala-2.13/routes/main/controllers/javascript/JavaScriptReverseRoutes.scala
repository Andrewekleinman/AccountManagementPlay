// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:8
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
        }
      """
    )
  
    // @LINE:10
    def newAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newAccount",
      """
        function(name0,phone1,email2,username3,password4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newAccount" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("phone", phone1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password4)])})
        }
      """
    )
  
    // @LINE:11
    def logAttempt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logAttempt",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logAttempt" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:12
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
    // @LINE:9
    def log: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.log",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "log"})
        }
      """
    )
  
    // @LINE:7
    def createOrLog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createOrLog",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
