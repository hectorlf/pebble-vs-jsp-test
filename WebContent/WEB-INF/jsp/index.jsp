<%@page session="false"%><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE html>
<c:set var="pageName" value="Inicio"/><c:set var="blogTitle" value="${preferences.title}"/><c:set var="blogTagline" value="${preferences.tagline}"/><c:set var="posts" value="${actionBean.posts}"/><c:set var="metaDescription" value="Un blog sobre Internet, Java, Android, tecnología y consultoría, aderezado con historias de terror extraídas del curro diario."/>
<html>

<%@include file="/WEB-INF/jsp/fragments/head.jsp"%>

<body>
<%@include file="/WEB-INF/jsp/fragments/header.jsp"%>

	<main role="main">
<c:forEach items="${posts}" var="post" varStatus="status">
<%@include file="/WEB-INF/jsp/fragments/post-excerpt.jsp"%>
</c:forEach>
	</main>

<%@include file="/WEB-INF/jsp/fragments/footer.jsp"%>

<%@include file="/WEB-INF/jsp/fragments/deferred-styles.jsp"%>
<%@include file="/WEB-INF/jsp/fragments/syntaxhighlighter-scripts.jsp"%>
</body>

</html>