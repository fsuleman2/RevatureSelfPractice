package steamsapi;

import java.util.ArrayList;

public class Ktimes {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=6;
		int k=1400000000;
		int mod = k;
		if(n<=k) {
			mod=k%n; //2
		}
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			al.add(arr[i]);
		}
		
		for(int i=0;i<mod;i++) {
			al.add(0,al.get(n-1));
			al.remove(n);
		}
		System.out.println(al);
		String str="mam1";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(rev!=null) {
			System.out.println(rev);
		}
		
		if(str.equals(rev)) {
			System.out.println("palindrome");
		}
	}

} 
