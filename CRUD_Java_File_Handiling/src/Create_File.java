import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Create_File {
	public static void main(String[] args) throws IOException {
	     	// CREARING A FILE :
		File file = new File("CreateFile.txt");
	boolean bol = 	file.createNewFile();
	if(bol)
	{		
	System.out.println("File IS CREATED ");	
	}
	else{
		System.out.println("Sorry!! Filename Already Exist");
	}
	
	
	// WRITING INTO A FILE :
	FileWriter Writer = new FileWriter(file);
	Writer.write("Hey !!! Wassupp Im Writing Inside File Using The WRite() Method Of FileWriter Class ");
	Writer.close();
	
	//READING THE DATA FROM THE FILE :
	System.out.println("The Data Inside The FIle "+ file+" Is :");
	Scanner sc = new Scanner(file);
	while(sc.hasNext()) {
String data = sc.nextLine();
System.out.println(data);

}
	
	
	if(file.delete()){
		System.out.println( file +"  Is Deleted ");
	}
	else {
		System.out.println(file+" Doesn't Exist");
	}
	
}
}