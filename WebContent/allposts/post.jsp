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
<title>Post</title>
<link rel="alternate" type="application/rss+xml" title=""
	href="feed/index.html">
<link href="http://fonts.googleapis.com/css?family=Raleway:700,300"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="../css/prettify.css">
<script type="text/javascript" src="../js/prettify/prettify.js"></script>
<script src="https://cdn.bootcss.com/prettify/r298/run_prettify.js"></script>
<script src="../js/layout.js"></script> 
<script src="../js/jquery-2.2.1.js"></script>
<script src="../js/jquery.dataTables.js"></script>
<script src="../js/bootstrap.js"></script>
<script src="../js/posts.js"></script> 
</head>
<body>
<% System.out.println(request.getContextPath()); %>
<% System.out.println(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"); %>
	<div class="wrapper">
		<nav>

			<div class="pull-left">
				<h1>
					<a href="javascript:"><img src="img/icon.png"
						alt="Free Documentation Template Icon" /> <span>Chase</span></a>
				</h1>
			</div>

			<div class="pull-right">
				<a href="#" target="_blank" class="btn btn-download"><img
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
				
				<div class="docs-content-post">
					<div id="postContent">
						<h2 id="postTitle"></h2>
						Author: Chase &nbsp;&nbsp; Posted Date: <p id="postTime"></p>
						<hr/>
						<div id="postContent"></div>
					</div>
				</div>
			</div>
		</section>
		<section class="vibrant centered">
			<div class="">
				<h4>
					This documentation template is provided by <a href="#"
						target="_blank">Frittt</a>. You can download and use this template
					for free. If you have used this template, please pay the
					developer's effort by Tweeting, sharing on Facebook, social mention
					or with a linkback. Enjoy! :)
				</h4>
			</div>
		</section>
		<footer>
			<div class="">
				<p>
					&copy; Copyright Frittt Templates. All Rights Reserved.More
					Templates <a href="http://www.cssmoban.com/" target="_blank"
						title="模板之家">模板之家</a> - Collect from <a
						href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
				</p>
			</div>
		</footer>
	</div>
	
</body>
</html>
