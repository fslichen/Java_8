package evolution.annotation;

import java.lang.reflect.Method;

import org.junit.Test;

public class AnyClass {
	@Schedule(dayOfMonth="last")
	@Schedule(dayOfMonth="first", dayOfWeek="Fri", hour=23)
	public void anyMethod() {
		
	}
	
	@Test
	public void testAnnotation() throws Exception {
		Method method = AnyClass.class.getDeclaredMethod("anyMethod");
		// The following method is specially designed for getting repeatable annotations at a time.
		Schedule[] schedules = method.getAnnotationsByType(Schedule.class);
		for (Schedule schedule : schedules) {
			System.out.println(schedule.dayOfMonth());
		}
	}
}
