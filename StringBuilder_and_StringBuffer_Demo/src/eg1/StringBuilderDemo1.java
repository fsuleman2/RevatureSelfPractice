package eg1;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			String s="hello hi good evening everyone hope you are enjoying progamming with java";
			StringBuilder sb=new StringBuilder();
			String ar[]=s.split(" ");
			for (int i = 0; i < ar.length; i++) {
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			}
			
			System.out.println(sb.toString().trim());

		}
	

}
