package cn.junit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pq.domain.Xteacher;
import com.pq.service.XevaluateService;
import com.pq.service.XteacherService;

public class XTeacherTest {

	private static XteacherService service = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = (XteacherService) ctx.getBean("XteacherService");
	}

	@Test
	public void testGenerateJury() {
		List list=service.generateJury(3);
		for(Object teacher : list){
			System.out.println(((Xteacher)teacher).getName());
		}
	}

}
