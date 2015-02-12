<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<%@ page import="java.net.URLEncoder" %>
       <!-- Fixed navbar -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script type="text/javascript">
</script>
</head>
  
  <body>
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="../main.oe">목장보고관리시스템</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
          <c:if test="${sessionId.roleSeq>4 || sessionId==null}">
            <li class="divider"><a href="/user/list.oe">목장원 관리</a></li>
            </c:if>
            <c:if test="${sessionId.roleSeq<4 || sessionId==null}">
            <li class="divider"><a href="/user/saintList.oe">성도관리</a></li>
            
            <li class="dropdown">
          <a href="../main.oe" class="dropdown-toggle" data-toggle="dropdown">조직관리<b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/dept/list.oe?group=교구">교구관리</a></li>
<%--                 <li><a href="/dept/list.oe?group=<%=URLEncoder.encode("교구", "UTF-8")%>">교구관리</a></li> --%>
                <!-- <li><a href="/dept/list.oe?group=목장">목장관리</a></li> -->
                <li><a href="/dept/list.oe?group=교육부">교육부</a></li>
                <li><a href="/dept/list.oe?group=부서">부서관리</a></li>
              </ul>
            </li>
            </c:if>
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">목장보고서<b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/report/list.oe">목장보고서 목록보기</a></li>
                <li><a href="/report/regist.oe">이번주 목장보고서 등록하기</a></li>
                <li><a href="#">Something else here</a></li>
                <li class="divider"></li>
                <li class="dropdown-header">Nav header</li>
                <li><a href="#">Separated link</a></li>
                <li><a href="#">One more separated link</a></li>
              </ul>
            </li>
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">마이페이지 <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li class="divider"></li>
                <li class="dropdown-header">Nav header</li>
                <li><a href="#">Separated link</a></li>
                <li><a href="#">One more separated link</a></li>
              </ul>
            </li>
            <c:if test="${sessionId.userId==null}">
            <li><a href="/login/loginForm.oe"><span class="glyphicon glyphicon-on"></span>로그인</a></li>
          </c:if>
          <c:if test="${sessionId!=null}">
            <li><a href="/login/logout.oe"><span class="glyphicon glyphicon-off"></span>로그아웃</a></li>
          </c:if>
          
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    </body>
    </html>