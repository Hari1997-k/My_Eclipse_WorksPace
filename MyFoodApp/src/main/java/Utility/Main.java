package Utility;

import Dao_Impl.Food_Dao_Impl;
import Dao_Impl.UserFoodDao_Impl;
import Models.UserFood;

public class Main {
	public static void main(String[] args) {
		Food_Dao_Impl fimpl = new Food_Dao_Impl();
//		Food food = new Food();
//		food.setFid(600);
//		food.setFname("ArabainFood _Comobo1");
//		food.setPrice(1299.99);
//		food.setDescription("Eat Healthy To Live ");
//		
//		fimpl.AddFood(food);
//		
//		List<Food> flist = fimpl.View_FoodItems();
//		System.out.println("the Food Item Present In Restaurant And Its Price  : ");
//		for(Food ff : flist) {
//		System.out.print(ff.getFname()+"\t\t"+ff.getPrice());
//		System.out.println();
//
//		}
//		
//		**************************************************************************************
		/*
		 * User_Dao_Impl uimpl = new User_Dao_Impl();
		 * 
		 * User u = new User("ASDF", null, "ADDD@gmail.com", "Hari_aAbcd",
		 * "Ramaiaah_Port  Hyderabad-6300611"); uimpl.CreateUser(u);
		 */
		//uimpl.CreateUser(u);
		
		//uimpl.Save_User_Food("AllooB_Bhujia_Takkori", 300);
		
		//uimpl.Edit_User_Food("Roti With Chicken Moglai", 300);

//		uimpl.Delete_User_Food(null , 300);
		
//		List<User> ulst = uimpl.View_User_Food(200);
//		for(User uu : ulst ) {
//			System.out.print(uu.getFoodItem());
//		}
//		
	
//LOGIN MODULE : 
		
//		List<User> ulist = uimpl.LoginUser("KRao", "Hari_abcd");
//		String name = "";
//		for(User uu : ulist) {
//			name = uu.getUname();
//			
//		}
//		System.out.println(ulist.size());
//		if(ulist.size() ==1) {
//			System.out.println(" Welcome "+name+" Login SUccessfull ");
//		}
//		else  {
//			System.out.println("Sorry U Dont Have An Account!!!! Do Register Now ");
//		}
//				
		
		UserFoodDao_Impl impl = new UserFoodDao_Impl();
		UserFood ufd = new UserFood( 2, "pppkjnkub;iukb'oin'opppp");
		impl.save(ufd);

		
	}

}
