package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//E:\SeleniumAssignments\CucumberTutorials\CucumberAssignments\Feature\DemoCucumber.feature
@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\SeleniumAssignments\\CucumberTutorials\\CucumberAssignments\\Feature\\DemoCucumber.feature"}, glue= {"stepDefinition"})

public class GoogleRunner {

}
