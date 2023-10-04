package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="classpath:test_features",
glue = "test.excutions",
tags = "@US_11" ,
plugin ={
"pretty",
 "html:target/htmlReports/cucumbers-pretty.html",
}
)
public class Runner {
}
