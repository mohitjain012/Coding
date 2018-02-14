package Coding.Java.ColectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerComparable implements Comparable<CustomerComparable> {

	int age;
	String name;
	int customerId;

	CustomerComparable(int age, String name, int id){
		this.age=age;this.name=name;customerId=id;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int compareTo(CustomerComparable c) {
		if(this.age<c.age)
			return -1;
		else if(this.age==c.age)
			return 0;
		else
			return 1;
	}
}

class MainTestClass{
	public static void main(String s) {
		List<CustomerComparable> customers = new ArrayList<CustomerComparable>();
		CustomerComparable c1 = new CustomerComparable(26,"Shweta",1);
		CustomerComparable c2 = new CustomerComparable(28,"Ankur",2);
		CustomerComparable c3 = new CustomerComparable(32,"Garima",4);
		CustomerComparable c4 = new CustomerComparable(26,"Mohit",3);
		customers.add(c1);customers.add(c2);customers.add(c3);customers.add(c4);
		for(CustomerComparable c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);
		Collections.sort(customers);
		for(CustomerComparable c:customers)
			System.out.println("age="+c.age+" name="+c.name+" id="+c.customerId);
	}
}