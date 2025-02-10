package com.list.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ProgramCollection {

	public static void main(String[] args) {
		
Collection<Object> c1 = new ArrayList<>(); // upcasting
c1.add(123);
c1.add("Ram");
c1.add('A');
c1.add(2326.45);

Collection<Object> c2 = new ArrayList<>();
c2.add("Sita");
c2.add("Nisha");
c2.addAll(c1);
System.out.println("Before remove "+c2);
Iterator<Object> i= c2.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
//boolean b6=c2.equals(c1);
//System.out.println("use of equals ..."+b6);
//c2.clear();
//System.out.println("after clear" +c2);
//c2.removeAll(c1);
//System.out.println("After remove "+c2);
//c2.remove("Nisha");
//System.out.println("After remove "+c2);
//boolean b = c2.isEmpty(); 
//System.out.println("After remove "+b);
//boolean b1=c2.contains("Sita");
//System.out.println("After remove "+b1);
//System.out.println("Collection of objects are :" +c2);
//boolean b3=c2.containsAll(c1);
//System.out.println(".."+b3);

}

}
