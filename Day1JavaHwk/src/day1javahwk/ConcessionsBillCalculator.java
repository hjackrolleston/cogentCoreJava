package day1javahwk;
import java.util.Scanner;
import java.lang.Exception;

public class ConcessionsBillCalculator {

	public static void main(String[] args) {
		double pizzas = -1;
		double puffs = -1;
		double drinks = -1;
		boolean sentinel1 = false;
		boolean sentinel2 = false;
		boolean sentinel3 = false;

		Scanner sc = new Scanner(System.in);

		while (!sentinel1) {
			System.out.println("How many pizzas will you order? (Must be non-negative number.)");
			String a = sc.next();
			try {
				pizzas = Double.parseDouble(a);
				if (pizzas >= 0) {
					sentinel1 = true;
				}
			} catch (Exception e) {
				System.out.println("Number values only.");
			}
		}
		while (!sentinel2) {
			System.out.println("How many puffs will you order? (Must be non-negative number.)");
			String a = sc.next();
			try {
				puffs = Double.parseDouble(a);
				if (puffs >= 0) {
					sentinel2 = true;
				}
			} catch (Exception e) {
				System.out.println("Number values only.");
			}
		}
		while (!sentinel3) {
			System.out.println("How many drinks will you order? (Must be non-negative number.)");
			String a = sc.next();
			try {
				drinks = Double.parseDouble(a);
				if (drinks >= 0) {
					sentinel3 = true;
				}
			} catch (Exception e) {
				System.out.println("Number values only.");
			}
		}
		double totalCost = (pizzas * 100) + (puffs * 20) + (drinks * 10);
		System.out.println("Bill details: ");
		System.out.println("Pizzas ordered: " + pizzas);
		System.out.println("Puffs ordered: " + puffs);
		System.out.println("Drinks ordered: " + drinks);
		System.out.print("Total cost: $");
		System.out.printf("%.2f", totalCost);
	}

}
