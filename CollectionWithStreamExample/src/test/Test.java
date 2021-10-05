package test;
import java.util.*;
import java.util.stream.Collectors;

import org.Product;
public class Test {

	public static void main(String[] args) {
		List<Product> prodList=new ArrayList<Product>();
		prodList.add(new Product(1001,"TV",95000,1,"Apple",0));
		prodList.add(new Product(1002,"Tripod",7000,2,
				"Digitech",100));
		prodList.add(new Product(1003,"CCTV Camera",4500,5,
				"Mi",150));
		prodList.add(new Product(1004,"Mobile",
				50000,1,"Samsung",0));
		prodList.add(new Product(1005,"Monitor",
				160000,4,"Dell",100));
		prodList.add(new Product(1006,"Mouse",
				1200,15,"Logitech",50));
		
		List<String> freeDeliveryProducts=prodList.stream()
			.filter(p->p.deliveryCharges==0.0f)
			.map(p->p.name)
			.collect(Collectors.toList());
		System.out.print(freeDeliveryProducts);
	}

}
