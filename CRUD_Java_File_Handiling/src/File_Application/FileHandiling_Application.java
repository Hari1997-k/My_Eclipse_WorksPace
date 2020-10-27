package File_Application;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandiling_Application {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\tWelcome To The File Handiling Application\t\t\t");
		System.out.println("\t\t\t==========================================\t\t\t");
		System.out.println("Enter the FileName To Do CRUD OPERATIONS  (.txt/.html...etc)");
		String  fname =sc.next();
		String op = " ";
		do {
		System.out.println("1) Create A File \n2) Insert Data Into File \n3) Read Data From The File \n4) Delete The File ");
		char ch = sc.next().charAt(0);
		
		File file = null ;
		ServiceImpl impl = new ServiceImpl();
		
		switch(ch) {
		case '1' :
			
			impl.CreateFile(fname);
			break ;
		case '2' :
			System.out.println("ENter The Data That U Want TO Store ");
			File file1 = new File(fname);

			String data = sc.nextLine();
			data = sc.nextLine();
			System.out.println();
			impl.Write(file1, data);
			
//			Scanner sf = new Scanner(file1);
//			if(sf.hasNext()) {
//				System.out.println("Data Inserted Successfully ");
//			}
//			else {
//				System.out.println("Data Inserted Failed ");
//			}
			break ;
		case '3' :
			System.out.println("Read It");
			break ;
		case '4' :
			System.out.println("Read It");
			break ;
		}
		System.out.println("Do U Want TO Continue say(Yes/No");
		op = sc.next();
		}
		while(op.equalsIgnoreCase("Yes"));
		System.out.println("Thankyou :-)");
	}

}
