package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class ChargingPlan {
	private String startDate;
	private String endDate;
	private String unitType;
	private String unitsBought;
	private String feeType;
	private String productVersionList;
	private boolean usageReportingSystem;
	JsonPath jp;
	public ChargingPlan(String jsonData) {
		jp=new JsonPath(jsonData);
		this.setStartDate(jp.getString("orderLine.chargingPlan.startDate"));
		this.setEndDate(jp.getString("orderLine.chargingPlan.endDate"));
		this.setUnitType(jp.getString("orderLine.chargingPlan.unitType"));
		this.setUnitsBought(jp.getString("orderLine.chargingPlan.unitsBought"));
		this.setFeeType(jp.getString("orderLine.chargingPlan.feeType"));
		this.setProductVersionList(jp.getString("orderLine.chargingPlan.productVersionList"));
		this.setUsageReportingSystem(jp.getBoolean("orderLine.chargingPlan.usageReportingSystem"));
	}
	public boolean isUsageReportingSystem() {
		return usageReportingSystem;
	}
	public void setUsageReportingSystem(boolean usageReportingSystem) {
		this.usageReportingSystem = usageReportingSystem;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public String getUnitsBought() {
		return unitsBought;
	}
	public void setUnitsBought(String unitsBought) {
		this.unitsBought = unitsBought;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public String getProductVersionList() {
		return productVersionList;
	}
	public void setProductVersionList(String productVersionList) {
		this.productVersionList = productVersionList;
	}
	/*public Boolean getUsageReportingSystem() {
		return usageReportingSystem;
	}
	public void setUsageReportingSystem(Boolean usageReportingSystem) {
		this.usageReportingSystem = usageReportingSystem;
	}*/
	

}
