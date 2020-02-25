import model.Customer;
import model.Table;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer("Antonio", "985142064");
		
		//j;adj;j;j;adgoium roiu oiru oierg;lkjfd
		
		System.out.println(c1.getName());
		System.out.println(c1.getNumber());
		
		c2.setName ("Joseph");
		
		System.out.println(c2.getName());
		System.out.println(c2.getNumber());
		
		System.out.println(c3.getName());
		System.out.println(c3.getNumber());
		
		Table t1 = new Table(10);
		Table t2 = new Table(15);
		Table t3 = new Table(20);
		Table t4 = new Table(25);
		
		System.out.println(t1.isBooked());
		System.out.println(t1.getBookedBy());
		
		boolean result;
		result = t1.book(c1);
		System.out.println("The booking was "+result);
		System.out.println(t1.isBooked());
		System.out.println(t1.getBookedBy());
		
		result = t1.book(c2);
		System.out.println("The booking was "+result);
		System.out.println(t1.isBooked());
		System.out.println(t1.getBookedBy());
		
		t2.book(c3);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);

	}

}
