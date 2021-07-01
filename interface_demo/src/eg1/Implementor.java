package eg1;

public class Implementor implements MyInterface1,MyInterface2 {
@Override
public void hello1() {
	System.out.println("Hello from hello1() from MyInterface value of x = "+ MyInterface1.x);
}
@Override
public void hello2() {
	System.out.println("Hello from hello2() from MyInterface value of x = "+MyInterface1.x);
}

@Override
public void hello3() {
	System.out.println("Hello from hello3() from MyInterface value of x = "+ MyInterface1.x);
}
@Override
public void method1() {
	// TODO Auto-generated method stub
	System.out.println("Hello from method1() from MyInterface2"+MyInterface2.x);
}
@Override
public void method2() {
	// TODO Auto-generated method stub
	System.out.println("Hello from method1() from MyInterface2"+MyInterface2.x);
}
@Override
public void common() {
	// TODO Auto-generated method stub
	System.out.println("Hello from commmon() from MyInterface1 and MyInterface2");
}

}
