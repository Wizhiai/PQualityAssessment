<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加用户页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
body {
	background:#FFF
}
</style>
  </head>
  
  <body>
  	<form action="user_addUser.action" method="post">
	<table>
	
	<tr>
		
		<td><label>用户名:</label></td>
		<td><input type="text" name="user.uno"></input></td>
		<td>${unoerror} </td>
	</tr>
	
	<tr>
		<td><label>密&nbsp;&nbsp;码:</label></td>
		<td><input type="password" name="user.upwd"></input></td>
		<td>${upwderror} </td>
	</tr>
	
	<tr>
		<td><label>身&nbsp;&nbsp;份:</label></td>
		<td><select name="user.uidentity" >
			<option value="学生" <c:if test="${user.uidentity}=='学生'">selected</c:if> >学生</option>
			<option value="教师" <c:if test="${user.uidentity}=='教师'">selected</c:if>>教师</option>
			<option value="管理员" <c:if test="${user.uidentity}=='管理员'">selected</c:if>>管理员</option>
		</select></td>
	</tr>
	<tr>
		<td><button type="submit" >提交</button></td>
		<td><button type="reset" >重置</button></td>
	</tr>
	</table>
	</form>
  </body>
</html>
