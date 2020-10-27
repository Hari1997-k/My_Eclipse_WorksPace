package Defining_Interface_Using_Anonymous_InnerClass;
interface Honda {
	public void Show();
}

public class Using_Annonymous_Class {
	public static void main(String[] args) {
		Honda hnd = new Honda() {

			@Override
			public void Show() {
System.out.println("Hey Welcome To HONDA SHOWROOM");				
			}
			
		};
		
		
		hnd.Show();
	}


}
//HERE , IN THIS EXAMPLE WE HAVENT CREATED A CLASS FOR DEFINING THE INTERFACE HONDA, INSTEAD WE USED ANNONYMOUS INNERCLASS.
//EVEN , here also the lines of code is gng long and also, 
//WE ARE CREATING AN ANNONYMOUS CLASS FOR IMPLEMENTING AN INTERFACE ALONE
//NOW , To overcome this we can use the lamda expression