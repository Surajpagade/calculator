package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Calculator calculator;
	double result;
	
	@SuppressWarnings("deprecation")
	@Then("The result is {string}")
	public void the_result_is(String expected) {
	    assertEquals(Double.parseDouble(expected), result, 0.01);
	}
	
	@Given("The calculator to perform operation")
	public void the_calculator_to_perform_operation() {
		calculator = new Calculator();
	}

	@When("The inputs for addition are {string} and {string}")
	public void the_inputs_for_addition_are_and(String firstOperand, String secondOperand) {
		result = calculator.add(Double.parseDouble(firstOperand), Double.parseDouble(secondOperand));
	}


}
