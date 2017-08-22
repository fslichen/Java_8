package evolution.optional;

import java.util.Optional;

public class AnyPojo {
	private String name;
	private AnotherPojo anotherPojo;
	private Optional<AnotherPojo> anotherPojoOptional;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<AnotherPojo> getAnotherPojoOptional() {
		return anotherPojoOptional;
	}
	public void setAnotherPojoOptional(Optional<AnotherPojo> anotherPojoOptional) {
		this.anotherPojoOptional = anotherPojoOptional;
	}
	public AnotherPojo getAnotherPojo() {
		return anotherPojo;
	}
	public void setAnotherPojo(AnotherPojo anotherPojo) {
		this.anotherPojo = anotherPojo;
	}
}
