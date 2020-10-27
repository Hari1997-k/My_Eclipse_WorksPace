import java.util.ArrayList;

public class RatingBO {
	
	public void displayAllRatingDetails(ArrayList<Rating> ratingList) {
		for(Rating rr : ratingList)
			
		{
			System.out.println("Rating "+rr.getId() +" Details :");
			System.out.println("Rating id :"+rr.getId());
			System.out.println("Rating name:"+rr.getName());
			System.out.println("Rating Description :"+ rr.getDesc());
			System.out.println("Rating Value :"+rr.getValue());

		}
	}

}
