package DAO;

import java.util.List;

import Models.Food;

public interface Food_Dao {
	public void AddFood(Food food) ;
	public void DeleteFood();
	public void UpdateFood();
	public void EditFood();
	public List<Food> View_FoodItems();
	
	
	}


