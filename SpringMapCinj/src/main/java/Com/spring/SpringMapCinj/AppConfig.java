package Com.spring.SpringMapCinj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//ANNOTATAION CONFIGURATION FOR CONSTRUCTOR INJECTION WITH MAP INTERAFCE :
	/*@Configuration 
	public class AppConfig {
	@Bean
	public Question question() {
	Map<String,String> mp = new HashMap<String , String>();
	mp.put("AUTHOR 1", "ORM is A Tool");
	mp.put("Author2", "ORM Is An Persistance Tool");
	mp.put("Author 3", "Hibernate Is An ORm Tool");
	Question quest = new Question("What Is ORM?", mp);
	return quest;

	}
	}*/
//ANNOTATAION CONFIGURATION FOR CONSTRUCTOR INJECTION WITH list INTERAFCE :
/*@Configuration
public class AppConfig{
@Bean
public Question question() {
	List <String> alst = new ArrayList<String>();
	alst.add("Beans is Also called as Bean class");
	alst.add("In Spring pojo class is called as Bean");
	alst.add("In Spring The Object of PoJo Class Is Called As A Bean ");
	Question quest = new Question("What Is BEANS in SPRING ?", alst);
	return quest;
}
}*/
//ANNOTATAION CONFIGURATION FOR CONSTRUCTOR INJECTION WITH LIST & MAP  INTERAFCE :
/*@Configuration
	@Bean
	public Question question() {
		List<String> qlst = new ArrayList<String>();
		qlst.add("HaRi");
		qlst.add("KsRao");
		qlst.add("K.HaRi");
		Map<String , String> qmp = new HashMap<String , String>();
		qmp.put("Easy", "Java Collection Framework");
		qmp.put("Medium Type", "Java Constructor Framework");
		qmp.put("Tough", "Java Collection Framework");
		Question quest = new Question("Whta is JCF ?", qlst, qmp);
		return quest;
		}
		}*/
