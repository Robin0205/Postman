package restsuured;
import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;


public class postbody {
	
	/*
	 * In this class we can see by how many ways we can create post body
	 *1)Hashmap--key,value pair
	 *2)Org.jsonlibrary ---need to add dependecny in pom.xml
	 *3)By using POJO class(Plane old Java Object)---we need to create class fro this one
	 *4)Using External json File. 
	 */
	
	//http://localhost:3000/students
	
	//1)Creating postbody by using Hashmap 
	//we can use this method if there is less amount of data not prefered for long data
	
    /*@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test(priority=1)
	public void creatrequestbody()
	{

    	HashMap dt=new HashMap();
    	dt.put("name", "Shiva");
    	dt.put("employee", "CEO");
        String courarr[]= {"c","java"}; //to pass multiple values of array into hashmap nned to write array and send it as a value  
        dt.put("course", courarr);
    	
    	
		given()
		  .contentType("appliction/json")
		  .body(dt)
		
		.when()
		   .post("http://localhost:3000/students")
		
		  .then()
		  .statusCode(201)
		  .body("name",equalTo("shiva"))
		  .body("employee",equalTo("CEO"))
		  .body("course[0]",equalTo("c"))
		  .body("course[1]",equalTo("java"))
		  .header("content-Type","application/json; charset=utf-8")
		  .log().all();
	
		  
	}
    
    @Test(priority=2)
	public void deleteuser()
	{
		when()
		   .delete("http://localhost:3000/students/5")
		
		.then()
		  .statusCode(200)
		  .log().all();
	
		  
	}*/
	
	//Creating Postbody using JSON.org
	
	/*@Test()
	public void creatrequestbodyusingjson()
	{

    	JSONObject data2=new JSONObject();
    	data2.put("name", "Shiva");
    	data2.put("employee", "CEO");
        String courar[]= {"c","java"}; //to pass multiple values of array into hashmap nned to write array and send it as a value  
        data2.put("course", courar);
    	
    	
		  given()
		  .contentType("appliction/json")
		  .body(data2.toString())         //we need to convert data intp string that will be converted into Json Format
		                                  //to string is only for json
		
		.when()
		   .post("http://localhost:3000/students")
		  .then()
		  .statusCode(201)
		  .body("name",equalTo("shiva"))
		  .body("employee",equalTo("CEO"))
		  .body("course[0]",equalTo("c"))
		  .body("course[1]",equalTo("java"))
		  .header("content-Type","application/json; charset=utf-8")
		  .log().all();
	
		  
	}
	
	@Test(priority=2)
	public void deleteuserofjson()
	{
		when()
		   .delete("http://localhost:3000/students/5")
		
		.then()
		  .statusCode(200)
		  .log().all();
	
		  
	}*/
	
	
	
	//Creating the Post request body by using the pojo class
	
	/*@Test()
	public void creatrequestbodyusingpojo()
	{
		

    	pojo p=new pojo();
    	p.setName("Shiva");
    	p.setEmployee("Ruler");
        String courar[]= {"c","java"}; //to pass multiple values of array into hashmap nned to write array and send it as a value  
        p.setCourse( courar);
    	
    	
		  given()
		  .contentType("appliction/json")
		  .body(p)         //we need to convert data intp string that will be converted into Json Format
		
		.when()
		   .post("http://localhost:3000/students")
		  .then()
		  .statusCode(201)
		  .body("name",equalTo("shiva"))
		  .body("employee",equalTo("CEO"))
		  .body("course[0]",equalTo("c"))
		  .body("course[1]",equalTo("java"))
		  .header("content-Type","application/json; charset=utf-8")
		  .log().all();
		  
	}
	
	@Test(priority=2)
	public void deleteuserofjson()
	{
		when()
		   .delete("http://localhost:3000/students/5")
		
		.then()
		  .statusCode(200)
		  .log().all();
	
	
}*/
	
	//Post request using external json file
	/*To do this type of postrequsrt body we need to cate the one body.sjon file(name is optional)
      then in that we need to enter the data that we are wising to post in Api*/
	
	
	@Test()
	public void creatrequestbodyusingexternaljson() throws FileNotFoundException
	{
		

    	File f=new File(".\\body.json");     //access the file .\\ pointing towards the present working directorey
    	FileReader fr=new FileReader(f);     //Read the file
    	
    	JSONTokener jz=new JSONTokener(fr);  //this calss is used to split the data
    	JSONObject jso=new JSONObject(jz);   //this class  is used to fromat the data ino strinf
    	
    	
    	
		  given()
		  .contentType("appliction/json")
		  .body(jso.toString())         //we need to convert data intp string that will be converted into Json Format
		
		.when()
		   .post("http://localhost:3000/students")
		  .then()
		  .statusCode(201)
		  .body("name",equalTo("shiva"))
		  .body("employee",equalTo("CEO"))
		  .body("course[0]",equalTo("c"))
		  .body("course[1]",equalTo("java"))
		  .header("content-Type","application/json; charset=utf-8")
		  .log().all();
		  
	}
	
	@Test(priority=2)
	public void deleteuserofjson()
	{
		when()
		   .delete("http://localhost:3000/students/5")
		
		.then()
		  .statusCode(200)
		  .log().all();
	
	
}
}
