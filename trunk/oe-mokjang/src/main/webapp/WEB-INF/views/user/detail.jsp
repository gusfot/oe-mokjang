	<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/paging-1.js"></script>

<script type="text/javascript">
function parent(){
	greeting();
}
$(document).ready(function(){
	parent();
});

</script>
</head>
<body>
	<div class="page-header">
	  <h1>Example page header <small>Subtext for header</small></h1>
	</div>
	<div>
		<nav class="navbar navbar-inverse" role="navigation">
  		<div class="collapse navbar-collapse navbar-ex8-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="/main.oe">HHome</a></li>
            <li><a href="regist.oe">Link</a></li>
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
	      <button type="submit" class="btn btn-default">Sign asdin</button>
	    </div>
	  </div>
	</form>
	</div>
	
	
	<!-- Button trigger modal -->
<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  Launch demo modal
</button>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title">Modal title</h4>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
</html>