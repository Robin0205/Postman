package restsuured;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class updateuser {
	
	@Test
	public void uuser(ITestContext context)
	{
		Faker fk=new Faker();
		JSONObject dt=new JSONObject();
		
		dt.put("name",fk.name().fullName() );
		dt.put("gender","Male" );
		dt.put("email",fk.internet().emailAddress() );
		dt.put("status","active");
		
		String s=new String("436db33d3ce350456d7f970e9597f381efb2cefe5e005060d4ad6563397c6232");
		
		int id = (Integer) context.getSuite().getAttribute("user_id");  
		
             given()
              .contentType("application/json")
              .header("Authorization","Bearer "+s)
              .body(dt.toString())  //when ur passing json data we must use tostring method
              .pathParam("id",id)
		
		     .when()
		    .put("https://reqres.in/api/users/{id}")
		   
		    
		    .then()
		    .statusCode(200)
		     .log().all();
		
		
		
	}

}
