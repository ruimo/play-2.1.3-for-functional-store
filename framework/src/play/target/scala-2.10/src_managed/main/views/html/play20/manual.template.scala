
package views.html.play20

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**/
object manual extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Option[String],Option[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String, main: Option[String], sidebar: Option[String]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.64*/("""

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*5.17*/title)),format.raw/*5.22*/("""</title>
        <link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css"></link>
    </head>
    <body>
        
        <section id="top">
            <div class="wrapper">
                <h1><a href="/@documentation">Manual, tutorials & references</a></h1>
                <nav>
                    <span class="versions">
                        <span>Browse APIs</span>
                        <select onchange="document.location=this.value">
                            <option selected disabled>Select language</option>
                            <option value="/@documentation/api/scala/index.html">Scala</option>
                            <option value="/@documentation/api/java/index.html">Java</option>
                        </select>
                    </span>
                </nav>
            </div>
        </section>
        
        <div id="content" class="wrapper doc">
            <article id="main">
                """),_display_(Seq[Any](/*28.18*/main/*28.22*/.map/*28.26*/ { html =>_display_(Seq[Any](format.raw/*28.36*/("""
                    """),_display_(Seq[Any](/*29.22*/Html(html))),format.raw/*29.32*/("""
                """)))}/*30.18*/.getOrElse/*30.28*/ {_display_(Seq[Any](format.raw/*30.30*/("""
                    <h1>Page not found ["""),_display_(Seq[Any](/*31.42*/title)),format.raw/*31.47*/("""]</h1>
                """)))})),format.raw/*32.18*/("""
            </article>
            <aside>
                """),_display_(Seq[Any](/*35.18*/sidebar/*35.25*/.map(Html.apply))),format.raw/*35.41*/("""
            </aside>
        </div>
        
    </body>
</html>"""))}
    }
    
    def render(title:String,main:Option[String],sidebar:Option[String]): play.api.templates.Html = apply(title,main,sidebar)
    
    def f:((String,Option[String],Option[String]) => play.api.templates.Html) = (title,main,sidebar) => apply(title,main,sidebar)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:02 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/play20/manual.scala.html
                    HASH: 1105e045581dbf1dbd5a48da8d68a667e81f974c
                    MATRIX: 418->1|557->63|628->99|654->104|1665->1083|1678->1087|1691->1091|1739->1101|1797->1123|1829->1133|1866->1151|1885->1161|1925->1163|2003->1205|2030->1210|2086->1234|2183->1295|2199->1302|2237->1318
                    LINES: 13->1|16->1|20->5|20->5|43->28|43->28|43->28|43->28|44->29|44->29|45->30|45->30|45->30|46->31|46->31|47->32|50->35|50->35|50->35
                    -- GENERATED --
                */
            