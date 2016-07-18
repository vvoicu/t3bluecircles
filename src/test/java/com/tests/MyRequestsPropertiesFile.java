package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MyRequestsPropertiesFile extends BaseTest {

	@Test
	public void readMyRequestsPropretyTest() {

		System.out.println("userName:" + userName);
		System.out.println("userPassword:" + userPassword);
		System.out.println("startDate:" + startDate);
		System.out.println("endDate:" + endDate);
	
	}

}
