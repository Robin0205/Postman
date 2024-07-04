package restsuured;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class autherization {

	/*
	 * Authentication---valid user or not Autherization---only valid user can access
	 * 
	 * 
	 * Basic,
	 * Digestive,
	 * Preemptive 
	 * 
	 * The above 3 authentications functionality is same using username and password but algorithm is different
	 *Bearer token,
	 *Auth 1.02,2.0 --------more critical to crack and high secure authenctications
	 *API KEY 
	 */
	
  /*  @Test(priority=1)
	public void basicauth()
	{
         given()
         .auth().basic("postman","password")         //this is the Deault API provided by pstman
		
		 .when()
		  .get("https://postman-echo.com/basic-auth")         //url of thr postman which provide basic api
		
		.then()
		  .statusCode(200)
		    .body("authenticated",equalTo(true))
		    .log().all();
		    
	}

	@Test(priority=2)
	public void digestauth()
	{
         given()
         .auth().basic("postman","password")
		
		 .when()
		  .get("https://postman-echo.com/basic-auth")
		
		.then()
		  .statusCode(200)
		    .body("authenticated",equalTo(true))
		    .log().all();
		    
	}
	
	@Test(priority=3)
	public void preemptiveauth()
	{
         given()
         .auth().preemptive().basic("postman","password")
		
		 .when()
		  .get("https://postman-echo.com/basic-auth")
		
		.then()
		  .statusCode(200)
		    .body("authenticated",equalTo(true))
		    .log().all();
		    
	}*/

	//After adding the Barrer token for the URL it will be added to header section
	 //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---Bearer token of my github
	  //this is the method to access the Apis with the bareertoken
	
	/*@Test(priority=4)
	public void bareertoken()                  
	{
		String btoken="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";
		
         given()
         .headers("Authorization","Bearer "+btoken)     //sapce must be there beside bearer word
		
		 .when()
		  .get("https://api.github.com/user")
		
		.then()
		  .statusCode(200)
		    .body("authenticated",equalTo(true))
		    .log().all();
		    
	}*/
	
/*	@Test(priority=5)
	public void oauth1()                  
	{
		
		//Oauth 1 need 4 parameters,where as Oauth 2 need only 1 parameter ---accesstoken
         given()
         .auth().oauth("consumerid","consumerkey","accesstoken","tokensecret")   //in this we need to enter the token
		
		 .when()
		  .get("url")           //here we have to pass the url of the API that we need to access
		
		.then()
		  .statusCode(200)
		   
		    .log().all();
		    
	}
	
	
	@Test(priority=6)
	public void oauth2()                  
	{
		
		//Oauth 1 need 4 parameters,where as Oauth 2 need only 1 parameter ---accesstoken
         given()
         .auth().oauth2("accesstoken")   //in this we need to enter the token
		
		 .when()
		  .get("url")           //here we have to pass the url of the API that we need to access
		
		.then()
		  .statusCode(200)
		   
		    .log().all();
		    
	}
	*/
	
	//@Test(priority=7)
	//public void apikey() { 
	
	
	//Method-1
	
	
		//we are using WEATHERAPI website to access the apis with API Key
		//depend on api design we have to pass keys along with header or query
		//and this passing of keys to apis are different some for header and some for query
		
       /* given()
         .queryParam("appid","id value") //in place of id value we need pass the app generated value (key value)
		
		 .when()
		  .get("https://api.openweathermap.org/data/2.5/forecast/daily?q=Delhi&units=metric&cnt=7")           
		
		.then()
		  .statusCode(200)
		    .log().all();
        }*/
	
		
		//method-2
		
		/*given()
		.queryParam("appid","id value")

		.pathParam("mypath","data/2.5/forecast/daily")
		.queryParam("q","Delhi")
        .queryParam("units","metrics")
        .queryParam("cnt","7")


		 .when()
		  .get("https://api.openweathermap.org/{mypath}") //here we have to pass the url of the API that we need to access
		
		.then()
		  .statusCode(200)
		   
		    .log().all();}*/
		    

}
