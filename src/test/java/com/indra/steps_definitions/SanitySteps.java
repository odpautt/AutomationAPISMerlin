package com.indra.steps_definitions;

import com.indra.actions.ApisTestPojo;
import com.indra.actions.ConsultResultAutomation;
import com.indra.actions.ExecuteServicesRestActions;
import com.indra.actions.TestLinkIntegration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class SanitySteps {
    @Managed
    WebDriver driver;

    ConsultResultAutomation resultAutomation = new ConsultResultAutomation();
    ApisTestPojo apisTestPojo = new ApisTestPojo();

    @Given("^se realiza la configuracion del Json$")
    public void seRealizaLaConfiguracionDelJson() {
        apisTestPojo.getAuthenticateTokenAPI("as");
    }

    @When("^se ejecuta el json configurado$")
    public void seEjecutaElJsonConfigurado() {
        resultAutomation.ExecuteAutomation();
    }

    @Then("^Se obtiene la respuesta de la ejecucion del json$")
    public void seObtieneLaRespuestaDeLaEjecucionDelJson() throws InterruptedException, Exception {
        resultAutomation.consultResultOfAutomation();
        System.out.println(resultAutomation.consultResultOfAutomation());
        //resultAutomation.testTestlink();
    }


}
