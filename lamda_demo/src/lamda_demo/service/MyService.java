package lamda_demo.service;

@FunctionalInterface
public interface MyService {
	public abstract void sayHello();
default void sayBye() {
	}
}
//to use functional interface

//create separate class and implement this interface