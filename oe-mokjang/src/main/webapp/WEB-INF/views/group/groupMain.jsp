r<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
 
  <title> New Document </title>
  <meta name="Generator" content="EditPlus">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />
	

<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/paging-1.js"></script>
   <!--초기화-->
  <style>
html, body, div, span, applet, object, iframe,
, p, blockquote, pre,
a, abbr, acronym, address, big, cite, code,
del, dfn, em, img, ins, kbd, q, s, samp,
small, strike, strong, sub, sup, tt, var,
b, u, i, center,
dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, canvas, details, embed, 
figure, figcaption, footer, header, hgroup, 
menu, nav, output, ruby, section, summary,
time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
}
/* HTML5 display-role reset for older browsers */
article, aside, details, figcaption, figure, 
footer, header, hgroup, menu, nav, section {
	display: block;
}
body {
	line-height: 1;
}
ol, ul {
	list-style: none;
}
blockquote, q {
	quotes: none;
}
blockquote:before, blockquote:after,
q:before, q:after {
	content: '';
	content: none;
}
table {
	border-collapse: collapse;
	border-spacing: 0;
}

  * { margin: 0; padding: 0; }
        body { font-family: 'Times New Roman', serif; }
        li { list-style: none; }
        a { text-decoration: none; }
        img { border: 0; }
    
  </style>

<!--헤더 -->
<style>
	#main_header{
	/*중앙정렬*/
	width:960px; margin:0 auto;

	/*절대좌표*/
	height:160px;
	position:relative;
	}
	#main_header > #title{ position:absolute; left:20px; top:30px; }
	#main_header > #main_gnb{position:absolute; right:0; top:0;}
	#main_header > #main_lnb{position:absolute; right:0; bottom:10px;}

	/*타이틀*/
	#title{ font-family:'Droid sans', cursive;}

	/*메뉴1*/

        #main_gnb > ul { overflow: hidden; } 
        #main_gnb > ul > li { float: left; } 
        #main_gnb > ul > li > a {
            display: block;
            padding: 2px 10px;
            border: 1px solid black;
        }
        #main_gnb > ul > li > a:hover {
            background: black;
            color: white;
        }
        #main_gnb > ul > li:first-child > a { border-radius: 10px 0 0 10px; }
        #main_gnb > ul > li:last-child > a  { border-radius: 0 10px 10px 0; }
    

	/*메뉴2*/
        #main_lnb > ul { overflow: hidden; }
        #main_lnb > ul > li { float: left; }
        #main_lnb > ul > li > a {
            display: block;
            padding: 10px 20px;
            border: 1px solid black;
        }
        #main_lnb > ul > li > a:hover {
            background: black;
            color: white;
        }
        #main_lnb > ul > li:first-child > a { border-radius: 10px 0 0 10px; }
        #main_lnb > ul > li:last-child > a  { border-radius: 0 10px 10px 0; }
    
	/*컨텐츠*/
	
        #content {
            /* 중앙 정렬 */
            width: 796px; margin: 0 auto;

            /* 수평 레이아웃 구성 */
            overflow: hidden;
        }
        #content > #main_section {
            width: 750px;
            float: left;
        }
        #content > #main_aside {
            width: 200px;
            float: right;
        }
    
	/*본문*/
	
        #main_section > article.main_article {
            margin-bottom: 10px;
            padding: 20px;
            border: 1px solid black;
        }
    
	/*목록*/
	
        .item {
            overflow: hidden;
            padding: 10px;
            border: 1px solid black;
            border-top: none;
        }
        .thumbnail {
            float: left;
        }
        .description {
            float: left;
            margin-left: 10px;
        }
        .description > strong {
            display: block;
            width: 120px;
            white-space: nowrap;
            overflow: hidden;
            text-overflow: ellipsis;
        }

		/*푸터*/
        #main_footer {
            /* 중앙 정렬 */
            width: 960px; margin: 0 auto;
            margin-bottom: 10px;

            /* 테두리 */
            box-sizing: border-box;
            padding: 10px;
            border: 1px solid black;

            /* 글자 정렬 */
            text-align: center;
        }
