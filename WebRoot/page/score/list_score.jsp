<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
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
    <div class="pageTitle">专家评分表<br/><a href="page/score/add_score.jsp" target="right">添加列表</a><br/><a href="page/score/yearinput_score.jsp" target="right">年度评分</a></div> 
    
    <div class="pageColumn">
      <div class="pageButton"></div>
      <table>
        <thead>
          <th width="4%">id</th>
          <th width="4%">届数</th>
          <th width="4%">专家姓名</th>
          <th width="14%">实践教学体系</th>
          <th width="14%">实验室与实践基地建设</th>
          <th width="14%">实践教学过程监控</th>
          <th width="14%">师资建设与管理制度</th>
          <th width="14%">实践教学效果</th>
          <th width="14%">毕业生评价</th>
          <th width="4%">操作</th>
         </thead>
        <tbody>
        <c:forEach var="xevaluate" items="${list}">
        <tr>
         	<td>${xevaluate.id}</td>
         	<td>${xevaluate.jieshu}</td>
         	<td>${xevaluate.tname}</td>
         	<td>
         		<table>
         			<tr collspan="2"><td>实践性教学计划</td></tr>
         			<tr ><td>${xevaluate.tscore1}</td></tr>
         			<tr><td>实践性课程大纲</td></tr>
         			<tr><td>${xevaluate.tscore2}</td></tr>
         			<tr><td>校企合作计划及协议</td></tr>
         			<tr><td>${xevaluate.tscore3}</td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         		</table>
         	</td>
         	<td>
         		<table>
         			<tr><td>实践教学设备投入</td></tr>
         			<tr><td>${xevaluate.tscore4}</td></tr>
         			<tr><td>实验室建设规划</td></tr>
         			<tr><td>${xevaluate.tscore5}</td></tr>
         			<tr><td>实验室建设制度</td></tr>
         			<tr><td>${xevaluate.tscore6}</td></tr>
         			<tr><td>重点实验室建设</tr>
         			<tr><td>${xevaluate.tscore7}</td></tr>
         			<tr><td>校外实践基地建设</td></tr>
         			<tr><td>${xevaluate.tscore8}</td></tr>
         			<tr><td>企业学院及资格认证</td></tr>
         			<tr><td>${xevaluate.tscore9}</td></tr>
         			<tr><td>用人企业群的数量与规模</td></tr>
         			<tr><td>${xevaluate.tscore10}</td></tr>
         		</table>
         	</td>
         	<td>
         		<table>
         			<tr><td>实践教学准备程度</td></tr>
         			<tr><td>${xevaluate.tscore11}</td></tr>
         			<tr><td>教师随堂指导与课后辅导</td></tr>
         			<tr><td>${xevaluate.tscore12}</td></tr>
         			<tr><td>教学过程纪录和总结</td></tr>
         			<tr><td>${xevaluate.tscore13}</td></tr>
         			<tr><td>教学指导书和任务书</td></tr>
         			<tr><td>${xevaluate.tscore14}</td></tr>
         			<tr><td>综合技能和项目实训</td></tr>
         			<tr><td>${xevaluate.tscore15}</td></tr>
         			<tr><td>企业顶岗与素质培训</td></tr>
         			<tr><td>${xevaluate.tscore16}</td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			
         		</table>
         	</td>
         	<td>
         		<table>
         			<tr><td>实践教学管理制度</td></tr>
         			<tr><td>${xevaluate.tscore17}</td></tr>
         			<tr><td>实践教学管理体系</tr>
         			<tr><td>${xevaluate.tscore18}</td></tr>
         			<tr><td>实践教学改革与创新</tr>
         			<tr><td>${xevaluate.tscore19}</td></tr>
         			<tr><td>实践教师队伍结构</tr>
         			<tr><td>${xevaluate.tscore20}</td></tr>
         			<tr><td>实践教学激励机制</tr>
         			<tr><td>${xevaluate.tscore21}</td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			
         			
         		</table>
         	</td>
         	<td>
         		<table>
         			<tr><td>毕业论文(设计)质量</tr>
         			<tr><td>${xevaluate.tscore22}</td></tr>
         			<tr><td>学生获奖情况</tr>
         			<tr><td>${xevaluate.tscore23}</td></tr>
         			<tr><td>综合实践能力展示</tr>
         			<tr><td>${xevaluate.tscore24}</td></tr>
         			<tr><td>创新精神与综合素质</tr>
         			<tr><td>${xevaluate.tscore25}</td></tr>
         			<tr><td>社会及用人单位评价</td></tr>
         			<tr><td>${xevaluate.tscore26}</td></tr> 
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>       			
         			
         		</table>
         	</td>
         	<td>
         		<table>
         			<tr><td>课程满意与兴趣度</td></tr>
         			<tr><td>${xevaluate.tscore27}</td></tr>
         			<tr><td>实践环境建设满意度</td></tr>
         			<tr><td>${xevaluate.tscore28}</td></tr>
         			<tr><td>教师实践教学能力</td></tr>
         			<tr><td>${xevaluate.tscore29}</td></tr>
         			<tr><td>实践能力发展自由度</td></tr>
         			<tr><td>${xevaluate.tscore30}</td></tr>
         			<tr><td>综合能力培养满意度</td></tr>
         			<tr><td>${xevaluate.tscore31}</td></tr>
         			<tr><td>就业创业能力培养</td></tr>
         			<tr><td>${xevaluate.tscore32}</td></tr>
         			<tr><td></td></tr>
         			<tr><td></td></tr>         			
         			
         		</table>
         	</td>
         	
         	<td><a href="score_deleteScoreList.action?xevaluate.id=${xevaluate.id}" target="right">删除</a></td>
        </tr>
        </c:forEach>
         </tbody>
      </table>
    </div>
  </div><!-- #widget -->
</div>


</body>
</html>
