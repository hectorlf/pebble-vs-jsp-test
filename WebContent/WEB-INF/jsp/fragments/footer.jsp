<%@taglib prefix="h" uri="http://www.hectorlopezfernandez.com/jsp/tags"%><%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
	<footer class="site-footer">
    	<div>
        	<section class="footer-description">
        		<form role="search" method="get" id="searchform" action="/search.action">
					<i class="fa fa-search"></i>
					<input type="search" id="s" name="q" placeholder="Buscar..." value="${h:escape(queryText)}" maxlength="50"/>
				</form>
			</section>
            <section class="copyright"><a rel="license" title="Esta obra est&aacute; bajo una licencia Creative Commons" href="http://creativecommons.org/licenses/by/3.0/es/" style="vertical-align:middle;"><img alt="Esta obra est&aacute; bajo una licencia Creative Commons" style="border-width:0" src="//licensebuttons.net/l/by/3.0/es/80x15.png" height="15" width="80"/></a> Licencia Creative Commons &#8226; <a>Privacidad y condiciones</a></section>
            <section>Tema &ldquo;Vapor&rdquo; diseñado por <a href="http://sethlilly.com/">Seth Lilly</a></section>
            <section class="poweredby"></section>
        </div>
    </footer>