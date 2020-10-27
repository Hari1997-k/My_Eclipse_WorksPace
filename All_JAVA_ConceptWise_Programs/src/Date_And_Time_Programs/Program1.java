package Date_And_Time_Programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program1 {
	public static void main(String[] args) throws ParseException {
		System.out.println(" FORMATTINGS  DATE:");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-yy-MM");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-yyyy-MM");
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE-yyyy-MMMM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("EE-YYYY-MM");

		Date date = new Date();
		System.out.println(date);
		System.out.println("DAte IN dd-yy-mm Formate :" + sdf.format(date));
		System.out.println("DAte IN dd-yyyy-MM Formate :" + sdf1.format(date));
		System.out.println("DAte IN EEEE-yyyy-MMMM Formate :" + sdf2.format(date));
		System.out.println("DAte IN EE-YYYY-MM Formate :" + sdf3.format(date));
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd-yy-mm");
		System.out.println("================================================================");
		System.out.println(" FORMATTINGS  TIME:");
		SimpleDateFormat sdf5 = new SimpleDateFormat("hh:mm:ss:a");
		SimpleDateFormat sdf6 = new SimpleDateFormat("z");

		SimpleDateFormat sdf7 = new SimpleDateFormat("HH:mm:ss:ZZZZ");
		SimpleDateFormat sdf8 = new SimpleDateFormat("a");
		SimpleDateFormat sdf9 = new SimpleDateFormat("Z");
		SimpleDateFormat sdf10 = new SimpleDateFormat("zzzz");

		System.out.println("Time in hh:mm:ss:a formate  : " + sdf5.format(date));
		System.out.println("Time in hh formate  : " + sdf6.format(date));
		System.out.println("Time in HH:mm:ss:ZZZZ formate  : " + sdf7.format(date));
		System.out.println("Time in a formate  : " + sdf8.format(date));
		System.out.println("Time in Z formate  : " + sdf9.format(date));
		System.out.println("Time in zzzz formate  : " + sdf10.format(date));
		System.out.println("================================================================");
System.out.println("IORMATTING THE GIVEN STRING INTO THE SDF FORMATE :");
		String dates = "11-22-22";
		System.out.println(sdf2.format(sdf.parse(dates)));
	}
}
