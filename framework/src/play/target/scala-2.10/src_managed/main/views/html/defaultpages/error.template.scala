
package views.html.defaultpages

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Default page for 500 Internal Server Error responses, in production mode.
 */
object error extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.api.UsefulException,play.api.templates.Html] {

    /**
 * Default page for 500 Internal Server Error responses, in production mode.
 */
    def apply/*4.2*/(error: play.api.UsefulException):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*4.35*/("""

<!DOCTYPE html>
<html>
	<head>
		<title>Error</title>
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
		        background: #A31012;
		        padding: 20px 45px;
		        color: #fff;
		        text-shadow: 1px 1px 1px rgba(0,0,0,.3);
		        border-bottom: 1px solid #690000;
		        font-size: 28px;
		    """),format.raw/*26.7*/("""}"""),format.raw/*26.8*/("""
		    p#detail """),format.raw/*27.16*/("""{"""),format.raw/*27.17*/("""
		        margin: 0;
		        padding: 15px 45px;
		        background: #F5A0A0;
		        border-top: 4px solid #D36D6D;
		        color: #730000;
		        text-shadow: 1px 1px 1px rgba(255,255,255,.3);
		        font-size: 14px;
		        border-bottom: 1px solid #BA7A7A;
		    """),format.raw/*36.7*/("""}"""),format.raw/*36.8*/("""
		</style>
	</head>
	<body>
		<h1>Oops, an error occured</h1>

		<p id="detail">
			This exception has been logged with id <strong>"""),_display_(Seq[Any](/*43.52*/error/*43.57*/.id)),format.raw/*43.60*/("""</strong>.
		</p>

	</body>
</html>







"""))}
    }
    
    def render(error:play.api.UsefulException): play.api.templates.Html = apply(error)
    
    def f:((play.api.UsefulException) => play.api.templates.Html) = (error) => apply(error)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 19:14:17 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-dash/framework/src/play/src/main/scala/views/defaultpages/error.scala.html
                    HASH: 419527ab7ef54616a483d917d3d502536be53d80
                    MATRIX: 571->86|681->119|1775->1185|1804->1186|1972->1327|2000->1328|2038->1338|2067->1339|2328->1573|2356->1574|2400->1590|2429->1591|2740->1875|2768->1876|2937->2009|2951->2014|2976->2017
                    LINES: 17->4|20->4|28->12|28->12|33->17|33->17|34->18|34->18|42->26|42->26|43->27|43->27|52->36|52->36|59->43|59->43|59->43
                    -- GENERATED --
                */
            