
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Prepare a generic HTML input.
 */
object input extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],_root_.scala.Function4[String, String, Option[String], Map[Symbol, Any], Html],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Prepare a generic HTML input.
 */
    def apply/*4.2*/(field: play.api.data.Field, args: (Symbol, Any)* )(inputDef: (String, String, Option[String], Map[Symbol,Any]) => Html)(implicit handler: FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {
def /*6.2*/id/*6.4*/ = {{ args.toMap.get('id).map(_.toString).getOrElse(field.id) }};
Seq[Any](format.raw/*4.184*/("""

"""),format.raw/*6.67*/("""

"""),_display_(Seq[Any](/*8.2*/handler(
    FieldElements(
        id,
        field,
        inputDef(id, field.name, field.value, args.filter(arg => !arg._1.name.startsWith("_") && arg._1 != 'id).toMap),
        args.toMap,
        lang
    )
))),format.raw/*16.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],inputDef:_root_.scala.Function4[String, String, Option[String], Map[Symbol, Any], Html],handler:FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(inputDef)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (_root_.scala.Function4[String, String, Option[String], Map[Symbol, Any], Html]) => (FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (inputDef) => (handler,lang) => apply(field,args:_*)(inputDef)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:00 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/input.scala.html
                    HASH: b9ede6334fc64256d52d05fb43f5d429e029fb0d
                    MATRIX: 620->42|862->227|871->229|965->224|994->292|1031->295|1267->510
                    LINES: 17->4|19->6|19->6|20->4|22->6|24->8|32->16
                    -- GENERATED --
                */
            