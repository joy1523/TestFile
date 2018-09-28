package org.cucum;


	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/org/cucum/scoutline.feature"
			,glue={"org.cucum"},plugin={"html:target/html-report"}
			)

	public class TestRunner2 {

	}


