package restsuured;
import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class deleteuser {
	
	@Test
	public void duser(ITestContext context)
	{
		String s=new String("436db33d3ce350456d7f970e9597f381efb2cefe5e005060d4ad6563397c6232");

		int id = (Integer) context.getSuite().getAttribute("user_id");  
		
		  given()
          .headers("Authorization","Bearer "+s)
          .pathParam("id",id)

             .when()
                 .delete("https://reqres.in/api/users/{id}")

                .then()
                .statusCode(204)
                 .log().all();
 

	}

}
