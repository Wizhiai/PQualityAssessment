<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户列表页面</title>
<link href="images/style.css" rel="stylesheet" type="text/css" />
<link href="images/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="javascript/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('tbody tr:odd').addClass("trLight");
		
		$(".select-all").click(function(){
			if($(this).attr("checked")){
				$(".checkBox input[type=checkbox]").each(function(){
					$(this).attr("checked", true);  
					});
				}else{
					$(".checkBox input[type=checkbox]").each(function(){
					$(this).attr("checked", false);  
					});
				}
			});
		
		})
</script>
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
    <div class="pageTitle">用户列表<br/><a href="page/user/add_user.jsp" target="right">添加用户</a></div> 
    <div class="pageColumn">
      <div class="pageButton"></div>
      <table>
        <thead>
          <th width="">id</th>
          <th width="">用户名</th>
          
          <th width="">用户类型</th>
          <th width="10%">操作</th>
            </thead>
        <tbody>
        <c:forEach var="user" items="${list}">
        <tr>
         	<td>${user.id}</td>
         	<td>${user.uno}</td>
         	
         	<td>${user.uidentity}</td>
         	<td><a href="user_deleteUser.action?user.id=${user.id }" target="right">删除</a></td>
        </tr>
        </c:forEach>
         </tbody>
      </table>
    </div>
  </div><!-- #widget -->
</div>


</body>
</html>
