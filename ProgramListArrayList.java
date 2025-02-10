package com.list.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;






public class ProgramListArrayList {

	public static void main(String[] args) {
		
		List<Object> l1 = new ArrayList<Object>();
		l1.add(124);
		l1.add('a');
		l1.add("Ashu");
		l1.addFirst("JK");
		l1.add(0, "Kr");
		l1.addFirst("Sita");
		l1.addLast("Ram");
		l1.add("TAK");

		
		List<Object> l2 = new ArrayList<Object>();
		l2.add(34789);
	//	l2.add('a');
		l2.addAll(l1);
		System.out.println("Before remove all " +l2);
		ListIterator<Object> ll= l2.listIterator();
		while(ll.hasNext()) {
			System.out.println(ll.next());
		}
			
	}	
	

}


