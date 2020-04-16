package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class CustomerAddress {
	private String id;
	private String address;
	private String addressLine2;
	private String addressLine3;
	private String addressLine4;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	JsonPath jp;
	public CustomerAddress(String jsonData) {
		jp=new JsonPath(jsonData);
		this.setId(jp.getString("customer.customerAddress.id"));
		this.setAddress(jp.getString("customer.customerAddress.address"));
		this.setAddressLine2(jp.getString("customer.customerAddress.addressLine2"));
		this.setAddressLine3(jp.getString("customer.customerAddress.addressLine3"));
		this.setAddressLine4(jp.getString("customer.customerAddress.addressLine4"));
		this.setCity(jp.getString("customer.customerAddress.city"));
		this.setState(jp.getString("customer.customerAddress.state"));
		this.setPostalCode(jp.getString("customer.customerAddress.postalCode"));
		this.setCountry(jp.getString("customer.customerAddress.country"));
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getAddressLine4() {
		return addressLine4;
	}
	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
