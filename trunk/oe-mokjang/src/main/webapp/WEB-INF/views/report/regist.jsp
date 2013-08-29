<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>목장 보고서 입력</title>
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
		<%@ include file="../include/header.jsp" %>
		<!-- //header -->

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1>Marketing stuff!</h1>
        <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
        <p><a class="btn btn-lg btn-success" href="#">Get started today</a></p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
      <form action="/report/regist.oe" method="post">
       <table class="table table-bordered">
        <thead>
          <tr>
          	<th rowspan="2">번호</th>
          	<th rowspan="2">이름</th>
            <th rowspan="2">제자와<br /> 목장원</th>
            <th colspan="5">예배</th>
            <th colspan="3">기도</th>
            <th rowspan="2">성경 </th>
            <th rowspan="2">성미 </th>
            <th rowspan="2">목장<br />인도 </th>
            <th rowspan="2">양육<br />인도 </th>
            <th rowspan="2">교회<br />등록 </th>
            <th rowspan="2">특별<br />행사 </th>
          </tr>
          <tr>
            <th>주일 낮</th>
            <th>목장<br/>집회</th>
            <th>저녁 </th>
            <th>수요 </th>
            <th>가정 </th>
            <th>새벽 </th>
            <th>철야 </th>
            <th>골방 </th>
          </tr>
          
        </thead>
        <tbody>
          <tr class="active">
           	<td>1</td>
            <td><input type="text" class="form-control" name="name" /></td>
            <td><input type="text" class="form-control" name="role" /></td>
            <td>
            	<select class="form-control" name="LordDay">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="mokjang">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="LordNight">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="wednesday">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td><input type="number" class="form-control" name="home" /></td>
            <td><input type="number" class="form-control" name="dawn" /></td>
            <td><input type="number" class="form-control" name="allNight" /></td>
            <td><input type="number" class="form-control" name="private" /></td>
            <td><input type="number" class="form-control" name="word" /></td>
            <td><input type="number" class="form-control" name="ritualRice" /></td>
            <td><input type="number" class="form-control" name="commitment" /></td>
            <td><input type="number" class="form-control" name="enroll" /></td>
            <td><input type="number" class="form-control" name="rearing" /></td>
            <td><input type="number" class="form-control" name="specialEvent" /></td>
          </tr>
          <tr class="success">
           <td>2</td>
           <td><input type="text" class="form-control" name="name" /></td>
            <td><input type="text" class="form-control" name="role" /></td>
            <td>
            	<select class="form-control" name="LordDay">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="mokjang">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="LordNight">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="wednesday">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td><input type="number" class="form-control" name="home" /></td>
            <td><input type="number" class="form-control" name="dawn" /></td>
            <td><input type="number" class="form-control" name="allNight" /></td>
            <td><input type="number" class="form-control" name="private" /></td>
            <td><input type="number" class="form-control" name="word" /></td>
            <td><input type="number" class="form-control" name="ritualRice" /></td>
            <td><input type="number" class="form-control" name="commitment" /></td>
            <td><input type="number" class="form-control" name="enroll" /></td>
            <td><input type="number" class="form-control" name="rearing" /></td>
            <td><input type="number" class="form-control" name="specialEvent" /></td>
          </tr>
          <tr class="warning">
            <td>2</td>
            <td><input type="text" class="form-control" name="name" /></td>
            <td><input type="text" class="form-control" name="role" /></td>
            <td>
            	<select class="form-control" name="LordDay">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="mokjang">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="LordNight">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="wednesday">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td><input type="number" class="form-control" name="home" /></td>
            <td><input type="number" class="form-control" name="dawn" /></td>
            <td><input type="number" class="form-control" name="allNight" /></td>
            <td><input type="number" class="form-control" name="private" /></td>
            <td><input type="number" class="form-control" name="word" /></td>
            <td><input type="number" class="form-control" name="ritualRice" /></td>
            <td><input type="number" class="form-control" name="commitment" /></td>
            <td><input type="number" class="form-control" name="enroll" /></td>
            <td><input type="number" class="form-control" name="rearing" /></td>
            <td><input type="number" class="form-control" name="specialEvent" /></td>
          </tr>
          <tr class="danger">
            <td>4</td>
            <td><input type="text" class="form-control" name="name" /></td>
            <td><input type="text" class="form-control" name="role" /></td>
            <td>
            	<select class="form-control" name="LordDay">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="mokjang">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="LordNight">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td>
            	<select class="form-control" name="wednesday">
				  <option>O</option>
				  <option>X</option>
				</select>
			</td>
            <td><input type="number" class="form-control" name="home" /></td>
            <td><input type="number" class="form-control" name="dawn" /></td>
            <td><input type="number" class="form-control" name="allNight" /></td>
            <td><input type="number" class="form-control" name="private" /></td>
            <td><input type="number" class="form-control" name="word" /></td>
            <td><input type="number" class="form-control" name="ritualRice" /></td>
            <td><input type="number" class="form-control" name="commitment" /></td>
            <td><input type="number" class="form-control" name="enroll" /></td>
            <td><input type="number" class="form-control" name="rearing" /></td>
            <td><input type="number" class="form-control" name="specialEvent" /></td>
          </tr>
        </tbody>
      </table>
      <button type="submit" class="btn btn-default">등록</button>
      </form>
      </div>

		<!-- Site footer -->
      <%@ include file="../include/footer.jsp" %>
      <!-- //Site footer -->

    </div> <!-- /container -->
	
</body>
</html>