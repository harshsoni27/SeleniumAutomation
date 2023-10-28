package TestNG;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = "Odd")
	public void testAnnotation1() {
		System.out.println("Test Annotation 1");
	}

	@Test(groups = "Even")
	public void testAnnotation2() {
		System.out.println("Test Annotation 2");
	}

	@Test(groups = "Odd")
	public void testAnnotation3() {
		System.out.println("Test Annotation 3");
	}

	@Test(groups = "Even")
	public void testAnnotation4() {
		System.out.println("Test Annotation 4");
	}

	@Test(groups = "Odd")
	public void testAnnotation5() {
		System.out.println("Test Annotation 5");
	}

}
