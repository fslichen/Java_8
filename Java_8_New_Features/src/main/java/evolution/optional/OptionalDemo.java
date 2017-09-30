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
	public void orElse() {
		AnyPojo anyPojo = new AnyPojo();
		AnotherPojo anotherPojo = Optional.of(anyPojo).map(x -> x.getAnotherPojo()).orElse(new AnotherPojo());
		System.out.println(anotherPojo);
	}
	
	@Test
	public void orElseGet() {
		AnyPojo anyPojo = new AnyPojo();
		AnotherPojo anotherPojo = Optional.of(anyPojo).map(x -> x.getAnotherPojo()).orElseGet(() -> new AnotherPojo());
		System.out.println(anotherPojo);
	}
	
	@Test
	public void filter() {
		AnyPojo anyPojo = new AnyPojo();
		AnotherPojo anotherPojo = new AnotherPojo();
		anyPojo.setAnotherPojo(anotherPojo);
		Optional.of(anyPojo).filter(x -> x.getAnotherPojo() != null).ifPresent(System.out::println);
	}
	
	@Test
	public void ofNullable() {
		AnyPojo anyPojo = null;
		Optional<AnyPojo> optional = Optional.ofNullable(anyPojo);
		System.out.println(optional);
	}
}
