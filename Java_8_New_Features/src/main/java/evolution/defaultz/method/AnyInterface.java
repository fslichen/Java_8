package evolution.defaultz.method;

public interface AnyInterface {
	default public void anyDefaultMethod() {
		System.out.println("Hello World");
	}
	
	default public void anotherDefaultMethod() {
		System.out.println("Goodbye Past");
	}
}
