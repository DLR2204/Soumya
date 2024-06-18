package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("demo")
@Configuration
public class Company {
	
	public static void main(String[] args) {
		
		BeanFactory factory = new AnnotationConfigApplicationContext(Company.class);
	
		Employee emp1 = (Employee) factory.getBean("emp");
		
		System.out.println(emp1);
	
		
		Address add = (Address) factory.getBean("add");
		
		System.out.println(add);
	
	}

}
