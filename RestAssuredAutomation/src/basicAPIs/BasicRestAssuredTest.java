package basicAPIs;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import files.BasicRestAssuredTestPAYLOAD;
import static org.hamcrest.Matchers.*;
public class BasicRestAssuredTest {
	
	public static void main(String[] args) {
		
		
		//give()= all the input details ,like query parameters ,headers,
		//when()= the method() used and the resource URL
		//then()= the status code
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		//Add Place
		String Response=given().log().all().queryParam("Key","qaclick123").header("Content-Type", "application/json").body(BasicRestAssuredTestPAYLOAD.paybody()
			)
		
		.when().log().all().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().asString();
		
		
		JsonPath js = new JsonPath(Response);
		String extractedID=js.get("place_id");
	
		
		
		
	
	//Retrieve Place
	 String Details =given().log().all().queryParam("Key","qaclick123").queryParam("place_id",extractedID).when().put("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().asString();
	
	 
	 
	 //update place
	 
	String Updateddetails=given().log().all().queryParam("Key", "qaclick123").queryParam("Content-Type","application/json").body(BasicRestAssuredTestPAYLOAD.paybody1(extractedID)).
	 		when().log().all().put("maps/api/place/update/json").then().assertThat().log().all().body("msg",equalTo("Address successfully updated")).extract().asString();
	
	
             
      String  expectedAddress="70 Vishram Nagar, USA";
	
	//Get place again to check if the updated place is updated
	
	String adress=given().log().all().queryParam("Key","qaclick123").queryParam("place_id",extractedID).when().put("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().asString();
	
	   JsonPath jp = new JsonPath(adress);
	  String actualAddress= jp.getString("adress");
	  
	  System.out.println(actualAddress);
	  System.out.println(expectedAddress);

	
	
}
}
