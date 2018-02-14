package Coding.Java.ColectionsPractice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();
		list.add(3);list.add(-1);list.add(2);list.add(6);

		System.out.println("List before sorting");
		System.out.println(list);

		System.out.println("List after sorting");
		Collections.sort(list);
		System.out.println(list);

		System.out.print("Index of 1 in list - ");
		System.out.println(Collections.binarySearch(list, 2));//list need to be sorted

		Collections.addAll(list, 1,0);
		System.out.println("List after addall");
		System.out.println(list);

		List<Integer> list2 = new LinkedList<Integer>(list);	//creating list 2 same as previous list
		System.out.println("Created new list 2 - "+list2);
		
		Collections.fill(list2, 1);
		System.out.print("List after fill 1 - ");
		System.out.println(list2);
		
		list.add(1);
		list.add(1);
		System.out.println("list - "+list);
		System.out.println("frequency of 1 in list - "+Collections.frequency(list, 1));
		System.out.println("max in list - "+Collections.max(list));
		System.out.println("min in list - "+Collections.min(list));
		
		Collections.replaceAll(list, 1, 4);
		System.out.println("list after replacing 1 with 4 - "+list);
		
		Collections.shuffle(list);
		System.out.println("list after shuffle - "+list);
		System.out.println("list after another shuffle - "+list);
	}

}

