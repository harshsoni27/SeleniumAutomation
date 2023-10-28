package TestNG;

import org.testng.annotations.Test;

public class TestAttributes {
	@Test()
	public void testAnnotation1() {
		System.out.println("Test Annotation 1");
	}

	@Test
	public void testAnnotation2() {
		System.out.println("Test Annotation 2");
	}

	@Test
	public void testAnnotation3() {
		System.out.println("Test Annotation 3");
	}

}
