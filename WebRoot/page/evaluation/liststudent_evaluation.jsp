<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>评估标准</title>
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
    <div class="pageTitle">历届评估结果</div> 
    <div class="pageColumn">
      <div class="pageButton"></div>
      <table>
        <thead>
          <th width="">id</th>
          <th width="">届数</th>
          <th width="">等级</th>
      、
          <th width="">操作</th>
         
            </thead>
        <tbody>
        <c:forEach var="xpgbz" items="${evaluationlist}">
        <tr>
         	<td>${xpgbz.id}</td>
         	<td>${xpgbz.jieshu}</td>
         	<td>${xpgbz.grade}</td>
        
         	<td><a href="student_evaluationShow.action?xpgbz.id=${xpgbz.id}" target="right">详细</a></td>
         	
        </tr>
        </c:forEach>
         </tbody>
      </table>
    </div>
  </div><!-- #widget -->
</div>


</body>
</html>
