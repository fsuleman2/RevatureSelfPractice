package eg1;

public class PanCardOldStyleDemo {

	public static void main(String[] args) {
		
		String s="ASWED9679Y";
		System.out.println(isValidPan(s));
		System.out.println(isValidPan("dfsdfdsfdf"));
		System.out.println(isValidPan("aSDEF1111A"));
		System.out.println(isValidPan("ASDEF1111A"));

	}
	
	public static boolean isValidPan(String s) {
		boolean b=false;
		if(s!=null && s.length()==10  && Character.isUpperCase(s.charAt(9))) {
			
			int upper=0;
			for (int i = 0; i < 5; i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					upper++;
				}
			}
			if(upper==5) {
				int digit=0;
				for (int i = 5; i < 9; i++) {
					if(Character.isDigit(s.charAt(i))) {
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
