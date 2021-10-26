package computer;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.lang.Math;

public class MyStepdefs {
    private Computer computer;
    private int value;
    private String opt;
    private double result;
    private double eps = 0.000001;

    @Before
    public void before() {
        computer = new Computer();
    }

    @Given("^One input value, ([-|+]?\\d+)$")
    public void twoInputValuesAnd(int arg0) {
        value = arg0;
    }

    @When("^I give (.*)$")
    public void iAddTheTwoValues(String s) {
        result = computer.calculate(value, s);
        opt = s;
        System.out.print(result);
    }

    @Then("^I expect the result nearly ([+-]?\\d+(?:\\.\\d*(?:[eE][+-]?\\d+)?)?)$")
    public void iExpectTheResult(double arg0) {
        if (opt.equals("rvs")) {
            Assert.assertTrue(Math.abs(arg0 - 1.0 / ((double) value)) < eps);
        } else if (opt.equals("sqr")) {
            Assert.assertTrue(Math.abs(arg0 - Math.sqrt(value)) < eps);
        }
    }
}
