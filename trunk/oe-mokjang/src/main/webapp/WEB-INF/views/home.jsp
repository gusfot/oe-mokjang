<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<!-- Optional theme -->
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">
	<!-- Latest compiled and minified JavaScript -->
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
	<form class="form-inline" role="form" action="/test.oe" method="post">
	  <div class="form-group">
	    <label class="sr-only" for="exampleInputEmail2">Email address</label>
	    <input type="email" class="form-control" id="exampleInputEmail2" name="email" placeholder="Enter email">
	  </div>
	  <div class="form-group">
	    <label class="sr-only" for="exampleInputPassword2">Password</label>
	    <input type="password" class="form-control" id="exampleInputPassword2" name="pw" placeholder="Password">
	  </div>
	  <div class="checkbox">
	    <label>
	      <input type="checkbox"> Remember me
	    </label>
	  </div>
	  <button type="submit" class="btn btn-default">Sign in</button>
	</form>
</body>
</html>
