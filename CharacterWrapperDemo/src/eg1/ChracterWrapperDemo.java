package eg1;

public class ChracterWrapperDemo {
public static void main(String[] args) {
	String s = "A S d    !@ _ dsK1239AX1iK>_f";
	int alpha = 0,upper = 0,lower = 0,digits = 0,alphanum = 0,spaces = 0,special = 0;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if(Character.isAlphabetic(c)) {
			alpha++;
		}
		if(Character.isUpperCase(c)) {
			upper++;
		}
		if(Character.isLowerCase(c)) {
			lower++;
		}
		if(Character.isDigit(c)) {
			digits++;
		}
		if(Character.isLetterOrDigit(c)) {
			alphanum++;
		}
		if(Character.isWhitespace(c)) {
			spaces++;
		}
		if(!Character.isLetterOrDigit(c)) {
			special++;
		}
	}
}
}
