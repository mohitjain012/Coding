package Coding.Java.ColectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCustomerUsingComparable {

	public static void main(String[] args) {
		List<CustomerComparable> customers = new ArrayList<CustomerComparable>();
		CustomerComparable c1 = new CustomerComparable(26,"Shweta",1);
		CustomerComparable c2 = new CustomerComparable(28,"Ankur",2);
		CustomerComparable c3 = new CustomerComparable(32,"Garima",4);
		CustomerComparable c4 = new CustomerComparable(26,"Mohit",3);
		customers.add(c1);customers.add(c2);customers.add(c3);customers.add(c4);
		System.out.println("----Records before sorting----");
		for(CustomerComparable c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);
		
		Collections.sort(customers);
		
		System.out.println("----Records after sorting on age----");
		for(CustomerComparable c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);
	}
	
}