import java.util.Scanner;
public class IncrementCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base salary: ");
		double baseSalary = sc.nextDouble();
		System.out.println("Enter appraisal rating: ");
		double rating = sc.nextDouble();
		
		if (baseSalary<=0) {System.out.println("Invalid input.");}
		else if (rating<0||rating>6) {System.out.println("Invalid input.");}
		else {
			if (1<=rating&&rating<=3) {baseSalary += baseSalary*(.1);}
			if (3.1<=rating&&rating<=4) {baseSalary += baseSalary*(.25);}
			if (4.1<=rating&&rating<=5) {baseSalary += baseSalary*(.3);}
			
			System.out.println(baseSalary);
		}
	}

}
