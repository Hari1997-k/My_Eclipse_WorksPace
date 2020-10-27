package Defining_Interface_Using_Anonymous_InnerClass;
//its an interafce.
 interface Suziki{
	public void show();
}
 //This is the class which is implementing the interafce Suziki ...
 //But , here we are craeting a class alone for defing the abstract methods of an interface Suziki
 //Which will lead to incraese in the lines of code , 
 //SO NOW WE ARE GNG TO USE ANNONYMOUS INNERCALSS INSTAED OF CREATING AN NEW CLASS
 class Hayabusa implements Suziki{

	@Override
	public void show() {
System.out.println("Hey Welcome to HAYABUSA showroom ");		
	}
	 
 }

public class NormalMthod {
	public static void main(String[] args) {
		Hayabusa hbs = new Hayabusa();
		hbs.show();
		
	}
}
