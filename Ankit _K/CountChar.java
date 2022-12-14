package com.newBasics;

public class CountChar {

	public static void main(String[] args) {
	
		String s = "JAVA IS A SIMPLEST PROGRAMMING LANGUAGE";
		
		int totalcount=s.length();
		
		int totalcount_afterRemove= s.replace("A", "").length();
		
		int count=totalcount-totalcount_afterRemove;
		
		System.out.println("Number of A: "+count);
		
		}

}
