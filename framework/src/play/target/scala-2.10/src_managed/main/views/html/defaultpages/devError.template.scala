
package views.html.defaultpages

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**
 * Default page for 500 Internal Server Error responses, in development mode.
 * This page display the error in the source code context.
 */
object devError extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.api.UsefulException,play.api.templates.Html] {

    /**
 * Default page for 500 Internal Server Error responses, in development mode.
 * This page display the error in the source code context.
 */
    def apply/*5.2*/(error: play.api.UsefulException):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.35*/("""

<!DOCTYPE html>
<html>
	<head>
		<title>"""),_display_(Seq[Any](/*10.11*/error/*10.16*/.title)),format.raw/*10.22*/("""</title>
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
		        background: #A31012;
		        padding: 20px 45px;
		        color: #fff;
		        text-shadow: 1px 1px 1px rgba(0,0,0,.3);
		        border-bottom: 1px solid #690000;
		        font-size: 28px;
		    """),format.raw/*27.7*/("""}"""),format.raw/*27.8*/("""
		    p#detail """),format.raw/*28.16*/("""{"""),format.raw/*28.17*/("""
		        margin: 0;
		        padding: 15px 45px;
		        background: #F5A0A0;
		        border-top: 4px solid #D36D6D;
		        color: #730000;
		        text-shadow: 1px 1px 1px rgba(255,255,255,.3);
		        font-size: 14px;
		        border-bottom: 1px solid #BA7A7A;
		    """),format.raw/*37.7*/("""}"""),format.raw/*37.8*/("""
		    p#detail input """),format.raw/*38.22*/("""{"""),format.raw/*38.23*/("""
		        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#AE1113), to(#A31012));
                border: 1px solid #790000;
                padding: 3px 10px;
                text-shadow: 1px 1px 0 rgba(0, 0, 0, .5);
                color: white;
                border-radius: 3px;
                cursor: pointer;
                font-family: Monaco, 'Lucida Console';
                font-size: 12px;
                margin: 0 10px;
                display: inline-block;
                position: relative;
                top: -1px;
		    """),format.raw/*52.7*/("""}"""),format.raw/*52.8*/("""
		    h2 """),format.raw/*53.10*/("""{"""),format.raw/*53.11*/("""
		        margin: 0;
		        padding: 5px 45px;
		        font-size: 12px;
		        background: #333;
		        color: #fff;
		        text-shadow: 1px 1px 1px rgba(0,0,0,.3);
		        border-top: 4px solid #2a2a2a;
		    """),format.raw/*61.7*/("""}"""),format.raw/*61.8*/("""
			pre """),format.raw/*62.8*/("""{"""),format.raw/*62.9*/("""
				margin: 0;
				border-bottom: 1px solid #DDD;
				text-shadow: 1px 1px 1px rgba(255,255,255,.5);
				position: relative;
				font-size: 12px;
				overflow: hidden;
			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/("""
			pre span.line """),format.raw/*70.18*/("""{"""),format.raw/*70.19*/("""
			    text-align: right;
			    display: inline-block;
			    padding: 5px 5px;
			    width: 30px;
			    background: #D6D6D6;
			    color: #8B8B8B;
			    text-shadow: 1px 1px 1px rgba(255,255,255,.5);
			    font-weight: bold;
			"""),format.raw/*79.4*/("""}"""),format.raw/*79.5*/("""
			pre span.code """),format.raw/*80.18*/("""{"""),format.raw/*80.19*/("""
			    padding: 5px 5px;
			    position: absolute;
			    right: 0;
			    left: 40px;
			"""),format.raw/*85.4*/("""}"""),format.raw/*85.5*/("""
			pre:first-child span.code """),format.raw/*86.30*/("""{"""),format.raw/*86.31*/("""
			    border-top: 4px solid #CDCDCD;
			"""),format.raw/*88.4*/("""}"""),format.raw/*88.5*/("""
			pre:first-child span.line """),format.raw/*89.30*/("""{"""),format.raw/*89.31*/("""
			    border-top: 4px solid #B6B6B6;
			"""),format.raw/*91.4*/("""}"""),format.raw/*91.5*/("""
			pre.error span.line """),format.raw/*92.24*/("""{"""),format.raw/*92.25*/("""
			    background: #A31012;
			    color: #fff;
			    text-shadow: 1px 1px 1px rgba(0,0,0,.3);
			"""),format.raw/*96.4*/("""}"""),format.raw/*96.5*/("""
			pre.error """),format.raw/*97.14*/("""{"""),format.raw/*97.15*/("""
				color: #A31012;
			"""),format.raw/*99.4*/("""}"""),format.raw/*99.5*/("""
			pre.error span.marker """),format.raw/*100.26*/("""{"""),format.raw/*100.27*/("""
				background: #A31012;
				color: #fff;
				text-shadow: 1px 1px 1px rgba(0,0,0,.3);
			"""),format.raw/*104.4*/("""}"""),format.raw/*104.5*/("""
		</style>
	</head>
	<body id="play-error-page">
		<h1>"""),_display_(Seq[Any](/*108.8*/error/*108.13*/.title)),format.raw/*108.19*/("""</h1>

		<p id="detail">
		    """),_display_(Seq[Any](/*111.8*/error/*111.13*/ match/*111.19*/ {/*113.11*/case description:play.api.PlayException.RichDescription =>/*113.69*/ {_display_(Seq[Any](format.raw/*113.71*/("""
		            """),_display_(Seq[Any](/*114.16*/play/*114.20*/.api.templates.Html(description.htmlDescription))),format.raw/*114.68*/("""
		        """)))}/*117.11*/case _ =>/*117.20*/ {_display_(Seq[Any](format.raw/*117.22*/("""
		            """),_display_(Seq[Any](/*118.16*/error/*118.21*/.description)),format.raw/*118.33*/("""
    			""")))}})),format.raw/*121.8*/("""
		</p>
		
		"""),_display_(Seq[Any](/*124.4*/error/*124.9*/ match/*124.15*/ {/*126.4*/case source:play.api.PlayException.ExceptionSource =>/*126.57*/ {_display_(Seq[Any](format.raw/*126.59*/("""

				"""),_display_(Seq[Any](/*128.6*/Option(source.sourceName)/*128.31*/.map/*128.35*/ { name =>_display_(Seq[Any](format.raw/*128.45*/("""
					<h2>
						In """),_display_(Seq[Any](/*130.11*/name)),format.raw/*130.15*/(""" """),_display_(Seq[Any](/*130.17*/Option(source.line)/*130.36*/.map/*130.40*/ { line =>_display_(Seq[Any](format.raw/*130.50*/("""
							at line """),_display_(Seq[Any](/*131.17*/line)),format.raw/*131.21*/(""".
						""")))})),format.raw/*132.8*/("""
					</h2>

                    <div id="source-code">
    					"""),_display_(Seq[Any](/*136.11*/Option(source.interestingLines(4))/*136.45*/.map/*136.49*/ {/*138.11*/case interesting =>/*138.30*/ {_display_(Seq[Any](format.raw/*138.32*/("""

    							"""),_display_(Seq[Any](/*140.13*/interesting/*140.24*/.focus.zipWithIndex.map/*140.47*/ {/*142.13*/case (line,index) if index == interesting.errorLine =>/*142.67*/ {_display_(Seq[Any](format.raw/*142.69*/("""
    									<pre class="error" data-file=""""),_display_(Seq[Any](/*143.45*/name)),format.raw/*143.49*/("""" data-line=""""),_display_(Seq[Any](/*143.63*/(interesting.firstLine+index))),format.raw/*143.92*/("""" """),_display_(Seq[Any](/*143.95*/Option(source.position)/*143.118*/.map/*143.122*/ { c =>_display_(Seq[Any](format.raw/*143.129*/(""" data-column=""""),_display_(Seq[Any](/*143.144*/c)),format.raw/*143.145*/("""" """)))})),format.raw/*143.148*/("""><span class="line">"""),_display_(Seq[Any](/*143.169*/(interesting.firstLine+index))),format.raw/*143.198*/("""</span><span class="code">"""),_display_(Seq[Any](/*143.225*/(Option(source.position).map(pos => (line+" ").zipWithIndex.map{ case (c,i) if i == pos => Html("""<span class="marker">""" + c + """</span>"""); case (c,_) => c}).getOrElse(line)))),format.raw/*143.405*/("""</span></pre>

    								""")))}/*147.13*/case (line, index) =>/*147.34*/ {_display_(Seq[Any](format.raw/*147.36*/("""
    									<pre data-file=""""),_display_(Seq[Any](/*148.31*/name)),format.raw/*148.35*/("""" data-line=""""),_display_(Seq[Any](/*148.49*/(interesting.firstLine+index))),format.raw/*148.78*/(""""><span class="line">"""),_display_(Seq[Any](/*148.100*/(interesting.firstLine+index))),format.raw/*148.129*/("""</span><span class="code">"""),_display_(Seq[Any](/*148.156*/line)),format.raw/*148.160*/("""</span></pre>
    								""")))}})),format.raw/*151.13*/("""
    						""")))}})),format.raw/*154.11*/("""
					</div>

				""")))})),format.raw/*157.6*/("""

			""")))}/*161.4*/case attachment:play.api.PlayException.ExceptionAttachment =>/*161.65*/ {_display_(Seq[Any](format.raw/*161.67*/("""
			    
			    <h2>"""),_display_(Seq[Any](/*163.13*/attachment/*163.23*/.subTitle)),format.raw/*163.32*/("""</h2>
			    
			    <div>
			        """),_display_(Seq[Any](/*166.13*/attachment/*166.23*/.content.split("\n").zipWithIndex.map/*166.60*/ {/*168.16*/case (line,index) =>/*168.36*/ {_display_(Seq[Any](format.raw/*168.38*/("""
			                <pre><span class="line">"""),_display_(Seq[Any](/*169.45*/(index+1))),format.raw/*169.54*/("""</span><span class="code">"""),_display_(Seq[Any](/*169.81*/line)),format.raw/*169.85*/("""</span></pre>
			            """)))}})),format.raw/*172.13*/("""
			    </div>
			    
			""")))}/*177.4*/case exception: play.api.PlayException if exception.cause != null =>/*177.72*/ {_display_(Seq[Any](format.raw/*177.74*/("""
			    
			    <h2>
			        No source available, here is the exception stack trace:
			    </h2>
			    
			    <div>
			        
			        <pre class="error"><span class="line">-></span><span class="code">"""),_display_(Seq[Any](/*185.79*/exception/*185.88*/.cause.getClass.getName)),format.raw/*185.111*/(""": """),_display_(Seq[Any](/*185.114*/exception/*185.123*/.cause.getMessage)),format.raw/*185.140*/("""</span></pre>
			        
			        """),_display_(Seq[Any](/*187.13*/exception/*187.22*/.cause.getStackTrace.map/*187.46*/ { line =>_display_(Seq[Any](format.raw/*187.56*/("""
						<pre><span class="line">&nbsp;</span><span class="code">    """),_display_(Seq[Any](/*188.68*/line)),format.raw/*188.72*/("""</span></pre>
			        """)))})),format.raw/*189.13*/("""
			    </div>
			    
			""")))}/*194.4*/case _ =>/*194.13*/ {_display_(Seq[Any](format.raw/*194.15*/("""
			""")))}})),format.raw/*197.4*/("""

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
                    DATE: Sun Aug 25 20:55:02 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/defaultpages/devError.scala.html
                    HASH: 0305a40525cbc4eaab76f4b217d92ce051d664c8
                    MATRIX: 694->146|804->179|883->222|897->227|925->233|1972->1252|2001->1253|2169->1394|2197->1395|2235->1405|2264->1406|2525->1640|2553->1641|2597->1657|2626->1658|2937->1942|2965->1943|3015->1965|3044->1966|3627->2522|3655->2523|3693->2533|3722->2534|3976->2761|4004->2762|4039->2770|4067->2771|4266->2943|4294->2944|4340->2962|4369->2963|4632->3199|4660->3200|4706->3218|4735->3219|4854->3311|4882->3312|4940->3342|4969->3343|5038->3385|5066->3386|5124->3416|5153->3417|5222->3459|5250->3460|5302->3484|5331->3485|5458->3585|5486->3586|5528->3600|5557->3601|5608->3625|5636->3626|5691->3652|5721->3653|5840->3744|5869->3745|5962->3802|5977->3807|6006->3813|6074->3845|6089->3850|6105->3856|6117->3880|6185->3938|6226->3940|6279->3956|6293->3960|6364->4008|6396->4042|6415->4051|6456->4053|6509->4069|6524->4074|6559->4086|6601->4114|6651->4128|6665->4133|6681->4139|6692->4146|6755->4199|6796->4201|6839->4208|6874->4233|6888->4237|6937->4247|6995->4268|7022->4272|7061->4274|7090->4293|7104->4297|7153->4307|7207->4324|7234->4328|7275->4337|7378->4403|7422->4437|7436->4441|7448->4456|7477->4475|7518->4477|7569->4491|7590->4502|7623->4525|7635->4542|7699->4596|7740->4598|7822->4643|7849->4647|7900->4661|7952->4690|7992->4693|8026->4716|8041->4720|8088->4727|8141->4742|8166->4743|8203->4746|8262->4767|8315->4796|8380->4823|8584->5003|8632->5045|8663->5066|8704->5068|8772->5099|8799->5103|8850->5117|8902->5146|8962->5168|9015->5197|9080->5224|9108->5228|9169->5269|9215->5293|9266->5312|9291->5326|9362->5387|9403->5389|9461->5410|9481->5420|9513->5429|9589->5468|9609->5478|9656->5515|9668->5549|9698->5569|9739->5571|9821->5616|9853->5625|9917->5652|9944->5656|10008->5715|10054->5750|10132->5818|10173->5820|10422->6032|10441->6041|10488->6064|10529->6067|10549->6076|10590->6093|10665->6131|10684->6140|10718->6164|10767->6174|10872->6242|10899->6246|10958->6272|11004->6304|11023->6313|11064->6315|11102->6325
                    LINES: 19->5|22->5|27->10|27->10|27->10|30->13|30->13|35->18|35->18|36->19|36->19|44->27|44->27|45->28|45->28|54->37|54->37|55->38|55->38|69->52|69->52|70->53|70->53|78->61|78->61|79->62|79->62|86->69|86->69|87->70|87->70|96->79|96->79|97->80|97->80|102->85|102->85|103->86|103->86|105->88|105->88|106->89|106->89|108->91|108->91|109->92|109->92|113->96|113->96|114->97|114->97|116->99|116->99|117->100|117->100|121->104|121->104|125->108|125->108|125->108|128->111|128->111|128->111|128->113|128->113|128->113|129->114|129->114|129->114|130->117|130->117|130->117|131->118|131->118|131->118|132->121|135->124|135->124|135->124|135->126|135->126|135->126|137->128|137->128|137->128|137->128|139->130|139->130|139->130|139->130|139->130|139->130|140->131|140->131|141->132|145->136|145->136|145->136|145->138|145->138|145->138|147->140|147->140|147->140|147->142|147->142|147->142|148->143|148->143|148->143|148->143|148->143|148->143|148->143|148->143|148->143|148->143|148->143|148->143|148->143|148->143|148->143|150->147|150->147|150->147|151->148|151->148|151->148|151->148|151->148|151->148|151->148|151->148|152->151|153->154|156->157|158->161|158->161|158->161|160->163|160->163|160->163|163->166|163->166|163->166|163->168|163->168|163->168|164->169|164->169|164->169|164->169|165->172|168->177|168->177|168->177|176->185|176->185|176->185|176->185|176->185|176->185|178->187|178->187|178->187|178->187|179->188|179->188|180->189|183->194|183->194|183->194|184->197
                    -- GENERATED --
                */
            