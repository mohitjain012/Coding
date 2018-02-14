package Coding.Java.ColectionsPractice.Comparator;

import java.util.Comparator;

import Coding.Java.ColectionsPractice.Customer;

public class CustomerIdComparator implements Comparator<Customer>{

	public int compare(Customer c1, Customer c2) {
		if(c1.customerId<c2.customerId)
			return -1;
		else if(c1.customerId==c2.customerId)
			return 0;
		else
			return 1;}

}
