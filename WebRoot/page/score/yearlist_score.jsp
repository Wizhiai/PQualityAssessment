<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>评估页面</title>
<link href="images/style.css" rel="stylesheet" type="text/css" />
<link href="images/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="javascript/jquery.min.js"></script>

<style type="text/css">
body {
	background:#FFF
}
</style>
</head>

<body>
<div id="contentWrap">
	<!--表格控件 -->
  <div id="widget table-widget">
    <div class="pageTitle">专家打分<br/></div> 
    <div class="pageColumn">
      <div class="pageButton"></div>
      <table>
        <thead>
          <th width="">id</th>
          <th width="">届数</th>
          <th width="">专家姓名</th>
          
            </thead>
        <tbody>
        <c:forEach var="xevaluate" items="${yearlist}">
        <tr>
         	<td>${xevaluate.id}</td>
         	<td>${xevaluate.jieshu}</td>
         	<td>${xevaluate.tname}</td>
         	
        </tr>
        </c:forEach>
         </tbody>
      </table>
    </div>
  </div><!-- #widget -->
</div>
<form action="score_evaluateFunction.action" method="post" >
 <table>
  <tr><td>请输入届数：<input type="text" name="year"></input><button type="submit" >评估开始</button></td></tr>
     </table>
     
</form>

</body>
</html>
