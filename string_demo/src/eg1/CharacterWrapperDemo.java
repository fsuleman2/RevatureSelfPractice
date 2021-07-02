package eg1;

public class CharacterWrapperDemo {

	public static void main(String[] args) {
		
		String s="A S d    !@ _ dsk1239AX1iK>_f";
		
		int alpha=0,upper=0,lower=0,digits=0,alphanum=0,space=0,special=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			
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
				space++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		
		System.out.println("Total alpha count : "+alpha);
		System.out.println("Total lowercase count : "+lower);
		System.out.println("Total uppercase count : "+upper);
		System.out.println("Total digits count : "+digits);
		System.out.println("Total space count : "+space);
		System.out.println("Total alphanumeric count : "+alphanum);
		System.out.println("Total special char count : "+special);

	}

}
