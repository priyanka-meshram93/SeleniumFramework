package basicAPIs;
import io.restassured.RestAssured ;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.*;

import files.Payload2;

public class Practice1 {
	
	public static void main(String[] args) {
		
		//given = all the input conditions(headers, query parameters, parameters)
		//when=  method name + the resource name
		//then = asserting the status code and the varous condition for assertion
		
		
		
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String ResponseCaptured=given().log().all().header("Content-Type","application/json").queryParam("Key", "qaclick123").body(Payload2.body())
				.when().post("/maps/api/place/add/json")
		.then().statusCode(200).assertThat().body("status",equalTo("OK")).log().all().header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
         System.out.println(ResponseCaptured);
         
         
         
         JsonPath jpath = new JsonPath(ResponseCaptured);
           String id=  jpath.get("place_id");
           
           System.out.println(id);
           
           
           //Update details
           
           given().log().all().header("Content-Type","application/json").queryParam("Key", "qaclick123").body(Payload2.body2()).when().put("/maps/api/place/update/json").then().statusCode(200).assertThat().body("msg", equalTo("Address successfully updated"));
         
}
	
}

