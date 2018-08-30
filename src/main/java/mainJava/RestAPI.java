package mainJava;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;

public class RestAPI {
	RequestSpecification httpRequest;
	Response response;
	ResponseBody responseBody;
	String name;
	String URI="http://localhost:3000/employees/"; 
	Map<String,String> headers=new HashMap<String,String>();


	
public void getRequest(){
			RestAssured.baseURI=URI;
			httpRequest = RestAssured.given();
			response = httpRequest.get("/3");
			responseBody=response.getBody();
			JsonPath jsonPath=response.jsonPath();
			name=jsonPath.get("first_name");
			System.out.println(name);
			System.out.println(responseBody.asString());
			System.out.println("Status code--"+response.getStatusCode());
		
	}


public void postRequest() throws JsonProcessingException{
	headers.put("Content-Type","application/json");
	RestAssured.baseURI=URI;
	httpRequest = RestAssured.given();
	JSONObject requestParam=requestParam(8,"Nitesh","Jaiswal","niteshjaiswal.gmail.com");
	httpRequest.header("Content-Type", "application/json");
	httpRequest.body(requestParam.toString());
	response = httpRequest.post();
	System.out.println(response.getStatusCode());
	}


public void putRequest(){
	headers.put("Content-Type","application/json");
	RestAssured.baseURI=URI;
	httpRequest = RestAssured.given();
	JSONObject requestParam=requestParam(8,"Jyotiram","GhadgeJI","jyotiramghadge.gmail.com");
	httpRequest.header("Content-Type", "application/json");
	httpRequest.body(requestParam.toString());
	response = httpRequest.put("/8");
	System.out.println(response.getStatusCode());
}

@Test
public void deleteRequest(){
	headers.put("Content-Type","application/json");
	RestAssured.baseURI=URI;
	httpRequest = RestAssured.given();
	response = httpRequest.delete("/8");
	responseBody=response.getBody();
	System.out.println(response.getStatusCode());
	System.out.println(responseBody.asString());
}

public JSONObject requestParam(int num,String firstName,String lastName,String email) {
	JSONObject requestParameter=new JSONObject();
	requestParameter.put("id",num);
	requestParameter.put("first_name", firstName);
	requestParameter.put("last_name", lastName);
	requestParameter.put("email", email);
	return requestParameter;
}
}
