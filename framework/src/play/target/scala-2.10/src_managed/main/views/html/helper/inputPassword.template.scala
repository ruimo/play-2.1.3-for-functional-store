
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML input password.
 *
 * Example:
 * {{{
 * @inputPassword(field = myForm("password"), args = 'size -> 10)
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
object inputPassword extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML input password.
 *
 * Example:
 * {{{
 * @inputPassword(field = myForm("password"), args = 'size -> 10)
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
    <input type="password" id=""""),_display_(Seq[Any](/*16.33*/id)),format.raw/*16.35*/("""" name=""""),_display_(Seq[Any](/*16.44*/name)),format.raw/*16.48*/("""" """),_display_(Seq[Any](/*16.51*/toHtmlArgs(htmlArgs))),format.raw/*16.71*/(""">
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
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/inputPassword.scala.html
                    HASH: ad8dfab6d6eccbefb7f329b0b451a39045103450
                    MATRIX: 978->256|1168->367|1206->370|1236->391|1307->424|1376->457|1400->459|1445->468|1471->472|1510->475|1552->495|1586->498
                    LINES: 35->13|38->13|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|41->16|42->17
                    -- GENERATED --
                */
            