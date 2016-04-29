$(function() {    

	/* Datepicker */
	var TxtStrtDate = 'from',
    TxtExpDte   = 'to';

	var myDate = new Date();     

	$(".datepicker, .from, .to").datepicker({
		showOn: "button",
		buttonImage: "images/icon/calendar.gif",
		buttonImageOnly: true,
		buttonText:'달력',
		defaultDate: "+1w",
		changeMonth: true,
		changeYear: true,
		numberOfMonths: 1,
		monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
		monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
		dayNames: ['일','월','화','수','목','금','토'],
		dayNamesShort: ['일','월','화','수','목','금','토'],
		dayNamesMin: ['일','월','화','수','목','금','토'],
		onselect: function( selectedDate ) {
			var option = this.id == "abc" ? "minDate" : "maxDate",
				instance = $( this ).data( "datepicker" ),
				date = $.datepicker.parseDate(
					instance.settings.dateFormat ||
					$.datepicker._defaults.dateFormat,
					selectedDate, instance.settings );
			dates.not( this ).datepicker( "option", option, date);
		}
		
	});

	//$('.datepicker, .from, .to').datepicker('setDate', myDate);
	//var dateFormat = $('.from, .to').datepicker( "option", "dateFormat" );
	
	$('.datepicker, .from, .to').datepicker( "option", "dateFormat", "yy-mm-dd" );


	/* Select */
	$('.select').selectric();
	
	/* Checkbox, Radio */
	$('input').iCheck({
		checkboxClass: 'icheckbox_square-blue',
		radioClass: 'iradio_square-blue',
		increaseArea: '20%'
	});

	// Vertical Navigation
	var vNav = $('div#nav');
	var vNav_i = vNav.find('>ul>li');
	var vNav_ii = vNav.find('>ul>li>ul>li');
	vNav_i.find('>ul').hide();
	vNav.find('>ul>li>ul>li[class=active]').parents('li').attr('class','active');
	vNav.find('>ul>li[class=active]').find('>ul').show();
	function vNavToggle(event){
		var t = $(this);
		if (t.next('ul').is(':hidden')) {
			vNav_i.find('>ul').hide();
			t.next('ul').show();
		} else if (t.next('ul').is(':visible')){
			t.next('ul').show();
		} else if (!t.next('ul').langth) {
			vNav_i.find('>ul').hide();
		}
		vNav_i.removeClass('active');
		t.parent('li').addClass('active');
		return false;
	}
	vNav_i.find('>a[href=#]').click(vNavToggle).focus(vNavToggle);
	function vNavActive(){
		vNav_ii.removeClass('active');
		$(this).parent(vNav_ii).addClass('active');
		return false;
	}; 
	vNav_ii.find('>a[href=#]').click(vNavActive).focus(vNavActive);	

	$('div.cont-body').each(function() {
		$(this).find('div.hidden:first').show();
	});

	$('ul.cont-tab a').click(function() {		
		if (!$(this).hasClass('current')) {			
			$(this).addClass('current').parent('li').siblings('li').find('a.current').removeClass('current');			
			$($(this).attr('href')).show().siblings('div.hidden').hide();
		}		
		this.blur();
		return false;
	});	
	

});

var dialogOpened = new Array();
//modallayerpopup by dialog
function dialogOpen(className){
	var openEle = $("#"+className);
	if (dialogOpened[className] == undefined) {
		openEle.dialog({
			resizable: false,
			draggable: false, 
			closeText: "닫기",
			width: "auto",
			modal:true
		});
		dialogOpened[className] = true;
	}
	else {
		openEle.dialog('open');
	}
	return false;
}

function dialogClose(className){
	var closeEle = $("#"+className);
	closeEle.dialog( "close" );
}

function wrapWindowByMask(){
	var maskHeight = $(document).height();  
	var maskWidth = $(window).width();  
	$('.mask').css({'width':maskWidth,'height':maskHeight});  
	$('.mask').show(); 
}

$(document).ready(function(){
	$('.openMask').click(function(e){
		e.preventDefault();
		wrapWindowByMask();
	});   
});