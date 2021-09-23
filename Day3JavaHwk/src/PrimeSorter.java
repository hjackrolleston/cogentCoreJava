import java.util.Scanner;
import java.util.ArrayList;
public class PrimeSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//System.out.println(isPrime(sc.nextInt()));
		
		System.out.println("Enter a lower and upper range number to find "
				+ "the primes between them.");
		int lw = sc.nextInt();int up=sc.nextInt();
		
		if (primesList(lw,up)!=null) {
			for (int j : primesList(lw,up)) {System.out.print(j+" ");}
		}
		else {System.out.println("Enter valid input.");}
	}
	
	public static ArrayList<Integer> primesList(int x,int y) {
		ArrayList<Integer> collection=new ArrayList<Integer>();
		if (y<x) {return null;}
		if (x<0||y<0) {return null;}
		if (x==y) {return null;}
		
		while (y>=x) {
			if (isPrime(y)) {collection.add(0,y);}
			y--;
		}return collection;
	}
	
	public static boolean isPrime(int a) {
		if (a==1||a==0) {return false;}
		for (int s=a-1;s>1;s--) {
			if (a%s==0) {return false;}
		}return true;
	}

}
