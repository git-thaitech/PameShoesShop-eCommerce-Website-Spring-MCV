<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>Register Account</title>








<div class="row">
	<div id="sidebar" class="span3">
		<div class="well well-small">
			<ul class="nav nav-list">
				<c:forEach var="item" items="${listCategoriesName}">
					<li><a href="products.html"><span
							class="icon-chevron-right"></span><c:out value = "${item}"/></a></li>
				</c:forEach>
				<li style="border: 0"></li>
			</ul>
		</div>

		<div class="well well-small alert alert-warning cntr">
			<h2>50% Discount</h2>
			<p>
				only valid for online order. <br>
				<br>
				<a class="defaultBtn" href="#">Click here </a>
			</p>
		</div>
		<div class="well well-small">
			<a href="#"><img src="assets/img/paypal.jpg"
				alt="payment method paypal"></a>
		</div>

		<a class="shopBtn btn-block" href="#">Upcoming products <br>
		<small>Click to view</small></a> <br> <br>
		<ul class="nav nav-list promowrapper">
			<li>
				<div class="thumbnail">
					<a class="zoomTool" href="product_details.html" title="add to cart"><span
						class="icon-search"></span> QUICK VIEW</a> <img
						src="assets/img/bootstrap-ecommerce-templates.png"
						alt="bootstrap ecommerce templates">
					<div class="caption">
						<h4>
							<a class="defaultBtn" href="product_details.html">VIEW</a> <span
								class="pull-right">$22.00</span>
						</h4>
					</div>
				</div>
			</li>
			<li style="border: 0">&nbsp;</li>
			<li>
				<div class="thumbnail">
					<a class="zoomTool" href="product_details.html" title="add to cart"><span
						class="icon-search"></span> QUICK VIEW</a> <img
						src="assets/img/shopping-cart-template.png"
						alt="shopping cart template">
					<div class="caption">
						<h4>
							<a class="defaultBtn" href="product_details.html">VIEW</a> <span
								class="pull-right">$22.00</span>
						</h4>
					</div>
				</div>
			</li>
			<li style="border: 0">&nbsp;</li>
			<li>
				<div class="thumbnail">
					<a class="zoomTool" href="product_details.html" title="add to cart"><span
						class="icon-search"></span> QUICK VIEW</a> <img
						src="assets/img/bootstrap-template.png" alt="bootstrap template">
					<div class="caption">
						<h4>
							<a class="defaultBtn" href="product_details.html">VIEW</a> <span
								class="pull-right">$22.00</span>
						</h4>
					</div>
				</div>
			</li>
		</ul>

	</div>
	<div class="span9">
		<ul class="breadcrumb">
			<li><a href="<c:url value="/"/>">Home</a> <span class="divider">/</span></li>
			<li class="active">Login</li>
		</ul>
		<h3>Login</h3>
		<hr class="soft" />







		<div class="well">
			<form:form class="form-horizontal" method="POST" action="login" modelAttribute="user">
				<h3>Your Personal Details</h3>

				<div class="control-group">
					<label class="control-label">Email <sup>*</sup></label>
					<div class="controls">
						<form:input type="email" placeholder="Email" path="email"/>
					</div>
				</div>


				<div class="control-group">
					<label class="control-label">Password <sup>*</sup></label>
					<div class="controls">
						<form:input type="password" placeholder="Password" path="password"/>
					</div>
				</div>
				
				<div class="control-group">
					<div class="controls">
						<input type="submit" value="Login"
							class="exclusive shopBtn">
					</div>
				</div>
				<div>
				 <p style="color:green; text-align: center"><i>${status}</i></p>
				</div>
			</form:form>
		</div>




	</div>
</div>

