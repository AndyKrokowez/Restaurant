package model;

public class Customer {

	private String name;
	private String number;
	
	public Customer() {
		System.out.println("This is a new customer");
		this.name = "Anderson";
		this.number = "0851844386";
		
		
	}
	
	public Customer(String name, String number) {
		this.name = name;
		this.number = number;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return "This is the customer " + name;
		
	}
	
	
}
