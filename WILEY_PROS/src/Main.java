import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws InputMismatchException {
				Scanner  sc = new Scanner(System.in);
				String  ch ;
				ArrayList<Rating> alist  = null ;
				ArrayList<Rating> al = new ArrayList<Rating>();
				Rating r = null;
				RatingBO RBO = new RatingBO();

				do {
				System.out.println("Enter Rating id :"); 
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Rating name :");
				char name = sc.next().charAt(0);
				sc.nextLine();
				System.out.println("Enter Rating Description :");
				String desc = sc.nextLine();
				System.out.println("Enter Rating Value :");
				String rating = sc.next();
				System.out.println("Do you want to enter the details of another rating? Enter yes or no");
				  ch = sc.next();
				 
				r = new Rating(id, name, desc, rating);
				alist= new ArrayList<Rating>();
				alist.add(r);
				al.addAll(alist);

				continue;
				}
				while(ch.equalsIgnoreCase("yes"));
				RBO.displayAllRatingDetails(al);
				sc.close();
	}
	}
