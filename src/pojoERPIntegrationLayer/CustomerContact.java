package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class CustomerContact {
	private String name;
	private String email;
	private String role;
	JsonPath jp;
	public CustomerContact(String jsonData) {
		jp=new JsonPath(jsonData);
		
		this.setEmail(jp.getString("customer.customerContact.email"));
		this.setName(jp.getString("customer.customerContact.name"));
		this.setRole(jp.getString("customer.customerContact.role"));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
