package Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java/Cucumber/login.feature", 
glue ="Cucumber" , monochrome = true , plugin = {"pretty", "html:target/HTMLReports.html"})

public class TestRunner 
{
	
}
