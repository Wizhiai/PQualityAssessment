package com.pq.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.pq.dao.XbiyspingjiaDAO;
import com.pq.dao.XevaluateDAO;
import com.pq.dao.XjiaoxuetixiDAO;
import com.pq.dao.XjxgcjiankongDAO;
import com.pq.dao.XpinggubiaozhunDAO;
import com.pq.dao.XsjjxxiaoguoDAO;
import com.pq.dao.XsysjdjiansheDAO;
import com.pq.dao.XszjsglzdDAO;
import com.pq.domain.Xbiyspingjia;
import com.pq.domain.Xevaluate;
import com.pq.domain.Xjiaoxuetixi;
import com.pq.domain.Xjxgcjiankong;
import com.pq.domain.Xpinggubiaozhun;
import com.pq.domain.Xsjjxxiaoguo;
import com.pq.domain.Xsysjdjianshe;
import com.pq.domain.Xszjsglzd;


public class EvaluateService {
	
	
	private XjiaoxuetixiDAO xjiaodao;
	private XsysjdjiansheDAO xsysdao;
	private XjxgcjiankongDAO xjxgcdao;
	private XszjsglzdDAO xszjsdao;
	private XsjjxxiaoguoDAO xsjjxdao;
	private XbiyspingjiaDAO xbiyedao;
	private XevaluateDAO xevaluedao;
	private XpinggubiaozhunDAO xpgbzdao;
	
	
	public XpinggubiaozhunDAO getXpgbzdao() {
		return xpgbzdao;
	}


	public void setXpgbzdao(XpinggubiaozhunDAO xpgbzdao) {
		this.xpgbzdao = xpgbzdao;
	}


	


	public XjiaoxuetixiDAO getXjiaodao() {
		return xjiaodao;
	}


	public void setXjiaodao(XjiaoxuetixiDAO xjiaodao) {
		this.xjiaodao = xjiaodao;
	}


	public XsysjdjiansheDAO getXsysdao() {
		return xsysdao;
	}


	public void setXsysdao(XsysjdjiansheDAO xsysdao) {
		this.xsysdao = xsysdao;
	}


	public XjxgcjiankongDAO getXjxgcdao() {
		return xjxgcdao;
	}


	public void setXjxgcdao(XjxgcjiankongDAO xjxgcdao) {
		this.xjxgcdao = xjxgcdao;
	}


	public XszjsglzdDAO getXszjsdao() {
		return xszjsdao;
	}


	public void setXszjsdao(XszjsglzdDAO xszjsdao) {
		this.xszjsdao = xszjsdao;
	}


	public XsjjxxiaoguoDAO getXsjjxdao() {
		return xsjjxdao;
	}


	public void setXsjjxdao(XsjjxxiaoguoDAO xsjjxdao) {
		this.xsjjxdao = xsjjxdao;
	}


	public XbiyspingjiaDAO getXbiyedao() {
		return xbiyedao;
	}


	public void setXbiyedao(XbiyspingjiaDAO xbiyedao) {
		this.xbiyedao = xbiyedao;
	}


	public XevaluateDAO getXevaluedao() {
		return xevaluedao;
	}


