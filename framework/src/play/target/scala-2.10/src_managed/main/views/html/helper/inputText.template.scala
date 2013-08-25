
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML input text.
 *
 * Example:
 * {{{
 * @inputText(field = myForm("name"), args = 'size -> 10, 'placeholder -> "Your name")
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
object inputText extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML input text.
 *
 * Example:
 * {{{
 * @inputText(field = myForm("name"), args = 'size -> 10, 'placeholder -> "Your name")
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
    def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {
def /*15.2*/inputType/*15.11*/ = {{ args.toMap.get('type).map(_.toString).getOrElse("text") }};
Seq[Any](format.raw/*13.113*/("""

"""),format.raw/*15.74*/("""

"""),_display_(Seq[Any](/*17.2*/input(field, args.filter(_._1 != 'type):_*)/*17.45*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*17.78*/("""
    <input type=""""),_display_(Seq[Any](/*18.19*/inputType)),format.raw/*18.28*/("""" id=""""),_display_(Seq[Any](/*18.35*/id)),format.raw/*18.37*/("""" name=""""),_display_(Seq[Any](/*18.46*/name)),format.raw/*18.50*/("""" value=""""),_display_(Seq[Any](/*18.60*/value)),format.raw/*18.65*/("""" """),_display_(Seq[Any](/*18.68*/toHtmlArgs(htmlArgs))),format.raw/*18.88*/(""">
""")))})),format.raw/*19.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 19:14:13 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-dash/framework/src/play/src/main/scala/views/helper/inputText.scala.html
                    HASH: cd8dafbe6bda1db7dc48c03e292eaba20e8e6c42
                    MATRIX: 1008->273|1180->387|1198->396|1293->384|1323->459|1361->462|1413->505|1484->538|1539->557|1570->566|1613->573|1637->575|1682->584|1708->588|1754->598|1781->603|1820->606|1862->626|1896->629
                    LINES: 35->13|37->15|37->15|38->13|40->15|42->17|42->17|42->17|43->18|43->18|43->18|43->18|43->18|43->18|43->18|43->18|43->18|43->18|44->19
                    -- GENERATED --
                */
            