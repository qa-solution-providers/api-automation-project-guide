#Name of project

API Automation for Current Weather info for one location

#Project Overview

Current Weather API provides list of APIs for getting weather information of over 200,000 locations

#Configuration instructions

##OS :
Windows

##RAM :
Min 2 GB

##Internet Speed :
Min 5 MB

#Dependencies

Rest Assured
Extent Report 
Apache Maven
Cucumber
Jackson Databind
Maven Compiler Plugin

#Core Components

pom.xml - Contains all the dependencies
src/main/java/pojo - Contains the pojo classes
src/main/resources - Contains the necessary documents README.md and Weather ApiDocs.md
src/main/test/runner - Contains Run configurations
src/main/test/stepdefinitions - Contains the java code corresponding to the feature file
src/test/java/utils - Contains reusable methods to be used in step definition code. One such is propertyFileReader()
src/test/resources/features - Contains the feature files written in Gherkin syntax which describes the beahviour of the API along with the scenarios
src/test/resources - Contains the config file with test data that drives the test execution
test-output - Contains the high level or the HTML reporting after the test execution along with pdf report

#Operating instructions

Fork the project into your ide - Eclipse
Right click on pom.xml and run as "Maven Build"
Now right click on pom.xml and run as "Maven Test"

#Contact information of the programmer

Samujjal Das Choudhury 
Email - samujjaldaschoudhury@gmail.com