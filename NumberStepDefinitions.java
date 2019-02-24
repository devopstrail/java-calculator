package nl.tudelft.cucumber;

import cucumber.api.java.en.Given;

public class NumberStepDefinitions {

	public static int A, B;

	@Given("^the numbers (\\d+) and (\\d+)$")
	public void theNumbersAnd(int first, int second) throws Throwable {
		A = first;
		B = second;
	}

}
