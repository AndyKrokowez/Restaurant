package model;
public class Table {

	private int tableNumber;
	private int capacity;
	private boolean booked;
	private Customer bookedBy;
	
	public Table(int tableNumber) {
		
		this.tableNumber = tableNumber;
		this.capacity = 4;
		this.booked = false;
		this.bookedBy = null;
		
		
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isBooked() {
		return booked;
	}

	public Customer getBookedBy() {
		return bookedBy;
	}

	public boolean book(Customer customer) {
		if(booked) {
			return false;
			
		} else {
			
			this.booked = true;
			this.bookedBy = customer;
			return true;
		}
	
	}
	
	public String toString(){
		String toReturn = "This is table number " + tableNumber + " for " + capacity + " people.";
		
		if (booked) {
			toReturn += "The table is booked by " + bookedBy;
		}
		
		return toReturn;
	}
	
	
	
}
