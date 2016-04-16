
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
    
    <title>详细评估表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link type="text/css" rel="stylesheet" href="javascript/jquery-1.11.1.min.js">
<style type="text/css">
body {
	background:#FFF
}
*{margin: 0;padding: 0;}
.list ul{list-style: none;display: inline-block;}
.list ul li{float:left;}
.list tr{display: inline-block;padding: 0px;}
.list tr td{vertical-align: top;}
</style>


  </head>
  
  <body>
 ${xpgbz.jieshu}届评估结果 
  	
	<table width="820" height="200" border="1">
  <tr>
    <td>id</td>
    <td colspan="3">${xpgbz.id}</td>
    <td rowspan="30">${xpgbz.conclusion}</td>
  </tr>
  <tr>
    <td>届数</td>
    <td colspan="3">${xpgbz.jieshu}</td>
  </tr>
  <tr>
    <td rowspan="6">实践教学体系</td>
    <td rowspan="2">${xpgbz.xjiaoxuetixi.jiaoxuejihua}</td>
    <td>${xpgbz.xjiaoxuetixi.jxjhpg}</td>
    <td rowspan="6">${xpgbz.xjiaoxuetixi.conclusion}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjiaoxuetixi.jxjhfs1},${xpgbz.xjiaoxuetixi.jxjhfs2}]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xjiaoxuetixi.kechengdagang}</td>
    <td>${xpgbz.xjiaoxuetixi.kcdgpg}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjiaoxuetixi.kcdgfs1},${xpgbz.xjiaoxuetixi.kcdgfs2}]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xjiaoxuetixi.xiaoqihezuo}</td>
    <td>${xpgbz.xjiaoxuetixi.xahzpg}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjiaoxuetixi.xqhzfs1},${xpgbz.xjiaoxuetixi.xqhzfs2}]</td>
  </tr>
  <tr>
    <td rowspan="14">实验室与实践基地建设</td>
    <td rowspan="2">${xpgbz.xsysjdjianshe.shebeitouru}</td>
    <td>${xpgbz.xsysjdjianshe.sbtrpg}</td>
    <td rowspan="14">${xpgbz.xsysjdjianshe.conclusion}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xsysjdjianshe.sbtrfs1},${xpgbz.xsysjdjianshe.sbtrfs2}]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xsysjdjianshe.shiyanshijianshe}</td>
    <td>${xpgbz.xsysjdjianshe.sysjspg}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xsysjdjianshe.sysjsfs1},${xpgbz.xsysjdjianshe.sysjsfs2}]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xsysjdjianshe.shiyanshizhidu}</td>
    <td>${xpgbz.xsysjdjianshe.syszdpg}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xsysjdjianshe.syszdfs1},${xpgbz.xsysjdjianshe.syszdfs2}]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xsysjdjianshe.xiaowaijidi}</td>
    <td>${xpgbz.xsysjdjianshe.xwjdpg}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xsysjdjianshe.swjdfs1},${xpgbz.xsysjdjianshe.swjdfs2}]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xsysjdjianshe.zhongdianshiyanshi}</td>
    <td>${xpgbz.xsysjdjianshe.zdsyspg}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xsysjdjianshe.zdsysfs1},${xpgbz.xsysjdjianshe.zdsysfs2}]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xsysjdjianshe.zigerenzheng}</td>
    <td>${xpgbz.xsysjdjianshe.zgrzpg}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xsysjdjianshe.zdsysfs1},${xpgbz.xsysjdjianshe.zdsysfs2}]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xsysjdjianshe.yongrenqiye}</td>
    <td>${xpgbz.xsysjdjianshe.yrqypg}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xsysjdjianshe.yrqyfs1},${xpgbz.xsysjdjianshe.yrqyfs2}]</td>
  </tr>
  <tr>
    <td rowspan="12">实践教学过程监控</td>
    <td rowspan="2">${xpgbz.xjxgcjiankong.jiaoxuezhunbei }</td>
    <td>${xpgbz.xjxgcjiankong.jxzbpg }</td>
    <td rowspan="12">${xpgbz.xjxgcjiankong.conclusion}</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjxgcjiankong.jxzbfs1 },${xpgbz.xjxgcjiankong.jxzbfs2 }]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xjxgcjiankong.jiaoxuezhidao }</td>
    <td>${xpgbz.xjxgcjiankong.jxgcpg }</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjxgcjiankong.jxgcfs1 },${xpgbz.xjxgcjiankong.jxgcfs2 }]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xjxgcjiankong.renwushu }</td>
    <td>${xpgbz.xjxgcjiankong.rwspg }</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjxgcjiankong.rwsfs1 },${xpgbz.xjxgcjiankong.rwsfs2 }]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xjxgcjiankong.zonghejineng }</td>
    <td>${xpgbz.xjxgcjiankong.zhjnpg }</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjxgcjiankong.zhjnfs1 },${xpgbz.xjxgcjiankong.zhjnfs2 }]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xjxgcjiankong.qiyedinggang }</td>
    <td>${xpgbz.xjxgcjiankong.qydgpg }</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjxgcjiankong.qydgfs1 },${xpgbz.xjxgcjiankong.qydgfs2 }]</td>
  </tr>
  <tr>
    <td rowspan="2">${xpgbz.xjxgcjiankong.jiaoxueguocheng }</td>
    <td>${xpgbz.xjxgcjiankong.jxgcpg }</td>
  </tr>
  <tr>
    <td>[${xpgbz.xjxgcjiankong.jxgcfs1 },${xpgbz.xjxgcjiankong.jxgcfs2 }]</td>
  </tr>
  <tr>
  	<td rowspan="10">师资建设与管理制度</td>
  	<td rowspan="2">${xpgbz.xszjsglzd.jiaoxuezhidu}</td>
	<td>${xpgbz.xszjsglzd.jxzdpg}</td>
	<td rowspan="10">${xpgbz.xszjsglzd.conclusion}</td>
  </tr>
  <tr>
  	<td>[${xpgbz.xszjsglzd.jxzdfs1},${xpgbz.xszjsglzd.jxzdfs2}]</td>
  </tr>
  <tr>
  <td rowspan="2">${xpgbz.xszjsglzd.jiaoxuetixi}</td>
  	<td>${xpgbz.xszjsglzd.jxtxpg}</td>
  </tr>
   <tr>
  	<td>[${xpgbz.xszjsglzd.jxtxfs1},${xpgbz.xszjsglzd.jxtxfs2}]</td>
  </tr>
  <tr>
  	<td rowspan="2">${xpgbz.xszjsglzd.jiaoxuegaige}</td>
	<td>${xpgbz.xszjsglzd.jxggpg}</td>
  </tr>
  <tr>
  <td>[${xpgbz.xszjsglzd.jxggfs1},${xpgbz.xszjsglzd.jxggfs2}]</td>
  </tr>
   <tr>
  	<td rowspan="2">${xpgbz.xszjsglzd.jiaoshiduwu}</td>
	<td>${xpgbz.xszjsglzd.jsdwpg}</td>
  </tr>
  <tr>
  	<td>[${xpgbz.xszjsglzd.jsdwfs1},${xpgbz.xszjsglzd.jsdwfs2}]</td>
  </tr>
  <tr>
  <td rowspan="2">${xpgbz.xszjsglzd.jilijizhi}</td>
  	<td>${xpgbz.xszjsglzd.jljzpg}</td>
  </tr>
   <tr>
  	<td>[${xpgbz.xszjsglzd.jljzfs1},${xpgbz.xszjsglzd.jljzfs2}]</td>
  </tr>
  <tr>
  	<td rowspan="10">实践教学效果</td>
  	<td rowspan="2">${xpgbz.xsjjxxiaoguo.lunwenzhiliang}</td>
	<td>${xpgbz.xsjjxxiaoguo.lwzlpg}</td>
	<td rowspan="10">${xpgbz.xsjjxxiaoguo.conclusion}</td>
  </tr>
  <tr>
  <td>[${xpgbz.xsjjxxiaoguo.lwzlfs1},${xpgbz.xsjjxxiaoguo.lwzlfs2}]</td>
  </tr>
   <tr>
  	<td rowspan="2">${xpgbz.xsjjxxiaoguo.huojiangqingkuang}</td>
	<td>${xpgbz.xsjjxxiaoguo.hjqkpg}</td>
  </tr>
  <tr>
  	<td>[${xpgbz.xsjjxxiaoguo.hjqkfs1},${xpgbz.xsjjxxiaoguo.hjqkfs2}]</td>
  </tr>
  <tr>
  <td rowspan="2">${xpgbz.xsjjxxiaoguo.shijiannengli}</td>
  	<td>${xpgbz.xsjjxxiaoguo.sjnlpg}</td>
  </tr>
   <tr>
  	<td>[${xpgbz.xsjjxxiaoguo.sjnlfs1},${xpgbz.xsjjxxiaoguo.sjnlfs2}]</td>
  </tr>
  <tr>
  	<td rowspan="2">${xpgbz.xsjjxxiaoguo.changxinsuzhi}</td>
	<td>${xpgbz.xsjjxxiaoguo.cxszpg}</td>
  </tr>
  <tr>
  <td>[${xpgbz.xsjjxxiaoguo.cxszfs1},${xpgbz.xsjjxxiaoguo.cxszfs2}]</td>
  </tr>
   <tr>
  	<td rowspan="2">${xpgbz.xsjjxxiaoguo.yongrendanwei}</td>
	<td>${xpgbz.xsjjxxiaoguo.yrdwpg}</td>
  </tr>
  <tr>
  	<td>[${xpgbz.xsjjxxiaoguo.yrdwfs1},${xpgbz.xsjjxxiaoguo.yrdwfs2}]</td>
  </tr>
  <tr>
  <td rowspan="12">毕业生评价</td>
  	<td rowspan="2">${xpgbz.xbiyspingjia.kechengmanyi}</td>
  	<td>${xpgbz.xbiyspingjia.kcmypg}</td>
	<td rowspan="12">${xpgbz.xsjjxxiaoguo.conclusion}</td>
  </tr>
   <tr>
  	<td>[${xpgbz.xbiyspingjia.kcmyfs1},${xpgbz.xbiyspingjia.kcmyfs2}]</td>
  </tr>
  <tr>
  	<td rowspan="2">${xpgbz.xbiyspingjia.shijianhuanjing}</td>
	<td>${xpgbz.xbiyspingjia.sjhjpg}</td>
  </tr>
  <tr>
  <td>[${xpgbz.xbiyspingjia.sjhjfs1},${xpgbz.xbiyspingjia.sjhjfs2}]</td>
  </tr>
   <tr>
  	<td rowspan="2">${xpgbz.xbiyspingjia.jiaoxuenengli}</td>
	<td>${xpgbz.xbiyspingjia.jxnlpg}</td>
  </tr>
  <tr>
  	<td>[${xpgbz.xbiyspingjia.jxnlfs1},${xpgbz.xbiyspingjia.jxnlfs2}]</td>
  </tr>
  <tr>
  <td rowspan="2">${xpgbz.xbiyspingjia.fazhanzydu}</td>
  	<td>${xpgbz.xbiyspingjia.fzzydpg}</td>
  </tr>
   <tr>
  	<td>[${xpgbz.xbiyspingjia.fzzydfs1},${xpgbz.xbiyspingjia.fzzydfs2}]</td>
  </tr>
  <tr>
  	<td rowspan="2">${xpgbz.xbiyspingjia.peiyangmanyidu}</td>
	<td>${xpgbz.xbiyspingjia.pymydpg}</td>
  </tr>
  <tr>
  <td>[${xpgbz.xbiyspingjia.pymydfs1},${xpgbz.xbiyspingjia.pymydfs2}]</td>
  </tr>
   <tr>
  	<td rowspan="2">${xpgbz.xbiyspingjia.jycynengli}</td>
	<td>${xpgbz.xbiyspingjia.jycynlpg}</td>
  </tr>
  <tr>
  	<td>[${xpgbz.xbiyspingjia.jycynlfs1},${xpgbz.xbiyspingjia.jycynlfs2}]</td>
  </tr>
</table>

  </body>
</html>