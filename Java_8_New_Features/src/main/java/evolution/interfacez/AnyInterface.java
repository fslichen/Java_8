package evolution.interfacez;

// The default method makes interface a little bit like abstract class.
// It's mainly used for avoid writing implementations in the old project.
public interface AnyInterface {
	default public void anyDefaultMethod() {
		System.out.println("Hello World");
	}
	
	default public void anotherDefaultMethod() {
		System.out.println("Goodbye Past");
	}
	
	static public void anyStaticMethod() {
		System.out.println("This is a static method.");
	}
}
