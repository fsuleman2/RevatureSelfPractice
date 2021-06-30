package operatorpack;

import java.util.Scanner;

public class JavaOperators {
public static void main(String[] args) {
	System.out.println("Arithmetic Operators");
	/* + Addition x+y
	 * - Subtraction x-y
	 * * Multiplication x*y
	 * / Division x/y
	 * % Modulus x%y
	 * ++ increment x++
	 * -- Decrement x--
	 * */
	Scanner scan = new Scanner(System.in);
	System.out.println("Please Enter X and Y Values");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println("Press \n 1.To perform Addition\n 2.To perform Subtraction\n 3.To perform Multiplication \n 4.To perform Division\n 5.To perform Modulus \n 6.To perform Increment \n 7.To perform Decrement\n");
	int input = scan.nextInt();
	if(input>0 && input <=7) {
		switch(input) {
		case 1 : System.out.println(x+y);
		break;
		case 2 : System.out.println(x-y);
		break;
		case 3 : System.out.println(x*y);
		break;
		case 4 : System.out.println(x/y);
		break;
		case 5 : System.out.println(x%y);
		break;
		case 6: System.out.println("Post Increment "+x++ +"\n"+"Pre Increment "+ ++y);
		break;
		case 7 : System.out.println("Post Decrement "+x-- +"\n"+"Pre Decrement "+ --y);
		break;
		default: System.out.println("please enter valid input");
		break;
		}
	}
	else {
		System.out.println("Please Enter Number between 1 to 7");
	}
}
}
