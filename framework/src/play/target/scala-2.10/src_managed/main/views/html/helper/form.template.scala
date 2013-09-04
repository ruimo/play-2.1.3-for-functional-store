
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML form.
 *
 * Example:
 * {{{
 * @form(action = routes.Users.submit, args = 'class -> "myForm") {
 *   ...
 * }
 * }}}
 *
 * @param action The submit action.
 * @param args Set of extra HTML attributes.
 * @param body The form body.
 */
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.api.mvc.Call,Array[scala.Tuple2[Symbol, String]],Html,play.api.templates.Html] {

    /**
 * Generate an HTML form.
 *
 * Example:
 * {{{
 * @form(action = routes.Users.submit, args = 'class -> "myForm") {
 *   ...
 * }
 * }}}
 *
 * @param action The submit action.
 * @param args Set of extra HTML attributes.
 * @param body The form body.
 */
    def apply/*15.2*/(action: play.api.mvc.Call, args: (Symbol,String)*)(body: => Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*15.68*/(""" 

<form action=""""),_display_(Seq[Any](/*17.16*/action/*17.22*/.url)),format.raw/*17.26*/("""" method=""""),_display_(Seq[Any](/*17.37*/action/*17.43*/.method)),format.raw/*17.50*/("""" """),_display_(Seq[Any](/*17.53*/toHtmlArgs(args.toMap))),format.raw/*17.75*/(""">
    """),_display_(Seq[Any](/*18.6*/body)),format.raw/*18.10*/("""
</form>
"""))}
    }
    
    def render(action:play.api.mvc.Call,args:Array[scala.Tuple2[Symbol, String]],body:Html): play.api.templates.Html = apply(action,args:_*)(body)
    
    def f:((play.api.mvc.Call,Array[scala.Tuple2[Symbol, String]]) => ( => Html) => play.api.templates.Html) = (action,args) => (body) => apply(action,args:_*)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:54:59 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/form.scala.html
                    HASH: ce2a89550b5b6c4ce329220182f4efab1bea8424
                    MATRIX: 947->260|1091->326|1145->344|1160->350|1186->354|1233->365|1248->371|1277->378|1316->381|1360->403|1402->410|1428->414
                    LINES: 39->15|42->15|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|45->18|45->18
                    -- GENERATED --
                */
            