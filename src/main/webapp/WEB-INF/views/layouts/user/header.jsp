<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="topNav">
		<div class="container">
			<div class="alignR">
				<div class="pull-left socialNw">
					<a href="#"><span class="icon-twitter"></span></a> <a href="#"><span
						class="icon-facebook"></span></a> <a href="#"><span
						class="icon-youtube"></span></a> <a href="#"><span
						class="icon-tumblr"></span></a>
				</div>
				<a href="index.html"> <span class="icon-home"></span> Home
				</a> <a href="#"><span class="icon-user"></span> My Account</a> <a
					href="<c:url value="/register"/>"><span class="icon-edit"></span>
					Register </a> <a href="contact.html"><span class="icon-envelope"></span>
					Contact us</a> <a href="cart.html"><span class="icon-shopping-cart"></span>
					2 Item(s) - <span class="badge badge-warning"> $448.42</span></a>
			</div>
		</div>
	</div>
</div>

<!--
Lower Header Section 
-->
<div class="container">
	<div id="gototop"></div>
	<header id="header">
		<div class="row">
			<div class="span4">
				<h1>
					<a class="logo" href="<c:url value="/"/>"><span>Twitter
							Bootstrap ecommerce template</span> <img
						src="<c:url value="assets/user/img/logo-bootstrap-shoping-cart.png"/>"
						alt="bootstrap sexy shop"> </a>
				</h1>
			</div>
			<div class="span4">
				<div class="offerNoteWrapper">
					<h1 class="dotmark">
						<i class="icon-cut"></i> Twitter Bootstrap shopping cart HTML
						template is available @ $14
					</h1>
				</div>
			</div>
			<div class="span4 alignR">
				<p>
					<br> <strong> Support (24/7) : 0800 1234 678 </strong><br>
					<br>
				</p>
				<span class="btn btn-mini">[ 2 ] <span
					class="icon-shopping-cart"></span></span> <span
					class="btn btn-warning btn-mini">$</span> <span
					class="btn btn-mini">&pound;</span> <span class="btn btn-mini">&euro;</span>
			</div>
		</div>
	</header>
</div>
	<!--
Navigation Bar Section 
-->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<a data-target=".nav-collapse" data-toggle="collapse"
					class="btn btn-navbar"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="<c:url value="/"/>">Home </a></li>
						<li class=""><a href="list-view.html">List View</a></li>
						<li class=""><a href="grid-view.html">Grid View</a></li>
						<li class=""><a href="three-col.html">Three Column</a></li>
						<li class=""><a href="four-col.html">Four Column</a></li>
						<li class=""><a href="general.html">General Content</a></li>
					</ul>
					<form action="#" class="navbar-search pull-left">
						<input type="text" placeholder="Search" class="search-query span2">

						<ul class="nav pull-right">
							<li><a href="<c:url value="/login"/>"><span
									class="icon-lock"></span> Login</a></li>
						</ul>
					</form>
				</div>
			</div>
		</div>
	</div>