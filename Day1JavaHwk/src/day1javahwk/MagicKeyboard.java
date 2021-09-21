package day1javahwk;
import java.util.Scanner;

public class MagicKeyboard {

	public static void main(String[] args) {

		char[] keylist = { 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ';', ',', '.', '/', '"',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's' };

		System.out.println("Enter four integers: ");
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();
		int numD = sc.nextInt();

		while (numA >= 58) {
			numA -= 58;
		}
		while (numA < 0) {
			numA += 58;
		}
		while (numB >= 58) {
			numB -= 58;
		}
		while (numB < 0) {
			numB += 58;
		}
		while (numC >= 58) {
			numC -= 58;
		}
		while (numC < 0) {
			numC += 58;
		}
		while (numD >= 58) {
			numD -= 58;
		}
		while (numD < 0) {
			numD += 58;
		}

		System.out.println("Char outputs: ");
		System.out.println(keylist[numA] + ", " + keylist[numB] + ", " + keylist[numC] + ", " + keylist[numD]);
	}

}
