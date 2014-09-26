package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNextday1 {

	@Test
	public void test() {
		time t= new time(28,5,2000);
		Nextday.nextday(t);
		fail("Not yet implemented");
	}
	@Test
	public void test1() {
		time t= new time(28,2,2000);
		Nextday.nextday(t);
		fail("Not yet implemented");
	}
	@Test
	public void test2() {
		time t= new time(29,2,2000);
		Nextday.nextday(t);
		fail("Not yet implemented");
	}
	@Test
	public void test3() {
		time t= new time(30,5,2000);
		Nextday.nextday(t);
		fail("Not yet implemented");
	}
	@Test
	public void test4() {
		time t= new time(31,7,2000);
		Nextday.nextday(t);
		fail("Not yet implemented");
	}
	@Test
	public void test5() {
		time t= new time(31,12,2000);
		Nextday.nextday(t);
		fail("Not yet implemented");
	}
	@Test
	public void test6() {
		time t= new time(31,12,2004);
		Nextday.nextday(t);
		fail("Not yet implemented");
	}
	@Test
	public void test7() {
		time t= new time(30,13,2001);
		Nextday.nextday(t);
		fail("Not yet implemented");
	}
}
