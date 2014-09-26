package default1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {
	void print(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}
	@Test
	public void test() {
		int [] num = { 1,4,5,6,0,2};
		Program1 pr1 = new Program1();
		pr1.BubbleSort(num);
		print(num);
		int []num1 = {6,5,4,2,1,0};
		assertArrayEquals(num, num1);
		System.out.println("test");
		fail("Not yet implemented");
	}
	@Test
	public void test1() {
		int [] num = { 19,8,5,4,3,2};
		Program1 pr1 = new Program1();
		pr1.BubbleSort(num);
		print(num);
		int []num1 = {19,8,5,4,3,2};
		assertArrayEquals(num, num1);
		System.out.println("test1");
		fail("Not yet implemented");
	}
	@Test
	public void test2() {
		int [] num = {8,8,8,8,8,8};
		Program1 pr1 = new Program1();
		pr1.BubbleSort(num);
		print(num);
		int []num1 = {8,8,8,8,8,8};
		assertArrayEquals(num, num1);
		System.out.println("test2");
		fail("Not yet implemented");
	}
	@Test
	public void test3() {
		int [] num = {-1,-7,6,-9 };
		Program1 pr1 = new Program1();
		pr1.BubbleSort(num);
		print(num);
		int []num1 = {6,-1,-7,-9};
		assertArrayEquals(num, num1);
		System.out.println("test3");
		fail("Not yet implemented");
	}
}
