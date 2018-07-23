package com.vi.cucumber.TestRunner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "Features",
		glue = "com.vi.cucumber.Test"
				
		)

@Test
public class TESTRunner extends AbstractTestNGCucumberTests{

}