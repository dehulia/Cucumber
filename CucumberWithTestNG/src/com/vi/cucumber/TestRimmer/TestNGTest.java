package com.vi.cucumber.TestRimmer;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		
		features = {"Features"},
		glue = "TestNG"
		
		)
@Test
public class TestNGTest extends AbstractTestNGCucumberTests{

}
