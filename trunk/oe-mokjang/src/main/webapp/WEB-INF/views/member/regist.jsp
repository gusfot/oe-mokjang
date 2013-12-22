<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원등록</title>
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
	<div class="page-header">
	  <h1>회원 가입 <small>Subtext for header</small></h1>
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
	<div class="container">
		<form class="form-horizontal" role="form" action="/member/regist.oe" method="post">
		  <div class="form-group">
		    <label class="col-sm-2" for="email">이메일 주소</label>
		     <div class="col-sm-10">
		    <input type="email" class="col-sm-10 form-control" id="email" name="email" placeholder="Email">
		  	</div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2" for="password">비밀번호</label>
		     <div class="col-sm-10">
		    <input type="password" class="form-control" id="password" name="password" placeholder="비밀번호">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="memberName">이름</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="name" name="name" placeholder="이름">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="exampleInputPassword1">직업</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="job" name="job" placeholder="직업">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="address">집주소</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="address" name="address" placeholder="집주소">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="birthday">생일</label>
		     <div class="col-sm-10">
		    <input type="date" class="form-control" id="birthday" name="birthday" placeholder="생일">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="mobilePhone">휴대폰</label>
		     <div class="col-sm-10">
		    <input type="tel" class="form-control" id="mobilePhone" name="mobilePhone" placeholder="휴대폰">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="homePhone">집전화번호</label>
		     <div class="col-sm-10">
		    <input type="tel" class="form-control" id="homePhone" name="homePhone" placeholder="집전화번호">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="gyogu">교구</label>
		    <div class="col-sm-10">
			    <select class="form-control" id="gyogu" name="gyogu">
				  <option value="1">소하1교구</option>
				  <option value="2">소하2교구</option>
				  <option value="3">소하3교구</option>
				  <option value="4">소하4교구</option>
				  <option value="5">소하5교구</option>
				  <option value="6">소하6교구</option>
				  <option value="7">소하7교구</option>
				  <option value="8">소하8교구</option>
				</select>
			</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" >직분</label>
		    <div class="col-sm-10">
			   <label class="radio-inline">
				  <input type="radio" name="role" id="role1" value="1"> 교구장 
				</label>
				<label class="radio-inline">
				  <input type="radio" name="role" id="role2" value="2"> 목자
				</label>
				<label class="radio-inline">
				  <input type="radio" name="role" id="role3" value="3"> 목장원 
				</label>
			</div>
		  </div>
		  
		  <div class="checkbox">
		    <label>
		      <input type="checkbox"> Check me out
		    </label>
		  </div>
		  <button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
</body>
</html>