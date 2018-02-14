package Coding.Java.ColectionsPractice.Comparator;

import java.util.Comparator;

import Coding.Java.ColectionsPractice.Customer;

public class CustomerAgeComparator implements Comparator<Customer>{

	public int compare(Customer c1, Customer c2) {
		if(c1.age<c2.age)
			return -1;
		else if(c1.age==c2.age)
			return 0;
		else
			return 1;}

}
