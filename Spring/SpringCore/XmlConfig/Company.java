package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
	public static void main(String[] args) {
		
//		Resource resource = new ClassPathResource("SpringCore.xml");
//
//		BeanFactory bean = new XmlBeanFactory(resource);
		
		ApplicationContext  bean = new ClassPathXmlApplicationContext("SpringCore.xml");
		
		Employee emp1 = (Employee) bean.getBean("emp");
		
		System.out.println(emp1);
		
		Employee emp2 = (Employee) bean.getBean("obj");
		
		System.out.println(emp2);
	}

}
