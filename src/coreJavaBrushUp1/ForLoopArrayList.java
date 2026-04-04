package coreJavaBrushUp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoopArrayList {

	public static void main(String[] args) {
		
		// using For loop on ArrayList to print all val
		
		List<String> a = new ArrayList<String>();
		
		a.add("Kiran");
		a.add("Maha");
		a.add("guddu");
		a.add("vani");
		a.add("pandu");
		a.add("sonar");
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("*************************************");
		// Enhanced for loop
		for(String val : a) {
			System.out.println(val);
		}
		System.out.println("*************************************");
		
		// check item is present in the ArrayList
		System.out.println(a.contains("pandu"));
		
		System.out.println("*************************************");
//		convert array to array list
		String name[] = {"Hi", "Maha", "GoodMorning"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Hi"));
	}

}
