package DAO;

import java.util.List;

import Models.User;

public interface User_Dao {
	
	public void CreateUser(User u);
	public List<User> LoginUser(String userName, String Password);
	public void Save_User_Food(String selected_Food_Item, int id);
	public void Edit_User_Food(String Entered_New_FoodItem, int id );
	public void Delete_User_Food(String Old_Food_Item, int id);
	public List<User> View_User_Food(int id);

}
