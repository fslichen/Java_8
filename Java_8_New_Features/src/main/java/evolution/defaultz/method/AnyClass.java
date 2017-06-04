package evolution.defaultz.method;

import org.junit.Test;

public class AnyClass implements AnyInterface {
	public void anyMethod() {
		anyDefaultMethod();
		anotherDefaultMethod();
	}
	
	@Test
	public void testDefaultMethods() {
		AnyClass anyClass = new AnyClass();
		anyClass.anyMethod();
	}
}
