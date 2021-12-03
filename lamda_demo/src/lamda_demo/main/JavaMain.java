package lamda_demo.main;

import lamda_demo.service.LengthInterface;
import lamda_demo.service.MyService;
import lamda_demo.service.SumInterface;
import lamda_demo.service.impl.MyServiceImpl;


public class JavaMain {

	public static void main(String[] args) {
		//creating object using our old approach
		MyService myService = new MyServiceImpl();
		myService.sayHello();
		
		//if we dont want to create any separe impl shorcut is
		MyService i13 = new MyService() {

			@Override
			public void sayHello() {
				System.out.println("sdfsds");
				
			}
			
		};
		i13.sayHello();
		//anonymous class
		MyService i = new MyService() {
			@Override
			public void sayHello() {
				System.out.println("Im from anonymous class");
				
			}
		};
		i.sayHello();
		
		/*now impl interface with the help of lambda expression*/
		
		MyService i1 = ()-> System.out.println("This is first time in lambda expression in one line");
//		MyService i4 = ()-> i4.sayHello();
		i1.sayHello();
		
		
		MyService i2 = ()->{
			System.out.println("This sis first time in lambda expression");
			System.out.println("This sis first time in lambda expression");
		};
		i2.sayHello();
		
	/***********************************************************************************************/
		
		SumInterface sumInterface = (a,b)-> {return a+b;};
		
		//caling method
		System.out.println(sumInterface.sum(10,20));
		
		/***********************************************************************************************/
		
		
		LengthInterface lengthInterface = str1 -> str1.length();
		String name = "Suleman";
		System.out.println("Length of the String "+name+" is "+lengthInterface.getLength("shivam"));
	}

}
