package TestRunner;

import io.cucumber.junit.Cucumber;

public class TagsRunner {
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\potnu\\eclipse-workspace\\CucumberMavenProject\\Features\\Tags.feature",
                 glue="TagsStepDefinition",
                 dryRun=false,
                 monochrome=true,
                 tags="@Smoke")
}
