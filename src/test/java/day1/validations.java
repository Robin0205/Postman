package day1;

public class validations {

	/*---Response validation---------
	 * status code
	 * cookies
	 * headers
	 * response time
	 * response body
	 * Data size
	 * 
	 * ASSERTATIONS can be used to validate response
	 * To do this validations we can addd assertion library called(pm)
	 * By adding functins of this library we can validate the response from the server
	 * These functions retrun by using javascript type
	 * 
	 * 
	 * we should write functions by wrting java script functions inside dat we have to call functions
	 * 
	 * There are 2 types of functions
	 * 1.Normal function
	 * 2.Arrow functions                      
	 * 
	 * 
	 * chai.Assertions Library(it is framework of javascript)
	 * -----------------------------------------------------
	 * 
	 * pm.test("Test Name",functions()                 --------------Normal functions
	 *            {
	 *            
	 *            //assertion;
	 *            }
	 *      );
	 *            
	 *            
	 *      pm.test("Test Name",() =>            -----------------Arrow functions
	 *            {
	 *            
	 *            //assertion;
	 *            }
	 *      );       
	 *   
	 *-----inside the test tab in postman we have to add validations points
	 *
	 * -------------------------- Test for the response code:--------------------------
	 *
	 *  
	 *  pm.test("status code is 200",()=> 
	 *  {
	 *     pm.response.to.have.status(200);
	 *  }
	 *  );
	 *  
	 *   
	 *  if you want to test for the status code being one of a set,include them all in an array and use one of 
	 *  -------------------------------------------------------------------------------------------------------
	 *  
	 *  pm.test("successful POST request",()=> 
	 *  {
	 *   pm.expect(pm.response.code).to.be.oneof([200,201]);
	 *  }
	 *  );
	 *  
	 *  
	 * check the status code text:
	 * ---------------------------
	 * 
	 * 
	 *  pm.test("status code name has string  ",()=> 
	 *  {
	 *   pm.response.to.have.status("created");
	 *  }
	 *  );
	 *  
	 *  
	 *  
	 *--------------------------Testing Headers---------------------
	 *
	 *
	 *CHECK THAT RESPONSE HEADERS PRESENT
	 *
	 *-----------------------------------
	 *pm.test("contant-Type header is presnet", () =>
	 *  {
	 *   pm.response.to.have.header("contant-Type");
	 *   
	 *   
	 *   )};
	 * 
	 *            
	 * Test for a response header having a particular value:
	 * ----------------------------------------------------
	 * 
	 * pm.test("contant-Type header is applicaiotn/json", () =>
	 *  {
	 *  
	 *  pm.expect( pm.response.header.get('contant-type')).to.equal('application/json; charset=utf-8');
	 *   
	 *   )};
	 *   
	 *   
	 *   -----------------Testing cookies-----------------(we need to verify cookie  and its value)
	 *   
	 *   Test if a cookie present in the response
	 *   ---------------------------------------
	 *   
	 *   pm.test("cookie ' language' is present",() =>
	 *   {
	 *   pm.test ( pm.cookie.has('language')).to.be.true; 
	 *   });
	 *   
	 * 
	 * 
	 * Test for a particular cookie value
	 * ----------------------------------
	 * 
	 * pm.test("cookie language hav value 1",() =>
	 *   {
	 *   pm.test ( pm.cookie.get('language')).to.be.eql('en-gb'); 
	 *   });
	 *   
	 * 
	 *  -------------------------Testing response time--------------
	 * 
	 * Test for the response time to be within a specified range:
	 * ----------------------------------------------------------
	 * pm.test("Response time is less than 200ms",() =>
	 * 
	 *   {
	 *   pm.expect ( pm.response.responseTime).to.be.below(2000);    //we can use above or below 
	 *   });
	 * 
	 * 
	 *                --------------------	Testing Response Body----------------
	 * 
	 * to validate response body different methods are present,in validating the resposne body json path will play cruial role
	 * 
	 * Asserting  a value type
	 * --------------------------
	 * Test the type of the any part of the response:
	 * {
	 * 
	 *  "id" :        1,                          ---------------these all are different fields
	 *  "name " :    "John",
	 *  "location" : "India",
	 *  "phone" :    "1234567890"
	 *  "ourses" :  ["java","selenium"]
	 *    
	 *    }
	 *    
	 * This is the multiple validations should be write for multiple fields to validate them
	 * 
	 * 
	 * const jsonData= pm.response.json(); ----------------response from json body will be copied in thid variable(jsondata)
	 * pm.test("Test data type of response ", ()=>
	 *    {
	 *      pm.expect(jsonData).to.be.an("Object");
	 *      pm.expect(jsonData.name).to.be.an("string");
	 *      pm.expect(jsonData.id).to.be.an("number");
	 *      pm.expect(jsonData.courses).to.be.an("array");
	 *    
	 *    ) 
	 *     }; 
	 *      
	 *   Asserting array properties
	 *   ---------------------------
	 *   
	 *   Check if any array is empty and if it contains particular name:
	 *   
	 *   {
	 * 
	 *  "id" :        1,                          ---------------these all are different fields
	 *  "name " :    "John",
	 *  "location" : "India",
	 *  "phone" :    "1234567890"
	 *  "courses" :  ["java","selenium"]
	 *    
	 *    }
	 *    
	 *    
	 *    pm.test("Test array properties", ()=> {
	 *        //courses includes "java"
	 *      pm.expect(jsonData.courses).to.include("java");
	 *       //coursesarray must include all listed
	 *      
	 *       pm.expect(jsonData.courses).to.have.members(["java","selenium"]);
	 *      
	 *    }};
	 *    
	 *    
	 *    validating json fields in Response
	 *    -----------------------------------------
	 *    
	 *   
	 *    {
	 * 
	 *  "id" :        1,                          ---------------these all are different fields
	 *  "name " :    "John",
	 *  "location" : "India",
	 *  "phone" :    "1234567890"
	 *  "ourses" :  ["java","selenium"]
	 *    
	 *    }
	 *    
	 *    pm.test("value of location field is India", ()=> {
	 *    var jsonData=pm.response .json();
	 *    pm.expect(jsonData.id).to.eql(1),
	 *    pm.expect(jsonData.name).to.eql("John"),
	 *    pm.expect(jsonData.location).to.eql("India"),
	 *    pm.expect(jsonData.phone).to.eql("1234567890"),
	 *    pm.expect(jsonData.courses[0]).to.eql("java"),
	 *    pm.expect(jsonData.courses[1]).to.eql("selenium"),
	 *    }
	 *    )
	 *    };
	 *    
	 *   
	 * ---------------------Json Schema---------------------
	 * schema means designing of data in table once the schmea designs storing integer , in dat place we cannot store string
	 * we can generate the json schemna by seacrhing json schema in browser and paste the json data thjere it will create the json schemna .
	 * 
	 *        validating JSON schemea
	 *        --------------------------
	 * Responses 
	 * 
	 *    {
	 * 
	 *  "id" :        1,                          ---------------these all are different fields
	 *  "name " :    "John",
	 *  "location" : "India",
	 *  "phone" :    "1234567890"
	 *  "ourses" :  ["java","selenium"]
	 *    
	 *    }
	 *    
	 *    
	 * json schema
	 * var schema={
	 *   "schema": "http://json-schema.org/draft-04/schema",
	 *   "type": "object",
	 *   "properties":
	 *   "id" : ("type":"integer"),
	 *   "name": ("type":"string"),
	 *   "location":("type":"string")
	 *    "phone":("type":"string"),
	 *    "courses":("type":"array",
	 *    "iteams":{("type" :"string"), ("type",:"string"))
	 *    )
	 *    )
	 *    ),
	 *    "required": {"id","nanme","phone","course"));
	 *    
	 *    
	 *   Json schmea validation             ---------------tv4 ia a library in postman like pm
	 *   ---------------------------
	 *   pm.test("schema ia valid", ()=>
	 *   {pm.expect(tvd.vlidation(jsonData, schema).to.be.true;
	 *   }
	 *   );
	 *    
	 * 
	 * 
	 * 
	 */

}
