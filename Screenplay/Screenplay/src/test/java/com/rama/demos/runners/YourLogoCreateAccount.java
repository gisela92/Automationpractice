package com.rama.demos.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"com.rama.demos.stepdefinitions", "com.rama.demos.hooks"},
        features = "src/test/resources/com/rama/demos/features/your_logo_create_account.feature",

        snippets = SnippetType.CAMELCASE
)


public class YourLogoCreateAccount {
}
