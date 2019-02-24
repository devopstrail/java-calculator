package nl.tudelft.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorStepDefinitions {

	private Calculator calculator;
	private int result;

	@Before
	public void setup() {
		calculator = new Calculator();
	}

	@When("^I add the two numbers$")
	public void iAddTheTwoNumbers() throws Throwable {
		result = calculator.add(NumberStepDefinitions.A, NumberStepDefinitions.B);
	}

	@Then("^the result should be (\\d+)$")
	public void theResultShouldBe(int expectedResult) throws Throwable {
		assertThat(result, equalTo(expectedResult));
	}

	@When("^I subtract the two numbers$")
	public void iSubtractTheTwoNumbers() throws Throwable {
		result = calculator.subtract(NumberStepDefinitions.A, NumberStepDefinitions.B);
	}

	@After
	public void tearDown() {
		calculator.close();
	}

}
