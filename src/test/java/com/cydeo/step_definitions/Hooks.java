package com.cydeo.step_definitions;
/*
In this class we will be able to pass pre- and post- conditions to each scenario and
each step
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from jnuit
//    @Before
//    public void setupScenario(){
//        System.out.println("==== Setting up browser using cucumber @Before");
//
//    }
//    @Before("@login") // This is simlar to @Before in TestNG it runs before each Scenario
//    public void setupScenarioForLogins(){
//        System.out.println("==== Setting up browser using cucumber only @Before @login tag ");
////@Before("@login") this will only apply to login scenarios
//
//    }
    @After // This is simlar to @After in TestNG it runs after each Scenario
    public void teardownScenario(Scenario scenario){

        // How to get a screenshot when your scenario fails
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();

        //System.out.println("==== Closing browser using cucumber @After");
        //System.out.println("==== Scenario ended take a screenshot.");
    }
//    @BeforeStep
//    public void setupStep(){
//        System.out.println("--------- applying setup using @BeforeStep");
//    }
//    @AfterStep
//    public void afterStep(){
//        System.out.println("-------- applying teardown using @AfterStep");
//    }
}
