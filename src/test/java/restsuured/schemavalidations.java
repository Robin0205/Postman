package restsuured;
import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;


public class schemavalidations {
	 
	//--------------SESSION-----------------
	
	/*schema is data type of the fields in json or xml that is called schema
	 * Response and schema validations are different
	 * in schema validation we will focus on type the data
	 * in response validation we will foucus on data
	 * 
	 * we need to convert the JSON Response from Json to json schema to dat we need to use 
	 * ------JSONFORMATTER---------IN google that will convert into schema and we need to doenload dat 
	 * and need to add unser resource file in our present working project
	 * -------POSTMAN supports only JSON SCHEMA validation not XML schmea validation
	 * 
	 * we can do it in rest assured
	 * */
	 
	//jsonresponse(.json)--jsonschema(.json format)
	//xmlresponse(.xml)---xmlschmea(.xsd)
	
	@Test
	public void schemavalid()
	{

		given()
		
		.when()
		   .get("http://localhost:3000/Books")
		
		.then()
		.statusCode(200)
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonschemav.json") );
		 

	}

}
