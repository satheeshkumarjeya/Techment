package com.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src\\test\\resources\\Features",dryRun=!true, glue="com.stepdefinition")
public class TestRunnerClass {

}
