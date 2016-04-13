package com.myapp.mockito;

public class ServiceLayer {
	public String findCountry(int positionId) {
		   // some business logic here to get latitude and longitude from postitionId 
		   ApiAdaptor api = new ApiAdaptor();
		   String latitude = "21.22";
		   String longitude = "21.22";
		   String country = api.getCountry(latitude, longitude);
		   return country;
	}
}
