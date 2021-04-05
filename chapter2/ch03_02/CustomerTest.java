package ch03_02;

public class CustomerTest {

	public static void main(String[] args) {
		
		/*
		Customer customerLee= new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint= 1000;
		System.out.println(customerLee.showCustomerInfo());
		*/
		
		VIPCustomer customerKIM= new VIPCustomer();
		customerKIM.setCustomerName("이순신");
		customerKIM.setCustomerID(10020);
		customerKIM.bonusPoint= 10000;
		System.out.println(customerKIM.showCustomerInfo());
	}

}
