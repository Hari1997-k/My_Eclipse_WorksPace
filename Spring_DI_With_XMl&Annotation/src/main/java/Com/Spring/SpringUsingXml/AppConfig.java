package Com.Spring.SpringUsingXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//SETTER INJECTCTION  WITH DEPENDENT OBJECT BEAN CONFIGURATION :
/*@Configuration
public class AppConfig {
@Bean
	public Employee employee () {
		Employee e = new Employee();
		e.setEid(12);
		e.setEname("ss");
		e.setErole("22222");
		e.setAddress(address());
	
		return e;
	}
@Bean
public Address address() {
	Address add = new Address();
	add.setDistrict("Chittorr");
	add.setDoorNo("12-ww-3");
	add.setStreet("CBR");
	return add;
	
}
}*/

//CONSTRUCTOR INJECTION WITH DEPENDENT OBJECT BEAN CONFIGURATION :
/*@Configuration
public class AppConfig{
	@Bean
public Employee employee() {
	Employee e = new Employee(980790, "vikramRathore", "DataScientist", address());
	return e;
}@Bean
public Address address() {
	Address add = new Address("19-3-1b/12c", "GarudadriNagr", "Mumbai");
	return add;
}
}*/
