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
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:8
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:10
    def newAccount(name:String, phone:String, email:String, username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "newAccount" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("phone", phone)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:11
    def logAttempt(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logAttempt" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:12
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:9
    def log(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "log")
    }
  
    // @LINE:7
    def createOrLog(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
