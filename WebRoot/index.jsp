<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>实践教学平台</title>
<script type="text/javascript" src="javascript/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	//setMenuHeight
	$('.menu').height($(window).height()-51-27-26-5);
	$('.sidebar').height($(window).height()-51-27-26-5);
	$('.page').height($(window).height()-51-27-26-5);
	$('.page iframe').width($(window).width()-15-168);
	
	//menu on and off
	$('.btn').click(function(){
		$('.menu').toggle();
		
		if($(".menu").is(":hidden")){
			$('.page iframe').width($(window).width()-15+5);
			}else{
			$('.page iframe').width($(window).width()-15-168);
				}
		});
		
	//
	$('.subMenu a[href="#"]').click(function(){
		$(this).next('ul').toggle();
		return false;
		});
})
</script>


</head>

<body style="background-color: #198BC9;">

	<div style="position: absolute;left: 470px;top: 10px;width: 400px;height: 100px;text-align: center;">
		<span style="font-size: 50px;font-family: 'Microsoft Yahei';color: #F7ED03;">校外实训管理系统</span>
	</div>
	
    <div style="">
    <center>
    	<a href="校内外工程实训基地与优质资源管理系统"><img title="基地实训" style="width: 200px;height: 200px;background-color: black;margin: 180px  50px 0 0;" src="images/index_1.jpg" /></a>
    	<a href="login.jsp"><img title="本科计算机专业实践教学质量评估系统" style="width: 200px;height: 200px;margin: 180px  50px 0 0;" src="images/index_2.jpg"/></a>
    	<a href=""><img title="本科计算机专业校外实训学生管理系统" style="width: 200px;height: 200px;margin: 180px  50px 0 0;" src="images/index_3.jpg"/></a>
    </center>
    </div>
    <div style="margin: 270px 0 0 500px;">CopyRight &copy; 2012-2014 www.hhitpq.com </div><!--#footer -->
   
    
</body>
</html>
