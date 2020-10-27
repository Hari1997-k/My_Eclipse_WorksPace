package Com.spring.SpringComponentAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// CONFIGURATION  FOR AUTOWIRE BY PROEPRTY USING SETTER INJECTION :
@Configuration
@ComponentScan(basePackages = "Com.spring.SpringComponentAnnotationDemo")
public class AppConfig {
	
}