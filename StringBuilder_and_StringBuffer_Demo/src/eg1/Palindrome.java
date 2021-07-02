package eg1;

public class Palindrome {
	public static void main(String[] args) {

		String s = "madam";
		System.out.println(isPalindrome(s));
		int x=1211111;
		System.out.println(isPalindrome(x+""));
	}

	public static boolean isPalindrome(String s) {
//		StringBuffer sb = new StringBuffer(s);
//		sb.reverse();
//		String temp = sb.toString();
//		return s.equals(temp);
		
		return new StringBuffer(s).reverse().toString().equals(s);
	}
}
