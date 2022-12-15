package com.basic;

public class IgnoreA {
	public static void main(String args[]) {
    String s = "Java is a simplest programning langauge";
    
    s = s.toLowerCase();
    for (char ch = 'a'; ch <='a'; ch++) {
    	int c = 0;
    	for (int i = 0; i < s.length(); i++){
    		if(ch== s.charAt(i))
    			c++;
    		
    	}
    	System.out.println(ch +"\t "+ c);
    }
	 {
		System.out.println(s.replace("a"," "));
	 }
	}
}