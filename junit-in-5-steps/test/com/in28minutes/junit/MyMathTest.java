package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@BeforeEach
	public void before() {
		
		System.out.println("Before each");
	}
	
	@AfterEach
	public void after() {
		
		System.out.println("after each");
	}
	
	@BeforeAll
	public static void BeforeAll() {
		
		System.out.println("@BeforeAll");
	}
	
	@AfterAll
	public static void AfterAll() {
		
		System.out.println("@AfterAll");
	}
	
	
	@Test
	public void sum_3() {
		//absense of failure is success
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6,result);
		System.out.println("test1");
		}
	
	@Test
	public void sum_4() {
		//absense of failure is success
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1,2,3,4});
		assertEquals(10,result);
		System.out.println("test2");
		}


}
