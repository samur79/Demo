package com.cydeo.cukesRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/cydeo/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
/*
Failed test runner is running only the failed scenarios
We create the rerun.txt where the failed tests are stored and
we create the plugin for the rerun plugin

 */

}
