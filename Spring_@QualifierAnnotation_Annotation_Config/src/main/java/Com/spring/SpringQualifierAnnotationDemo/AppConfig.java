package Com.spring.SpringQualifierAnnotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// CONFIGURATION  FOR AUTOWIRE BY PROEPRTY USING SETTER INJECTION :

@Configuration
public class AppConfig {
	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setEid(89999);
		emp.setEname("RoBinHOOD");
		return emp;
	}
	@Bean
	public Address address() {
		Address add = new Address();
		add.setCity("AAA");
		add.setStreet("CCC");
		add.setDoorno("BBBB");
		return add;
		
	}
	@Bean
	public Address address1() {
		Address add = new Address();
		add.setCity("DDDD");
		add.setDoorno("EEEE");
		add.setStreet("FFF");

		return add;
		
	}
	

}