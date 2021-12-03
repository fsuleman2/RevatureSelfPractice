package steamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		// create a list and filter all even numbers from list

		// creating list in shorthand
//		List<Integer> nlist=new ArrayList<Integer>();
//		nlist.add(1);
		
		List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67, 100, 101); // if you are creating list with .of method it is
																		// by
		// default immutable
		System.out.println(list1);

		// without stream
		List<Integer> listEven = new ArrayList<>();

		for (Integer i : list1) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println(listEven);

		/*************************************** using STREAMS **********************/
		Stream<Integer> intStreams = list1.stream(); //converting 
		List<Integer> newL=intStreams.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("im new list"+newL);
		
		intStreams.filter(i->i%2==0).forEach(e->{
			System.out.println(e);
		});
		
		
		
		
		
		
		
		
		List<Integer> evenList = intStreams.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		// imporovisng above code

		List<Integer> newEvenList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newEvenList);

		// printing numbers above 50
		List<Integer> maxList = list1.stream().filter(i -> i >= 50).collect(Collectors.toList());
		System.out.println(maxList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
