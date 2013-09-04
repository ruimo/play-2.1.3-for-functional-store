
package views.html.play20

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**/
object book extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(pages: Seq[String]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.22*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Play 2.1 documentation</title>
        <link rel="stylesheet" media="screen, print" href="/@documentation/resources/style/main.css">
        <link rel="stylesheet" media="screen, print" href="/@documentation/resources/style/book.css">
        <style type="text/css" media="screen">
            body """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/("""
                width: 650px;
                margin: 5em auto;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""
        </style>
        <script src="http://code.jquery.com/jquery-1.7.1.min.js" type="text/javascript"></script>
    </head>
    <body id="manual">
    
    <script type="text/javascript" charset="utf-8">
        var pages = ["""),_display_(Seq[Any](/*21.23*/pages/*21.28*/.map/*21.32*/{p=>_display_(Seq[Any](format.raw/*21.36*/("""'"""),_display_(Seq[Any](/*21.38*/p)),format.raw/*21.39*/("""'""")))}/*21.41*/.mkString(","))),format.raw/*21.55*/("""]
        
        $(pages).each(function() """),format.raw/*23.34*/("""{"""),format.raw/*23.35*/("""
            var pageName = this
            var doc = $.ajax("""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
                url: '/@documentation/' + pageName,
                success: function(data) """),format.raw/*27.41*/("""{"""),format.raw/*27.42*/("""
                    var c = $('#main', $(data)[7]).attr('id', pageName)
                    $(document.body).append(c)
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/(""",
                async: false
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/(""")   
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/(""")
        
        $('img').each(function() """),format.raw/*35.34*/("""{"""),format.raw/*35.35*/("""
            var src = $(this).attr('src')
            if(src.indexOf('resources') == 0) """),format.raw/*37.47*/("""{"""),format.raw/*37.48*/("""
                $(this).attr('src', '/@documentation/' + src)
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/(""")
        
        $('blockquote').each(function() """),format.raw/*42.41*/("""{"""),format.raw/*42.42*/("""
            if($(this).text().indexOf('Next:') == 0) """),format.raw/*43.54*/("""{"""),format.raw/*43.55*/("""
                $(this).remove()
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/("""
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/(""")
        
    </script>
    
    </body>
</html>
"""))}
    }
    
    def render(pages:Seq[String]): play.api.templates.Html = apply(pages)
    
    def f:((Seq[String]) => play.api.templates.Html) = (pages) => apply(pages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:01 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/play20/book.scala.html
                    HASH: 2af5cdb59a57b9898795f285671702e8ca6e2eb6
                    MATRIX: 391->1|488->21|867->374|896->375|1001->452|1030->453|1296->683|1310->688|1323->692|1365->696|1403->698|1426->699|1447->701|1483->715|1555->759|1584->760|1674->822|1703->823|1824->917|1853->918|2017->1054|2046->1055|2117->1098|2146->1099|2186->1112|2215->1113|2287->1157|2316->1158|2433->1247|2462->1248|2565->1324|2594->1325|2630->1334|2659->1335|2738->1386|2767->1387|2849->1441|2878->1442|2952->1488|2981->1489|3017->1498|3046->1499
                    LINES: 13->1|16->1|26->11|26->11|29->14|29->14|36->21|36->21|36->21|36->21|36->21|36->21|36->21|36->21|38->23|38->23|40->25|40->25|42->27|42->27|45->30|45->30|47->32|47->32|48->33|48->33|50->35|50->35|52->37|52->37|54->39|54->39|55->40|55->40|57->42|57->42|58->43|58->43|60->45|60->45|61->46|61->46
                    -- GENERATED --
                */
            