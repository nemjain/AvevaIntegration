package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class UpdateOrderFulfillmentStatus {
	private int statusId; 
	private StatusInfo statusInfo;
	JsonPath jp;
	
	public UpdateOrderFulfillmentStatus(String jsonData)
	{
		    jp=new JsonPath(jsonData);
		    
		    
			this.setStatusId(jp.getInt("statusId"));
			StatusInfo statusInfo=new StatusInfo(jsonData);
			
			this.setStatusInfo(statusInfo);
			
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int i) {
		this.statusId = i;
	}
	public StatusInfo getStatusInfo() {
		return statusInfo;
	}
	public void setStatusInfo(StatusInfo statusInfo) {
		this.statusInfo = statusInfo;
	}
	
	
	
	

}
