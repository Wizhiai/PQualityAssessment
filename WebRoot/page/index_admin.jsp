<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理员页面</title>
<link href="images/style.css" rel="stylesheet" type="text/css" />
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

<body style="overflow-y:hidden">
<div id="wrap">
	<div id="header">
    <div class="logo fleft"></div>
    <div class="nav fleft"></div>
    <a class="logout fright" href="login.jsp"> </a>
    <div class="clear"></div>
    <div class="subnav">
    	<div class="subnavLeft fleft"></div>
        <div class="fleft"></div>
        <div class="subnavRight fright"></div>
    </div>
    </div><!--#header -->
    <div id="content">
    <div class="space"></div>
    <div class="menu fleft">
    	<ul>
        	<li class="subMenuTitle">管理菜单</li>
            <li class="subMenu"><a href="user_findList.action" target="right">用户管理</a>
            </li>
            <li class="subMenu"><a href="score_findList.action" target="right">专家分数表管理</a>
            </li>
            <li class="subMenu"><a href="evaluation_findList.action" target="right">评估结果管理</a>
            </li>
            <li class="subMenu"><a href="professional_findList.action" target="right">专家库管理</a>
            </li>
             <li class="subMenu"><a href="professional_findListJury.action" target="right">专家评委会管理</a>
            </li>
           
            
        </ul>
    </div>
    <div class="page">
    <iframe width="100%" scrolling="auto" height="100%" frameborder="false" allowtransparency="true" style="border: medium none;" src="main.jsp" id="rightMain" name="right"></iframe>
    </div>
    </div><!--#content -->
    <div class="clear"></div>
    <div id="footer">CopyRight &copy; 2012-2014 www.hhitPq.com </div><!--#footer -->
   
    
</div><!--#wrap -->
</body>
</html>
