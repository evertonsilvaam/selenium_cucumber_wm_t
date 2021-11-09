package com.webmotors.tests.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="../src/test/resource/feature",
		tags="",
		glue= {"com.webmotors.tests.runner"},
		plugin= {"json:target/reports/report.json"},
		snippets=CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTest {
	
}
