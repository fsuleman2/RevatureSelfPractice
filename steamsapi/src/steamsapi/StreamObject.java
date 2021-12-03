package steamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		// Stream API - Collection process
		// collection / group of objects

		// to create blank stream
		Stream<Object> emptyStream = Stream.empty();
//		emptyStream.forEach(e->{
//			System.out.println(e);
//		});

		String names[] = { "Suleman", "Shivam", "Arjun", "Amit", "Anmol" };
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});
		Integer intArr[] = {1,2,3,4,5};
		Stream<Integer> intStreams=Stream.of(intArr);
		intStreams.forEach(e->{
			System.out.println(e);
		});

		System.out.println();
		Stream<String> stream2 = Stream.of("Suleman", "Shivam", "Arjun", "Amit", "Anmol");
		stream2.forEach(e -> {
			System.out.println(e);
		});

		// using builder pattern
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//using Arrays.stream
	IntStream intStream = Arrays.stream(new int[] {2,3,4,5,6});
	intStream.forEach(e->{
		if(e%2==0) {
			System.out.println(e);
		}
	});
	
	
	//another method to create stream
	ArrayList<Integer> myIntList = new ArrayList<Integer>();
	myIntList.add(1);
	myIntList.add(2);
	myIntList.add(3);
	myIntList.add(4);

	
	Stream<Integer> myStreamInt = myIntList.stream();
	myStreamInt.forEach(e->{
		if(e%2!=0) {
			System.out.println("I am Odd Number "+e);
		}
	});
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
