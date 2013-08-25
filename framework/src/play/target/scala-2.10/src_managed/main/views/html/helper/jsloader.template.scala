
package views.html.helper

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Javascript CommonJS module loader
 *
 * Should only be used in development mode: in production, compiled Javascript should be used
 */
object jsloader extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**
 * Javascript CommonJS module loader
 *
 * Should only be used in development mode: in production, compiled Javascript should be used
 */
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*6.45*/("""
<script type="text/javascript">
var require = function(moduleName) """),format.raw/*8.36*/("""{"""),format.raw/*8.37*/("""
  var body = "";
  $.ajax("""),format.raw/*10.10*/("""{"""),format.raw/*10.11*/("""
    url: "/assets/javascripts/" + moduleName + ".js",
    dataType: "text", async: false,
    success: function(result) """),format.raw/*13.31*/("""{"""),format.raw/*13.32*/(""" body = result; """),format.raw/*13.48*/("""}"""),format.raw/*13.49*/("""
  """),format.raw/*14.3*/("""}"""),format.raw/*14.4*/(""");
  body = "var exports = """),format.raw/*15.25*/("""{"""),format.raw/*15.26*/("""}"""),format.raw/*15.27*/(""";\n" + body + "\nreturn exports;";
  var fnct = new Function("module", "exports", body);
  return fnct();
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""
</script>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 19:14:14 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-dash/framework/src/play/src/main/scala/views/helper/jsloader.scala.html
                    HASH: 1c8aff6091774ce29ba03ce3cbc406c86556a561
                    MATRIX: 729->186|824->254|852->255|907->282|936->283|1085->404|1114->405|1158->421|1187->422|1217->425|1245->426|1300->453|1329->454|1358->455|1491->561|1519->562
                    LINES: 24->6|26->8|26->8|28->10|28->10|31->13|31->13|31->13|31->13|32->14|32->14|33->15|33->15|33->15|36->18|36->18
                    -- GENERATED --
                */
            