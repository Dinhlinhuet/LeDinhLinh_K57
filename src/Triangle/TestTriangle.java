package Triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void test() {
		String result = Triangle.defineTriangle(3, 4, 5);
		assertEquals(" right triangle", result);
		assertEquals("is not triangle", Triangle.defineTriangle(1, 2, 3));
		assertEquals("equilateral triangle", Triangle.defineTriangle(2, 2, 2));
		assertEquals("isosceless triangle", Triangle.defineTriangle(2, 2, 3));
		assertEquals(" triangle", Triangle.defineTriangle(4, 5, 6));
		fail("Not yet implemented");
	}

}
