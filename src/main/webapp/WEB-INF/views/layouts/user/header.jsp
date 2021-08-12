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
				<a href="<c:url value="/"/>"> <span class="icon-home"></span>
					Home
				</a> <a href="#"><span class="icon-user"></span> My Account</a>

				<c:if test="${sessionScope.userSession == null}">
					<a href="<c:url value="/register"/>"><span class="icon-edit"></span>
						Register Now </a>

				</c:if>


				<a href="<c:url value="/contact"/>"><span class="icon-envelope"></span>
					Contact us</a> <a href="cart.html"><span class="icon-shopping-cart"></span>
					2 Item(s) - <span class="badge badge-warning"> $448.42</span></a>
			</div>
		</div>
	</div>
</div>

<!--
Lower Header Section 
-->

<div id="gototop"></div>
<header id="header">
	<div class="row">
		<div class="span4">
			<h1>
				<a class="logo" href="<c:url value="/"/>"><span>Pame
						Shoes Shop</span> <img
					src="<c:url value="/assets/user/img/logo-bootstrap-shoping-cart.png"/>"
					alt="bootstrap sexy shop"> </a>
			</h1>
		</div>
		<div class="span4">
			<div class="offerNoteWrapper">
				<h1 class="dotmark">
					<i class="icon-cut"></i> Get super sales 50%%%%%%
				</h1>
			</div>
		</div>
		<div class="span4 alignR">
			<p>
				<br> <strong> Github : github.com/thaitechnet </strong><br>
				<br>
			</p>
			<span class="btn btn-mini">[ 2 ] <span
				class="icon-shopping-cart"></span></span> <span
				class="btn btn-warning btn-mini">$</span> <span class="btn btn-mini">&pound;</span>
			<span class="btn btn-mini">&euro;</span>
		</div>
	</div>
</header>


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
					<li class=""><a href="<c:url value="/product"/>">Products</a></li>
					<li class=""><a href="<c:url value="/"/>">Nike</a></li>
					<li class=""><a href="<c:url value="/"/>">Adidas</a></li>
					<li class=""><a href="<c:url value="/"/>">Palladium</a></li>
					<li class=""><a href="<c:url value="/"/>">Converse</a></li>
				</ul>
				<form action="#" class="navbar-search pull-left">
					<input type="text" placeholder="Search" class="search-query span2">
				</form>
				<ul class="nav pull-right">
					<c:if test="${sessionScope.userSession == null }">
						<li><a href="<c:url value="/login"/>"><span
								class="icon-lock"></span> Login</a></li>
					</c:if>
					<c:if test="${sessionScope.userSession != null }">
						<li><a href="<c:url value="/"/>">Hello ${sessionScope.userSession.firstName},</a></li>
						<li><a href="<c:url value="/logout"/>">Logout</a></li>
					</c:if>

				</ul>
			</div>
		</div>
	</div>
</div>
