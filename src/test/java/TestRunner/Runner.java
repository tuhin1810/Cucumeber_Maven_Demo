package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//Lenovo//IdeaProjects//Cucumber_Maven//Features//Orange.feature",glue={"StepDefinitions"})
public class Runner {
}
