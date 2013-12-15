<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>교회 등록</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	    <!-- header -->
		<%@ include file="../../include/header.jsp" %>
		<!-- //header -->

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1>Marketing stuff!</h1>
        <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
        <p><a class="btn btn-lg btn-success" href="#">Get started today</a></p>
      </div>
      <div class="container">
		<button type="button" class="btn btn-primary"" onclick="javascript:location.href='/report/regist.oe';">목장 보고서 작성하기 </button>
      </div>
	
	<div class="container">
		<form class="form-horizontal" role="form" method="post" action="/church/regist.oe">
		  <div class="form-group">
		    <label for="inputEmail1" class="col-lg-2 control-label">교회 이름</label>
		    <div class="col-lg-10">
		      <input type="text" class="form-control" id="churchNm" name="churchNm" placeholder="교회 이름">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword1" class="col-lg-2 control-label">Password</label>
		    <div class="col-lg-10">
		      <input type="password" class="form-control" id="inputPassword1" placeholder="Password">
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
		    </div>
		  </div>
		</form>
		</div>

      <!-- Site footer -->
      <%@ include file="../../include/footer.jsp" %>
      <!-- //Site footer -->
    </div> <!-- /container -->
</body>
</html>