package restsuured;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/*every set of fields considered as a one object and group of objects are called array
they are saved in the index form frist record store at 0 index and 2 index store at 1 index
 we need to use JSONPATHFINDER to know the index wise record

THEN----cant do more validation by using this method
and also cant do looping statements and conditional statements so dats the reason we have to capture the
reposnse in a variable and we can do the requires vlidation by using this response variable.
By converting response varibale into JSON we can do the multiple validations.
PARSING-------TRAVERSE through the json to validates the fields in the API body*/
 
public class parsinjsonresponcedata {
	
	@Test(priority=1)
	public void testjsonresponse()
	{
     
		//Approach-1
		
		/*given()
		.contentType(ContentType.JSON)     //this is for local host and for internet--(application/json)
		
		.when()
		   .get("http://localhost:3000/Books")
		
		.then()
		  .statusCode(200)  
		  .header("Content-Type","application/json")
		  .body("Books[3].title",equalTo("god"));
		*/
		
		
		
		//Appraoch-2
	
/*
	    Response res=given()
		.contentType(ContentType.JSON)
		
		.when()
		   .get("http://localhost:3000/Books");
		 
	  Assert.assertEquals(res.getStatusCode(),200);          //validation-1
	  Assert.assertEquals(res.header("Content-Type"),"application/json"); //validation-2
	  
	   String  title=res.jsonPath().get("Books[3].title").toString();
	   Assert.assertEquals(title,"god"); */
	 
	}
		
	@Test(priority=2)
	public void testjsonresponsebodydata()
	{
		//Appraoch-1
		

	    Response res=given()
		.contentType(ContentType.JSON)
		
		.when()
		   .get("http://localhost:3000/Books");
		 
	     Boolean status=false;
	  
	    //Using JSONObject class 
	    JSONObject js=new JSONObject(res.asString());       //converting response to String object
	    
	    //print all the title of the Books
	    
	        for(int i=0;i<js.getJSONArray("Books").length();i++)   //validation-1
	        {
	        	String title=js.getJSONArray("Books").getJSONObject(i).get("title").toString();
	        	System.out.println(title);
	        }
	    
	    //Search for title of  particular books in JSON
	    
	    for(int i=0;i<js.getJSONArray("Books").length();i++)     //valiadtion---2
        {
        	String tit=js.getJSONArray("Books").getJSONObject(i).get("title").toString();
        	
        	if(tit.equals("god"))
        	{
        		status=true;
        		break;
        	}	
        }
	    Assert.assertEquals(status,true);
	    
	    //To validate the total price of the books             //validation-3
	    
	    
	    double totalprice=0;
	    for(int i=0;i<js.getJSONArray("Books").length();i++)     //valiadtion---2
        {
        	String pp=js.getJSONArray("Books").getJSONObject(i).get("price").toString();
        	
        	totalprice=totalprice+Double.parseDouble(pp);
        }
	    System.out.println("total price of the books is:"+totalprice);
	    Assert.assertEquals(totalprice,100340);
	    
	     
	}
}
