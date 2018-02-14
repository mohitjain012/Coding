package Coding.Java.ColectionsPractice.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Coding.Java.ColectionsPractice.Customer;

public class SortCustomerUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<Customer>();
		Customer c1 = new Customer(26,"Shweta",1);
		Customer c2 = new Customer(28,"Ankur",2);
		Customer c3 = new Customer(32,"Garima",4);
		Customer c4 = new Customer(26,"Mohit",3);
		customers.add(c1);customers.add(c2);customers.add(c3);customers.add(c4);

		System.out.println("----Records before sorting----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		Collections.sort(customers,new CustomerAgeComparator());
		System.out.println("----Records after sorting on age----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		Collections.sort(customers,new CustomerNameComparator());
		System.out.println("----Records after sorting on name----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		Collections.sort(customers,new CustomerIdComparator());
		System.out.println("----Records after sorting on id----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);



		customers.sort(new CustomerAgeComparator());
		System.out.println("----Records after sorting on age----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		customers.sort(new CustomerNameComparator());
		System.out.println("----Records after sorting on name----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		customers.sort(new CustomerIdComparator());
		System.out.println("----Records after sorting on id----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

	}

}
