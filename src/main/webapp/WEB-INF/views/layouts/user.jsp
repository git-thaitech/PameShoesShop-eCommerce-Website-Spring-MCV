<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="utf-8">
<title><decorator:title default="Master-Layout"></decorator:title>  </title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link href="<c:url value="/assets/user/css/bootstrap.css"/>"
	rel="stylesheet" />

<link href="<c:url value="/assets/user/style.css"/>" rel="stylesheet" />

<link
	href="<c:url value="/assets/user/font-awesome/css/font-awesome.css"/>"
	rel="stylesheet">
<link href="<c:url value="/assets/user/ico/favicon.ico"/>"
	rel="shortcut icon">
</head>


<body>

	<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>
	<decorator:body></decorator:body>
	<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>


	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<c:url value="/assets/user/js/jquery.js"/>"></script>
	<script src="<c:url value="/assets/user/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/jquery.easing-1.3.min.js"/>"></script>
	<script
		src="<c:url value="/assets/user/js/jquery.scrollTo-1.4.3.1-min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/shop.js"/>"></script>
</body>
</html>
