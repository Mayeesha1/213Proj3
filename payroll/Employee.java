package payroll;

/**
The employee class holds all the main attributes of an employee. The employee object is created
and each employee has their own profile and payment.
@author mayeesha, rebecca
*/
public class Employee {
	private Profile profile; 
	private double payment;

	/**
	This constructor uses the Profile of an employee to connect the information 
	to the Profile class where all three attributes are held for each employee.
	@param profile to be added to each employee
	*/
	public Employee(Profile profile) {
	this.profile = profile;
	}
	
	/**
	This method gets the profile of an employee from the Profile class so it can be 
	used in other classes.
	@return profile of an employee
	 */
	public Profile getProfile() { 
		return profile;
	}
	
	/**
	This method is the method that the other classes with the same method will override 
	 */
	public void calculatePayment() { 
	//...
	}
	
	/**
	Setter method for the payment of an employee so the value can be set in other classes
	@param payment of an employee 
	*/
	public void setPayment(double payment) {
		this.payment=payment;
	}
	
	/**
	Getter method for the payment of an employee it can be used in other classes.
	@return payment of an employee
	 */
	public double getPayment() { 
		return payment;
	}
	
	/**
	Getter method for the department code of an employee from the profile class it can be 
	used in other classes.
	@return employee's department code (CS/IT/ECE)
	 */
	public String getdepCode() {
		return profile.getDepartment();
	}
	
	/**
	Getter method for the date hired from the profile class so it can be used in other 
	classes.
	@return employee's date hired
	 */
	public Date getDate() { 
		return profile.getDateHired();
	}
	
	/**
	This method checks if employee objects are equal and already in the database by comparing 
	one employee's profile with another, and returns boolean values accordingly.
	@param obj of type employee to check with another employee object
	@return true if employees are equal, false if not
	*/
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee employee=(Employee) obj;
			return employee.profile.equals(this.profile);
		}
		return false;
	}
	
	/**
	The method creates a string description of an employee and refers to the profile toString 
	method to apply polymorphism in order to to print the output without repetitive code
	@return string description
	*/
	@Override  
	public String toString() { 
		return profile.toString();
	} 
}