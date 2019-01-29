package restAPI;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

//import io.restassured.response.Response;

public class BooksAPI {
	/*//@Test
	public void testingStatusCode()
	{
		
		//Response resp = get("http://services.groupkt.com/country/get/iso2code/US");
		given().
		get("http://services.groupkt.com/country/get/iso2code/US").
		then().statusCode(200).
		log().all();
		
	}*/
	
	@Test
	public void responseCompare()
	{
		Response resp = get("http://services.groupkt.com/country/get/iso2code/US");
		//body("RestResponse.result.name", equals("United States of America"));
		
	}

	//@Test

	public void hasItemsFunction()
	{
		given().
		get("http://services.groupkt.com/country/get/all").
		then().body("RestResponse.result.name", hasItems("India", "Sri Lanka"));
	}
	

}
