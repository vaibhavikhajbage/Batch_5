package com.java8featuresdemo.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class EvenOdd {
	
	public static void main(String[] args) {
		List <Integer>numbers=Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		List <Integer>numbers2=Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		//with java 8
		List<Integer> oddNumbers =numbers.stream().filter(w-> w%2 !=0).collect(Collectors.toList());
		List<Integer> evenNumbers =numbers2.stream().filter(w-> w%2 ==0).collect(Collectors.toList());
		
		System.out.println("Oddnumbers are = "+oddNumbers);
		System.out.println("Evennumbers are = "+evenNumbers);
		
		
	}

}
