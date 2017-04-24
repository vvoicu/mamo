package com.matches.tests.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/matches/MatchesLogin.feature", glue = "com.matches.tests.cucumber")
public class DefinitionTestSuite {}
