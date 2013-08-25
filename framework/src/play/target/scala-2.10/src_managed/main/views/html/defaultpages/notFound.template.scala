
package views.html.defaultpages

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Default page for 404 Not Found responses, in production mode.
 */
object notFound extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.api.mvc.RequestHeader,Option[play.core.Router.Routes],play.api.templates.Html] {

    /**
 * Default page for 404 Not Found responses, in production mode.
 */
    def apply/*4.2*/(request:play.api.mvc.RequestHeader, router:Option[play.core.Router.Routes]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*4.78*/("""

<!DOCTYPE html>
<html>
	<head>
		<title>Action not found</title>
		<link rel="shortcut icon" href="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAlFJREFUeNqUU8tOFEEUPVVdNV3dPe8xYRBnjGhmBgKjKzCIiQvBoIaNbly5Z+PSv3Aj7DSiP2B0rwkLGVdGgxITSCRIJGSMEQWZR3eVt5sEFBgTb/dN1yvnnHtPNTPG4PqdHgCMXnPRSZrpSuH8vUJu4DE4rYHDGAZDX62BZttHqTiIayM3gGiXQsgYLEvATaqxU+dy1U13YXapXptpNHY8iwn8KyIAzm1KBdtRZWErpI5lEWTXp5Z/vHpZ3/wyKKwYGGOdAYwR0EZwoezTYApBEIObyELl/aE1/83cp40Pt5mxqCKrE4Ck+mVWKKcI5tA8BLEhRBKJLjez6a7MLq7XZtp+yyOawwCBtkiBVZDKzRk4NN7NQBMYPHiZDFhXY+p9ff7F961vVcnl4R5I2ykJ5XFN7Ab7Gc61VoipNBKF+PDyztu5lfrSLT/wIwCxq0CAGtXHZTzqR2jtwQiXONma6hHpj9sLT7YaPxfTXuZdBGA02Wi7FS48YiTfj+i2NhqtdhP5RC8mh2/Op7y0v6eAcWVLFT8D7kWX5S9mepp+C450MV6aWL1cGnvkxbwHtLW2B9AOkLeUd9KEDuh9fl/7CEj7YH5g+3r/lWfF9In7tPz6T4IIwBJOr1SJyIGQMZQbsh5P9uBq5VJtqHh2mo49pdw5WFoEwKWqWHacaWOjQXWGcifKo6vj5RGS6zykI587XeUIQDqJSmAp+lE4qt19W5P9o8+Lma5DcjsC8JiT607lMVkdqQ0Vyh3lHhmh52tfNy78ajXv0rgYzv8nfwswANuk+7sD/Q0aAAAAAElFTkSuQmCC">
	    <style>
		    html, body, pre """),format.raw/*12.23*/("""{"""),format.raw/*12.24*/("""
		        margin: 0;
		        padding: 0;
		        font-family: Monaco, 'Lucida Console', monospace;
		        background: #ECECEC;
		    """),format.raw/*17.7*/("""}"""),format.raw/*17.8*/("""
		    h1 """),format.raw/*18.10*/("""{"""),format.raw/*18.11*/("""
		        margin: 0;
		        background: #AD632A;
		        padding: 20px 45px;
		        color: #fff;
		        text-shadow: 1px 1px 1px rgba(0,0,0,.3);
		        border-bottom: 1px solid #9F5805;
		        font-size: 28px;
		    """),format.raw/*26.7*/("""}"""),format.raw/*26.8*/("""
		    p#detail """),format.raw/*27.16*/("""{"""),format.raw/*27.17*/("""
		        margin: 0;
		        padding: 15px 45px;
		        background: #F6A960;
		        border-top: 4px solid #D29052;
		        color: #733512;
		        text-shadow: 1px 1px 1px rgba(255,255,255,.3);
		        font-size: 14px;
		        border-bottom: 1px solid #BA7F5B;
		    """),format.raw/*36.7*/("""}"""),format.raw/*36.8*/("""
		</style>
	</head>
	<body>
		<h1>Action not found</h1>

		<p id="detail">
			For request '"""),_display_(Seq[Any](/*43.18*/request)),format.raw/*43.25*/("""'
		</p>

	</body>
</html>







"""))}
    }
    
    def render(request:play.api.mvc.RequestHeader,router:Option[play.core.Router.Routes]): play.api.templates.Html = apply(request,router)
    
    def f:((play.api.mvc.RequestHeader,Option[play.core.Router.Routes]) => play.api.templates.Html) = (request,router) => apply(request,router)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 19:14:17 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-dash/framework/src/play/src/main/scala/views/defaultpages/notFound.scala.html
                    HASH: 1c0e09e9a7b3bc0e632710b4adeedf71e60f1e94
                    MATRIX: 584->74|737->150|1842->1227|1871->1228|2039->1369|2067->1370|2105->1380|2134->1381|2395->1615|2423->1616|2467->1632|2496->1633|2807->1917|2835->1918|2964->2011|2993->2018
                    LINES: 17->4|20->4|28->12|28->12|33->17|33->17|34->18|34->18|42->26|42->26|43->27|43->27|52->36|52->36|59->43|59->43
                    -- GENERATED --
                */
            