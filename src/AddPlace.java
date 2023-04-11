import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import files.Payload;



public class AddPlace {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.addPlace()).when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.41 (Ubuntu)");
	}

}

