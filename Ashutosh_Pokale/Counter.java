package counter;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				count++;

			sc.close();
		}
		System.out.println("The number of occurrences of 'a' is " + count);
	}
}
