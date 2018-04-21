package ca.test.steps;

import cucumber.api.java.en.Given;

public class Test {

    @Given("^this is my fist given test$")
    public void this_is_my_fist_given_test() {
        System.out.println("test");
    }

}
