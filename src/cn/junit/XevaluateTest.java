package cn.junit;


import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pq.domain.Xevaluate;
import com.pq.service.EvaluateService;
import com.pq.service.XevaluateService;

public class XevaluateTest {

	private static XevaluateService service = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = (XevaluateService) ctx.getBean("XevaluateService");
	}
	@Test
	public void testXevaluate() {
		List<Xevaluate> list = new ArrayList<Xevaluate>();
		Xevaluate x1 = new Xevaluate();
		x1.setJieshu("2091");
		x1.setTscore1(73d);
		Xevaluate x2 = new Xevaluate();
		x2.setTscore1(82d);
		x2.setJieshu("2091");
		Xevaluate x3 = new Xevaluate();
		x3.setTscore1(65d);
		x3.setJieshu("2091");
		list.add(x1);
		list.add(x2);
		list.add(x3);
		service.commit(list);
		
	}

}
