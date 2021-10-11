package test;
import org.PrintEven;
import org.Thread1;
import org.Thread2;
public class Test {

	public static void main(String[] args) {
		PrintEven obj=new PrintEven();
		Thread t1=new Thread1(obj);
		Thread t2=new Thread2(obj);t1.start();t2.start();
	}
}
