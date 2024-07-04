package restsuured;

import org.testng.annotations.Test;

import com.github.javafaker.Business;
import com.github.javafaker.Faker;

public class Fakerlibrary {
	
	/*------------Faker Library--------------
	 * It is a library which is ised to generate dummy data whoch is required for testing the APIS
	 * To do that we need to add this dependency library to our project.
	 * Then we need to create the object to this class with that object we create many fields like full name,firstname,lastname,
	 * address,phone number etc.
	 * 
	 */
	
	@Test
	void fakedata()
	{
		Faker fake=new Faker();
	String fullanme=fake.name().fullName();
	String fname=fake.name().firstName();
	String lname=fake.name().lastName();
	String uname=fake.name().username();
	String pwd=fake.internet().password();
	Business bs=fake.business();
	
	
	System.out.println(fullanme);
	System.out.println(fname);
	System.out.println(lname);
	System.out.println(uname);
	System.out.println(pwd);
	System.out.println(bs);

	
	
	
		
	}
	


}
