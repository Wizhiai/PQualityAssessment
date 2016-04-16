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
   ${xpgbz.jieshu}届评估结果
  	<form action="evaluation_detailAddEvaluation.action" method="post" >
  	<div class="menu_div">
		<table class="list"  width="100%" >
       	  	<tr style="font-weight: bold;border:1px solid silver;">
	          <td class="btn_1" style="border:1px solid silver;" width="47px">id</td>
	          <td class="btn_2" style="border:1px solid silver;" >届数</td>
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
         		<td>id</td><td style="">${xpgbz.id}</td>
        	</tr>
        </table> 	
      </div>	
         	
      <!-- 222222222222222222222222222222222222222222222222222222222 -->   	
        <div class="list2_div">
        	<table class="list_table">
        		<tr>
        			<td>届数</td>
         			<td width="70px">${xpgbz.jieshu}</td>
         		</tr>
         	</table>
       	</div> 
      <!-- 33333333333333333333333333333333333333333333333333333333333 -->   	
         	
         	
         <div class="list3_div">
         	<table class="list_table">
         		<tr>
         			<td style="">${xpgbz.xjiaoxuetixi.jiaoxuejihua}</td>
         			
         			<td>${xpgbz.xjiaoxuetixi.jxjhpg}</td>
         			
       			</tr>
       			<tr>
         			<td>${xpgbz.xjiaoxuetixi.kechengdagang}</td>
         			
         			<td>${xpgbz.xjiaoxuetixi.kcdgpg}</td>
         			</tr>
       			<tr>
         			
         			<td>${xpgbz.xjiaoxuetixi.xiaoqihezuo}</td>
         			<td>${xpgbz.xjiaoxuetixi.xahzpg}</td>
         			</tr>
         		<tr>
         		<td>评语分析</td>
         		<td>${xpgbz.xjiaoxuetixi.conclusion }"</td>
         		</tr>
         	</table>
       	</div>
         	
       <!-- 4444444444444444444444444444444444444444444444444444 -->  	
         <div class="list4_div">	
         	<table class="list_table">
         		<tr>
         			<td>${xpgbz.xsysjdjianshe.shebeitouru}</td>
         			<td>${xpgbz.xsysjdjianshe.sbtrpg}</td>
         			
       			</tr>
       			<tr>
         			<td>${xpgbz.xsysjdjianshe.shiyanshijianshe}</td>        			
         			<td>${xpgbz.xsysjdjianshe.sysjspg}</td>
         			</tr>
       			<tr>
         			
         			<td>${xpgbz.xsysjdjianshe.shiyanshizhidu}</td>
         			<td>${xpgbz.xsysjdjianshe.syszdpg}</td>        			
         				</tr>
       			<tr>
         		
         			<td>${xpgbz.xsysjdjianshe.xiaowaijidi}</td>
         			<td>${xpgbz.xsysjdjianshe.xwjdpg}</td>
         				</tr>
       			<tr>
         			
         			<td>${xpgbz.xsysjdjianshe.zhongdianshiyanshi}</td>
         			<td>${xpgbz.xsysjdjianshe.zdsyspg}</td>
         				</tr>
       			<tr>
         			<td>${xpgbz.xsysjdjianshe.zigerenzheng}</td>
         			<td>${xpgbz.xsysjdjianshe.zgrzpg}</td>
         				</tr>
       			<tr>
         			<td>${xpgbz.xsysjdjianshe.yongrenqiye}</td>
         			<td>${xpgbz.xsysjdjianshe.yrqypg}</td>
         			</tr>
       			<tr>
         		<td>评语分析</td>
         		<td>${xpgbz.xsysjdjianshe.conclusion }"</td>
         		</tr>
         	</table>
       	</div>
         	
        <!-- 555555555555555555 --> 	
         	
       	<div class="list5_div">
         	<table class="list_table">
         		<tr>
         			<td>${xpgbz.xjxgcjiankong.jiaoxuezhunbei }</td>
         			<td>${xpgbz.xjxgcjiankong.jxzbpg }</td>
         				
         			
       			</tr>
       			<tr>
         			<td>${xpgbz.xjxgcjiankong.jiaoxuezhidao }</td>
         			<td>${xpgbz.xjxgcjiankong.jxzdpg }</td>
         			</tr>
       			<tr>
         			<td>${xpgbz.xjxgcjiankong.jiaoxueguocheng }</td>
         			<td>${xpgbz.xjxgcjiankong.jxgcpg }</td>
         				</tr>
       			<tr>
         			<td>${xpgbz.xjxgcjiankong.renwushu }</td>
         			<td>${xpgbz.xjxgcjiankong.rwspg }</td>
         			</tr>
       			<tr>
         			<td>${xpgbz.xjxgcjiankong.zonghejineng }</td>
         			<td>${xpgbz.xjxgcjiankong.zhjnpg }</td>
         				</tr>
       			<tr>
         			<td>${xpgbz.xjxgcjiankong.qiyedinggang }</td>
         			<td>${xpgbz.xjxgcjiankong.qydgpg }</td>
         			</tr>
       			<tr>
         		<td>评语分析</td>
         		<td>${xpgbz.xjxgcjiankong.conclusion }</td>
         		</tr>
         	</table>
       	</div>
         	
         	
         <!-- 66666666666 -->	
         	
       	<div class="list6_div">
         	
         	<table class="list_table">
         		<tr>
         			<td>${xpgbz.xszjsglzd.jiaoxuezhidu}</td>
         		<td>${xpgbz.xszjsglzd.jxzdpg}</td>
         			
       			</tr>
       			<tr>
         			<td>${xpgbz.xszjsglzd.jiaoxuetixi}</td>
         			<td>${xpgbz.xszjsglzd.jxtxpg}</td>
         			</tr>
       			<tr>
         			<td>${xpgbz.xszjsglzd.jiaoxuegaige}</td>
         			<td>${xpgbz.xszjsglzd.jxggpg}</td>
         		</tr>
       			<tr>
         			<td>${xpgbz.xszjsglzd.jiaoshiduwu}</td>
         			<td>${xpgbz.xszjsglzd.jsdwpg}</td>
         				</tr>
       			<tr>
         			<td>${xpgbz.xszjsglzd.jilijizhi}</td>
         			<td>${xpgbz.xszjsglzd.jljzpg}</td>
         				</tr>
       			<tr>
         		<td>评语分析</td>
         		<td>${xpgbz.xszjsglzd.conclusion }"</td>
         		</tr>
         	</table>
       	</div>
         	
         <!-- 777777777 -->	
         	
         	<div class="list7_div">
         	
         	<table class="list_table">
         		<tr>
         			<td>${xpgbz.xsjjxxiaoguo.lunwenzhiliang}</td>
         			<td>${xpgbz.xsjjxxiaoguo.lwzlpg}</td> 
         			
         			
       			</tr>
       			<tr>
         			<td>${xpgbz.xsjjxxiaoguo.huojiangqingkuang}</td>
         			<td>${xpgbz.xsjjxxiaoguo.hjqkpg}</td> 
         			</tr>
       			<tr>
         			<td>${xpgbz.xsjjxxiaoguo.shijiannengli}</td>
         			<td>${xpgbz.xsjjxxiaoguo.sjnlpg}</td> 
         			</tr>
       			<tr>
         			<td>${xpgbz.xsjjxxiaoguo.changxinsuzhi}</td>
         			<td>${xpgbz.xsjjxxiaoguo.cxszpg}</td> 
         			</tr>
       			<tr>
         			<td>${xpgbz.xsjjxxiaoguo.yongrendanwei}</td>
         			<td>${xpgbz.xsjjxxiaoguo.yrdwpg}</td> 
         			 </tr> 
 			     <tr>
         		<td>评语分析</td>
         		<td>${xpgbz.xsjjxxiaoguo.conclusion }"</td>
         		</tr> 			
         	</table>
       	</div>
         	
         	<!-- 88888888 -->
         	
       	<div class="list8_div">
         	<table class="list_table">
         		<tr>
         			<td>${xpgbz.xbiyspingjia.kechengmanyi}</td>
         			<td>${xpgbz.xbiyspingjia.kcmypg}</td>
         			
         			
         			
       			</tr>
       			<tr>
         			<td>${xpgbz.xbiyspingjia.shijianhuanjing}</td>
         			<td>${xpgbz.xbiyspingjia.sjhjpg}</td>
         				</tr>
       			<tr>
         			<td>${xpgbz.xbiyspingjia.jiaoxuenengli}</td>
         			<td>${xpgbz.xbiyspingjia.jxnlpg}</td>
         				</tr>
       			<tr>
         			<td>${xpgbz.xbiyspingjia.fazhanzydu}</td>
         			<td>${xpgbz.xbiyspingjia.fzzydpg}</td>
         			</tr>
       			<tr>
         			<td>${xpgbz.xbiyspingjia.peiyangmanyidu}</td>
         			<td>${xpgbz.xbiyspingjia.pymydpg}</td>
         			</tr>
       			<tr>
         			<td>${xpgbz.xbiyspingjia.jycynengli}</td>
         			<td>${xpgbz.xbiyspingjia.jycynlpg}</td>
         			</tr>
       			 <tr>
         		<td>评语分析</td>
         		<td>${xpgbz.xbiyspingjia.conclusion }</td>
         		</tr> 
        	</table>
        </div>
        
        
       <div class="btn_div">
        <table style="width: 300px;text-align: center;">
        	<tr style="width: 100%;">
        	 <td>总体评价</td>
              <td>${xpgbz.conclusion}</td>
				
	    	</tr>
       </table>
      </div>
       
       
	</form>
  </body>
</html>

