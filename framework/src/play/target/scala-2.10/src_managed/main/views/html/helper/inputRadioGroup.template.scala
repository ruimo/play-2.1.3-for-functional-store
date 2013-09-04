
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML radio group
 *
 * Example:
 * {{{
 * @inputRadioGroup(
 *           contactForm("gender"),
 *           options = Seq("M"->"Male","F"->"Female")
 *           '_label -> "Gender",
 *           '_error -> contactForm("gender").error.map(_.withMessage("select gender")))
 *
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra HTML attributes.
 * @param handler The field constructor.
 */
object inputRadioGroup extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML radio group
 *
 * Example:
 * {{{
 * @inputRadioGroup(
 *           contactForm("gender"),
 *           options = Seq("M"->"Male","F"->"Female")
 *           '_label -> "Gender",
 *           '_error -> contactForm("gender").error.map(_.withMessage("select gender")))
 *
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra HTML attributes.
 * @param handler The field constructor.
 */
    def apply/*18.2*/(field: play.api.data.Field, options: Seq[(String,String)], args: (Symbol,Any)*)(implicit handler: FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*18.144*/("""

"""),_display_(Seq[Any](/*20.2*/input(field, args:_*)/*20.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*20.56*/("""
  <span class="buttonset" id=""""),_display_(Seq[Any](/*21.32*/id)),format.raw/*21.34*/("""">
    """),_display_(Seq[Any](/*22.6*/options/*22.13*/.map/*22.17*/ { v =>_display_(Seq[Any](format.raw/*22.24*/("""
      <input type="radio" id=""""),_display_(Seq[Any](/*23.32*/(id))),format.raw/*23.36*/("""_"""),_display_(Seq[Any](/*23.38*/v/*23.39*/._1)),format.raw/*23.42*/("""" name=""""),_display_(Seq[Any](/*23.51*/name)),format.raw/*23.55*/("""" value=""""),_display_(Seq[Any](/*23.65*/v/*23.66*/._1)),format.raw/*23.69*/("""" """),_display_(Seq[Any](/*23.72*/(if(value == Some(v._1)) "checked" else ""))),format.raw/*23.115*/(""" """),_display_(Seq[Any](/*23.117*/toHtmlArgs(htmlArgs))),format.raw/*23.137*/(""">
      <label for=""""),_display_(Seq[Any](/*24.20*/(id))),format.raw/*24.24*/("""_"""),_display_(Seq[Any](/*24.26*/v/*24.27*/._1)),format.raw/*24.30*/("""">"""),_display_(Seq[Any](/*24.33*/v/*24.34*/._2)),format.raw/*24.37*/("""</label>
    """)))})),format.raw/*25.6*/("""
  </span>
""")))})),format.raw/*27.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,options:Seq[scala.Tuple2[String, String]],args:Array[scala.Tuple2[Symbol, Any]],handler:FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,options,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]]) => (FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,options,args) => (handler,lang) => apply(field,options,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:54:59 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/inputRadioGroup.scala.html
                    HASH: 89954a65d863b126750dd52bdae5759dc585fc6d
                    MATRIX: 1358->428|1579->570|1617->573|1647->594|1718->627|1786->659|1810->661|1853->669|1869->676|1882->680|1927->687|1995->719|2021->723|2059->725|2069->726|2094->729|2139->738|2165->742|2211->752|2221->753|2246->756|2285->759|2351->802|2390->804|2433->824|2490->845|2516->849|2554->851|2564->852|2589->855|2628->858|2638->859|2663->862|2708->876|2751->888
                    LINES: 45->18|48->18|50->20|50->20|50->20|51->21|51->21|52->22|52->22|52->22|52->22|53->23|53->23|53->23|53->23|53->23|53->23|53->23|53->23|53->23|53->23|53->23|53->23|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|57->27
                    -- GENERATED --
                */
            