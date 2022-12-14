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package com.basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int i = Sc.nextInt();
		int rem = i % 2;

		if (rem == 0) {
			System.out.println("The number is even ");
		} else
			System.out.println("The number is odd");

	}

}
