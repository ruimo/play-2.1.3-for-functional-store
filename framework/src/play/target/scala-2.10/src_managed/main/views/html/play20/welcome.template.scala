
package views.html.play20

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
/**/
object welcome extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, style: String = "Scala"):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""

"""),_display_(Seq[Any](/*3.2*/play/*3.6*/.api.Play.maybeApplication.filterNot(_.mode != play.api.Mode.Dev).map/*3.75*/ { _ =>_display_(Seq[Any](format.raw/*3.82*/("""
    
<link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css">

<section id="top">
    <div class="wrapper">
        <h1><a href="/@documentation">"""),_display_(Seq[Any](/*9.41*/message)),format.raw/*9.48*/("""</a></h1>
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

<div id="news">
    <iframe src="http://www.playframework.org/widget?uid="""),_display_(Seq[Any](/*24.59*/play/*24.63*/.api.Play.maybeApplication.flatMap(_.configuration.getString("application.secret")).map(_.take(5)).map(play.api.libs.Codecs.sha1(_)))),format.raw/*24.195*/("""&version="""),_display_(Seq[Any](/*24.205*/play/*24.209*/.core.PlayVersion.current)),format.raw/*24.234*/("""&tag="""),_display_(Seq[Any](/*24.240*/style/*24.245*/.toUpperCase)),format.raw/*24.257*/("""" scrolling="no" style="overflow: hidden; display: block; margin: 0 auto; width: 960px; height: 60px"></iframe>
</div>


<div id="content" class="wrapper doc">

    """),_display_(Seq[Any](/*30.6*/if(style == "Scala")/*30.26*/ {_display_(Seq[Any](format.raw/*30.28*/("""

        <article>

            <h1>Welcome to Play 2.1</h1>

            <p>
                Congratulations, you’ve just created a new Play application. This page will help you with the few next steps.
            </p>

            <blockquote>
                <p>
                    You’re using Play """),_display_(Seq[Any](/*42.40*/play/*42.44*/.core.PlayVersion.current)),format.raw/*42.69*/("""
                </p>
            </blockquote>

            <h2>Why do you see this page?</h2>

            <p>
                The <code>conf/routes</code> file defines a route that tells Play to invoke the <code>Application.index</code> action whenever a browser requests the <code>/</code> URI using the GET method:
            </p>

<pre><code># Home page
GET     /               controllers.Application.index</code></pre>

            <p>
                Play has invoked the <code>controllers.Application.index</code> method to obtain the <code>Action</code> to execute:
            </p>

<pre><code>def index = Action """),format.raw/*59.31*/("""{"""),format.raw/*59.32*/("""
  Ok(views.html.index("Your new application is ready!"))
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""</code></pre>

            <p>
                An action is a function that handles the incoming HTTP request, and returns the HTTP result to send back to the web client. 
                Here we send a <code>200 OK</code> response, using a template to fill its content.
            </p>

            <p>
                The template is defined in the <code>app/views/index.scala.html</code> file and compiled as a Scala function.
            </p>

<pre><code>@(message: String)

@main("Welcome to Play 2.1") """),format.raw/*74.31*/("""{"""),format.raw/*74.32*/("""

    @play20.welcome(message)

"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""</code></pre>

            <p>
                The first line of the template defines the function signature. Here it just takes a single <code>String</code> parameter. 
                This template then calls another function defined in <code>app/views/main.scala.html</code>, which displays the HTML layout, and another
                function that displays this welcome message. You can freely add any HTML fragment mixed with Scala code in this file.
            </p>

            <h2>Is this your first time?</h2>

            <p>
                You can now continue with the <a href="/@documentation/ScalaTodoList">first tutorial</a>, which will guide you through the basics of creating a Play 2.1 application.
            </p>

            <h2>Need to set up an IDE?</h2>

            <p>
                You can start hacking your application right now using any text editor. Any changes will be automatically reloaded at each page refresh, 
                including modifications made to Scala source files.
            </p>

            <p>
                If you want to set-up your application in <strong>Eclipse</strong> or any other Scala IDE, check the 
                <a href="/@documentation/IDE">Setting up your preferred IDE</a> page.
            </p>

            <h2>Need to connect to a database?</h2>

            <p>
                You can quickly set-up a development database (either in-memory or written to the file system), 
                by adding these lines to the <code>conf/application.conf</code> file:
            </p>

<pre><code>db.default.driver=org.h2.Driver
db.default.url="jdbc:h2:mem:play"</code></pre>

            <p>
                If you need to connect to another JDBC-compliant database, first add the corresponding driver library 
                to your application dependencies:
            </p>

<pre><code>val appDependencies = Seq(
  "mysql" % "mysql-connector-java" % "5.1.18"
)</code></pre>

            <p>
                Then add the corresponding JDBC configuration to the <code>conf/application.conf</code> file:
            </p>

<pre><code>db.url=jdbc:mysql:database_name
db.driver=org.mysql.Driver
db.user=root
db.pass=secret</code></pre>

            <h2>Need more help?</h2>

            <p>
                When your application is run from the Play console, you can access the current documentation directly, at 
                the <a href="/@documentation">/@documentation</a> URL or go to <a href="http://www.playframework.org">http://www.playframework.org</a>.
            </p>

            <p>
                The <a href="http://groups.google.com/group/play-framework">Play Google Group</a> is where Play users come to seek help, announce projects, and discuss issues and new features. If you don’t have a Google account, you can still join the mailing list by sending an e-mail to 
                <strong>play-framework+subscribe@googlegroups.com</strong>.
            </p>

        </article>    
        <aside>
            <h3>Browse</h3>
            <ul>
                <li><a href="/@documentation">Local documentation</a></li>
                <li><a href="/@documentation/api/scala/index.html">Browse the Scala API</a></li>
            </ul>
            <h3>Start here</h3>
            <ul>
                <li><a href="/@documentation/PlayConsole">Using the Play console</a></li>
                <li><a href="/@documentation/IDE">Setting up your preferred IDE</a></li>
                <li><a href="/@documentation/ScalaTodoList">Your first application</a></li>
            </ul>
        </aside>

    """)))}/*159.7*/else/*159.12*/{_display_(Seq[Any](format.raw/*159.13*/("""

        <article>

            <h1>Welcome to Play 2.1</h1>

            <p>
                Congratulations, you’ve just created a new Play application. This page will help you with the next few steps.
            </p>

            <blockquote>
                <p>
                    You’re using Play """),_display_(Seq[Any](/*171.40*/play/*171.44*/.core.PlayVersion.current)),format.raw/*171.69*/("""
                </p>
            </blockquote>

            <h2>Why do you see this page?</h2>

            <p>
                The <code>conf/routes</code> file defines a route that tells Play to invoke the <code>Application.index</code> action whenever a browser requests the <code>/</code> URI using the GET method:
            </p>

<pre><code># Home page
GET     /               controllers.Application.index()</code></pre>

            <p>
                Play has invoked the <code>controllers.Application.index</code> method:
            </p>

<pre><code>public static Result index() """),format.raw/*188.41*/("""{"""),format.raw/*188.42*/("""
  return ok(index.render("Your new application is ready."));
"""),format.raw/*190.1*/("""}"""),format.raw/*190.2*/("""</code></pre>

            <p>
                An action method handles the incoming HTTP request, and returns the HTTP result to send back to the web client. 
                Here we send a <code>200 OK</code> response, using a template to fill its content.
            </p>

            <p>
                The template is defined in the <code>app/views/index.scala.html</code> file and compiled as a standard Java class.
            </p>

<pre><code>@(message: String)

@main("Welcome to Play 2.1") """),format.raw/*203.31*/("""{"""),format.raw/*203.32*/("""

    @play20.welcome(message, style = "Java")

"""),format.raw/*207.1*/("""}"""),format.raw/*207.2*/("""</code></pre>

            <p>
                The first line of the template defines the function signature. Here it just takes a single <code>String</code> parameter. 
                Then this template calls another function defined in <code>app/views/main.scala.html</code> which displays the HTML layout, and another
                function that displays this welcome message. You can freely add any HTML fragment mixed with Scala code in this file.
            </p>

            <blockquote>
                <p>
                    <strong>Note</strong> that Scala is fully compatible with Java, so if you don’t know Scala don’t panic, a Scala statement is very similar to a Java one. 
                </p>
            </blockquote>

            <h2>Is this your first time?</h2>

            <p>
                You can now continue with the <a href="/@documentation/JavaTodoList">first tutorial</a>, which will guide you through the basics of creating a Play 2.1 application.
            </p>

            <h2>Need to set up an IDE?</h2>

            <p>
                You can start hacking your application right now using any text editor. Any changes will be automatically reloaded at each page refresh, 
                including modifications made to Scala source files.
            </p>

            <p>
                If you want to set-up your application in <strong>Eclipse</strong> or any other Java IDE, check the 
                <a href="/@documentation/IDE">Setting up your preferred IDE</a> page.
            </p>

            <h2>Need to connect to a database?</h2>

            <p>
                You can quickly set-up a development database (either in-memory or written to the file system), 
                by adding these lines to the <code>conf/application.conf</code> file:
            </p>

<pre><code>db.default.driver=org.h2.Driver
db.default.url="jdbc:h2:mem:play"</code></pre>

            <p>
                If you need to connect to another JDBC-compliant database, first add the corresponding driver library 
                to your application dependencies:
            </p>

<pre><code>val appDependencies = Seq(
  "mysql" % "mysql-connector-java" % "5.1.18"
)</code></pre>

            <p>
                Then add the corresponding JDBC configuration to the <code>conf/application.conf</code> file:
            </p>

<pre><code>db.url=jdbc:mysql:database_name
db.driver=org.mysql.Driver
db.user=root
db.pass=secret</code></pre>

            <h2>Need more help?</h2>

            <p>
                When your application is run from the Play console, you can access the current documentation directly, at 
                the <a href="/@documentation">/@documentation</a> URL or go to <a href="http://www.playframework.org">http://www.playframework.org</a>.
            </p>

            <p>
                The <a href="http://groups.google.com/group/play-framework">Play Google Group</a> is where Play users come to seek help, announce projects, and discuss issues and new features. If you don’t have a Google account, you can still join the mailing list by sending an e-mail to 
                <strong>play-framework+subscribe@googlegroups.com</strong>.
            </p>

        </article>    
        <aside>
            <h3>Browse</h3>
            <ul>
                <li><a href="/@documentation">Local documentation</a></li>
                <li><a href="/@documentation/api/java/index.html">Browse the Java API</a></li>
            </ul>
            <h3>Start here</h3>
            <ul>
                <li><a href="/@documentation/PlayConsole">Using the Play console</a></li>
                <li><a href="/@documentation/IDE">Setting up your preferred IDE</a></li>
                <li><a href="/@documentation/JavaTodoList">Your first application</a></li>
            </ul>
        </aside>

    """)))})),format.raw/*294.6*/("""


</div>
    
""")))}/*299.2*/.getOrElse/*299.12*/ {_display_(Seq[Any](format.raw/*299.14*/("""
    
<h1>"""),_display_(Seq[Any](/*301.6*/message)),format.raw/*301.13*/("""</h1>
    
""")))})),format.raw/*303.2*/("""
"""))}
    }
    
    def render(message:String,style:String): play.api.templates.Html = apply(message,style)
    
    def f:((String,String) => play.api.templates.Html) = (message,style) => apply(message,style)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 25 20:55:01 JST 2013
                    SOURCE: /home/shanai/play/play-2.1.3-for-functional-store/framework/src/play/src/main/scala/views/play20/welcome.scala.html
                    HASH: 924753d6809823e27f0ecf8b8684ba4b594fbb6a
                    MATRIX: 396->1|515->43|552->46|563->50|640->119|684->126|897->306|925->313|1530->884|1543->888|1698->1020|1745->1030|1759->1034|1807->1059|1850->1065|1865->1070|1900->1082|2101->1248|2130->1268|2170->1270|2513->1577|2526->1581|2573->1606|3227->2232|3256->2233|3341->2291|3369->2292|3906->2803|3935->2804|3994->2837|4022->2838|7636->6444|7650->6449|7690->6450|8034->6757|8048->6761|8096->6786|8718->7379|8748->7380|8838->7442|8867->7443|9398->7947|9428->7948|9504->7997|9533->7998|13421->11864|13456->11880|13476->11890|13517->11892|13564->11903|13594->11910|13638->11922
                    LINES: 13->1|16->1|18->3|18->3|18->3|18->3|24->9|24->9|39->24|39->24|39->24|39->24|39->24|39->24|39->24|39->24|39->24|45->30|45->30|45->30|57->42|57->42|57->42|74->59|74->59|76->61|76->61|89->74|89->74|93->78|93->78|174->159|174->159|174->159|186->171|186->171|186->171|203->188|203->188|205->190|205->190|218->203|218->203|222->207|222->207|309->294|314->299|314->299|314->299|316->301|316->301|318->303
                    -- GENERATED --
                */
            