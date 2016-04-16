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
    
    <title>添加专家页面</title>
    
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
<script type="text/javascript">
  function checkForm(obj){
  
     for(var i=1;i<=4;i++){
	     var ts = document.getElementById(i).value;
	     if(ts==null || ts.trim()==""){
	        alert("请正确填写!");
	        return false;
	     }
	     document.getElementById(i).value=ts.trim();
	 }
	 return true;
  }
</script>
  </head>
  
  <body>
  	<form action="professional_addTeacher.action" method="post" onsubmit="return checkForm(this)">
	<table>
	
	<tr>
		
		<td><label>专家姓名:</label></td>
		<td><input type="text" name="xteacher.name" id="1"></input></td>
		
	</tr>
	
	<tr>
		<td><label>教师工号</label></td>
		<td><input type="text" name="xteacher.xno" id="2"></input></td>
		
	</tr>
	
	<tr>
		<td><label>年&nbsp;&nbsp;龄</label></td>
		<td><input type="text" name="xteacher.age" id="3"></input></td>
		
	</tr>
	<tr>
		<td><label>联系方式</label></td>
		<td><input type="text" name="xteacher.contact" id="4"></input></td>
		
	</tr>
	<tr>
		<td><label>职&nbsp;&nbsp;称</label></td>
		<td><select name="xteacher.professionaltitle" >
			<option value="助教" <c:if test="${xteacher.professionaltitle}=='助教'">selected</c:if> >助教</option>
			<option value="讲师" <c:if test="${xteacher.professionaltitle}=='讲师'">selected</c:if>>讲师</option>
			<option value="副教授" <c:if test="${xteacher.professionaltitle}=='副教授'">selected</c:if>>副教授</option>
		    <option value="教授" <c:if test="${xteacher.professionaltitle}=='教授'">selected</c:if>>教授</option>
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
