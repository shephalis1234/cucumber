package runnre.com;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import reader.configfilereader;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:/HaudAPI/cucumberframework/src/main/java/feature/com/contact.feature", //the path of the feature files
			glue={"stepdefinition"}, //the path of the step definition files
//			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false, //to check the mapping is proper between feature file and step def file
//			,tags={"@Smoke"}
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
//			plugin = { "usage" }
//			 plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
//					 "junit:target/cucumber-reports/Cucumber.xml",
//					 "html:target/cucumber-reports"}
			plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
			)
	 
	
	
public class Runner {
		@AfterClass
		 public static void writeExtentReport() {
			
			Reporter.loadXMLConfig(new File("C:/HaudAPI/cucumberframework/extent-config.xml"));
			
			 }	 
}
