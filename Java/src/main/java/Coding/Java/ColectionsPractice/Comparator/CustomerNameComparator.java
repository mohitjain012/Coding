package Coding.Java.ColectionsPractice.Comparator;

import java.util.Comparator;

import Coding.Java.ColectionsPractice.Customer;

public class CustomerNameComparator implements Comparator<Customer>{

	public int compare(Customer c1, Customer c2) {
		return c1.name.compareTo(c2.name);
	}
}