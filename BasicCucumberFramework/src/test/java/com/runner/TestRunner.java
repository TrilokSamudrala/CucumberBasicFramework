package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Features",
		glue={"com.sampl.steps"},
		monochrome =true,
		plugin = {"pretty", "html:test-output"},
		tags= {"@fourth"}

)

public class TestRunner {

}
