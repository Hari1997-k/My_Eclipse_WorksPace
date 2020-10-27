package Utility;

import java.util.List;
import java.util.Scanner;

import Dao_Impl.Product_Dao_Impl;
import Model.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO ** ECOMMERCE . COM **");
		System.out.println("====================================");
		String opt = "";

		do {
			System.out.println("Select Your Choice Among The Following ");
			System.out.println("==========================================");

			System.out.println(
					"1) Create A Product \n2) View All Products \n3) Update Product By Name \n4) Delete Product BY Name  ");
			System.out.println(">>Enter Your Choice :");
			char ch = sc.next().charAt(0);
			Product_Dao_Impl impl = new Product_Dao_Impl();

			switch (ch) {
			case '1':

				System.out.println("Enter The Product Name : ");
				String pname = sc.next();
				System.out.println("Enter The "+pname+" category : ");
				String pcategory = sc.nextLine();
								   sc.next();
				System.out.println("Enter The "+pname+" Price");
				int price = sc.nextInt();
				Product pro = new Product(pname , price , pcategory);
				int RecordsChange = impl.createProduct(pro);
				if(RecordsChange > 0) {
					System.out.println("1 Record Inserted Successfully ");
				}
				else {
					System.out.println("No Record Inserted");
				}
				
				
				break;
			case '2':
				System.out.println("Total No Of Products Available \n==========================================");
				List<Product> plist = impl.viewAllProducts();
				for(Product pp : plist ) {
					System.out.println(pp.getPid() + "\t\t" + pp.getPname() + "\t\t" + pp.getPrice() + "\t\t" + pp.getCategory());
				}
				break;
			case '3':
//			impl.updateProductByName(null);
				System.out.println("3");
				break;
			case '4':
//			impl.deleteProductByName(null);
				System.out.println("4");
				break;

			}
			System.out.println("Do U Want To COntinue Say (Yes/No)");
			opt = sc.next();
		} while (opt.equalsIgnoreCase("Yes"));

		System.out.println("Thanks For Using Ecommerce App ");
	}

}

