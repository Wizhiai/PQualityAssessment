package cn.junit;


import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pq.dao.XevaluateDAO;
import com.pq.domain.Xevaluate;
import com.pq.service.EvaluateService;

public class EvaluateServiveTest {
	
	private static EvaluateService service = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = (EvaluateService) ctx.getBean("EvaluateService");
	}

	@Test
	public void testEvaluate() {
		
		
		
		service.evaluate("2061");
	}
	

}
