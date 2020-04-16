package testERPIntegrationLayer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;
import pojoERPIntegrationLayer.StatusInfo;
import pojoERPIntegrationLayer.UpdateOrderFulfillmentStatus;


public class ValidateUpdateOrderFulfillmentStatus {
	//static JsonPath jp;
	 static String inputJsonData;
	
public static void main(String[] args) {
		// TODO Auto-generated metJhod stub
		
         inputJsonData="{\"statusId\":200,\"statusInfo\":{\"dateFulfilled\":\"14-APR-2020\",\"deliveryMethod\":\"Design-Bid-Build\"}}";
		// jp=new JsonPath(inputJsonData);
	
		 UpdateOrderFulfillmentStatus ob=new UpdateOrderFulfillmentStatus(inputJsonData);
		
		// To print the output values in json format
	ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(ob);
            System.out.println("JSON = " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
	}

}
}
