<%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%><stripes:url beanclass="com.hectorlopezfernandez.action.IndexAction" var="indexUrl"/>
	<header id="site-head">
        <a id="blog-logo" href="${indexUrl}"><div class="bloglogo"></div></a>
        <h1 class="blog-title"><a href="${indexUrl}">${blogTitle}</a></h1>
        <h2 class="blog-description">${blogTagline}</h2>
        <nav class="menu" role="navigation">
		    <ul>
		      <li><stripes:link beanclass="com.hectorlopezfernandez.action.ArchiveAction">Archivo</stripes:link></li>
		      <li><a href="/tags" target="_blank">Tags</a></li>
		      <li><a href="/curriculum">Curr&iacute;culum</a></li>
		      <li><a href="https://github.com/hectorlf" target="_blank">GitHub</a></li>
		      <li><a href="/about">Acerca de&hellip;</a></li>
		    </ul>
		</nav>
    </header>