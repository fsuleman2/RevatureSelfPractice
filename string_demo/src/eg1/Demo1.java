package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="hello";
		String s3="heyyyyy";
		String s4=new String("hello");
		System.out.println(s1+" (s1) is in memory address "+System.identityHashCode(s1));
		System.out.println(s2+" (s2) is in memory address "+System.identityHashCode(s2));
		System.out.println(s3+" (s3) is in memory address "+System.identityHashCode(s3));
		System.out.println(s4+" (s4) is in memory address "+System.identityHashCode(s4));
		
		s3="hello";
		
		System.out.println(s3+" (s3) is in memory address "+System.identityHashCode(s3));
		
		s4=s4.intern(); //brings s4 from heap general memory to string common pool
		System.out.println(s4+" (s4) is in memory address "+System.identityHashCode(s4));
		
		
		System.out.println("\ns1="+s1);
		System.out.println("s1.equals(\"raj\") : "+s1.equals("raj"));
		System.out.println("s1.equals(\"hello\") : "+s1.equals("hello"));
		System.out.println("s1.equals(\"Hello\") : "+s1.equals("Hello"));
		
		System.out.println("s1.equalsIgnoreCase(\"raj\") : "+s1.equalsIgnoreCase("raj"));
		System.out.println("s1.equalsIgnoreCase(\"hello\") : "+s1.equalsIgnoreCase("hello"));
		System.out.println("s1.equalsIgnoreCase(\"Hello\") : "+s1.equalsIgnoreCase("Hello"));
		
		System.out.println("s1.length() : "+s1.length());
		
		
		System.out.println("s1.startsWith(\"he\") : "+s1.startsWith("he"));
		System.out.println("s1.startsWith(\"e\") : "+s1.startsWith("e"));
		System.out.println("s1.endsWith(\"he\") : "+s1.endsWith("he"));
		System.out.println("s1.endsWith(\"llo\") : "+s1.endsWith("llo"));
		
		System.out.println("s1.contains(\"e\") : "+s1.contains("e"));
		System.out.println("s1.contains(\"ell\") : "+s1.contains("ell"));
		System.out.println("s1.contains(\"lol\") : "+s1.contains("lol"));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		
		System.out.println("s1.substring(1) : "+s1.substring(1));
		System.out.println("s1.substring(1,4) : "+s1.substring(1,4));
		
		System.out.println(s1.replace("l", "m"));
		System.out.println(s1);
		
		System.out.println(s1.charAt(0));
		
		for (int i = 0; i < s1.length(); i++) {
			System.out.println("s1.charAt("+i+") : "+s1.charAt(i));
		}
		
		char ar[]=s1.toCharArray();
		System.out.println(ar[0]);
		
		String s="        helloooo        ";
		System.out.println(s);
		s=s.trim();
		System.out.println(s);
		
		String d="hello hi everyone good afternoon are we ready for lunch";
		String arr[]=d.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i].toUpperCase());
		}
		
	}

}
