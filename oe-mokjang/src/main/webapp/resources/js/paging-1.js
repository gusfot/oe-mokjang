


/*
 * 페이징 UI를 생성하여 화면에 바인딩한다.
 * @param page 현재페이지번호
 * @param pageSize 페이지크기
 * @param totalNumberOfItems 전체갯수*/
 
function paging(page, pageSize, totalNumOfItems){ 
	var totalPage = parseInt(totalNumOfItems/pageSize) + (totalNumOfItems%pageSize > 0 ? 1 : 0);
	var firstPage = parseInt((page-1)/10)*10 + (totalPage%10 > 0 ? 1 : 0);
	// 페이징 UI(맨앞, 페이징이전페이지, 1/2/3/4/.../10, 페이징다음페이지, 맨끝)를 생성한다.
	var html = '';
	html += '<li><a href="#" data-page="1">&laquo;</a></li>';
	html += '<li ' + (firstPage == 1 ? 'class="disabled"' : '') + '><a href="#" data-page="' + (firstPage-1) + '">&lsaquo;</a></li>';
	for (var i=firstPage; i<firstPage+10; i++) {
		if (i <= totalPage)
			html += '<li ' + (page == i ? 'class="active"' : '') + '><a href="#" data-page="' + i + '">' + i + '</a></li>';
		else
			html += '<li class="disabled"><a href="#" data-page="' + i + '">' + i + '</a></li>';
	}
	html += '<li ' + (totalPage < firstPage+10 ? 'class="disabled"' : '') + '><a href="#" data-page="' + (firstPage+10) + '">&rsaquo;</a></li>';
	html += '<li><a href="#" data-page="' + totalPage + '">&raquo;</a></li>';
return html;
};


