<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'score_yearlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<script type="text/javascript">
  function checkForm(obj){
  
    
	     var year = document.getElementById("yearid").value;
	     if(year==null || tscore.trim()==""){
	        alert("请正确填写!");
	        return false;
	     }
	     document.getElementById("yearid").value=year.trim();
	 
	 return true;
  }
</script>
  </head>
  
  <body>
  <form action="score_yearList.action" method="post" onsubmit="return checkForm(this)">
  <table>
  	     <tr><td> 请输入添加的届数：<input type="text" name="year" id="yearid"></td></tr>
  		 <tr><td> <button  type="submit" >提交</button></td></tr>
  </table>
  		
   </form>
  </body>
</html>
