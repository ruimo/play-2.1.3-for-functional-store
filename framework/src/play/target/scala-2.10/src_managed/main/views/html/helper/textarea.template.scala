
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML textarea.
 *
 * Example:
 * {{{
 * @textarea(field = myForm("address"), args = 'rows -> 3, 'cols -> 50)
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
object textarea extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML textarea.
 *
 * Example:
 * {{{
 * @textarea(field = myForm("address"), args = 'rows -> 3, 'cols -> 50)
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
    <textarea id=""""),_display_(Seq[Any](/*16.20*/id)),format.raw/*16.22*/("""" name=""""),_display_(Seq[Any](/*16.31*/name)),format.raw/*16.35*/("""" """),_display_(Seq[Any](/*16.38*/toHtmlArgs(htmlArgs))),format.raw/*16.58*/(""">"""),_display_(Seq[Any](/*16.60*/value)),format.raw/*16.65*/("""</textarea>
""")))})),format.raw/*17.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:54:59 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/textarea.scala.html
                    HASH: 8945765f78ce32763c658bbbbb326694aaa57a2f
                    MATRIX: 973->256|1163->367|1201->370|1231->391|1302->424|1358->444|1382->446|1427->455|1453->459|1492->462|1534->482|1572->484|1599->489|1643->502
                    LINES: 35->13|38->13|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|41->16|41->16|41->16|42->17
                    -- GENERATED --
                */
            