	public void setXevaluedao(XevaluateDAO xevaluedao) {
		this.xevaluedao = xevaluedao;
	}
    //判断区间
	public String judgeInterval(Double d)
	{
		if(90d<=d&&d<=100d)
		{
			return "优秀";
			
		}else if(80d<=d&&d<90d)
		{
			return "良好";
			
		}else if(70d<=d&&d<80d)
		{
			return "中等";
			
		}else if(60d<=d&&d<70d)
		{
			return "及格";
			
		}else 
		{
			return "不及格";
		}
	}
	//求出隶属度
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	public String membershipF(List<Double> min2max )
	{
		//根据给出的等级区间确定隶属函数
		Double min=min2max.get(0);
		Double max=min2max.get(1);
		int grade=9;
		Double getmax=0d;
		Double m1=0d,m2=60d,m3=70d,m4=80d,m5=90d,m6=100d;
		List<Double> membership1=new ArrayList<Double>();//有效区间的下限
		List<Double> membership2=new ArrayList<Double>();//有效区间的上限
		List<Double> membership=new ArrayList<Double>();//有效区间的隶属度
		
		if(min<m2)
		{
			membership1.add(1d);
			membership1.add((min-m1)/m2);
			membership1.add(0d);
			membership1.add(0d);
			membership1.add(0d);
			
			
		}else if(min<m3)
		{
			membership1.add((m3-min)/10d);
			membership1.add(1d);
			membership1.add((min-m2)/10d);
			membership1.add(0d);
			membership1.add(0d);
			
		}else if(min<m4)
		{
			membership1.add(0d);
			membership1.add((m4-min)/10d);
			membership1.add(1d);
			membership1.add((min-m3)/10d);
			membership1.add(0d);
		}else if(min<m5)
		{
			membership1.add(0d);
			membership1.add(0d);
			membership1.add((m5-min)/10d);
			membership1.add(1d);
			membership1.add((min-m4)/10d);
		}else 
		{
			membership1.add(0d);
			membership1.add(0d);
			membership1.add(0d);
			membership1.add((m6-min)/10d);
			membership1.add(1d);
		}
		

		if(max<m2)
		{
			membership2.add(1d);
			membership2.add((max-m1)/m2);
			membership2.add(0d);
			membership2.add(0d);
			membership2.add(0d);
			
			
		}else if(max<m3)
		{
			membership2.add((m3-max)/10d);
			membership2.add(1d);
			membership2.add((max-m2)/10d);
			membership2.add(0d);
			membership2.add(0d);
			
		}else if(max<m4)
		{
			membership2.add(0d);
			membership2.add((m4-max)/10d);
			membership2.add(1d);
			membership2.add((max-m3)/10d);
			membership2.add(0d);
		}else if(max<m5)
		{
			membership2.add(0d);
			membership2.add(0d);
			membership2.add((m5-max)/10d);
			membership2.add(1d);
			membership2.add((max-80)/10d);
		}else 
		{
			membership2.add(0d);
			membership2.add(0d);
			membership2.add(0d);
			membership2.add((m6-max)/10d);
			membership2.add(1d);
		}
		
		for(int i=0;i<membership1.size();i++)
		{
			membership.add((membership1.get(i)+membership2.get(i))/2d);
		}
		for(int i=0;i<membership.size();i++)
		{
			
			
			if(membership.get(i)>=getmax)
			{
				getmax=membership.get(i);
				grade=i;
			}
		}
		
		switch(grade){
		
		case 0:
			return "不及格";
		case 1:
			return "及格";
		case 2:
			return "中等";
		case 3:
			return "良好";
		case 4:
			return "优秀";		
		
		}
		return "";
		
	}

    
	//求出有效区间
	public List<Double> effectiveRange(List<Double> listdouble)
	{
		List<Double> min2max=new ArrayList<Double>();
		
		double d1=0d,d2=0d;
		double v=(double)listdouble.size();
		for(int i=0;i<listdouble.size();i++)
		{
			if(judgeInterval(listdouble.get(i)).equals("优秀"))
			{
				d1=d1+90d;
				d2=d2+100d;
			}else if(judgeInterval(listdouble.get(i)).equals("良好"))
			{
				d1=d1+80d;
				d2=d2+89d;
				
			}else if(judgeInterval(listdouble.get(i)).equals("中等"))
			{
				d1=d1+70d;
				d2=d2+79d;
				
			}else if(judgeInterval(listdouble.get(i)).equals("及格"))
			{
				d1=d1+60d;
				d2=d2+69d;
			}else 
			{
				d1=d1+0d;
				d2=d2+59d;
			}
			
		}
		d1=d1/v;
		d2=d2/v;
		min2max.add(d1);
		min2max.add(d2);
		
		return min2max;
		
	}
	//
	public Double jugeScoreList(int j,Xevaluate xe)
	{
		
		switch(j)
		{
		 case 0:
			return xe.getTscore1();
			 
		 case 1:
			 return xe.getTscore2();
		 case 2:
			 return xe.getTscore3();
		 case 3:
			 return xe.getTscore4();
		 case 4:
			 return xe.getTscore5();
		 case 5:
			 return xe.getTscore6();
		 case 6:
			 return xe.getTscore7();
		 case 7:
			 return xe.getTscore8();
		 case 8:
			 return xe.getTscore9();
		 case 9:
			 return xe.getTscore10();
		 case 10:
			 return xe.getTscore11();
		 case 11:
			 return xe.getTscore12();
		 case 12:
			 return xe.getTscore13();
		 case 13:
			 return xe.getTscore14();
		 case 14:
			 return xe.getTscore14();
		 case 15:
			 return xe.getTscore16();
		 case 16:
			 return xe.getTscore17();
		 case 17:
			 return xe.getTscore18();
		 case 18:
			 return xe.getTscore19();
		 case 19:
			 return xe.getTscore2();
		 case 20:
			 return xe.getTscore21();
		 case 21:
			 return xe.getTscore22();
		 case 22:
			 return xe.getTscore23();
		 case 23:
			 return xe.getTscore24();
		 case 24:
			 return xe.getTscore25();
		 case 25:
			 return xe.getTscore26();
		 case 26:
			 return xe.getTscore27();
		 case 27:
			 return xe.getTscore28();
		 case 28:
			 return xe.getTscore29();
		 case 29:
			 return xe.getTscore30();
		 case 30:
			 return xe.getTscore31();
		 case 31:
			 return xe.getTscore32();
		}
		return 0d;
	}
	
