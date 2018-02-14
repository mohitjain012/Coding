package Coding.Java.ColectionsPractice.Comparable;

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
