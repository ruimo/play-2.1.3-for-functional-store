
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML input checkbox.
 *
 * Example:
 * {{{
 * @checkbox(field = myForm("done"))
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra HTML attributes ('''id''' and '''label''' are 2 special arguments).
 * @param handler The field constructor.
 */
object checkbox extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML input checkbox.
 *
 * Example:
 * {{{
 * @checkbox(field = myForm("done"))
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra HTML attributes ('''id''' and '''label''' are 2 special arguments).
 * @param handler The field constructor.
 */
    def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {
def /*15.2*/boxValue/*15.10*/ = {{ args.toMap.get('value).getOrElse("true") }};
Seq[Any](format.raw/*13.113*/("""

"""),format.raw/*15.58*/("""

"""),_display_(Seq[Any](/*17.2*/input(field, args:_*)/*17.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*17.56*/("""
    <input type="checkbox" id=""""),_display_(Seq[Any](/*18.33*/id)),format.raw/*18.35*/("""" name=""""),_display_(Seq[Any](/*18.44*/name)),format.raw/*18.48*/("""" value=""""),_display_(Seq[Any](/*18.58*/boxValue)),format.raw/*18.66*/("""" """),_display_(Seq[Any](/*18.69*/(if(value == Some(boxValue)) "checked" else ""))),format.raw/*18.116*/(""" """),_display_(Seq[Any](/*18.118*/toHtmlArgs(htmlArgs.filterKeys(_ != 'value)))),format.raw/*18.162*/(""">
    <span>"""),_display_(Seq[Any](/*19.12*/args/*19.16*/.toMap.get('_text))),format.raw/*19.34*/("""</span>
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 19:14:13 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-dash/framework/src/play/src/main/scala/views/helper/checkbox.scala.html
                    HASH: f5783a85b1f297d88a0618dd497bd8b3670bb232
                    MATRIX: 1027->283|1199->397|1216->405|1296->394|1326->453|1364->456|1394->477|1465->510|1534->543|1558->545|1603->554|1629->558|1675->568|1705->576|1744->579|1814->626|1853->628|1920->672|1969->685|1982->689|2022->707|2062->716
                    LINES: 35->13|37->15|37->15|38->13|40->15|42->17|42->17|42->17|43->18|43->18|43->18|43->18|43->18|43->18|43->18|43->18|43->18|43->18|44->19|44->19|44->19|45->20
                    -- GENERATED --
                */
            