	//求出隶属度，评定等级
	@SuppressWarnings("unchecked")
	public void evaluate(String jieshu)
	{
		//有效区间

		
		List<Xevaluate> list=xevaluedao.findByJieshu(jieshu);
		List<Double>[] listdouble=new ArrayList[32];//统计每个二级指标打分表
		
		
		List<Double>[] min2max2=new ArrayList[32];//二级指标有效区间
		List<Double>[] min2max1=new ArrayList[6];//一级指标有效区间
		List<Double> min2max0=new ArrayList();//总评估区间
		
		
		String grade2[]=new String[32];//二级指标评估等级
		String grade1[]=new String[6];//一级指标评估等级
		String grade0=new String();//总评估等级
		
		Xpinggubiaozhun xpgbz=new Xpinggubiaozhun();
		Xjiaoxuetixi jiaoxuetixi=new Xjiaoxuetixi();//实践教学体系
		Xsysjdjianshe sysjdjs=new Xsysjdjianshe();//实验室与实践基地建设
		Xjxgcjiankong jxgcjk=new Xjxgcjiankong();//实践教学过程监控
		Xszjsglzd szjsglzd=new Xszjsglzd();//师资建设与管理制度
		Xsjjxxiaoguo sjjxxg=new Xsjjxxiaoguo();//实践教学效果
		Xbiyspingjia byspj=new Xbiyspingjia();//毕业生评价
		
		
		/**二级指标体系各项的等级和区间**/
		//统计每个二级指标打分表
		for(int j=0;j<32;j++)
		{
			for (Iterator i = list.iterator(); i.hasNext();)
			{
				Xevaluate xe=(Xevaluate)i.next();				
				List<Double> temp=new ArrayList();	
				
				temp.add(jugeScoreList(j,xe));	
				listdouble[j]=temp;			
			    
			}	
		}
		
		//求出每个二级指标的有效区间、通过隶属度函数评估有效区间得到评估结果
		for(int j=0;j<32;j++)
		{
			min2max2[j]=effectiveRange(listdouble[j]);
			grade2[j]=membershipF(min2max2[j]);
		}
		/**二级指标体系各项指标初始化和一级指标体系初始化**/
		//实践教学体系
		Set set1=new HashSet();
		set1.add(xpgbz);
		
		List<Double> mmTemp1=new ArrayList();
	
		mmTemp1.add(min2max2[0].get(0)*0.35d+min2max2[1].get(0)*0.35d+min2max2[2].get(0)*0.3d);
		mmTemp1.add(min2max2[0].get(1)*0.35d+min2max2[1].get(1)*0.35d+min2max2[2].get(1)*0.3d);
		min2max1[0]=mmTemp1;
		
		
		grade1[0]=membershipF(min2max1[0]);
		
		jiaoxuetixi.setJiaoxuejihua("实践性教学计划");
		jiaoxuetixi.setJxjhfs1(min2max2[0].get(0));
		jiaoxuetixi.setJxjhfs2(min2max2[0].get(1));
		jiaoxuetixi.setJxjhpg(grade2[0]);
		
		jiaoxuetixi.setKechengdagang("实践性课程大纲");
		jiaoxuetixi.setKcdgfs1(min2max2[1].get(0));
		jiaoxuetixi.setKcdgfs2(min2max2[1].get(1));
		jiaoxuetixi.setKcdgpg(grade2[1]);
		
		jiaoxuetixi.setXiaoqihezuo("校企合作计划及协议");
		jiaoxuetixi.setXqhzfs1(min2max2[2].get(0));
		jiaoxuetixi.setXqhzfs2(min2max2[2].get(1));
		jiaoxuetixi.setXahzpg(grade2[2]);
		
		jiaoxuetixi.setJieshu(jieshu);
		jiaoxuetixi.setTotal1(min2max1[0].get(0));
		jiaoxuetixi.setTotal2(min2max1[0].get(1));
		jiaoxuetixi.setGrade(grade1[0]);
		
		
		
		//实验室与实践基地建设
		Set set2=new HashSet();
		set2.add(xpgbz);
		

		List<Double> mmTemp2=new ArrayList();
		
		mmTemp2.add(min2max2[3].get(0)*0.15d+min2max2[4].get(0)*0.1d+min2max2[5].get(0)*0.1d+min2max2[6].get(0)*0.2d+min2max2[7].get(0)*0.2d+min2max2[8].get(0)*0.1d+min2max2[9].get(0)*0.15d);
		mmTemp2.add(min2max2[3].get(1)*0.15d+min2max2[4].get(1)*0.1d+min2max2[5].get(1)*0.1d+min2max2[6].get(1)*0.2d+min2max2[7].get(1)*0.2d+min2max2[8].get(1)*0.1d+min2max2[9].get(1)*0.15d);
		min2max1[1]=mmTemp2;
		
		
		grade1[1]=membershipF(min2max1[1]);
		
		sysjdjs.setShebeitouru("实践教学设备投入");
		sysjdjs.setSbtrfs1(min2max2[3].get(0));
		sysjdjs.setSbtrfs2(min2max2[3].get(1));
		sysjdjs.setSbtrpg(grade2[3]);
		
		sysjdjs.setShiyanshijianshe("实验室建设规划");
		sysjdjs.setSysjsfs1(min2max2[4].get(0));
		sysjdjs.setSysjsfs2(min2max2[4].get(1));		
		sysjdjs.setSysjspg(grade2[4]);
		
		sysjdjs.setShiyanshizhidu("实验室建设制度");
		sysjdjs.setSyszdfs1(min2max2[5].get(0));
		sysjdjs.setSyszdfs2(min2max2[5].get(1));
		sysjdjs.setSyszdpg(grade2[5]);
		
		sysjdjs.setZhongdianshiyanshi("重点实验室建设");
		sysjdjs.setZdsysfs1(min2max2[6].get(0));
		sysjdjs.setZdsysfs2(min2max2[6].get(1));
		sysjdjs.setZdsyspg(grade2[6]);
		
		
		sysjdjs.setXiaowaijidi("校外实践基地建设");
		sysjdjs.setXwjdpg(grade2[7]);
		sysjdjs.setSwjdfs1(min2max2[7].get(0));
		sysjdjs.setSwjdfs2(min2max2[7].get(1));
		
		
		sysjdjs.setZigerenzheng("企业学院及资格认证");
		sysjdjs.setZgrzfs1(min2max2[8].get(0));
		sysjdjs.setZgrzfs2(min2max2[8].get(1));
		sysjdjs.setZgrzpg(grade2[8]);
		
		sysjdjs.setYongrenqiye("用人企业群的数量与规模");
		sysjdjs.setYrqyfs1(min2max2[9].get(0));
		sysjdjs.setYrqyfs2(min2max2[9].get(1));
		sysjdjs.setYrqypg(grade2[9]);
		
		
		sysjdjs.setJieshu(jieshu);
		sysjdjs.setTotal1(min2max1[1].get(0));
		sysjdjs.setTotal2(min2max1[1].get(1));
		sysjdjs.setGrade(grade1[1]);
		
		
		
		
		
		//实践教学过程监控
		Set set3=new HashSet();
		set3.add(xpgbz);
		
        List<Double> mmTemp3=new ArrayList();
		
		mmTemp3.add(min2max2[10].get(0)*0.2d+min2max2[11].get(0)*0.2d+min2max2[12].get(0)*0.2d+min2max2[13].get(0)*0.15d+min2max2[14].get(0)*0.15d+min2max2[15].get(0)*0.1d);
		mmTemp3.add(min2max2[10].get(1)*0.2d+min2max2[11].get(1)*0.2d+min2max2[12].get(1)*0.2d+min2max2[13].get(1)*0.15d+min2max2[14].get(1)*0.15d+min2max2[15].get(1)*0.1d);
		min2max1[2]=mmTemp3;
		grade1[2]=membershipF(min2max1[2]);		
		
		jxgcjk.setJiaoxuezhunbei("实践教学准备程度");
		jxgcjk.setJxzbfs1(min2max2[10].get(0));
		jxgcjk.setJxzbfs2(min2max2[10].get(1));
		jxgcjk.setJxzbpg(grade2[10]);
		
		
		jxgcjk.setJiaoxuezhidao("教师随堂指导与课后辅导");
		jxgcjk.setJxzdfs1(min2max2[11].get(0));
		jxgcjk.setJxzdfs2(min2max2[11].get(1));
		jxgcjk.setJxzdpg(grade2[11]);
		
		jxgcjk.setJiaoxueguocheng("教学过程纪录和总结");
		jxgcjk.setJxgcfs1(min2max2[12].get(0));
		jxgcjk.setJxgcfs2(min2max2[12].get(1));
		jxgcjk.setJxgcpg(grade2[12]);
		
		jxgcjk.setRenwushu("教学指导书和任务书");
		jxgcjk.setRwsfs1(min2max2[13].get(0));
		jxgcjk.setRwsfs2(min2max2[13].get(1));
		jxgcjk.setRwspg(grade2[13]);
		
		jxgcjk.setZonghejineng("综合技能和项目实训");
		jxgcjk.setZhjnfs1(min2max2[14].get(0));
		jxgcjk.setZhjnfs2(min2max2[14].get(1));
		jxgcjk.setZhjnpg(grade2[14]);
		
		jxgcjk.setQiyedinggang("企业顶岗与素质培训");
		jxgcjk.setQydgfs1(min2max2[15].get(0));
		jxgcjk.setQydgfs2(min2max2[15].get(1));
		jxgcjk.setQydgpg(grade2[15]);
		
		
		jxgcjk.setJieshu(jieshu);
		jxgcjk.setTotal1(min2max1[2].get(0));
		jxgcjk.setTotal2(min2max1[2].get(1));
		jxgcjk.setGrade(grade1[2]);
		
		
		
		
		//师资建设与管理制度
		Set set4=new HashSet();
		set4.add(xpgbz);
		
        List<Double> mmTemp4=new ArrayList();		
		mmTemp4.add(min2max2[16].get(0)*0.2d+min2max2[17].get(0)*0.15d+min2max2[18].get(0)*0.2d+min2max2[19].get(0)*0.25d+min2max2[20].get(0)*0.2d);
		mmTemp4.add(min2max2[16].get(1)*0.2d+min2max2[17].get(1)*0.15d+min2max2[18].get(1)*0.2d+min2max2[19].get(1)*0.25d+min2max2[20].get(1)*0.2d);
		min2max1[3]=mmTemp4;
	
		
		grade1[3]=membershipF(min2max1[3]);
		
		
		szjsglzd.setJiaoxuezhidu("实践教学管理制度");
		szjsglzd.setJxzdfs1(min2max2[16].get(0));
		szjsglzd.setJxzdfs2(min2max2[16].get(1));
		szjsglzd.setJxzdpg(grade2[16]);
		
		szjsglzd.setJiaoxuetixi("实践教学管理体系");
		szjsglzd.setJxtxfs1(min2max2[17].get(0));
		szjsglzd.setJxtxfs2(min2max2[17].get(1));
		szjsglzd.setJxtxpg(grade2[17]);
		
		szjsglzd.setJiaoxuegaige("实践教学改革与创新");
		szjsglzd.setJxggfs1(min2max2[18].get(0));
		szjsglzd.setJxggfs2(min2max2[18].get(1));
		szjsglzd.setJxggpg(grade2[18]);
		
		szjsglzd.setJiaoshiduwu("实践教师队伍结构");
		szjsglzd.setJsdwfs1(min2max2[19].get(0));
		szjsglzd.setJsdwfs2(min2max2[19].get(1));
		szjsglzd.setJsdwpg(grade2[19]);
		
		szjsglzd.setJilijizhi("实践教学激励机制");
		szjsglzd.setJljzfs1(min2max2[20].get(0));
		szjsglzd.setJljzfs2(min2max2[20].get(1));
		szjsglzd.setJljzpg(grade2[20]);
		
		szjsglzd.setJieshu(jieshu);
		szjsglzd.setTotal1(min2max1[3].get(0));
		szjsglzd.setTotal2(min2max1[3].get(1));
		szjsglzd.setGrade(grade1[3]);
		
		
		
		
		
		//实践教学效果
		Set set5=new HashSet();
		set5.add(xpgbz);
		

        List<Double> mmTemp5=new ArrayList();		
		mmTemp5.add(min2max2[21].get(0)*0.25d+min2max2[22].get(0)*0.15d+min2max2[23].get(0)*0.2d+min2max2[24].get(0)*0.15d+min2max2[25].get(0)*0.25d);
		mmTemp5.add(min2max2[21].get(1)*0.25d+min2max2[22].get(1)*0.15d+min2max2[23].get(1)*0.2d+min2max2[24].get(1)*0.15d+min2max2[25].get(1)*0.25d);

		min2max1[4]=mmTemp5;
		
		grade1[4]=membershipF(min2max1[4]);
		
		sjjxxg.setLunwenzhiliang("毕业论文(设计)质量");
		sjjxxg.setLwzlfs1(min2max2[21].get(0));
		sjjxxg.setLwzlfs2(min2max2[21].get(1));
		sjjxxg.setLwzlpg(grade2[21]);
		
		sjjxxg.setHuojiangqingkuang("学生获奖情况");
		sjjxxg.setHjqkfs1(min2max2[22].get(0));
		sjjxxg.setHjqkfs2(min2max2[22].get(1));
		sjjxxg.setHjqkpg(grade2[22]);
		
		sjjxxg.setShijiannengli("综合实践能力展示");
		sjjxxg.setSjnlfs1(min2max2[23].get(0));
		sjjxxg.setSjnlfs2(min2max2[23].get(1));
		sjjxxg.setSjnlpg(grade2[23]);
		
		sjjxxg.setChangxinsuzhi("创新精神与综合素质");
		sjjxxg.setCxszfs1(min2max2[24].get(0));
		sjjxxg.setCxszfs2(min2max2[24].get(1));
		sjjxxg.setCxszpg(grade2[24]);
		
		sjjxxg.setYongrendanwei("社会及用人单位评价");
		sjjxxg.setYrdwfs1(min2max2[25].get(0));
		sjjxxg.setYrdwfs2(min2max2[25].get(1));
		sjjxxg.setYrdwpg(grade2[25]);
		
		sjjxxg.setJieshu(jieshu);
		sjjxxg.setTotal1(min2max1[4].get(0));
		sjjxxg.setTotal2(min2max1[4].get(1));
		sjjxxg.setGrade(grade1[4]);
		
		
		
		
		
		//毕业生评价
		
		Set set6=new HashSet();
		set6.add(xpgbz);
		
		List<Double> mmTemp6=new ArrayList();		
		mmTemp6.add(min2max2[26].get(0)*0.2d+min2max2[27].get(0)*0.15d+min2max2[28].get(0)*0.2d+min2max2[29].get(0)*0.1d+min2max2[30].get(0)*0.15d+min2max2[31].get(0)*0.2d);
		mmTemp6.add(min2max2[26].get(1)*0.2d+min2max2[27].get(1)*0.15d+min2max2[28].get(1)*0.2d+min2max2[29].get(1)*0.1d+min2max2[30].get(1)*0.15d+min2max2[31].get(1)*0.2d);
		min2max1[5]=mmTemp6;
		
		
		grade1[5]=membershipF(min2max1[5]);
		
		byspj.setKechengmanyi("课程满意与兴趣度");
		byspj.setKcmyfs1(min2max2[26].get(0));
		byspj.setKcmyfs2(min2max2[26].get(1));
		byspj.setKcmypg(grade2[26]);
		
		byspj.setShijianhuanjing("实践环境建设满意度");
		byspj.setSjhjfs1(min2max2[27].get(0));
		byspj.setSjhjfs2(min2max2[27].get(1));
		byspj.setSjhjpg(grade2[27]);
		
		byspj.setJiaoxuenengli("教师实践教学能力");
		byspj.setJxnlfs1(min2max2[28].get(0));
		byspj.setJxnlfs2(min2max2[28].get(1));
		byspj.setJxnlpg(grade2[28]);
		
		byspj.setFazhanzydu("实践能力发展自由度");
		byspj.setFzzydfs1(min2max2[29].get(0));
		byspj.setFzzydfs2(min2max2[29].get(1));
		byspj.setFzzydpg(grade2[29]);
		
		byspj.setPeiyangmanyidu("综合能力培养满意度");
		byspj.setPymydfs1(min2max2[30].get(0));
		byspj.setPymydfs2(min2max2[30].get(1));
		byspj.setPymydpg(grade2[30]);
		
		byspj.setJycynengli("就业创业能力培养");
		byspj.setJycynlfs1(min2max2[31].get(0));
		byspj.setJycynlfs2(min2max2[31].get(1));
		byspj.setJycynlpg(grade2[31]);

		
		byspj.setJieshu(jieshu);
		byspj.setTotal1(min2max1[5].get(0));
		byspj.setTotal2(min2max1[5].get(1));
		byspj.setGrade(grade1[5]);
		
		

		xjiaodao.save(jiaoxuetixi);		
		xsysdao.save(sysjdjs);
		xjxgcdao.save(jxgcjk);
		xszjsdao.save(szjsglzd);
		xsjjxdao.save(sjjxxg);
		xbiyedao.save(byspj);
		
		/**一级指标体系各项的等级和区间**/
		//运用区间运算和权重系数得到一级指标的有效区间，判断隶属度
		min2max0.add(min2max1[0].get(0)*0.1d+min2max1[1].get(0)*0.2d+min2max1[2].get(0)*0.2d+min2max1[3].get(0)*0.15d+min2max1[4].get(0)*0.15d+min2max1[5].get(0)*0.2d);
		min2max0.add(min2max1[0].get(1)*0.1d+min2max1[1].get(1)*0.2d+min2max1[2].get(1)*0.2d+min2max1[3].get(1)*0.15d+min2max1[4].get(1)*0.15d+min2max1[5].get(1)*0.2d);
		grade0=membershipF(min2max0);
		
		xpgbz.setJieshu(jieshu);
		xpgbz.setTotal1(min2max0.get(0));
		xpgbz.setTotal2(min2max0.get(1));
		xpgbz.setGrade(grade0);

		jiaoxuetixi.setXpinggubiaozhuns(set1);
		sysjdjs.setXpinggubiaozhuns(set2);
		jxgcjk.setXpinggubiaozhuns(set3);
		szjsglzd.setXpinggubiaozhuns(set4);
		sjjxxg.setXpinggubiaozhuns(set5);
		byspj.setXpinggubiaozhuns(set6);
		
		xpgbz.setXjiaoxuetixi((Xjiaoxuetixi) (xjiaodao.findByJieshu(jieshu)).get(0));
		xpgbz.setXsysjdjianshe((Xsysjdjianshe) (xsysdao.findByJieshu(jieshu)).get(0));
		xpgbz.setXjxgcjiankong((Xjxgcjiankong) xjxgcdao.findByJieshu(jieshu).get(0));
		xpgbz.setXsjjxxiaoguo((Xsjjxxiaoguo) xsjjxdao.findByJieshu(jieshu).get(0));
		xpgbz.setXszjsglzd((Xszjsglzd) xszjsdao.findByJieshu(jieshu).get(0));
		xpgbz.setXbiyspingjia((Xbiyspingjia) xbiyedao.findByJieshu(jieshu).get(0));
		
		
	
		
		

		xpgbzdao.save(xpgbz);
		
		
	}
}