</style>

<script type="text/javascript">
function pageR(param){
	var html = '';
	var total=""
	var item = null;
	$.ajax({
		type:"GET",
		url:'/dept/mainList.oe?group=gyogu',
	success : function(result) {
		var rawJsonData = JSON.parse(result);
		for (var i=0; i<rawJsonData.length; i++) {
			item = rawJsonData[i];
			html += '<tr>';
			html += '	<td>'+(i+1)+'</td>';
			html += '	<td>'+item.deptName+'</td>';
			html += '	<td>오병이어</td>';
			html += '</tr>';
		}
		$('#tbody-item-list-gyogu').html(html);
	}
	});
	$.ajax({
		type:"GET",
		url:'/dept/mainList.oe?group=edu',
	success : function(result) {
		var rawJsonData = JSON.parse(result);
		for (var i=0; i<rawJsonData.length; i++) {
			item = rawJsonData[i];
			html += '<tr>';
			html += '	<td>'+(i+1)+'</td>';
			html += '	<td>'+item.deptName+'</td>';
			html += '	<td>오병이어</td>';
			html += '</tr>';
		}
		$('#tbody-item-list-edu').html(html);
	}
	});
	
	$.ajax({	
		type:"GET",
		url:'/dept/mainList.oe?group=depart',
	success : function(result) {
		var rawJsonData = JSON.parse(result);
		for (var i=0; i<rawJsonData.length; i++) {
			item = rawJsonData[i];
			html += '<tr>';
			html += '	<td>'+(i+1)+'</td>';
			html += '	<td>'+item.deptName+'</td>';
			html += '	<td>오병이어</td>';
			html += '</tr>';
		}
		$('#tbody-item-list-depart').html(html);
	}
	});
}

$(document).ready(function() {
	/* pageR(1); */
	});


</script>


 </head>




 <body>
 <%@ include file="../include/header.jsp" %>
 <!-- //////header//////-->
<header id="main_header">

</header>


<!--//////content//////-->
<div id="content">
	<section id="main_section">
		<article class="main_article">
                <a href="list.oe?group=gyogu"><h3>교구</h3></a>
                 <table class="table table-striped">
              <thead>
                <tr>
                  <th>No</th>
            	   <th>교구이름</th>
                  <th>상위부서</th>
                </tr>
              </thead>
              <tbody id="tbody-item-list-gyogu">
                <c:forEach var = "list" items="${gyoguList.items}" varStatus="s">
                <tr>
                  <td>${s.count}</td>
                  <td>${list.deptName}</td>
                  <td>오병이어교회</td>
                </tr>
                  </c:forEach>
              </tbody>
            </table>
            
            </article>
            
            
			<article class="main_article">
                <a href="list.oe?group=edu"><h3>교육부</h3></a>
                 <table class="table table-striped">
              <thead>
                <tr>
                  <th>No</th>
            	   <th>부서이름</th>
                  <th>상위부서</th>
                </tr>
              </thead>
             <tbody id="tbody-item-list-edu">
                 <c:forEach var = "list" items="${eduList.items}" varStatus="s">
                <tr>
                  <td>${s.count}</td>
                  <td>${list.deptName}</td>
                  <td>오병이어교회</td>
                </tr>
                  </c:forEach>
              </tbody>
            </table>
            

            </article>
			<article class="main_article">
                <a href="list.oe?group=depart"><h3>부서</h3></a>
                 <table class="table table-striped">
			<thead>              
                <tr>
                  <th>No</th>
            	   <th>교구이름</th>
                  <th>상위부서</th>
                </tr>
              </thead>
            <tbody id="tbody-item-list-depart">
                 <c:forEach var = "list" items="${departList.items}" varStatus="s">
                <tr>
                  <td>${s.count}</td>
                  <td>${list.deptName}</td>
                  <td>오병이어교회</td>
                </tr>
                  </c:forEach>
              </tbody>
            </table>
            

            </article>
	</section>
	
</div>


<!--//////footer//////-->
<footer id="main_footer">
	<%@ include file="../include/footer.jsp" %>
</footer>

 </body>
</html>
