package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\Features",glue="stepdefinition")
public class Run1 extends AbstractTestNGCucumberTests {

}
