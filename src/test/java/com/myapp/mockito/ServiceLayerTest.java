package com.myapp.mockito;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest({ServiceLayer.class})
public class ServiceLayerTest {

	private static final String COUNTRY_EXPECTED = "New Zealand";
	
	@Test
	public void findCountryTest() throws Exception {
		log("started findCountryTest");
		ApiAdaptor mockedApiAdaptor = Mockito.mock(ApiAdaptor.class);
		PowerMockito.whenNew(ApiAdaptor.class).withAnyArguments().thenReturn(mockedApiAdaptor);
		Mockito.when(mockedApiAdaptor.getCountry(Mockito.anyString(), Mockito.anyString())).thenReturn(COUNTRY_EXPECTED);
		
		ServiceLayer serviceLayer = new ServiceLayer();
		String countryRetrieved = serviceLayer.findCountry(21);
		assertEquals(COUNTRY_EXPECTED, countryRetrieved);
	}
	
	
	private void log(String s) {
		System.out.println(s);
	}

}
