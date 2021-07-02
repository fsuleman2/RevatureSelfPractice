package eg1;

public class RegExStyleDemo {

	public static void main(String[] args) {
		/*
		 * Reg-Ex - Regular Expression - Pattern Matching Algorithm [] = represents
		 * expression {} = represents length ^ - not [a-z]{3} - any 3 lower case
		 * characters are accepted [A-Z0-9]{5} - any combination of 5 uppercase with
		 * digits are accepted [A-Z]{5}[0-9]{4} - five uppercase letters followed by 4
		 * digits [a-zA-Z]{2,8} - any word of min length of 2 and max length of 8
		 * [0-9]{1,} - minimum length is 1 and max can be any [^0-9] - apart from digits
		 * + ? *
		 */
		String s = "ASWED9679O";
		if (s != null && s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid Pan");
		} else {
			System.out.println("Invalid Pan");
		}

		String s1 = "A S d    !@ _ dsk1239AX1iK>_f";
		System.out.println(s1.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s1.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s1.replaceAll("[ a-zA-Z0-9]", ""));

		String mobileNum = "91-1234567899";
		if (mobileNum.matches("\\+91-[0-9]{10}")) {
			System.out.println("Valid number");
		} else {
			System.out.println("Invalid Number");
		}

	}

} //Task - Write Regex for all the government Ids you have (license, bikenumber, aadhar number)
