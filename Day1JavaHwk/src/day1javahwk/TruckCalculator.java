package day1javahwk;
import java.util.Scanner;
import java.lang.Exception;

public class TruckCalculator {

	public static void main(String[] args) {
		double liters = 1;
		double kilometers = 1;

		boolean sentinel1 = false;
		boolean sentinel2 = false;

		Scanner sc = new Scanner(System.in);

		while (!sentinel1) {
			System.out.println("Enter tank capacity in liters (must be greater than zero): ");
			String a = sc.next();
			try {
				liters = Double.parseDouble(a);
				if (liters > 0) {
					sentinel1 = true;
				}
			} catch (Exception e) {
				System.out.println("Number values only.");
			}
		}
		while (!sentinel2) {
			System.out.println("Enter distance-to-empty in kilometers (must be greater than zero): ");
			String a = sc.next();
			try {
				kilometers = Double.parseDouble(a);
				if (kilometers > 0) {
					sentinel2 = true;
				}
			} catch (Exception e) {
				System.out.println("Number values only.");
			}
		}

		double euroLpKm = (liters * 100) / kilometers;
		double gallons = (liters * 0.2642);
		double miles = (kilometers * 0.6214);
		double usMpG = miles / gallons;

		System.out.print("\n=============\n\nLiters per hundred kilometers notation: ");
		System.out.printf("%.2f", euroLpKm);
		System.out.print("\n Miles per gallon notation: ");
		System.out.printf("%.2f", usMpG);
	}

}
