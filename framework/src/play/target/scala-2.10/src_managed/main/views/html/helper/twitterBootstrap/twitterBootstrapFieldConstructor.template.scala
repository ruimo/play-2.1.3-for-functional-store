
package views.html.helper.twitterBootstrap

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**/
object twitterBootstrapFieldConstructor extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[views.html.helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: views.html.helper.FieldElements):play.api.templates.Html = {
        _display_ {import play.api.i18n._

import views.html.helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.52*/("""

<div class="clearfix """),_display_(Seq[Any](/*10.23*/elements/*10.31*/.args.get('_class))),format.raw/*10.49*/(""" """),_display_(Seq[Any](/*10.51*/if(elements.hasErrors)/*10.73*/ {_display_(Seq[Any](format.raw/*10.75*/("""error""")))})),format.raw/*10.81*/("""" id=""""),_display_(Seq[Any](/*10.88*/elements/*10.96*/.args.get('_id).getOrElse(elements.id + "_field"))),format.raw/*10.145*/("""">
    <label for=""""),_display_(Seq[Any](/*11.18*/elements/*11.26*/.id)),format.raw/*11.29*/("""">"""),_display_(Seq[Any](/*11.32*/elements/*11.40*/.label(elements.lang))),format.raw/*11.61*/("""</label>
    <div class="input">
        """),_display_(Seq[Any](/*13.10*/elements/*13.18*/.input)),format.raw/*13.24*/("""
        <span class="help-inline">"""),_display_(Seq[Any](/*14.36*/elements/*14.44*/.errors(elements.lang).mkString(", "))),format.raw/*14.81*/("""</span>
        <span class="help-block">"""),_display_(Seq[Any](/*15.35*/elements/*15.43*/.infos(elements.lang).mkString(", "))),format.raw/*15.79*/("""</span> 
    </div>
</div>
"""))}
    }
    
    def render(elements:views.html.helper.FieldElements): play.api.templates.Html = apply(elements)
    
    def f:((views.html.helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:00 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/twitterBootstrap/twitterBootstrapFieldConstructor.scala.html
                    HASH: 8e7ae3a5a2c96de4ac9866a13b010d1d6a299b29
                    MATRIX: 456->1|627->44|655->98|683->254|743->278|760->286|800->304|838->306|869->328|909->330|947->336|990->343|1007->351|1079->400|1135->420|1152->428|1177->431|1216->434|1233->442|1276->463|1354->505|1371->513|1399->519|1471->555|1488->563|1547->600|1625->642|1642->650|1700->686
                    LINES: 13->1|19->1|21->5|22->8|24->10|24->10|24->10|24->10|24->10|24->10|24->10|24->10|24->10|24->10|25->11|25->11|25->11|25->11|25->11|25->11|27->13|27->13|27->13|28->14|28->14|28->14|29->15|29->15|29->15
                    -- GENERATED --
                */
            