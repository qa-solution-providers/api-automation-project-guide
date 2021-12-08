package stepdefinitions;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.ErrResponsePojo;
import pojo.ValidResponsePojo;

public class Get_Current_Weather_Data_For_One_Location {
	
	RequestSpecification rSpec;
	Response res;

	@Given("User navigates to weather website")
	public void userNavigatesToWeatherWebsite() {
		RestAssured.baseURI = "https://api.openweathermap.org/data/2.5/weather";
	}

	@Given("Query Param {string} is {string} and {string} is {string}")
	public void queryParamIsAndIs(String id, String idVal, String apiKey, String apiKeyVal) {
		rSpec =  RestAssured
	    	.given()
	    		.queryParam(id, idVal)
	    		.queryParam(apiKey, apiKeyVal);
	}

	@Given("Query Param {string} is {string}, {string} is {string} and {string} is {string}")
	public void queryParamIsIsAndIs(String lat, String latVal, String lon, String lonVal, String apiKey, String apiKeyVal) {
		rSpec =  RestAssured
		    	.given()
		    		.queryParam(lat, latVal)
		    		.queryParam(lon, lonVal)
		    		.queryParam(apiKey, apiKeyVal);
	}



	
	@When("I execute {string} request")
	public void iExecuteRequest(String string) {
	    
		if(string.equalsIgnoreCase("GET")) {
			 res = rSpec.get();
		}else if (string.equalsIgnoreCase("POST")) {
			res = rSpec.post();
		}else if (string.equalsIgnoreCase("PUT")) {
			res = rSpec.put();
		}else if (string.equalsIgnoreCase("OPTIONS")) {
			res = rSpec.options();
		}else if (string.equalsIgnoreCase("HEAD")) {
			res = rSpec.options();
		}
	}
		
	@Then("I verify the statuscode is {int}")
	public void iVerifyTheStatuscodeIs(Integer statusCode) {
	    res
	    	.then()
	    		.assertThat()
	    			.statusCode(statusCode)
	    		;
	}

	@And("I verify body contains {string} and {string}")
	public void iVerifyBodyWithIsAndIs(String cod, String message) {
		   
		ErrResponsePojo resObj = res
			.then()
		    	.extract().response().body().as(ErrResponsePojo.class);
		
		MatcherAssert.assertThat(resObj.getCod(), Matchers.equalTo(cod));
		MatcherAssert.assertThat(resObj.getMessage(), Matchers.equalTo(message));
		
		}

	@And("I verify body contains {string},{int},{double},{double}")
	public void iVerifyBodyContains(String name,int cod,Double lat, Double lon) {
		ValidResponsePojo resObj = res
				.then()
			    	.extract().response().body().as(ValidResponsePojo.class);
			
			MatcherAssert.assertThat(resObj.getName(), Matchers.equalTo(name));
			MatcherAssert.assertThat(resObj.getCod(), Matchers.equalTo(cod));			
			MatcherAssert.assertThat(resObj.getCoord().getLat(), Matchers.equalTo(lat));
			MatcherAssert.assertThat(resObj.getCoord().getLon(), Matchers.equalTo(lon));
			
	}


}