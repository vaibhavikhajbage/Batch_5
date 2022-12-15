package reversal;

public class ReversalString {

	public static void main(String[] args) {
		String str = "Ashutosh";
		String rev = "";
		int l = str.length();
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
