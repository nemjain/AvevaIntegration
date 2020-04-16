package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class OrderLine {
	private String orderLineId;
	private Order order;
	private Product product;
	private String chargingType;
	private String shippingAddress;
	private ChargingPlan chargingPlan;
	JsonPath jp;
	
	public OrderLine(String jsonData) {
		jp=new JsonPath(jsonData);
		this.setOrderLineId(jp.getString("orderLine.orderLineId"));
		this.setChargingType(jp.getString("orderLine.chargingType"));
		this.setShippingAddress(jp.getString("orderLine.shippingAddress"));
		
		Order order=new Order(jsonData);
		this.setOrder(order);
		
		Product product=new Product(jsonData);
		this.setProduct(product);
		
		ChargingPlan chargingPlan=new ChargingPlan(jsonData);
		this.setChargingPlan(chargingPlan);
	}
	public String getOrderLineId() {
		return orderLineId;
	}
	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getChargingType() {
		return chargingType;
	}
	public void setChargingType(String chargingType) {
		this.chargingType = chargingType;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public ChargingPlan getChargingPlan() {
		return chargingPlan;
	}
	public void setChargingPlan(ChargingPlan chargingPlan) {
		this.chargingPlan = chargingPlan;
	}
	

}
