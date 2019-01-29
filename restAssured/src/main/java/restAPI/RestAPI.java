package restAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class RestAPI {

	@Test
	public static void testResponseCode()
	{
		
	Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");	
		
	int statusCode = resp.getStatusCode();
		
	System.out.println("Status code: "+statusCode);
	
	Assert.assertEquals(200, statusCode);
	
			
	}
	
	@Test
	public void getData()
	{
		Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String data = resp.asString();
		System.out.println("Data: "+data);
		System.out.println("Response Time: "+resp.getTime());
	}
}
