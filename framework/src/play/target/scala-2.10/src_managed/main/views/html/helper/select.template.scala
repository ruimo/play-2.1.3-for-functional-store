
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML select.
 *
 * Example:
 * {{{
 * @select(field = myForm("isDone"), options = options("Yes","No"))
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
object select extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]],FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML select.
 *
 * Example:
 * {{{
 * @select(field = myForm("isDone"), options = options("Yes","No"))
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
    def apply/*13.2*/(field: play.api.data.Field, options: Seq[(String,String)], args: (Symbol,Any)*)(implicit handler: FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*13.144*/("""

"""),_display_(Seq[Any](/*15.2*/input(field, args:_*)/*15.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*15.56*/("""
    <select id=""""),_display_(Seq[Any](/*16.18*/id)),format.raw/*16.20*/("""" name=""""),_display_(Seq[Any](/*16.29*/name)),format.raw/*16.33*/("""" """),_display_(Seq[Any](/*16.36*/toHtmlArgs(htmlArgs))),format.raw/*16.56*/(""">
        """),_display_(Seq[Any](/*17.10*/args/*17.14*/.toMap.get('_default).map/*17.39*/ { defaultValue =>_display_(Seq[Any](format.raw/*17.57*/("""
            <option class="blank" value="">"""),_display_(Seq[Any](/*18.45*/defaultValue)),format.raw/*18.57*/("""</option>
        """)))})),format.raw/*19.10*/("""
        """),_display_(Seq[Any](/*20.10*/options/*20.17*/.map/*20.21*/ { v =>_display_(Seq[Any](format.raw/*20.28*/("""
            <option value=""""),_display_(Seq[Any](/*21.29*/v/*21.30*/._1)),format.raw/*21.33*/("""" """),_display_(Seq[Any](/*21.36*/(if(value == Some(v._1)) "selected" else ""))),format.raw/*21.80*/(""">"""),_display_(Seq[Any](/*21.82*/v/*21.83*/._2)),format.raw/*21.86*/("""</option>
        """)))})),format.raw/*22.10*/("""
    </select>
""")))})),format.raw/*24.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,options:Seq[scala.Tuple2[String, String]],args:Array[scala.Tuple2[Symbol, Any]],handler:FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,options,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]]) => (FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,options,args) => (handler,lang) => apply(field,options,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 19:14:13 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-dash/framework/src/play/src/main/scala/views/helper/select.scala.html
                    HASH: a433e848fe29449163a15070d0f89ab1f452f8ad
                    MATRIX: 993->250|1214->392|1252->395|1282->416|1353->449|1407->467|1431->469|1476->478|1502->482|1541->485|1583->505|1630->516|1643->520|1677->545|1733->563|1814->608|1848->620|1899->639|1945->649|1961->656|1974->660|2019->667|2084->696|2094->697|2119->700|2158->703|2224->747|2262->749|2272->750|2297->753|2348->772|2395->788
                    LINES: 35->13|38->13|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|41->16|42->17|42->17|42->17|42->17|43->18|43->18|44->19|45->20|45->20|45->20|45->20|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|47->22|49->24
                    -- GENERATED --
                */
            