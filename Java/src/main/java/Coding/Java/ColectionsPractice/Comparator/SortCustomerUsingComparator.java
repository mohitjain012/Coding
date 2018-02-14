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
		
		CustomerAgeComparator ageCompare = new CustomerAgeComparator();
		CustomerNameComparator nameCompare = new CustomerNameComparator();
		CustomerIdComparator idCompare = new CustomerIdComparator();

		Collections.sort(customers,ageCompare);
		System.out.println("----Records after sorting on age----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		Collections.sort(customers,nameCompare);
		System.out.println("----Records after sorting on name----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		Collections.sort(customers,idCompare);
		System.out.println("----Records after sorting on id----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);


		customers.sort(ageCompare);
		System.out.println("----Records after sorting on age----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		customers.sort(nameCompare);
		System.out.println("----Records after sorting on name----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

		customers.sort(idCompare);
		System.out.println("----Records after sorting on id----");
		for(Customer c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);

	}

}
