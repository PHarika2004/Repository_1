package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\potnu\\eclipse-workspace\\CucumberMavenProject\\orangeHrmlogin.feature",
                  glue="stepDefinition",
                 plugin= {"pretty","html:target/cucumber-reports"},
                  dryRun=false,
                  monochrome=true)

public class TestRunner {

	

}


