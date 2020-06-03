package com.example.myapplication.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/escenarios_ejemplo.feature",
    glue = "com.example.myapplication.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class EscenariosEjemploRunner {}
