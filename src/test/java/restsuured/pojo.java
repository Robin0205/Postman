package restsuured;

public class pojo {
	
	
	/*--------------POJO----(Plane old java object----------------
	 * In order to preapre the data by using pojo class we have to create the pojo cls separately 
	 * and need to prepare the data to setter and getter methods also as like encapsulation wrapping both the
	 * variables and function in one class. Then we need to create the object for this pojo class in the postbody
	 * and need to call this data.
	 *  
	 */
     
	//here method string accept the value and assign to the class name variable as both the variable names are same
	//this keyword is used which is pointing towards clas variable only though both have same name
	
	String name;
	String employee;
	String course[];

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
}
