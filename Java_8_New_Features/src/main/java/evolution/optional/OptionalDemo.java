package evolution.optional;

import java.util.Optional;

import org.junit.Test;

public class OptionalDemo {
	@Test
	public void map() {
		AnyPojo anyPojo = new AnyPojo();
		AnotherPojo anotherPojo = new AnotherPojo();
		anotherPojo.setName("Chen");
		anyPojo.setAnotherPojo(anotherPojo);
		Optional.of(anyPojo).map(x -> x.getAnotherPojo()).map(x -> x.getName()).ifPresent(System.out::print);
	}
	
	@Test
	public void sd() {
		AnyPojo anyPojo = new AnyPojo();
		AnotherPojo anotherPojo = new AnotherPojo();
		anotherPojo.setName("Chen");
		anyPojo.setAnotherPojo(anotherPojo);
	}
}
