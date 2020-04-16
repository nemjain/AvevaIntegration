package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class Customer {
	private String legacyCustomerCode;
	private String accountNumber;
	private CustomerContact customerContact;
	private String companyName;
	private CustomerAddress customerAddress;
	JsonPath jp;
	public Customer(String jsonData) {
		jp=new JsonPath(jsonData);
		
		this.setLegacyCustomerCode(jp.getString("customer.legacyCustomerCode"));
		this.setAccountNumber(jp.getString("customer.accountNumber"));
		this.setCompanyName(jp.getString("customer.companyName"));
		
		CustomerContact customerContact=new CustomerContact(jsonData);
		this.setCustomerContact(customerContact);
		
		CustomerAddress customerAddress=new CustomerAddress(jsonData);
		this.setCustomerAddress(customerAddress);
	
	}
	public String getLegacyCustomerCode() {
		return legacyCustomerCode;
	}
	public void setLegacyCustomerCode(String legacyCustomerCode) {
		this.legacyCustomerCode = legacyCustomerCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public CustomerContact getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(CustomerContact customerContact) {
		this.customerContact = customerContact;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	

}
