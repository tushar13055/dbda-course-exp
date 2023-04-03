
public class Customer {
	private String name, email;
	private int age;
	private double creditLimit;
	
	String getCustomerDetails(String name, String email, int age, double creditLimit) {
		return ("Name: " + name + " Email: " + email + " Age: " + age + " Credit Limit: " + creditLimit);
	}
}
