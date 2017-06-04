package evolution.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Schedules.class)// You need to define another annotation that holds Schedule[].
@Retention(RetentionPolicy.RUNTIME)
public @interface Schedule {
	String dayOfMonth() default "first";
	String dayOfWeek() default "Mon";
	int hour() default 12;
}