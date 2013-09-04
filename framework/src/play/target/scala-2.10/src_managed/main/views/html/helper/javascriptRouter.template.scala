
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generates a Javascript object that lets you refer 
 * to your application's routes in Javascript code
 *
 * Example:
 * {{{
 * @javascriptRouter("jsRoutes")(
 *   routes.javascript.Users.list,
 *   routes.javascript.Application.index
 * )
 * }}}
 *
 * Now you can access your routes in JavaScript without hardcoded URL's, e.g.:
 * {{{
 * jsRoutes.controllers.Users.list().ajax({success: /* ... */, error: /* ... */})
 * }}}
 * Each action in the generated object has the following keys:
 * * *ajax*: lets you perform a jQuery ajax call to that actiomn
 * * *method*: HTTP method
 * * *url*
 * 
 * @param name The javascript object name.
 * @param routes Set of routes to include in this javascript router.
 */
object javascriptRouter extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Array[play.core.Router.JavascriptReverseRoute],play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**
 * Generates a Javascript object that lets you refer 
 * to your application's routes in Javascript code
 *
 * Example:
 * {{{
 * @javascriptRouter("jsRoutes")(
 *   routes.javascript.Users.list,
 *   routes.javascript.Application.index
 * )
 * }}}
 *
 * Now you can access your routes in JavaScript without hardcoded URL's, e.g.:
 * {{{
 * jsRoutes.controllers.Users.list().ajax({success: /* ... */, error: /* ... */})
 * }}}
 * Each action in the generated object has the following keys:
 * * *ajax*: lets you perform a jQuery ajax call to that actiomn
 * * *method*: HTTP method
 * * *url*
 * 
 * @param name The javascript object name.
 * @param routes Set of routes to include in this javascript router.
 */
    def apply/*25.2*/(name:String = "Router")(routes:play.core.Router.JavascriptReverseRoute*)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*25.121*/("""

<script type="text/javascript">
    """),_display_(Seq[Any](/*28.6*/Html(play.api.Routes.javascriptRouter(name)(routes:_*)))),format.raw/*28.61*/("""
</script>
"""))}
    }
    
    def render(name:String,routes:Array[play.core.Router.JavascriptReverseRoute],request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(name)(routes:_*)(request)
    
    def f:((String) => (Array[play.core.Router.JavascriptReverseRoute]) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (name) => (routes) => (request) => apply(name)(routes:_*)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:00 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/javascriptRouter.scala.html
                    HASH: 7adef82b94712efc6c281aae5385f0c7998c9a52
                    MATRIX: 1897->718|2095->837|2169->876|2246->931
                    LINES: 59->25|62->25|65->28|65->28
                    -- GENERATED --
                */
            