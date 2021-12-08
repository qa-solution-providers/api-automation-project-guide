#Author: samujjaldaschoudhury@gmail.com
Feature: Get Current Weather Data for one location based on available filter condition
  This feature file contains test scenarios for fetching Current Weather Data for one location
  based on City Id,City Name,Geographic Coordinates, Zip code

  Scenario Outline: Positive scenario for current weather details for one location based on City Id  
    Given User navigates to weather website
    And Query Param "id" is "<idVal>" and "appid" is "<appid>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statuscode>
    And I verify body contains "<name>",<cod>,<lat>,<lon>

  Examples: 
   |idVal|appid|httpMethod|statuscode|name|cod|lat|lon|
   |2172797|b68f91adb4c89dc7becdf965c6087bb5|GET|200|Cairns|200|-16.9167|145.7667|
   |2172797|b68f91adb4c89dc7becdf965c6087bb5|POST|200|Cairns|200|-16.9167|145.7667|

  Scenario Outline: Negative scenario for current weather details for one location based on City Id
    Given User navigates to weather website
    And Query Param "id" is "<idVal>" and "appid" is "<appid>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statuscode>   
    
  Examples:
		|idVal|appid|httpMethod|statuscode|
    |2172797|b68f91adb4c89dc7becdf965c6087bb5|PUT|405|
   	|2172797|junkappidkeydc7becdf965c6087bb54|GET|401|
   	|'/2^%2797/'|b68f91adb4c89dc7becdf965c6087bb5|GET|400|
   	
  Scenario Outline: Valid Get call for Current Weather Data for one location based on City Name
    Given User navigates to weather website
    And Query Param "q" is "<cityName>" and "appid" is "<apiKey>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statusCode> 	
  
  Examples:
		|cityName|apiKey|httpMethod|statusCode|
    |London|b68f91adb4c89dc7becdf965c6087bb5|GET|200|
   	|London|b68f91adb4c89dc7becdf965c6087bb5|POST|200|
   	|Thung Tako|b68f91adb4c89dc7becdf965c6087bb5|GET|200|
   	|Thung Tako|b68f91adb4c89dc7becdf965c6087bb5|POST|200|
   	
  Scenario Outline: Invalid Get call for Current Weather Data for one location based on City Name
    Given User navigates to weather website
    And Query Param "q" is "<cityName>" and "appid" is "<apiKey>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statusCode> 	
  
  Examples:
		|cityName|apiKey|httpMethod|statusCode|
    |holohooooo@!@|b68f91adb4c89dc7becdf965c6087bb5|GET|404|
   	|London|b68f91adb4c89dc7becinvalid6087bb5|GET|401|
   	
  Scenario Outline: Valid Get call for Current Weather Data for one location based on City Name, State Code and Country Code
    Given User navigates to weather website
    And Query Param "q" is "<locDetails>" and "appid" is "<apiKey>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statusCode> 
    
   Examples:
		|locDetails|apiKey|httpMethod|statusCode|
    |London,UK|b68f91adb4c89dc7becdf965c6087bb5|GET|200|
    |City of London,GB|b68f91adb4c89dc7becdf965c6087bb5|POST|200|
   	|New York,NY,840|b68f91adb4c89dc7becdf965c6087bb5|GET|200| 
   	|Newburgh,NY,840|b68f91adb4c89dc7becdf965c6087bb5|POST|200| 
   	
  Scenario Outline: Invalid Get call for Current Weather Data for one location based on City Name, State Code and Country Code
    Given User navigates to weather website
    And Query Param "q" is "<locDetails>" and "appid" is "<apiKey>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statusCode> 
    
  Examples:
		|locDetails|apiKey|httpMethod|statusCode|
    |Lond@!@on,UK|b68f91adb4c89dc7becdf965c6087bb5|GET|404|
   	|New York,N@@Y,840|b68f91adb4c89dc7becdf965c6087bb5|POST|200| 
   	
  Scenario Outline: Valid Get call for Current Weather Data for one location based on Geographic coordinates
    Given User navigates to weather website
    And Query Param "lat" is "<lat>", "lon" is "<lon>" and "appid" is "<apiKey>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statusCode> 
    
  Examples:
		|lat|lon|apiKey|httpMethod|statusCode|
    |35|139|b68f91adb4c89dc7becdf965c6087bb5|GET|200|
   	|50.844051|8.66014|b68f91adb4c89dc7becdf965c6087bb5|POST|200|   	
   	
  Scenario Outline: Invalid Get call for Current Weather Data for one location based on Geographic coordinates
    Given User navigates to weather website
    And Query Param "lat" is "<lat>", "lon" is "<lon>" and "appid" is "<apiKey>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statusCode> 
    
  Examples:
		|lat|lon|apiKey|httpMethod|statusCode|
    |xxxx|139|b68f91adb4c89dc7becdf965c6087bb5|GET|400|
   	|106.909317|xxx|b68f91adb4c89dc7becdf965c6087bb5|POST|400|
   	|35|139|b68f91adb4c89dc7becdf965c6087bb5|PUT|405|   
   	
  Scenario Outline: Valid Get call for Current Weather Data for one location based on Zip Code	
    Given User navigates to weather website
    And Query Param "zip" is "<zipCode>" and "appid" is "<apiKey>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statusCode> 
    
  Examples:
		|zipCode|apiKey|httpMethod|statusCode|
    |94040,US|b68f91adb4c89dc7becdf965c6087bb5|GET|200|	    
    |28117,US|b68f91adb4c89dc7becdf965c6087bb5|GET|200| 
    
  Scenario Outline: Invalid Get call for Current Weather Data for one location based on Zip Code
    Given User navigates to weather website
    And Query Param "zip" is "<zipCode>" and "appid" is "<apiKey>" 
    When I execute "<httpMethod>" request
    Then I verify the statuscode is <statusCode> 
    And I verify body contains "<cod>" and "<message>"
    
  Examples:
		|zipCode|apiKey|httpMethod|statusCode|message|cod|
    |94040,US|b68f91adb4c89dc7becdf965c608723|GET|401|Invalid API key. Please see http://openweathermap.org/faq#error401 for more info.|401|	    
    |34er23,US|b68f91adb4c89dc7becdf965c6087bb5|GET|404|city not found|404|
    |28117,US|b68f91adb4c89dc7becdf965c6087bb5|PUT|405|Internal error|405|      
   	
   		   	 	
    
   	
