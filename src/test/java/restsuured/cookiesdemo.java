package restsuured;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class cookiesdemo {

	/*
	 * when u send some request in the request body in retun it will gove some
	 * response it also consist of cookies we cant validate the cookies because the
	 * values of cookies are dynamic means they keep on changing for every
	 * request,instead we can see whether the values for cookies are present or not
	 * 
	 */

	@Test
	void getcookies() {
		
		      Response  res=given()

				.when()
				.get("https://www.google.com/");

				//.then()
				//.statusCode(200)
				//.log().all();
		      
		      //to get single cookie info
		      
		     //String ckvalue=res.getCookie("AEC");
		    // System.out.println("The cookie value of AEC is :"+ ckvalue);
		     
		     
		     //to get multiple cookies along with values
		      
		      
		 Map<String,String>  cookies=res.getCookies();
		 
		//System.out.println(cookies.keySet());   //to get only keys of the cookies
		 
		 //To get the values of multiple keys we have to use loop statement
		 
		 for(String k:cookies.keySet())
		 {
			String values=res.getCookie(k);
			System.out.println(values);
		 }
		 
		 

	}

}
