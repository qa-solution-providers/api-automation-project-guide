package stepdefinitions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://api.openweathermap.org/data/2.5/weather";
		RequestSpecification rspec = RestAssured
		    	.given()
		    		.queryParam("q", "New York,N@@Y,840")
		    		.queryParam("appid", "b68f91adb4c89dc7becdf965c6087bb5");
		Response res = rspec.get();
		System.out.println(res.getStatusLine());
		

	}

}
