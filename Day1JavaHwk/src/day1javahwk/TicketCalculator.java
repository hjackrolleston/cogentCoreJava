package day1javahwk;
import java.util.Scanner;

public class TicketCalculator {

	public static void main(String[] args) {
		double tickets;
		char refreshment, couponCode, circle;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of tickets to purchase: ");
		tickets = sc.nextDouble();
		System.out.print("\nDo you want refreshments? (y/n)");
		refreshment = sc.next().charAt(0);
		System.out.print("\nDo you have a coupon code? (y/n)");
		couponCode = sc.next().charAt(0);
		System.out.print("\nTicket type? (k/q; k class=$75, q class=$150)");
		circle = sc.next().charAt(0);

		if ((refreshment == 'y' || refreshment == 'n') && (couponCode == 'y' || couponCode == 'n')
				&& (circle == 'k' || circle == 'q')) {
			if (tickets < 5 || tickets > 40) {
				System.out.println("Minimum 5 and maximum 40 tickets.");
			} else {
				double price = tickets * 75;
				if (circle == 'q') {
					price *= 2;
				}
				if (tickets > 20) {
					price = price * 9 / 10;
				}
				if (couponCode == 'y') {
					price = price * 49 / 50;
				}
				if (refreshment == 'y') {
					price += (tickets * 50);
				}

				System.out.print("\nTicket cost: $");
				System.out.printf("%.2f", price);
			}
		} else {
			System.out.println("Invalid input (only 'y/n' for refreshments and coupons, 'k/q' for ticket types).");
		}

	}

}
