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
    
    <title>添加评分表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="javascript/jquery.min.js"></script>
<style type="text/css">
body {
	background:#FFF
}
*{margin: 0;padding: 0;}
.list ul{list-style: none;display: inline-block;}
.list ul li{float:left;}
.list tr{display: inline-block;padding: 0px;}
.list tr td{vertical-align: top;}



.list1_div,.list2_div,.list3_div,.list4_div,.list5_div,.list6_div,.list7_div,.list8_div{display: none;width: 600px;height: 400px;text-align: center;margin: 30px 0 0 200px ;background-color:#7E71E3;}

.list_table{height: 100%;width: 100%; text-align: center;}
.list_table input{border: 0;width: 200px;height: 30px;background-color: silver;}

.btn_div{margin:0 0 0 400px;}
</style>
<script type="text/javascript">
  function checkForm(obj){
  
     for(var i=1;i<=32;i++){
	     var tscore = document.getElementById("tscore"+i).value;
	     if(tscore==null || tscore.trim()==""||tscore.valueOf()>100){
	        alert("请正确填写!");
	        return false;
	     }
	     document.getElementById("tscore"+i).value=tscore.trim();
	 }
	 return true;
  }
  
  function hideAll(){
  	$(".list1_div").hide();
  	$(".list2_div").hide();
  	$(".list3_div").hide();
  	$(".list4_div").hide();
  	$(".list5_div").hide();
  	$(".list6_div").hide();
  	$(".list7_div").hide();
  	$(".list8_div").hide();
  }
  
  
  $(function(){
  	$(".btn_1").click(function(){
  		hideAll();
  		$(".list1_div").show();
  	});
  	$(".btn_2").click(function(){
  		hideAll();
  		$(".list2_div").show();
  	});
  	$(".btn_3").click(function(){
  		hideAll();
  		$(".list3_div").show();
  	});
  	$(".btn_4").click(function(){
  		hideAll();
  		$(".list4_div").show();
  	});
  	$(".btn_5").click(function(){
  		hideAll();
  		$(".list5_div").show();
  	});
  	$(".btn_6").click(function(){
  		hideAll();
  		$(".list6_div").show();
  	});
  	$(".btn_7").click(function(){
  		hideAll();
  		$(".list7_div").show();
  	});
  	$(".btn_8").click(function(){
  		hideAll();
  		$(".list8_div").show();
  	});
  });
</script>
  </head>
  
  <body>
  	<form action="score_addScoreList.action" method="post" onsubmit="return checkForm(this)">
  	<div class="menu_div">
		<table class="list"  width="100%" >
       	  	<tr style="font-weight: bold;border:1px solid silver;">
	          <td class="btn_1" style="border:1px solid silver;" width="47px">届数</td>
	          <td class="btn_2" style="border:1px solid silver;" >专家姓名</td>
	          <td class="btn_3" style="border:1px solid silver;" width="154px">实践教学体系</td>
	          <td class="btn_4" style="border:1px solid silver;" width="202px">实验室与实践基地建设</td>
	          <td class="btn_5" style="border:1px solid silver;" width="190px">实践教学过程监控</td>
	          <td class="btn_6" style="border:1px solid silver;"  width="156px">师资建设与管理制度</td>
	          <td class="btn_7" style="border:1px solid silver;" width="164px">实践教学效果</td>
	          <td class="btn_8" style="border:1px solid silver;" width="161px">毕业生评价</td>
    		</tr>
      	</table>
      </div>
      <!-- 111111111111111111111111111111111111111111111111111111 -->
      <div class="list1_div">
     	 <table class="list_table">
        	<tr style="border:1px solid silver;">
         		<td>届数</td><td style=""><input size="2" type="text" name="xevaluate.jieshu"></td>
        	</tr>
        </table> 	
      </div>	
         	
      <!-- 222222222222222222222222222222222222222222222222222222222 -->   	
        <div class="list2_div">
        	<table class="list_table">
        		<tr>
        			<td>专家姓名</td>
         			<td width="70px"><input size="5" type="text" name="xevaluate.tname"></td>
         		</tr>
         	</table>
       	</div> 
      <!-- 33333333333333333333333333333333333333333333333333333333333 -->   	
         	
         	
         <div class="list3_div">
         	<table class="list_table">
         		<tr>
         			<td style="">实践性教学计划</td>
         			<td><input  type="text" name="xevaluate.tscore1" id="tscore1"></td>
       			</tr>
       			<tr>
         			<td>实践性课程大纲</td>
         			<td><input type="text" name="xevaluate.tscore2" id="tscore2"></td>
       			</tr>
       			<tr>
         			<td>校企合作计划及协议</td>
         			<td><input type="text" name="xevaluate.tscore3" id="tscore3" ></td>
         		</tr>
         	</table>
       	</div>
         	
       <!-- 4444444444444444444444444444444444444444444444444444 -->  	
         <div class="list4_div">	
         	<table class="list_table">
         		<tr>
         			<td style="">实践教学设备投入</td>
         			<td><input type="text" name="xevaluate.tscore4" id="tscore4"></td>
       			</tr>
       			<tr>
         			<td>实验室建设规划</td>
         			<td><input type="text" name="xevaluate.tscore5" id="tscore5"></td>
       			</tr>
       			<tr>
         			<td>实验室建设制度</td>
         			<td><input type="text" name="xevaluate.tscore6" id="tscore6"></td>
       			</tr>
       			<tr>
         			<td>重点实验室建设</td>
         			<td><input type="text" name="xevaluate.tscore7" id="tscore7"></td>
       			</tr>
       			<tr>
         			<td>校外实践基地建设</td>
         			<td><input type="text" name="xevaluate.tscore8" id="tscore8"></td>
       			</tr>
       			<tr>
         			<td>企业学院及资格认证</td>
         			<td><input type="text" name="xevaluate.tscore9" id="tscore9"></td>
       			</tr>
       			<tr>
         			<td>用人企业群的数量与规模</td>
         			<td><input type="text" name="xevaluate.tscore10" id="tscore10"></td>
       			</tr>
         	</table>
       	</div>
         	
        <!-- 555555555555555555 --> 	
         	
       	<div class="list5_div">
         	<table class="list_table">
         		<tr>
         			<td>实践教学准备程度</td>
         			<td><input type="text" name="xevaluate.tscore11" id="tscore11"></td>
       			</tr>
       			<tr>
         			<td>教师随堂指导与课后辅导</td>
         			<td><input type="text" name="xevaluate.tscore12" id="tscore12"></td>
       			</tr>
       			<tr>
         			<td>教学过程纪录和总结</td>
         			<td><input type="text" name="xevaluate.tscore13" id="tscore13"></td>
       			</tr>
       			<tr>
         			<td>教学指导书和任务书</td>
         			<td><input type="text" name="xevaluate.tscore14" id="tscore14"></td>
       			</tr>
       			<tr>
         			<td>综合技能和项目实训</td>
         			<td><input type="text" name="xevaluate.tscore15" id="tscore15"></td>
       			</tr>
       			<tr>
         			<td>企业顶岗与素质培训</td>
         			<td><input type="text" name="xevaluate.tscore16" id="tscore16"></td>
       			</tr>
         	</table>
       	</div>
         	
         	
         <!-- 66666666666 -->	
         	
       	<div class="list6_div">
         	
         	<table class="list_table">
         		<tr>
         			<td>实践教学管理制度</td>
         			<td><input type="text" name="xevaluate.tscore17" id="tscore17"></td>
       			</tr>
       			<tr>
         			<td>实践教学管理体系</td>
         			<td><input type="text" name="xevaluate.tscore18" id="tscore18"></td>
       			</tr>
       			<tr>
         			<td>实践教学改革与创新</td>
         			<td><input type="text" name="xevaluate.tscore19" id="tscore19"></td>
       			</tr>
       			<tr>
         			<td>实践教师队伍结构</td>
         			<td><input type="text" name="xevaluate.tscore20" id="tscore20"></td>
       			</tr>
       			<tr>
         			<td>实践教学激励机制</td>
         			<td><input type="text" name="xevaluate.tscore21" id="tscore21"></td>
       			</tr>
         	</table>
       	</div>
         	
         <!-- 777777777 -->	
         	
         	<div class="list7_div">
         	
         	<table class="list_table">
         		<tr>
         			<td>毕业论文(设计)质量</td>
         			<td><input type="text" name="xevaluate.tscore22" id="tscore22"></td>
       			</tr>
       			<tr>
         			<td>学生获奖情况</td>
         			<td><input type="text" name="xevaluate.tscore23" id="tscore23"></td>
       			</tr>
       			<tr>
         			<td>综合实践能力展示</td>
         			<td><input type="text" name="xevaluate.tscore24" id="tscore24"></td>
       			</tr>
       			<tr>
         			<td>创新精神与综合素质</td>
         			<td><input type="text" name="xevaluate.tscore25" id="tscore25"></td>
       			</tr>
       			<tr>
         			<td>社会及用人单位评价</td>
         			<td><input type="text" name="xevaluate.tscore26" id="tscore26"></td>
 			     </tr>  			
         	</table>
       	</div>
         	
         	<!-- 88888888 -->
         	
       	<div class="list8_div">
         	<table class="list_table">
         		<tr>
         			<td>课程满意与兴趣度</td>
         			<td><input type="text" name="xevaluate.tscore27" id="tscore27"></td>
       			</tr>
       			<tr>
         			<td>实践环境建设满意度</td>
         			<td><input type="text" name="xevaluate.tscore28" id="tscore28"></td>
       			</tr>
       			<tr>
         			<td>教师实践教学能力</td>
         			<td><input type="text" name="xevaluate.tscore29" id="tscore29"></td>
       			</tr>
       			<tr>
         			<td>实践能力发展自由度</td>
         			<td><input type="text" name="xevaluate.tscore30" id="tscore30"></td>
       			</tr>
       			<tr>
         			<td>综合能力培养满意度</td>
         			<td><input type="text" name="xevaluate.tscore31" id="tscore31"></td>
       			</tr>
       			<tr>
         			<td>就业创业能力培养</td>
         			<td><input type="text" name="xevaluate.tscore32" id="tscore32"></input></td>       			
       			</tr>
        	</table>
        </div>
        
        
       <div class="btn_div">
        <table style="width: 300px;text-align: center;">
        	<tr style="width: 100%;">
				<td style="width: 100px;"><button  type="submit" >提交</button></td>
				<td style="width: 100px;"><button type="reset" >重置</button></td>
				<td style="width: 100px;">${emptyinput }</td>
	    	</tr>
       </table>
      </div>
       
       
	</form>
  </body>
</html>
