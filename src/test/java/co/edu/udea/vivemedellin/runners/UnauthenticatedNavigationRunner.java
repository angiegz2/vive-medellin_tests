package co.edu.udea.vivemedellin.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hu011_navegacion_usuario_no_registrado.feature",
        glue = "co.edu.udea.vivemedellin.stepdefinitions",
        plugin = {"pretty"}
)
public class UnauthenticatedNavigationRunner {
}
