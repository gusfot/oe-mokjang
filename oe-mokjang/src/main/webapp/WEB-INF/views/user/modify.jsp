	<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>로그인</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/paging-1.js"></script>
<!-- <script type="text/javascript" src="/js/paging-1.js"></script> -->

</head>
<body>

	<div class="page-header">
	  <h1>Example page header <small>Subtext for header</small></h1>
	</div>
	<div>
		<nav class="navbar navbar-inverse" role="navigation">
  		<div class="collapse navbar-collapse navbar-ex8-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">Link</a></li>
            <li><a href="#">Link</a></li>
          </ul>
        </div>
</nav>
	</div>
	<div>
	<form class="form-horizontal" role="form" action="/login.oe" method="post" >
	  <div class="form-group">
	    <label for="inputEmail1" class="col-lg-2 control-label">Email</label>
	    <div class="col-lg-10">
	      <input type="email" class="form-control" id="inputEmail1" name="id" placeholder="Email">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword1" class="col-lg-2 control-label">Password</label>
	    <div class="col-lg-10">
	      <input type="password" class="form-control" id="inputPassword1" name="password" placeholder="Password">
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="col-lg-offset-2 col-lg-10">
	      <div class="checkbox">
	        <label>
	          <input type="checkbox"> Remember me
	        </label>
	      </div>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="col-lg-offset-2 col-lg-10">
	      <button type="submit" class="btn btn-default">Sign in</button>
	      <input type="button" value="AjaxTest" onclick="greeting()" > 
	    </div>
	  </div>
	</form>
	</div>
</body>
</html>