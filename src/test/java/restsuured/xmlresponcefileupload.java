package restsuured;
import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;


/* https://restapi.adequateshop.com/api/Traveler?page=1
 * 
 * This site will return thr response in the XML format so we are using this for xml validation
 * 
 * validating the response body of xml is same as dat of the json bt we will use here xmlobject class to validat 
 * more fields 
 * 
 * File upload--session 5 of Rest Assured
 * To upload files through API we should have one jar file(file-upload-RestApI.jar) in C DRIVER (or) any where else in local system
	 * open command prompt and enter this command to run this jar API which is developed using spring boot application
	 * 
	 * java -jar file upload-RestAPI.jar +enter.
	 * 
	 * And this RestApi jar file is developed using springboot application
	 * then we need to pass the url link mentioned below in google and can upload the file (This is a GUI testing)
	 * 
	 * But to do the API testinf for file upload 
	 * open postman----in Url section mention URL mentioned below
	 * the go to body----form data----key (seelct-file) value(choose-file)
	 * if u choose text in key u  need to mention the file name in value type and response will be given in console
	 * we  can do some validation from dat response
	 * 
	 * 
	 * upload file through API URL http://localhost 8080/uploadfile ---to upload single file
	 * upload file through API URL http://localhost 8080/uploadmultiplefile ---to upload multiple file
	 * 
	 * To upload go to body section n go to form data
	 * parameter key-file  name-file value-the file which is going to be upload (for single file)
	 * parameter key-files  name-file value-the file which is going to be upload (for multiple file)
	 * after upload save and send request.
	 * if u select text instead of files u have to give path in the form of text.
	 * 
	 * 
	 * The uploaded fils can see in C driver ---upload folder it is automatically created by default
	 * 
 * 
 */
public class xmlresponcefileupload {

	@Test
	public void fileupload()
	{
		File myfile=new File("c:\\Automation\\Text1.txt");    //we need to create this file under the automationpractice folder with name text1.txt
		
            given()
            .multiPart("file",myfile)       //this refers to the form data in body in postman
            .contentType("multipar/form-data")
		
		 .when()
		   .get("http://localhost:8080/UploadFile")
		    
		
		.then()
		  .statusCode(200)
		    .body("filename",equalTo("Text1.txt"))
		    .log().all();	
	}
	
	
	
	@Test
	public void fileuploads()    //doesnt work for All Apis
	{
		File myfile1=new File("c:\\Automation\\Text1.txt");    //we need to create this file under the automationpractice folder with name text1.txt
		File myfile2=new File("c:\\Automation\\ext2.txt");    //we need to create this file under the automationpractice folder with name text1.txt
		
		File Filearr[]= {myfile1,myfile2};   //u can pass variable namein multipart instead of passin multi files 
		
            given()
            .multiPart("files",myfile1)       //this refers to the form data in body in postman
            .multiPart("files",myfile2)       //this refers to the form data in body in postman
            //multipart("files"filearr)       //giving filearr ata time

            .contentType("multipar/form-data")
		
		 .when()
		   .get("http://localhost:8080/UploadMultipleFiles")
		    
		
		.then()
		  .statusCode(200)
		    .body("[0].filename",equalTo("Text1.txt"))
		    .body("[1].filename",equalTo("Text2.txt"))

		    .log().all();	
	}
	
	@Test
	public void downloadfile()
	{
		given()
		
		.when()
		   .get("https://localhost:8080/downloadFile/Text1.txt")
		
		.then()
		  .statusCode(200)
		    .log().all();
		 
			
	}
	
	
	
}
