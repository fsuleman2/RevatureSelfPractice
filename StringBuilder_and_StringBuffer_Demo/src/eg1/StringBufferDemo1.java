package eg1;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		System.out.println("memory address of sb before modify "+System.identityHashCode(sb));
		sb.append(" hey").append(11122).append(34343.333);
		System.out.println(sb);
		System.out.println("memory address of sb after modify "+System.identityHashCode(sb));
		sb.insert(1, "Java");
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.delete(1, 4);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");
		System.out.println(sb1.equals(sb2)); //equals is not overridden in both buffer and builder classes
		System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
