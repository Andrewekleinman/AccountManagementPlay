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
    def newAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newAccount",
      """
        function(firstname0,lastname1,phone2,email3,username4,password5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newAccount" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("firstname", firstname0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("lastname", lastname1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("phone", phone2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username4), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password5)])})
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
  
    // @LINE:9
    def create2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create2",
      """
        function(firstname0,lastname1,phone2,email3,username4,password5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create2" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("firstname", firstname0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("lastname", lastname1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("phone", phone2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username4), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password5)])})
        }
      """
    )
  
    // @LINE:14
    def logAttempt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logAttempt",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logAttempt" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:12
    def logSuccess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logSuccess",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logSuccess" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0)])})
        }
      """
    )
  
    // @LINE:10
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
  
    // @LINE:11
    def log2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.log2",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "log2" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:15
    def nothing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.nothing",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nothing"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
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
