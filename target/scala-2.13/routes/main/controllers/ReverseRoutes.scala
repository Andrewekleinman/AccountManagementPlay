// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def newAccount(firstname:String, lastname:String, phone:String, email:String, username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "newAccount" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("firstname", firstname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("lastname", lastname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("phone", phone)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:8
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:9
    def create2(firstname:String, lastname:String, phone:String, email:String, username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("firstname", firstname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("lastname", lastname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("phone", phone)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:14
    def logAttempt(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logAttempt" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:12
    def logSuccess(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logSuccess" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)))))
    }
  
    // @LINE:10
    def log(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "log")
    }
  
    // @LINE:7
    def createOrLog(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:11
    def log2(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "log2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:15
    def nothing(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "nothing")
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
