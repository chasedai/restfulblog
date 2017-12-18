<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="description" content="">
<meta name="HandheldFriendly" content="True">
<meta name="MobileOptimized" content="320">
<meta name="viewport"
	content="initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>Blog HomePage</title>
<link rel="alternate" type="application/rss+xml" title=""
	href="feed/index.html">
<link href="http://fonts.googleapis.com/css?family=Raleway:700,300"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/prettify.css">
  
<script src="js/jquery-2.2.1.js"></script>
<script src="js/jquery.dataTables.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/ap.js"></script> 
<!--<script>
function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      $("#testforRest4").append(this.responseText);
    }
  };
  xhttp.open("GET", "http://" + window.location.host+"/Blog/rest/posts", true);
  xhttp.send();
}
$(document).ready(function(){
	loadDoc();
});
//window.onload = loadDoc;
</script>-->
</head>
<body>
<% System.out.println(request.getContextPath()); %>
<% System.out.println(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"); %>
	<div class="wrapper">
		<nav>

			<div class="pull-left">
				<h1>
					<a><img src="img/icon.png"
						alt="Free Documentation Template Icon" /> <span>Chase</span></a>
				</h1>
			</div>

			<div class="pull-right">
				<a class="btn btn-download"><img
					src="img/download.png" width="25" alt="Temp" /> Temp button</a>
			</div>

		</nav>
		<header>
			<div class="container">
				<h2 class="lone-header">Chase Single User Blog</h2>
			</div>
		</header>
		<section>
			<div class="container">
				<ul class="docs-nav">
					<li><strong>Categories</strong></li>
					<li><a href="#welcome" class="cc-active">Java</a></li>
					<li><a href="#welcome" class="cc-active">PHP</a></li>
					<li><a href="#welcome" class="cc-active">SQL</a></li>
					<li><a href="#welcome" class="cc-active">Front-end</a></li>
				</ul>
				<div class="docs-content">
					<div id="allPosts">
						<script>
							//alert(window.location.host);
						</script>
					</div>
				</div>
			</div>
		</section>
		<section class="vibrant centered">
			<div class="">
				<h4>
					Have a nice day!
				</h4>
			</div>
		</section>
		<footer>
			<div class="">
				<p>
					&copy; Copyright <a href="https://www.behance.net/iamfrittt3d6c">Frittt Templates</a>. All Rights Reserved
				</p>
			</div>
		</footer>
	</div>
	<script src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/prettify/prettify.js"></script>
	<script src="https://cdn.bootcss.com/prettify/r298/run_prettify.js"></script>
	<script src="js/layout.js"></script>
</body>
</html>
