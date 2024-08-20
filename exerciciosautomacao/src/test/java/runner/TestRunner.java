package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",      
    glue = "steps",
    //tags = "@test",
    plugin = {                                       
        "pretty",                                    
        "html:target/cucumber-reports/html-report.html"  
    },
    monochrome = true                                
)

public class TestRunner {
	

}
