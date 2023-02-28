package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters password");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");
    }
    @When("user enter student username")
    public void user_enter_student_username() {
        System.out.println("user enter student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");
    }
    @When("user enter admin username")
    public void user_enter_admin_username() {
        System.out.println("user enter admin username");
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("user enters admin password");
    }
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }


}
