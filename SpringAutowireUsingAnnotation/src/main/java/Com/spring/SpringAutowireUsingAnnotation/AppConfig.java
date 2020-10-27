package Com.spring.SpringAutowireUsingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// CONFIGURATION  FOR AUTOWIRE BY PROEPRTY USING SETTER INJECTION :

/*@Configuration
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
		add.setCity("TPT");
		add.setDoorno("1b/12c");
		return add;
		
	}
	

}*/
/*@Configuration
public class AppConfig {
	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setEid(99999);
		emp.setEname("RaviTeja");
		return emp;
	}
	@Bean
	public Address address() {
		Address address = new Address();
		address.setCity("BNGLR");
		address.setDoorno("12-09-8999");
		address.setStreet("GandhiRoad");
		return address;
		
	}
}*/
	

@Configuration
public class AppConfig {

	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setEid(12);
		emp.setEname("loppingRAJ");
		return emp;
	}

	@Bean
	public Address address() {
		Address add = new Address();
		add.setCity("wwwww");
		add.setDoorno("222www");
		
		return add;
	}
}
