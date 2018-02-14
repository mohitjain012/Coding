package Coding.Java.ColectionsPractice;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = new ArrayList<String>();
		data.add("mohit jain");
		data.add("ankur jagga");
		data.add("shweta chauhan");
		data.add("garima jain");
		System.out.println("----Records before sorting----");
		for(String s:data) {
			System.out.println(s);
		}
		System.out.println("----Records after sorting----");
		Collections.sort(data);
		for(String s:data) {
			System.out.println(s);
		}
		
	}

}
