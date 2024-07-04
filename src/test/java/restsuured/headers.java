package restsuured;
import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class headers {
	
	
	 //Headers content remains constant only few fields of the headers remains unchanged
	
	/*@Test(priority=1)
	 public void headersdemo()
	 {

		given()
		
		.when()
		   .get("https://www.google.com/")
		
		 .then()
		  .statusCode(200)
		  .header("Transfer-Encoding", "chunked");	 		 		 
	 }*/
	
	
	/*@Test(priority=1)
	 public void headersdemoinfo()
	 {

		Response res=given()
		
		.when()
		   .get("https://www.google.com/");
		
		 //To get the single header value
		//System.out.println(res.getHeader("Transfer-Encoding"));
		 		 		 
		//To get all the header values
		
		 Headers headers=res.getHeaders();
		 
		 
		 for(Header header:headers)
		 {
			  System.out.println( header.getName()+"  "+header.getValue());
		 }
		
	 }
	*/
	@Test(priority=1)
	 public void testlogo()
	 {

		given()
		
		.when()
		   .get("https://www.google.com/")
		
		.then()
		.log().body()    //to get only body response
		.log().headers()  //to get only header response
		.log().cookies()  //to get only cookies response
		.log().all();     //to get entire body response
		
		
	 }
}
