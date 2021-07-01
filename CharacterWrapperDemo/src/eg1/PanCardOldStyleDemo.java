package eg1;

public class PanCardOldStyleDemo {
public static void main(String[] args) {
	String s = "ASWED9679Y";
System.out.println(isValidPan(s));
}
public static boolean isValidPan(String s) {
	boolean b = false;
	if(s!=null && s.length()==10 && Character.isUpperCase(s.charAt(9))) {
		int upper = 0;
		for(int i = 0; i < 5;i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				upper++;
			}
		}                                                      
			if(upper == 5) {
				int digit = 0;
				for (int j = 0; j < 9; j++) {
					if(Character.isDigit(s.charAt(j))) {
						digit++;
					}
				}
				if(digit==4) {
					b=true;
				}
			}
		}
	return b;
}
}
