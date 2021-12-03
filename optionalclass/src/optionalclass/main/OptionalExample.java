package optionalclass.main;

import java.util.Optional;

public class OptionalExample {
	
	public static Optional<String> getName(){
		String s = "suleman";
		return Optional.ofNullable(s);
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[]) {
			String str = "Suleman";
			
			//old approach
			if(str==null) {
				System.out.println("No element");
			}
			else {
				System.out.println(str.length());
			}
			
			//new approch with Optional Class
			
			Optional<String> optional = Optional.ofNullable(str);
			System.out.println(optional.isPresent()); //true or false
			System.out.println(optional.get()); //return the value or throws NoSuchElementException
			System.out.println(optional.orElse("No Value exist"));
			optional.ifPresent(e->{
				System.out.println(e.length()); //return length else nothing
			});
			
		Optional<String> nameOptional = getName();
		System.out.println(nameOptional.orElse("Null return"));
	}
}
