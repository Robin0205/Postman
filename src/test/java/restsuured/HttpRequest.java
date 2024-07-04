package restsuured;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

//To do any changes with font and size color,go to window option from menu bar then preferences--General--Basic
//We need to navigate to Rest Assured official website and add the needed dependencies to project
/*---------------------REST ASSURED---------------
 * REST ASSURED is an API/Library through which we can automate the REST API'S.
 * 
 * pre-requisites
 * 
 * Java-9,+Eclipse
 * TestNG
 * Maven(comes with eclipse)
 * 
 * Dependencies needed to add to pom.xml file
 * 
 * Rest Assured
 * Json-path
 * Json
 * gson
 * TestNG
 * Scribejava-apis
 * Json-Schema-Validator
 * XML-Schema-validator
 * 
 * 
 */
/*
 * 
 * given()----prerequisites
 * 
 * content type,set cookies,ada auth,add parameters,set headers,info etc.....
 * 
 * when()------request
 * 
 * get,put,patch,update,delete
 * 
 * 
 * then()------validations
 * 
 * validate status code,header section,cookies,time, bodysize,response body.
 * 
 * 
 * 
 * we need to add static packages in order to work with when.
 * then,given methods we have to find them and add manually to test cse
 * we need to add 3 packages to every test case
 * 
 * To do that go to rest assured app and find static imports and add import to that static packages 
 * 
 */
public class HttpRequest {
	
	int id;
	
	//-----------------REQRES is the website we are using for this REST APIS validation-----------
	
    @Test(priority=1)
	void getuser()
	{
		given()
		
		.when()
		   .get("https://reqres.in/api/users?page=2")
		
		.then()
		  .statusCode(200)
		    .body("page",equalTo(2))
		    .log().all();
		 

	}
    
    
	@Test(priority=2)
	void createuser()
	{
    	
    	HashMap data=new HashMap();
    	data.put("name", "robin");
    	data.put("Role", "student");

    	
    	
		id=given()
		  .contentType("application/json")
		  .body(data)
		
		.when()
		   .post("https://reqres.in/api/users")
		   .jsonPath().getInt("id");
		
		//.then()
		 // .statusCode(201)
		    //.log().all();
		 

	}
	@Test(priority=3,dependsOnMethods= {"createuser"})
	void updateuser()
	{
    	
    	HashMap data=new HashMap();
    	data.put("name", "robin");
    	data.put("Role", "trainee");

    	
    	
		given()
		  .contentType("application/json")
		  .body(data)
		
		.when()
		   .post("https://reqres.in/api/users/+id")
		
		.then()
		  .statusCode(201)
		    .log().all();
		 

	}
	
	@Test(priority=4)
	void deleteuser()
	{
		given()
    		
		.when()
		   .delete("https://reqres.in/api/users/+id")
		
		.then()
		  .statusCode(204)
		    .log().all();
		 

	}

	
    
}
