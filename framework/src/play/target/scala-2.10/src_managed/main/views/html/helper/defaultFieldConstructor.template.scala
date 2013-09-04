
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Default field constructor.
 *
 * It generates field as following:
 * {{{
 * <dl class="error">
 *   <dt><label for="name">Your name:</label></dt>
 *   <dd><input type="text" id="name" name="name"></dd>
 *   <dd class="error">This field is required</dd>
 *   <dd class="info">Required</dd>
 * </dl>
 * }}}
 *
 * @param el The field informations.
 */
object defaultFieldConstructor extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[FieldElements,play.api.templates.Html] {

    /**
 * Default field constructor.
 *
 * It generates field as following:
 * {{{
 * <dl class="error">
 *   <dt><label for="name">Your name:</label></dt>
 *   <dd><input type="text" id="name" name="name"></dd>
 *   <dd class="error">This field is required</dd>
 *   <dd class="info">Required</dd>
 * </dl>
 * }}}
 *
 * @param el The field informations.
 */
    def apply/*16.2*/(elements: FieldElements):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*16.27*/("""

<dl class=""""),_display_(Seq[Any](/*18.13*/elements/*18.21*/.args.get('_class))),format.raw/*18.39*/(""" """),_display_(Seq[Any](/*18.41*/if(elements.hasErrors)/*18.63*/ {_display_(Seq[Any](format.raw/*18.65*/("""error""")))})),format.raw/*18.71*/("""" id=""""),_display_(Seq[Any](/*18.78*/elements/*18.86*/.args.get('_id).getOrElse(elements.id + "_field"))),format.raw/*18.135*/("""">
    <dt><label for=""""),_display_(Seq[Any](/*19.22*/elements/*19.30*/.id)),format.raw/*19.33*/("""">"""),_display_(Seq[Any](/*19.36*/elements/*19.44*/.label(elements.lang))),format.raw/*19.65*/("""</label></dt>
    <dd>"""),_display_(Seq[Any](/*20.10*/elements/*20.18*/.input)),format.raw/*20.24*/("""</dd>
    """),_display_(Seq[Any](/*21.6*/elements/*21.14*/.errors(elements.lang).map/*21.40*/ { error =>_display_(Seq[Any](format.raw/*21.51*/("""
        <dd class="error">"""),_display_(Seq[Any](/*22.28*/error)),format.raw/*22.33*/("""</dd>
    """)))})),format.raw/*23.6*/("""
    """),_display_(Seq[Any](/*24.6*/elements/*24.14*/.infos(elements.lang).map/*24.39*/ { info =>_display_(Seq[Any](format.raw/*24.49*/("""
        <dd class="info">"""),_display_(Seq[Any](/*25.27*/info)),format.raw/*25.31*/("""</dd>
    """)))})),format.raw/*26.6*/("""
</dl>"""))}
    }
    
    def render(elements:FieldElements): play.api.templates.Html = apply(elements)
    
    def f:((FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:54:59 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/defaultFieldConstructor.scala.html
                    HASH: 3ef05dd8cb8b60baa9e49800c96ca40942d694b1
                    MATRIX: 1115->357|1218->382|1268->396|1285->404|1325->422|1363->424|1394->446|1434->448|1472->454|1515->461|1532->469|1604->518|1664->542|1681->550|1706->553|1745->556|1762->564|1805->585|1864->608|1881->616|1909->622|1955->633|1972->641|2007->667|2056->678|2120->706|2147->711|2189->722|2230->728|2247->736|2281->761|2329->771|2392->798|2418->802|2460->813
                    LINES: 41->16|44->16|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|51->23|52->24|52->24|52->24|52->24|53->25|53->25|54->26
                    -- GENERATED --
                */
            