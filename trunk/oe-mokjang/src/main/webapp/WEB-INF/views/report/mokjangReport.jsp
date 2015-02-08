<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>목장 보고서 입력</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

<!-- Custom styles for this template -->
 <link href="/resources/assets/css/dashboard.css" rel="stylesheet">
</head>
<body>

<div>
	<h2>목장집회 보고서 (하나님은 정직한 사람을 복 주십니다.)</h2>
</div>
<div class="row">
  <div class="col-md-3">
  <form class="form-horizontal">
      <div class="form-group">
        <label for="inputEmail3" class="col-sm-3 control-label">교구</label>
        <div class="col-sm-8">
          <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword3" class="col-sm-3 control-label">목장</label>
        <div class="col-sm-8">
          <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword4" class="col-sm-3 control-label">집회일시</label>
        <div class="col-sm-8">
          <input type="date" class="form-control" id="inputPassword4" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword5" class="col-sm-3 control-label">집회장소</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword5" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword6" class="col-sm-3 control-label">마음열기</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword6" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword7" class="col-sm-3 control-label">찬송인도</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword7" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword8" class="col-sm-3 control-label">말씀인도</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword8" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword9" class="col-sm-3 control-label">사역인도</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword9" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword10" class="col-sm-3 control-label">다음장소</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword10" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword11" class="col-sm-3 control-label">목장선교헌금</label>
        <div class="col-sm-8">
          <input type="number" class="form-control" id="inputPassword11" placeholder="원">
        </div>
      </div>
      <div class="form-group">
     	 <label for="inputPassword12" class="col-sm-3 control-label">기타보고사항</label>
        <div class="col-sm-8">
          <textarea rows="" cols="" id="inputPassword12"></textarea>
        </div>
      </div>
    </form>
  </div>
  <div class="col-md-7">
	<table class="table table-bordered">
      <caption>Optional table caption.</caption>
      <thead>
        <tr>
          <th>번호</th>
          <th>목장원이름</th>
          <th>목장집회참석</th>
          <th>목장새등록자</th>
          <th>8주차참석자</th>
          <th>목장등록후 교회등록</th>
          <th>양육1권수료자</th>
          <th>학교양육1권수료</th>
          <th>교회등록</th>
          <th>교회등록후목장참석</th>
          <th>목장집회1명감소</th>
          <th>번식하여나가는분</th>
          <th>식당봉사</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th scope="row">1</th>
          <td>Mark</td>
          <td>Otto</td>
          <td>@mdo</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">2</th>
          <td>Jacob</td>
          <td>Thornton</td>
          <td>@fat</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      </tbody>
    </table>
  </div>
</div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
	<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- Latest compiled and minified JavaScript -->
    <!-- <script src="/resources/assets/js/docs.min.js"></script> -->
    
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <!-- <script src="/resources/assets/js/ie10-viewport-bug-workaround.js"></script> -->
  </body>
</html>