package com.basic;

public class CountCharactersInaString {

	public static void main(String[] args) {
		String s="Rajat Thakur";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				count++;
			
		}
			
     System.out.println("count of characters" +count);
	}

}
