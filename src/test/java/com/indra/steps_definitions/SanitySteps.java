package com.indra.steps_definitions;

import com.indra.actions.ConsultResultAutomation;
import com.indra.actions.ExecuteServicesRestActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SanitySteps {
    @Managed
    WebDriver driver;

    ConsultResultAutomation resultAutomation = new ConsultResultAutomation();

    @Given("^se realiza la configuracion del Json$")
    public void seRealizaLaConfiguracionDelJson() {

    }

    @When("^se ejecuta el json configurado$")
    public void seEjecutaElJsonConfigurado() {
       resultAutomation.ExecuteAutomation();
    }

    @Then("^Se obtiene la respuesta de la ejecucion del json$")
    public void seObtieneLaRespuestaDeLaEjecucionDelJson() throws InterruptedException {
        resultAutomation.consultResultOfAutomation();
    }


}
