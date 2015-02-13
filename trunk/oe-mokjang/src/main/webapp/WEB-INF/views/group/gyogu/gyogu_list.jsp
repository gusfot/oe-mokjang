r<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>등록 교구 목록</title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	

<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/paging-1.js"></script>

</head>
<body>
        <%@ include file="../../include/header.jsp" %>
    <div class="container">
      <div class="row">
     
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">조직관리</h1>

          <c:if test="${groupName==null}">
          <h2 class="sub-header">교구관리</h2>
          </c:if>
          <c:if test="${groupName!=null}">
          <h2 class="sub-header">${groupName}관리</h2>
          </c:if>
          
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>No</th>
            	   <th>교구이름</th>
                  <th>상위부서</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach var="list" items="${pageList.items}" varStatus="s">
                <tr>
                  <td>${s.count}</td>
                  <td><a data-toggle="modal" href="detail.oe?deptSeq=${list.deptSeq}&group=${groupName}" data-target="#myModal">${list.deptName}</a></td>
                  <td>오병이어교회</td>
                </tr>
                </c:forEach>
              </tbody>
            </table>
            <%-- <a data-toggle="modal" href="registForm.oe" data-target="#myModal"><button>${groupName }추가</button></a> --%>
            <a href="registForm.oe?group=${groupName}" ><button>${groupName }추가</button></a>
          </div>
        </div>
      </div>
    </div>
    
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
      <div class="modal-body">
      </div>
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

</body>
</html>