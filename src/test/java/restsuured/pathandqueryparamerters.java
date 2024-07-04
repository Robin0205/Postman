package restsuured;
import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

public class pathandqueryparamerters {
	
	
	//https://reqres.in/api/users?page=2&id=5
//---schema---host/domain--(path) after ? mark(query path) then end point. 


	@Test
	public void testqueryandpathparameters()
	{
		given()
         .pathParam("mypath","users" ) 
         .queryParam("page","2" )
         .queryParam("id","5" )


		
		.when()
		  .get("https://reqres.in/api/{mypath}") //we must need to pass path bt not need to pass query pathparam
		
		.then()
		  .statusCode(200)
		  .log().all();
	}
}
