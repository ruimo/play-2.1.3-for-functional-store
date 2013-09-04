
package views.html.defaultpages

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Default page for 401 Not Authorized responses.
 */
object unauthorized extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**
 * Default page for 401 Not Authorized responses.
 */
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>
	<head>
		<title>Unauthorized</title>
		<link rel="shortcut icon" href="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAlFJREFUeNqUU8tOFEEUPVVdNV3dPe8xYRBnjGhmBgKjKzCIiQvBoIaNbly5Z+PSv3Aj7DSiP2B0rwkLGVdGgxITSCRIJGSMEQWZR3eVt5sEFBgTb/dN1yvnnHtPNTPG4PqdHgCMXnPRSZrpSuH8vUJu4DE4rYHDGAZDX62BZttHqTiIayM3gGiXQsgYLEvATaqxU+dy1U13YXapXptpNHY8iwn8KyIAzm1KBdtRZWErpI5lEWTXp5Z/vHpZ3/wyKKwYGGOdAYwR0EZwoezTYApBEIObyELl/aE1/83cp40Pt5mxqCKrE4Ck+mVWKKcI5tA8BLEhRBKJLjez6a7MLq7XZtp+yyOawwCBtkiBVZDKzRk4NN7NQBMYPHiZDFhXY+p9ff7F961vVcnl4R5I2ykJ5XFN7Ab7Gc61VoipNBKF+PDyztu5lfrSLT/wIwCxq0CAGtXHZTzqR2jtwQiXONma6hHpj9sLT7YaPxfTXuZdBGA02Wi7FS48YiTfj+i2NhqtdhP5RC8mh2/Op7y0v6eAcWVLFT8D7kWX5S9mepp+C450MV6aWL1cGnvkxbwHtLW2B9AOkLeUd9KEDuh9fl/7CEj7YH5g+3r/lWfF9In7tPz6T4IIwBJOr1SJyIGQMZQbsh5P9uBq5VJtqHh2mo49pdw5WFoEwKWqWHacaWOjQXWGcifKo6vj5RGS6zykI587XeUIQDqJSmAp+lE4qt19W5P9o8+Lma5DcjsC8JiT607lMVkdqQ0Vyh3lHhmh52tfNy78ajXv0rgYzv8nfwswANuk+7sD/Q0aAAAAAElFTkSuQmCC">
	    <style>
		    html, body, pre """),format.raw/*10.23*/("""{"""),format.raw/*10.24*/("""
		        margin: 0;
		        padding: 0;
		        font-family: Monaco, 'Lucida Console', monospace;
		        background: #ECECEC;
		    """),format.raw/*15.7*/("""}"""),format.raw/*15.8*/("""
		    h1 """),format.raw/*16.10*/("""{"""),format.raw/*16.11*/("""
		        margin: 0;
		        background: #333;
		        padding: 20px 45px;
		        color: #fff;
		        text-shadow: 1px 1px 1px rgba(0,0,0,.3);
		        border-bottom: 1px solid #111;
		        font-size: 28px;
		    """),format.raw/*24.7*/("""}"""),format.raw/*24.8*/("""
		    p#detail """),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""
		        margin: 0;
		        padding: 15px 45px;
		        background: #888;
		        border-top: 4px solid #666;
		        color: #111;
		        text-shadow: 1px 1px 1px rgba(255,255,255,.3);
		        font-size: 14px;
		        border-bottom: 1px solid #333;
		    """),format.raw/*34.7*/("""}"""),format.raw/*34.8*/("""
		</style>
	</head>
	<body>
		<h1>Unauthorized</h1>

		<p id="detail">
			You must be authenticated to access this page.
		</p>

	</body>
</html>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:03 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/defaultpages/unauthorized.scala.html
                    HASH: 029266f2214b7573b04cf215a49c9a46408ea5ac
                    MATRIX: 570->58|1669->1129|1698->1130|1866->1271|1894->1272|1932->1282|1961->1283|2216->1511|2244->1512|2288->1528|2317->1529|2616->1801|2644->1802
                    LINES: 20->4|26->10|26->10|31->15|31->15|32->16|32->16|40->24|40->24|41->25|41->25|50->34|50->34
                    -- GENERATED --
                */
            