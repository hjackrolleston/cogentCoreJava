package day1javahwk;
import java.util.Scanner;

public class CollegePlacement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no of students placed in CSE: ");
		int cse = sc.nextInt();
		System.out.print("\n Enter no of students placed in ECE: ");
		int ece = sc.nextInt();
		System.out.print("\n Enter no of students placed in MECH: ");
		int mech = sc.nextInt();

		boolean highestCSE = false;
		boolean highestECE = false;
		boolean highestMECH = false;

		if (cse >= ece && cse >= mech) {
			highestCSE = true;
		}
		if (ece >= cse && ece >= mech) {
			highestECE = true;
		}
		if (mech >= cse && mech >= ece) {
			highestMECH = true;
		}

		if (highestCSE && highestECE && highestMECH) {
			highestCSE = false;
			highestECE = false;
			highestMECH = false;
		}

		if (cse < 0 || ece < 0 || mech < 0) {
			System.out.println("Invalid input; no negative values.");
		} else {
			if (highestCSE || highestECE || highestMECH) {
				System.out.println("Highest placement: ");
				if (highestCSE) {
					System.out.println("CSE");
				}
				if (highestECE) {
					System.out.println("ECE");
				}
				if (highestMECH) {
					System.out.println("MECH");
				}
			} else {
				System.out.println("No department has received highest placement.");
			}
		}
	}

}
