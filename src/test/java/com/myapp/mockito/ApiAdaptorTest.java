package com.myapp.mockito;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class ApiAdaptorTest {

	@Test
	public void getCountryTest() {
		log("start getCountryTest");
		ApiAdaptor apiAdaptor = new ApiAdaptor();
		String country = apiAdaptor.getCountry(null, null);
	
		assertEquals("getCountryTest failed", "Australia", country);
		fail("Not yet implemented");
	}

	
	private void log(String s) {
		System.out.println(s);
	}
}
