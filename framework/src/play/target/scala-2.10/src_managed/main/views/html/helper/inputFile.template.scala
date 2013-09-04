
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML input file.
 *
 * Example:
 * {{{
 * @inputFile(field = myForm("name"), args = 'size -> 10)
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
object inputFile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML input file.
 *
 * Example:
 * {{{
 * @inputFile(field = myForm("name"), args = 'size -> 10)
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
    def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*13.113*/("""

"""),_display_(Seq[Any](/*15.2*/input(field, args:_*)/*15.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*15.56*/("""
    <input type="file" id=""""),_display_(Seq[Any](/*16.29*/id)),format.raw/*16.31*/("""" name=""""),_display_(Seq[Any](/*16.40*/name)),format.raw/*16.44*/("""" """),_display_(Seq[Any](/*16.47*/toHtmlArgs(htmlArgs))),format.raw/*16.67*/(""">
""")))})),format.raw/*17.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:00 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/inputFile.scala.html
                    HASH: e89c383a4f1cd321339a65712a60b28738d83571
                    MATRIX: 950->244|1140->355|1178->358|1208->379|1279->412|1344->441|1368->443|1413->452|1439->456|1478->459|1520->479|1554->482
                    LINES: 35->13|38->13|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|41->16|42->17
                    -- GENERATED --
                */
            