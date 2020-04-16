package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class Order {
	private String orderId;
	private String orderDate;
	private Customer customer;
	private String orderStatus;
	private String salesContact;
	JsonPath jp;
	public Order(String jsonData) {
		jp=new JsonPath(jsonData);
		this.setOrderId(jp.getString("orderLine.order.orderId"));
		this.setOrderDate(jp.getString("orderLine.order.orderDate"));		
		this.setOrderStatus(jp.getString("orderLine.order.orderStatus"));
		this.setSalesContact(jp.getString("orderLine.order.salesContact"));
		
		Customer customer=new Customer(jsonData);
		this.setCustomer(customer);
		
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getSalesContact() {
		return salesContact;
	}
	public void setSalesContact(String salesContact) {
		this.salesContact = salesContact;
	}
	

}
