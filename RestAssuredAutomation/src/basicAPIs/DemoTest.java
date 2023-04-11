package basicAPIs;

import io.restassured.RestAssured ;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import static io.restassured.RestAssured.* ;

import files.Payload;

public class DemoTest {
	
	public static void main(String[] args) {
		
		// given= all the input details
		//when = submit the API (With which method name and the resource name)
		//then =  validations
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
String Response	=given().log().all().queryParam("key", "qaclick123").header("Content-type", "application/json").body(Payload.payloadBody()).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();


JsonPath js = new JsonPath(Response);

String responseParsedplaceiD =js.get("place_id");
 String responseParsedID =js.get("id");
 
System.out.println(responseParsedplaceiD);
System.out.println(responseParsedID);


//Update place

given().log().all().queryParam("key", "qaclick123").header("Content-type", "application/json").body("{\r\n"
		+ "\"place_id\": \""+responseParsedplaceiD+"\",\r\n"
		+ "\"address\":\"70 Summer walk, USA\",\r\n"
		+ "\"key\":\"qaclick123\"\r\n"
		+ "}\r\n"
		+ "")
		.when().put("maps/api/place/update/json").then().log().all().statusCode(200).assertThat().body("msg", equalTo("Address successfully updated"));



// Retrieving the details


given().log().all().queryParam("key","qaclick123" ,responseParsedplaceiD).when().get("maps/api/place/get/json").then().log().all().statusCode(200).assertThat().body("address", equalTo("70 Summer walk, USA"));
		

	}


}

