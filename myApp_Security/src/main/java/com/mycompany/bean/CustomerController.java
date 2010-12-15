package com.mycompany.bean;

import java.util.List;


import com.mycompany.dao.ICustomerDao;
import com.mycompany.entity.Customer;
import com.mycompany.entity.CustomerOrder;

/**
 * @author abdelkafi_s
 *
 */
public class CustomerController {
	
		private ICustomerDao customerDao;
	
	    private String customerId;


	    private String taxId;


	    private String name;


	    private String adresse;


	    private String city;


	    private String state;


	    private String zip;


	    private String phone;


	    private List<CustomerOrder> customerOrders;
	    
	    private List<Customer> customers;
	    
	    
	    
	    public void save(){
	    	Customer customer= new Customer(Integer.parseInt(taxId), name, adresse, city, state, zip, phone, null);
	    	customerDao.save(customer);
	    	
	    }



		public ICustomerDao getCustomerDao() {
			return customerDao;
		}


		public void setCustomerDao(ICustomerDao customerDao) {
			this.customerDao = customerDao;
		}


		public String getCustomerId() {
			return customerId;
		}


		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}


		public String getTaxId() {
			return taxId;
		}


		public void setTaxId(String taxId) {
			this.taxId = taxId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAdresse() {
			return adresse;
		}


		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getZip() {
			return zip;
		}


		public void setZip(String zip) {
			this.zip = zip;
		}


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public List<CustomerOrder> getCustomerOrders() {
			return customerOrders;
		}


		public void setCustomerOrders(List<CustomerOrder> customerOrders) {
			this.customerOrders = customerOrders;
		}



		public List<Customer> getCustomers() {
			customers = (List<Customer>) customerDao.getAll();
			return customers;
		}



		public void setCustomers(List<Customer> customers) {
			this.customers = customers;
		}

		
}
