package restAPI;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class ThomasBayerCustomerValidityCheck {
@Test
public void IDCheck()
{
	Response resp = RestAssured.get("http://thomas-bayer.com/sqlrest/CUSTOMER/0");
	String data = resp.asString();
}
//	given().get("http://thomas-bayer.com/sqlrest/CUSTOMER/0").
	//then().body("CUSTOMER.ID",equalTo("0"));
	

@Test
public void customerDetailsCheck()
{
	given().
	get("http://thomas-bayer.com/sqlrest/CUSTOMER/10").
	then().
	body("CUSTOMER.ID", equalTo("10"));
}


}
