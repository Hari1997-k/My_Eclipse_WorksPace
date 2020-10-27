package Defining_Interface_Using_Lambda_Expression;

interface A{
	public void showA();
}
interface B{
	public void showB();
}
interface C{
	public void ShowC();	
}

public class LambdDemno2 {
	public static void main(String[] args) {
		//IMPLEMENTING MULTIPLE INTERFACES USING LAMBDA EXPRESSION :
		
		A a = ()->System.out.println("Hey Welcome To Interafce A");
		a.showA();
		
		B b = ()->System.out.println("Hey Welcome To Interface B ");
		b.showB();
		
		C c= ()->System.out.println("Hey Welcome To Interafce C ");
		c.ShowC();
	}

}
