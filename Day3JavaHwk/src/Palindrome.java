import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPalindrome=true;
		Scanner sc = new Scanner(System.in);
		int inpt = sc.nextInt();
		
		if (inpt<0) {System.out.println("Invalid (cannot be negative).");}
		else {
			String str = Integer.toString(inpt);
			
			int a=0; int b=str.length()-1;
			while (b>a) {
				if (str.charAt(a)!=str.charAt(b)) {isPalindrome=false;}
				a++;b--;
			} if (isPalindrome) {System.out.println("Palindrome.");}
			else {System.out.println("Not a palindrome.");}
		}
	}
	

}
