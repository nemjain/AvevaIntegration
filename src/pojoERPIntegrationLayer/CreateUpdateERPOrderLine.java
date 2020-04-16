package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class CreateUpdateERPOrderLine {
	private Customer customer;
	private OrderLine orderLine;
	private String licenceFactory;
	JsonPath jp;
	public CreateUpdateERPOrderLine(String jsonData) {
		jp=new JsonPath(jsonData);
	    
	    Customer customer=new Customer(jsonData);
		this.setCustomer(customer);
		OrderLine orderLine=new OrderLine(jsonData);
		this.setOrderLine(orderLine);
		this.setLicenceFactory(jp.getString("licenceFactory"));
		
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public OrderLine getOrderLine() {
		return orderLine;
	}
	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}
	public String getLicenceFactory() {
		return licenceFactory;
	}
	public void setLicenceFactory(String licenceFactory) {
		this.licenceFactory = licenceFactory;
	}
	

}
