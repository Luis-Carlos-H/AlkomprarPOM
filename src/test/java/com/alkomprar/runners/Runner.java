package com.alkomprar.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/CompraProducto.feature","src/test/resources/features/InicioSesion.feature","src/test/resources/features/RegistroUsuario.feature"},
        glue = "com.alkomprar.stepDefinitions",
        tags = "@Compra",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}