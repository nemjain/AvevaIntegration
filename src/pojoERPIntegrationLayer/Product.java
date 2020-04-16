package pojoERPIntegrationLayer;

import io.restassured.path.json.JsonPath;

public class Product {
	private String productCode;
	private String versioning;
	private String legacyProductCode;
	private String commercialName;
	private String productClass;
	private String status;
	private String comments;
	JsonPath jp;
	public Product(String jsonData) {
		jp=new JsonPath(jsonData);
		this.setProductCode(jp.getString("orderLine.product.productCode"));
		this.setVersioning(jp.getString("orderLine.product.versioning"));
		this.setLegacyProductCode(jp.getString("orderLine.product.legacyProductCode"));
		this.setCommercialName(jp.getString("orderLine.product.commercialName"));
		this.setProductClass(jp.getString("orderLine.product.productClass"));
		this.setStatus(jp.getString("orderLine.product.status"));
		this.setComments(jp.getString("orderLine.product.comments"));
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getVersioning() {
		return versioning;
	}
	public void setVersioning(String versioning) {
		this.versioning = versioning;
	}
	public String getLegacyProductCode() {
		return legacyProductCode;
	}
	public void setLegacyProductCode(String legacyProductCode) {
		this.legacyProductCode = legacyProductCode;
	}
	public String getCommercialName() {
		return commercialName;
	}
	public void setCommercialName(String commercialName) {
		this.commercialName = commercialName;
	}
	public String getProductClass() {
		return productClass;
	}
	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	

}
