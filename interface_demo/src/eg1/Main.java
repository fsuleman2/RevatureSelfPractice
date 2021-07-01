package eg1;

public class Main {
public static void main(String[] args) {
	//L.H.S should be interface and right hand side should
	//be its implementing class(code to interface)
MyInterface1 imp = new Implementor();
imp.hello1();
imp.hello2();
imp.hello3();

MyInterface2 imp2 = new Implementor();

imp2.method1();
imp2.method2();
imp2.common();
}
}
