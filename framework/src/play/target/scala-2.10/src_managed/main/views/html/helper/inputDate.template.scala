
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML5 input date.
 *
 * Example:
 * {{{
 * @inputDate(field = myForm("releaseDate"), args = 'size -> 10)
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
object inputDate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML5 input date.
 *
 * Example:
 * {{{
 * @inputDate(field = myForm("releaseDate"), args = 'size -> 10)
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
    <input type="date" id=""""),_display_(Seq[Any](/*16.29*/id)),format.raw/*16.31*/("""" name=""""),_display_(Seq[Any](/*16.40*/name)),format.raw/*16.44*/("""" value=""""),_display_(Seq[Any](/*16.54*/value)),format.raw/*16.59*/("""" """),_display_(Seq[Any](/*16.62*/toHtmlArgs(htmlArgs))),format.raw/*16.82*/(""">
""")))})))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:54:59 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/inputDate.scala.html
                    HASH: 469c89a76289a3ee302f6f6172d52b4e0b7a2f91
                    MATRIX: 966->252|1156->363|1194->366|1224->387|1295->420|1360->449|1384->451|1429->460|1455->464|1501->474|1528->479|1567->482|1609->502
                    LINES: 35->13|38->13|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|41->16|41->16|41->16
                    -- GENERATED --
                */
            