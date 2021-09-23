import java.util.Scanner;
public class LuckyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 4-digit license plate number to see if it's " +
				"divisible by the lucky numbers 3, 5, or 7: ");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt(); String asString = Integer.toString(value);
		
		if (asString.length()!=4) {System.out.println("Not a valid car number.");}
		else if (value<0) {System.out.println("Not a valid car number.");}
		else {
			char c1 = asString.charAt(0);char c2 = asString.charAt(1);
			char c3 = asString.charAt(2);char c4 = asString.charAt(3);
			int d1=Character.getNumericValue(c1);
			int d2=Character.getNumericValue(c2);
			int d3=Character.getNumericValue(c3);
			int d4=Character.getNumericValue(c4);
			int sum=d1+d2+d3+d4;
			
			if (sum%3==0||sum%5==0||sum%7==0) {System.out.println("Lucky number.");}
			else {System.out.println("Sorry, not a lucky number.");}
		}
	}

}
