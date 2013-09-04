
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Generate an HTML form.
 *
 * Example:
 * {{{
 * @requireJs(core = routes.Assets.at("javascripts/require.js").url, module = routes.Assets.at("javascripts/main").url)
 * }}}
 *
 * @param core reference to require.js
 * @param module javascript module in question
 */
object requireJs extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Html] {

    /**
 * Generate an HTML form.
 *
 * Example:
 * {{{
 * @requireJs(core = routes.Assets.at("javascripts/require.js").url, module = routes.Assets.at("javascripts/main").url)
 * }}}
 *
 * @param core reference to require.js
 * @param module javascript module in question
 */
    def apply/*13.2*/(module: String, core: String, productionFolderPrefix: String = "-min", folder: String= "javascripts"):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*13.104*/("""


 <script type="text/javascript" data-main=""""),_display_(Seq[Any](/*16.45*/{if(play.api.Mode.Prod == play.api.Play.maybeApplication.map(_.mode).getOrElse(play.api.Mode.Dev)) module.replace(folder,folder+productionFolderPrefix) else module})),format.raw/*16.209*/("""" src=""""),_display_(Seq[Any](/*16.217*/core)),format.raw/*16.221*/(""""></script>
"""))}
    }
    
    def render(module:String,core:String,productionFolderPrefix:String,folder:String): play.api.templates.Html = apply(module,core,productionFolderPrefix,folder)
    
    def f:((String,String,String,String) => play.api.templates.Html) = (module,core,productionFolderPrefix,folder) => apply(module,core,productionFolderPrefix,folder)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:00 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/helper/requireJs.scala.html
                    HASH: 44b23cec3cd4b519c0596813637b6317e62a1427
                    MATRIX: 947->274|1128->376|1211->423|1398->587|1443->595|1470->599
                    LINES: 33->13|36->13|39->16|39->16|39->16|39->16
                    -- GENERATED --
                */
            