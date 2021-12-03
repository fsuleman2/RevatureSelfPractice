package steamsapi;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Demo11 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		//filter(predicate);
		//step1:convert exsiting list into streams
		al.stream().forEach(System.out::print);
		al.stream().filter(e->e%2==0).forEach(e->{
			System.out.println(e);
		});
		
		al.stream().filter(i->i>4).forEach(e->{
			System.out.println(e);
		});

	}

}
