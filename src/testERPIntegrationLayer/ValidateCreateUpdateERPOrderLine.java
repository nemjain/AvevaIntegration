package testERPIntegrationLayer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoERPIntegrationLayer.ChargingPlan;
import pojoERPIntegrationLayer.CreateUpdateERPOrderLine;
import pojoERPIntegrationLayer.Customer;
import pojoERPIntegrationLayer.CustomerAddress;
import pojoERPIntegrationLayer.CustomerContact;
import pojoERPIntegrationLayer.Order;
import pojoERPIntegrationLayer.OrderLine;
import pojoERPIntegrationLayer.Product;

public class ValidateCreateUpdateERPOrderLine {

	static String inputJsonData;

	public static void main(String[] args) {
		
		inputJsonData="{\"customer\":{\"legacyCustomerCode\":\"10001\",\"accountNumber\":\"10001001\",\"customerContact\":{\"name\":\"david\",\"email\":\"david@abc.com\",\"role\":\"Customer\"},\"companyName\":\"TestComp\",\"customerAddress\":{\"id\":\"Customer Address\",\"address\":\"101,New Street\",\"addressLine2\":\"201,New Street\",\"addressLine3\":\"301,New Street\",\"addressLine4\":\"401,New Street\",\"city\":\"Bristol\",\"state\":\"UK\",\"postalCode\":\"BS11DB\",\"country\":\"England\"}},\"orderLine\":{\"orderLineId\":\"Ordln0001\",\"order\":{\"orderId\":\"Ord0001\",\"orderDate\":\"13-APR-2020\",\"customer\":{\"legacyCustomerCode\":\"10001\",\"accountNumber\":\"10001001\",\"customerContact\":{\"name\":\"david\",\"email\":\"david@abc.com\",\"role\":\"Customer\"},\"companyName\":\"TestComp\",\"customerAddress\":{\"id\":\"Customer Address\",\"address\":\"101,New Street\",\"addressLine2\":\"201,New Street\",\"addressLine3\":\"301,New Street\",\"addressLine4\":\"401,New Street\",\"city\":\"Bristol\",\"state\":\"UK\",\"postalCode\":\"BS11DB\",\"country\":\"England\"}},\"orderStatus\":\"New\",\"salesContact\":\"Michel\"},\"product\":{\"productCode\":\"P0001\",\"versioning\":\"1.0\",\"legacyProductCode\":\"LP0001\",\"commercialName\":\"Software product\",\"productClass\":\"L1\",\"status\":\"New\",\"comments\":\"Test\"},\"chargingType\":\"Annual\",\"shippingAddress\":\"100,Avenue 20, New Street\",\"chargingPlan\":{\"startDate\":\"12-APR-2020\",\"endDate\":\"11-APR-2021\",\"unitType\":\"Qty\",\"unitsBought\":\"Pound\",\"feeType\":\"Annual\",\"productVersionList\":\"PVL01\",\"usageReportingSystem\":true}},\"licenceFactory\":\"CALM2\"}\r\n" + 
				"";
		
		CreateUpdateERPOrderLine obj=new CreateUpdateERPOrderLine(inputJsonData);
		
		ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(obj);
            System.out.println("JSON = " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace(); }
		
				}

}
