import java.util.Scanner;

public class Reading_And_PrintingData_In_CSVFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user address in CSV Formate(Username,AddressLine 1,AddressLine 2,PinCode)");
		String str= sc.nextLine();
		System.out.println("Printing The ENterd Details In CSV Format (Username,AddressLine 1,AddressLine 2,PinCode)");
		String [] csv = str.split(",");
		
		Address add  = new Address();
		add.setUsername(csv[0]);
		add.setAddressLine1(csv[1]);
		add.setAddressLine2(csv[2]);
		add.setPinCode(Integer.valueOf(csv[3]));
		System.out.println(add.getUsername()+","+add.getPinCode()+","+add.getAddressLine2()+","+add.getAddressLine1());
		System.out.println(add.equals(add));
		
		
		
	}

}
