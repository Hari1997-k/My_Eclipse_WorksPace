package Com.spring.SpringJdbcCRUD;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		CmpDAO cd = (CmpDAO) context.getBean("cmpdao");
			/*Company cm = new Company();
			cm.setCid(10);
		  	cm.setCname("WIPRO"); 
		  	cm.setCtype("ProductBased");
//INSERT INTO COMPANY VALUES(? ,? ,?) :		 
	cd.CreateCompany(cm);
	
//DELETE CNAME . CTYPE FROM COMPANY WHERE CID = ? ;	
	cd.DeleteCompany(0);
	
//UPDATE TABEL COMPANY SET CNAME = ? , CTYPE = ? WHERE CID = ? :	
	cd.updateCnameCtypeById(60, "TCS", "ProductBased");
		cd.updateCnameCtypeById(70, "PAYPAL.CO.In ","WebBased");

//UPDATE COMPANY SET CNAME = ? WHERE CID  = ? ;	
	cd.UpdateCNameByCid(1000, "Google.CO");
	
//UPDATE COMPANY SET CID = ? WHERE CNAME = ?;	
	cd.UpdateCidByCname(60, "Google.CO");
	
//SELECT * FROM COMPANY :
		List<Company> clst = cd.listOfComapanies();
		System.out.println("Cid"+"\t\t"+"Cname"+"\t\t"+"CType");
		for(Company cpny : clst) {
			System.out.println(cpny.getCid()+"\t\t"+cpny.getCname()+"\t\t"+cpny.getCtype());
		}
		
//SELECT * FROM COMAPNY WHERE CID = ? :
		System.out.println("CId :\t\t"+"CName :\t\t"+ "CType :\t\t");
		List<Company> clist = cd.Get_ListOfCompanys_ById(70);
		for(Company cp : clist) {
			System.out.println(cp.getCid()+"\t\t"+cp.getCname()+"\t\t"+cp.getCtype());
		}
		
//SELECT CID , CNAME , CTYPE FROM COMPANY :		
		System.out.println("CId :\t\t"+"CName :\t\t"+ "CType :\t\t");
		List<Company> clist = cd.Get_ListOfCompanys_FromTable();
		for(Company cp : clist) {
		System.out.println(cp.getCid()+"\t\t"+cp.getCname()+"\t\t"+cp.getCtype());
		}
		
//SELECT CID , CNAME , CTYPE FROM COMPANY WHERE CNAME = ?		
		System.out.println("CId :\t\t"+"CName :\t\t"+ "CType :\t\t");
		List<Company> clist =cd.Get_ListOfCompanys_ByName("CTS");
		for(Company cp : clist) {
			System.out.println(cp.getCid()+"\t\t"+cp.getCname()+"\t\t"+cp.getCtype());
		}
		
//SELECT CNAME FROM COMPANY WHERE CID = ?: 		
		System.out.println("CompanyName :"+cd.getCnameBy_Cid(60).getCname());
		
//SELECT CNAME , CTYPE FROMCOMPANY WHERE CID = ? :		
		System.out.println("CNAME :"+cd.getCname_CtypeBy_Cid(70).getCname()+"\t CTYPE :"+cd.getCname_CtypeBy_Cid(70).getCtype());*/
		cd.DeleteByNameAndType("WebBased","Google");		
}
}
