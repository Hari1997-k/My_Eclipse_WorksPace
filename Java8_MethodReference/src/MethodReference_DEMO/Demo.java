package MethodReference_DEMO;
@FunctionalInterface
interface A{
	public void show();
	}
class AA implements A {

	@Override
	public void show() {
System.out.println("Welcome To Show Method :");		
	}
}
public class Demo {
	
	public static void main(String[] args) {
		AA aa = new AA();
		A a = aa::show;
		a.show();	
	}
}