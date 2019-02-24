package nl.tudelft.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {"pretty"},
	snippets = SnippetType.CAMELCASE,
	features = "src/test/resources/features")
public class CucumberTest {

	/**
	 * This class should be empty, step definitions should be in separate classes.
	 */

}
