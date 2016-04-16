<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录-模板下载：http://www.codefans.net</title>
<link href="images/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="javascript/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('.captcha').focus(function(){
			$('.yzm-box').show();
			});
			
		$('.captcha').focusout(function(){
			$('.yzm-box').hide();
			});
		})
</script>

</head>

<body>

<div id="wrap">
	
	<div id="header"> </div>
    <div id="content-wrap">
    	<div class="space">${nomessage}  ${passwdmessage} </div>
    	<div id="message-box">&nbsp;${nomessage}  ${passwdmessage}</div>
   	  <form action="login_login" method="post"><div class="content">
        <div class="field"><label>账　户：</label><input class="username" name="user.uno" value="" type="text" /></div>
		<div class="field"><label>密　码：</label><input class="password" name="user.upwd" value="" type="password" /><br /></div>
		<div class="field"><label>身　份：</label>
		<select name="user.uidentity" >
			<option value="学生" <c:if test="${user.uidentity}=='学生'">selected</c:if> >学生</option>
			<option value="教师" <c:if test="${user.uidentity}=='教师'">selected</c:if>>教师</option>
			<option value="管理员" <c:if test="${user.uidentity}=='管理员'">selected</c:if>>管理员</option>
		</select>
		</div>
                 <div class="field">  
        <div class="yzm-box"> </div>
        </div>
        <div class="btn"><input name="" type="submit" class="login-btn" value="" /></div>
      </div></form>
    </div>
    <div id="footer"> </div>
</div>
</body>
</html>
