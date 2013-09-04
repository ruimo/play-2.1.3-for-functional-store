
package views.html.defaultpages

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Default page for 404 Not Found responses, in development mode.
 * This page display the routes file content.
 */
object devNotFound extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.api.mvc.RequestHeader,Option[play.core.Router.Routes],play.api.templates.Html] {

    /**
 * Default page for 404 Not Found responses, in development mode.
 * This page display the routes file content.
 */
    def apply/*5.2*/(request:play.api.mvc.RequestHeader, router:Option[play.core.Router.Routes]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.78*/("""

<!DOCTYPE html>
<html>
	<head>
		<title>Action not found</title>
		<link rel="shortcut icon" href="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAlFJREFUeNqUU8tOFEEUPVVdNV3dPe8xYRBnjGhmBgKjKzCIiQvBoIaNbly5Z+PSv3Aj7DSiP2B0rwkLGVdGgxITSCRIJGSMEQWZR3eVt5sEFBgTb/dN1yvnnHtPNTPG4PqdHgCMXnPRSZrpSuH8vUJu4DE4rYHDGAZDX62BZttHqTiIayM3gGiXQsgYLEvATaqxU+dy1U13YXapXptpNHY8iwn8KyIAzm1KBdtRZWErpI5lEWTXp5Z/vHpZ3/wyKKwYGGOdAYwR0EZwoezTYApBEIObyELl/aE1/83cp40Pt5mxqCKrE4Ck+mVWKKcI5tA8BLEhRBKJLjez6a7MLq7XZtp+yyOawwCBtkiBVZDKzRk4NN7NQBMYPHiZDFhXY+p9ff7F961vVcnl4R5I2ykJ5XFN7Ab7Gc61VoipNBKF+PDyztu5lfrSLT/wIwCxq0CAGtXHZTzqR2jtwQiXONma6hHpj9sLT7YaPxfTXuZdBGA02Wi7FS48YiTfj+i2NhqtdhP5RC8mh2/Op7y0v6eAcWVLFT8D7kWX5S9mepp+C450MV6aWL1cGnvkxbwHtLW2B9AOkLeUd9KEDuh9fl/7CEj7YH5g+3r/lWfF9In7tPz6T4IIwBJOr1SJyIGQMZQbsh5P9uBq5VJtqHh2mo49pdw5WFoEwKWqWHacaWOjQXWGcifKo6vj5RGS6zykI587XeUIQDqJSmAp+lE4qt19W5P9o8+Lma5DcjsC8JiT607lMVkdqQ0Vyh3lHhmh52tfNy78ajXv0rgYzv8nfwswANuk+7sD/Q0aAAAAAElFTkSuQmCC">
        <style>
		    html, body, pre """),format.raw/*13.23*/("""{"""),format.raw/*13.24*/("""
		        margin: 0;
		        padding: 0;
		        font-family: Monaco, 'Lucida Console', monospace;
		        background: #ECECEC;
		    """),format.raw/*18.7*/("""}"""),format.raw/*18.8*/("""
		    h1 """),format.raw/*19.10*/("""{"""),format.raw/*19.11*/("""
		        margin: 0;
		        background: #AD632A;
		        padding: 20px 45px;
		        color: #fff;
		        text-shadow: 1px 1px 1px rgba(0,0,0,.3);
		        border-bottom: 1px solid #9F5805;
		        font-size: 28px;
		    """),format.raw/*27.7*/("""}"""),format.raw/*27.8*/("""
		    p#detail """),format.raw/*28.16*/("""{"""),format.raw/*28.17*/("""
		        margin: 0;
		        padding: 15px 45px;
		        background: #F6A960;
		        border-top: 4px solid #D29052;
		        color: #733512;
		        text-shadow: 1px 1px 1px rgba(255,255,255,.3);
		        font-size: 14px;
		        border-bottom: 1px solid #BA7F5B;
		    """),format.raw/*37.7*/("""}"""),format.raw/*37.8*/("""
		    h2 """),format.raw/*38.10*/("""{"""),format.raw/*38.11*/("""
		        margin: 0;
		        padding: 5px 45px;
		        font-size: 12px;
		        background: #333;
		        color: #fff;
		        text-shadow: 1px 1px 1px rgba(0,0,0,.3);
		        border-top: 4px solid #2a2a2a;
		    """),format.raw/*46.7*/("""}"""),format.raw/*46.8*/("""
			pre """),format.raw/*47.8*/("""{"""),format.raw/*47.9*/("""
				margin: 0;
				border-bottom: 1px solid #DDD;
				text-shadow: 1px 1px 1px rgba(255,255,255,.5);
				position: relative;
				font-size: 12px;
				overflow: hidden;
			"""),format.raw/*54.4*/("""}"""),format.raw/*54.5*/("""
			pre span.line """),format.raw/*55.18*/("""{"""),format.raw/*55.19*/("""
			    text-align: right;
			    display: inline-block;
			    padding: 5px 5px;
			    width: 30px;
			    background: #D6D6D6;
			    color: #8B8B8B;
			    text-shadow: 1px 1px 1px rgba(255,255,255,.5);
			    font-weight: bold;
			"""),format.raw/*64.4*/("""}"""),format.raw/*64.5*/("""
			pre span.route """),format.raw/*65.19*/("""{"""),format.raw/*65.20*/("""
			    padding: 5px 5px;
			    position: absolute;
			    right: 0;
			    left: 40px;
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/("""
			pre span.route span.verb """),format.raw/*71.29*/("""{"""),format.raw/*71.30*/("""
			    display: inline-block;
			    width: 5%;
			    min-width: 50px;
			    overflow: hidden;
			    margin-right: 10px;
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/("""
			pre span.route span.path """),format.raw/*78.29*/("""{"""),format.raw/*78.30*/("""
			    display: inline-block;
			    width: 30%;
			    min-width: 200px;
			    overflow: hidden;
			    margin-right: 10px;
			"""),format.raw/*84.4*/("""}"""),format.raw/*84.5*/("""
			pre span.route span.call """),format.raw/*85.29*/("""{"""),format.raw/*85.30*/("""
			    display: inline-block;
			    width: 50%;
			    overflow: hidden;
			    margin-right: 10px;
			"""),format.raw/*90.4*/("""}"""),format.raw/*90.5*/("""
			pre:first-child span.route """),format.raw/*91.31*/("""{"""),format.raw/*91.32*/("""
			    border-top: 4px solid #CDCDCD;
			"""),format.raw/*93.4*/("""}"""),format.raw/*93.5*/("""
			pre:first-child span.line """),format.raw/*94.30*/("""{"""),format.raw/*94.31*/("""
			    border-top: 4px solid #B6B6B6;
			"""),format.raw/*96.4*/("""}"""),format.raw/*96.5*/("""
			pre.error span.line """),format.raw/*97.24*/("""{"""),format.raw/*97.25*/("""
			    background: #A31012;
			    color: #fff;
			    text-shadow: 1px 1px 1px rgba(0,0,0,.3);
			"""),format.raw/*101.4*/("""}"""),format.raw/*101.5*/("""
		</style>
	</head>
	<body>
		<h1>Action not found</h1>

		<p id="detail">
			For request '"""),_display_(Seq[Any](/*108.18*/request)),format.raw/*108.25*/("""'
		</p>
		
		"""),_display_(Seq[Any](/*111.4*/router/*111.10*/ match/*111.16*/ {/*113.4*/case Some(routes) =>/*113.24*/ {_display_(Seq[Any](format.raw/*113.26*/("""
			    
			    <h2>
        			These routes have been tried, in this order:
        		</h2>

                <div>
    				"""),_display_(Seq[Any](/*120.10*/routes/*120.16*/.documentation.zipWithIndex.map/*120.47*/ { r =>_display_(Seq[Any](format.raw/*120.54*/("""
    					<pre><span class="line">"""),_display_(Seq[Any](/*121.35*/(r._2 + 1))),format.raw/*121.45*/("""</span><span class="route"><span class="verb">"""),_display_(Seq[Any](/*121.92*/r/*121.93*/._1._1)),format.raw/*121.99*/("""</span><span class="path">"""),_display_(Seq[Any](/*121.126*/r/*121.127*/._1._2)),format.raw/*121.133*/("""</span><span class="call">"""),_display_(Seq[Any](/*121.160*/r/*121.161*/._1._3)),format.raw/*121.167*/("""</span></span></pre>
    				""")))})),format.raw/*122.10*/("""
				</div>

			""")))}/*127.4*/case None =>/*127.16*/ {_display_(Seq[Any](format.raw/*127.18*/("""
				<h2>
        			No router defined.
        		</h2>
			""")))}})),format.raw/*133.10*/("""

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
                    DATE: Sun Aug 25 20:55:03 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/defaultpages/devNotFound.scala.html
                    HASH: 28a5bea738b7e3186dfadd5bf5155d4bb0d4a987
                    MATRIX: 681->121|834->197|1942->1277|1971->1278|2139->1419|2167->1420|2205->1430|2234->1431|2495->1665|2523->1666|2567->1682|2596->1683|2907->1967|2935->1968|2973->1978|3002->1979|3256->2206|3284->2207|3319->2215|3347->2216|3546->2388|3574->2389|3620->2407|3649->2408|3912->2644|3940->2645|3987->2664|4016->2665|4135->2757|4163->2758|4220->2787|4249->2788|4404->2916|4432->2917|4489->2946|4518->2947|4675->3077|4703->3078|4760->3107|4789->3108|4921->3213|4949->3214|5008->3245|5037->3246|5106->3288|5134->3289|5192->3319|5221->3320|5290->3362|5318->3363|5370->3387|5399->3388|5527->3488|5556->3489|5686->3582|5716->3589|5767->3604|5783->3610|5799->3616|5810->3623|5840->3643|5881->3645|6043->3770|6059->3776|6100->3807|6146->3814|6218->3849|6251->3859|6335->3906|6346->3907|6375->3913|6440->3940|6452->3941|6482->3947|6547->3974|6559->3975|6589->3981|6652->4011|6688->4033|6710->4045|6751->4047|6845->4120
                    LINES: 19->5|22->5|30->13|30->13|35->18|35->18|36->19|36->19|44->27|44->27|45->28|45->28|54->37|54->37|55->38|55->38|63->46|63->46|64->47|64->47|71->54|71->54|72->55|72->55|81->64|81->64|82->65|82->65|87->70|87->70|88->71|88->71|94->77|94->77|95->78|95->78|101->84|101->84|102->85|102->85|107->90|107->90|108->91|108->91|110->93|110->93|111->94|111->94|113->96|113->96|114->97|114->97|118->101|118->101|125->108|125->108|128->111|128->111|128->111|128->113|128->113|128->113|135->120|135->120|135->120|135->120|136->121|136->121|136->121|136->121|136->121|136->121|136->121|136->121|136->121|136->121|136->121|137->122|140->127|140->127|140->127|144->133
                    -- GENERATED --
                */
            