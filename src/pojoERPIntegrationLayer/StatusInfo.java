package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class StatusInfo {
	
	private String dateFulfilled;
	private String deliveryMethod;
	JsonPath jp;
	
	public StatusInfo(String jsonData) {
		// TODO Auto-generated constructor stub
		jp=new JsonPath(jsonData);
		this.setDateFulfilled(jp.getString("statusInfo.dateFulfilled"));
		this.setDeliveryMethod(jp.getString("statusInfo.deliveryMethod"));
	}

	public String getDateFulfilled() {
		return dateFulfilled;
	}
	public void setDateFulfilled(String dateFulfilled) {
		this.dateFulfilled = dateFulfilled;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	
}
