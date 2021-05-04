package com.ecommerce.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
glue="com.ecommerce.stepdefinition",
plugin={"html:target","json:target/report"},
monochrome = true,
dryRun =false)
public class TestRunner {

}
