package test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer,Integer> function1 = (a)->(a+25);
		System.out.println(function1.apply(100));

	}

}
