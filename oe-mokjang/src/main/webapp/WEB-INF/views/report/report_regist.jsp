<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
      <!--  -->
       <form action="/report/regist.oe" method="post">
      <div class="form-group">
		  <div class="form-group">
		  	<label class="col-sm-2" for="meetingDate">목장모임 시간</label>
		     <div class="col-sm-10">
		    <input type="date" class="form-control" id="meetingDate" name="meetingDate" placeholder="목장모임 시간">
		  	</div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2" for="meetingPlace">모임장소</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="meetingPlace" name="meetingPlace" placeholder="모임장소">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="offering">헌금</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="offering" name="offering" placeholder="헌금">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="worshipMember">찬송인도</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="worshipMember" name="worshipMember" placeholder="찬송인도">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="welcomeMember">기도인도</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="welcomeMember" name="welcomeMember" placeholder="기도인도">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="workMember">사역인도</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="workMember" name="workMember" placeholder="사역인도">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="wordMember">말씀인도</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="wordMember" name="wordMember" placeholder="집주소">
		  	</div>
		  </div>
		  <div class="form-group">
		  	<label class="col-sm-2" for="nextMeetingPlace">다음모임장소</label>
		     <div class="col-sm-10">
		    <input type="text" class="form-control" id="nextMeetingPlace" name="nextMeetingPlace" placeholder="다음모임장소">
		  	</div>
		  </div>
	  </div>
	  <!-- -->
      <hr />
     
       <table class="table table-bordered">
       <caption>이번주 목장보고서 등록</caption>
       <colgroup>
       		<col width="4%" />
       		<col width="8%" />
       		<col width="8%" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       </colgroup>
       <thead>
          <tr>
            <th>번호</th>
            <th>목장원이름</th>
            <th>목장집회<br />참석</th>
            <th>목장<br />새등록자</th>
            <th>8주<br />참석자</th>
            <th>목장등록후<br />교회등록</th>
            <th>양육1권<br />수료자</th>
            <th>학교양육<br />1권수료</th>
            <th>교회등록</th>
            <th>교회등록후<br />목장참석</th>
            <th>목장집회<br />1명감소</th>
            <th>번식하여<br />나가는분</th>
            <th>식당봉사</th>
          </tr>
          
        </thead>
        <tbody>
        <c:forEach var="member" items="${members}" varStatus="s">
          <tr class="active">
           	<td>${s.count}</td>
            <td><input type="text" class="form-control" name="memberName[]" value="${member.name}" disabled /></td>
            <td><input type="number" class="form-control" name="attendMokjang[]" value="0" /></td>
            <td><input type="number" class="form-control" name="enrollMokjang[]" value="0" /></td>
            <td><input type="number" class="form-control" name="attend8weeksMokjang[]" value="0" /></td>
            <td><input type="number" class="form-control" name="attendMokjangAfterChurch[]" value="0" /></td>
            <td><input type="number" class="form-control" name="graduateNutureMokjang[]" value="0" /></td>
            <td><input type="number" class="form-control" name="graduateSchoolChurch[]" value="0" /></td>
            <td><input type="number" class="form-control" name="enrollChurch[]" value="0" /></td>
            <td><input type="number" class="form-control" name="enrollChurchAfterEnrollMokjang[]" value="0" /></td>
            <td><input type="number" class="form-control" name="decreaseAttendantMokjangChurch[]" value="0" /></td>
            <td><input type="number" class="form-control" name="sentChurch[]" value="0" /></td>
            <td><input type="number" class="form-control" name="restaurantService[]" value="0" /></td>
          </tr>
          <input type="hidden" name="memberId[]" value="${member.id}" />
          </c:forEach>
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