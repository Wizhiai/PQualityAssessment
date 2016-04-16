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
  	<form action="professional_setZhiwei.action" method="post" >
	<table border="1">
		<thead>
			<th>选择领导</th>
			<th>id</th>
			<th>专家姓名</th>
			<th>专家职称</th>		
			<th>教师工号</th>
			
		</thead>
		 <c:forEach var="xteacher" items="${setlist}">
		  
		<tr>
		<td><input type="radio" name="radio" value="${ xteacher.id}"></td>
			<td>${ xteacher.id}</td>
			<td>${ xteacher.name}</td>		
			<td>${ xteacher.professionaltitle}</td>
			<td>${ xteacher.xno}</td>
			<td>
			
			</td>
		</tr>
		
		</c:forEach>
		</table>
		<input type="hidden" name="jieshu"  value="${jieshu }"></input>
	<button type="submit" >提交</button>
	
	</form>
  </body>
</html>
