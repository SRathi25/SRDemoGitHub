package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\SeleniumAssignments\\CucumberTutorials\\CucumberAssignments\\Feature\\DataDrivenOrangehrmLogin.feature"}, glue= {"stepDefinition"})

public class DataDrivenOrangehrmLoginRunner {

}
