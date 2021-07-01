package eg_java8;

public interface Java8Interface {
public static void iAmStatic() {
	System.out.println("Hello Static methods allowed in interfaces from JAVA 8");
}
default void iAmDefault() {
	//by default abstract and public but due to java 8 we can have default specifier
	System.out.println("Default methods from Java8");
}
}
