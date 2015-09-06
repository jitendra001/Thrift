package customer.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.thrift.TException;

import customer.service.CustomerService.Iface;

public class CustomerServiceHandler implements Iface {
	
	private static List<Customer> customers = createCustomers();

	@Override
	public Customer getCustomer(int customerId) throws CustomerUnavailable, TException {
		Customer cus = null;
		for(Customer c : customers){
			if(c.getCustomerId() == customerId){
				cus = c;
				return cus;
			}
		}
		
		if(cus==null){
			CustomerUnavailable unavailable  = new CustomerUnavailable();
			unavailable.setMessage("Customer Not Found!");
			throw new CustomerUnavailable(unavailable);
		}
		return cus;
		
	}

	private static List<Customer> createCustomers() {
		Customer c1 = new Customer(1, "Customer 1", "Address 1");
		Customer c2 = new Customer(2, "Customer 2", "Address 2");
		Customer c3 = new Customer(3, "Customer 3", "Address 3");
		Customer c4 = new Customer(4, "Customer 4", "Address 4");
		Customer c5 = new Customer(5, "Customer 5", "Address 5");
		Customer c6 = new Customer(6, "Customer 6", "Address 6");
		Customer c7 = new Customer(7, "Customer 7", "Address 7");
		Customer c8 = new Customer(8, "Customer 8", "Address 8");
		Customer c9 = new Customer(9, "Customer 9", "Address 9");
		List<Customer> customer = new ArrayList<>();
		customer.add(c1);
		customer.add(c2);
		customer.add(c3);
		customer.add(c4);
		customer.add(c5);
		customer.add(c6);
		customer.add(c7);
		customer.add(c8);
		customer.add(c9);
		return customer;
	}

}
