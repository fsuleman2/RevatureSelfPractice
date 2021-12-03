package steamsapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String args[]) {
		
		//filter: it takes predicate i.e boolean valued function return true or false
		//based on true and false it filter the elements.. it checks boolean values on every elements..
		//if any element false it will ignore that element
		//works only one boolean values 
		
	
		
		//map
		
		
		/* works on the values
		 * On each element we can perform any  operation
		 * making square of each element 
		 * it takes the one element and apply certain operation and return the value*/
		
		
		
		//creating list
		List<String> names = List.of("Suleman", "Shivam", "Arjun", "Amit", "Anmol");
		//filter out the names whose first letter is A
		
		List<String> newNames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		
	names.stream().filter(e->e.startsWith("A")).forEach(e->{
			System.out.println(e);
		});
	
	
	
	List<Integer> numList = List.of(2,3,4,5,6,1);
	numList.stream().map(i -> i*i).forEach(e->{
		System.out.println(e);
	});
		System.out.println(numList);
		
		
		//shortcut to print names form the list
		names.stream().forEach(System.out::println); //:: is a function reference
		
		
		//sort method in streams
		System.out.println("Before sorted"+numList+"\n"+"After sorted");
		numList.stream().sorted().forEach(System.out::println);
		
		
		//sorting use comparator for custom sorting and printing min and max elemen from list
		
		System.out.println();
		
		Integer minElement = numList.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min element "+minElement);
		
		
		System.out.println();
		
		Integer maxElement = numList.stream().max((x,y)->x.compareTo(y)).get(); //ek value return hori bol k foreach nhi use karre isiye get lere
		//and max return optional
		System.out.println("Max element "+maxElement);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
