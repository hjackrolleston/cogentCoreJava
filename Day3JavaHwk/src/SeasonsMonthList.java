import java.util.Scanner;
public class SeasonsMonthList {

	public static void main(String[] args) {
		System.out.println("Enter the current month number to get the season: ");
		Scanner sc = new Scanner(System.in);
		System.out.println(getSeason(sc.nextInt()));
	}
	
	public static String getSeason(int monthNumber) {
		if ((0 < monthNumber&&monthNumber < 3)||monthNumber==12) {return "Season: Winter";}
		else if (2<monthNumber&&monthNumber<6) {return "Season: Spring";}
		else if (5<monthNumber&&monthNumber<9) {return "Season: Summer";}
		else if (8<monthNumber&&monthNumber<12) {return "Season: Autumn";}
		else {return "Invalid input (must be integer from 1 to 12).";}
	}

}
