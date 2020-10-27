package Com.spring.SpringMapSinj;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//SETTER INJECTION ANNOTATION CONFIG :
/*@Configuration
public class AppConfig {
	@Bean
	public Question question() {
		Question quest = new Question();
		quest.setQues("What is DI ?");
		List<String> al = new ArrayList<String>();
		al.add("Di Stands For Dependency Injection \n");
		al.add("Di Stands For Data Iron");
		quest.setAnswer(al);
		return quest ;
	}

}*/
//SETTER INJECTION WITH MAP CONFIGURATION 
/*@Configuration
class AppConfig{
	@Bean
	public Question question() {
		Question quest = new Question();
		quest.setQues("What Is A POJO class ?");
		Map<String , String> mp = new HashMap<String , String>();
		mp.put("Hari", "Plain Old Jav Object");
		mp.put("KsRao", "Class With GetterSetter");
		mp.put("Hari_k", "Encapsulated Class Is Called POJO class");
		quest.setAnswer(mp);
		return quest;
	}	}*/	
		
	
	
