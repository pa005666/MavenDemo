package com.pouchen.mavenDemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiffDemoTest {
	
	private DiffDemo diffDemo;
	
	@BeforeAll
	private void setup() {
		diffDemo = new DiffDemo();
	}
	
	@Test
	private void testGetDiff() {
		String str1 = "abcde";
		String str2 = "abcxy";
		
		String expected = "xy";
		
		try {
			String deffResult = diffDemo.getDiff(str1, str2);
			assertEquals(expected, deffResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
