package restsuured;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class getuser {

	@Test
	public void guser(ITestContext context) {
		
		
		int id = (Integer) context.getSuite().getAttribute("user_id");  //this id value should come form createruser class
		//as the retuen type of getattibute is object so we are converting object to int and assing value as int(Typecasting)

	String s=new String("436db33d3ce350456d7f970e9597f381efb2cefe5e005060d4ad6563397c6232");

	          given()
	          .headers("Authorization","Bearer "+s)
	          .pathParam("id",id)
	
	             .when()
	                 .get("https://reqres.in/api/users/{id}")
	
	                .then()
	                .log().all();
	 

	
	}
}
