package package1;
public class Customer {
	private String customerId;
	private String customerName;
	protected float discountPercentage;
	public Customer(String custId, String custName) {
		this.customerId = custId;
		this.customerName = custName;
	}
	protected void displayCustomerDetails() {
		System.out.println("Displaying Customer details \n***************************");
		System.out.println("Customer Id: " + this.customerId);
		System.out.println("Customer Name: " + this.customerName);
	}
}
