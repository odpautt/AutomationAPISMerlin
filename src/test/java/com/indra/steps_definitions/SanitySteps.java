package com.indra.steps_definitions;

import com.indra.actions.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SanitySteps {
    @Managed
    WebDriver driver;

    ConsultResultAutomationActions resultAutomation = new ConsultResultAutomationActions();
    ApisTestPojo apisTestPojo = new ApisTestPojo();
    TestCasesActions testCasesActions = new TestCasesActions();


    @Given("^se hace la peticion del token$")
    public void seHaceLaPeticionDelToken() {

    }

    @When("^se ejecuta la api configurada para la ejecucion de la automatizacion caso uno$")
    public void seEjecutaLaApiConfiguradaParaLaEjecucionDeLaAutomatizacionCaso() {
       resultAutomation.ExecuteAutomation(testCasesActions.CancelacionPorSolicitud());
    }

    @Then("^Se obtiene la respuesta de la ejecucion de la automatizacion$")
    public void seObtieneLaRespuestaDeLaEjecucionDeLaAutomatizacion() throws Exception {
        resultAutomation.consultResultOfAutomation();
        System.out.println("\n\n"+resultAutomation.consultResultOfAutomation()+"\n\n");
    }


    // caso 2
    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso dos$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoDos() {
        resultAutomation.ExecuteAutomation(testCasesActions.Reconexion430());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles("Activa"));
        System.out.println(testCasesActions.Reconexion430() +"\n"+testCasesActions.ConsultarLineaDetalles("Activa"));
    }

    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso tres$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoTres() {
        resultAutomation.ExecuteAutomation(testCasesActions.RealizarCancelacionDeRoamingLineaPostpago5_2());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles("Activa"));
    }


    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso cuatro$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoCuatro() {
        resultAutomation.ExecuteAutomation(testCasesActions.CambioDePospagoAPospagoGenerico());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles("Activa"));
    }

    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso cinco$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoCinco() {

    }

    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso seis$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoSeis() {
        resultAutomation.ExecuteAutomation(testCasesActions.SuspensionRoboPerdidaEnLineaPortada());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles(""));
    }

    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso siete$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoSiete() {
        resultAutomation.ExecuteAutomation(testCasesActions.ReconexionRoboPerdidaEnLineaPortada());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles("Activa"));

    }

    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso ocho$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoOcho() {
        resultAutomation.ExecuteAutomation(testCasesActions.CambioDePlanDePostpagoEmpresarial5_3APostpagoEmpresarial5_1());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles("Activa"));
    }

    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso nueve$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoNueve() {
        resultAutomation.ExecuteAutomation(testCasesActions.RealizarActivacionDeRoamingLineaPostpago5_2());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles("Activa"));
    }

    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso diez$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoDiez() {
        resultAutomation.ExecuteAutomation(testCasesActions.CambioDePlanDePostpagoEmpresarial5_1APostpagoEmpresarial5_1Plus());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles("Activa"));
    }


    @When("^se ejecuta la api configurado para la ejecucion de la automatizacion caso once$")
    public void seEjecutaLaApiConfiguradoParaLaEjecucionDeLaAutomatizacionCasoOnce() {
        resultAutomation.ExecuteAutomation(testCasesActions.CatalogoAtp_GestionCuentas_Suscripcion_Ejecucion());
        resultAutomation.ExecuteAutomation(testCasesActions.ConsultarLineaDetalles("Activa"));

    }


    @Given("^se realiza la configuracion del Json$")
    public void seRealizaLaConfiguracionDelJson() {
        apisTestPojo.getAuthenticateTokenAPI("as");
    }

    @When("^se ejecuta el json configurado$")
    public void seEjecutaElJsonConfigurado() {
        resultAutomation.ExecuteAutomation("{\n" +
                "    \"contentFeature\": [\n" +
                "        \"Feature: Consultar Estado de Linea\\n\\n   Scenario Outline: Consultar Estado de Line\\n\\tGiven Deseo navegar a la pagina <urlCrm>\\n    And Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n    And Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n    And Doy click en \\\"Submit\\\"\\n    And Espero que la pagina cargue\\n    When Doy click en \\\"Consultas\\\"\\n    And Espero que la pagina cargue\\n    And Selecciono en el arbol la opcion <postventa>\\n    And Selecciono en el arbol la opcion <integral>\\n    And Doy click en \\\"Nueva pantalla unica\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n    And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n    And Ingreso rapidamente <msisdn> en el campo \\\"Msisdn\\\"\\n    Then Doy click en \\\"Buscar\\\"\\n    And Espero que la pagina cargue\\n    And Valido que valor del campo \\\"label tipo\\\" sea <tipo>\\n    And Valido que valor del campo \\\"estado linea\\\" sea <estadoLinea>\\n\\tAnd Doy click en \\\"Activacion\\\"\\n\\tAnd Doy click en \\\"Impreso HLR\\\"\\n\\tAnd Espero <tiempoEsperaFinal> segundos\\n\\tAnd Modifico el atributo <atributo> del campo \\\"HLR\\\" por <valorAtributo>\\n\\tAnd Capturo con scroll la informacion completa de la pagina\\n    And Doy click en \\\"Prepago\\\"\\n\\tAnd Doy click en \\\"Resumen\\\"\\n\\tAnd Espero <tiempoEsperaFinal> segundos\\n\\tAnd Capturo con scroll la informacion completa de la pagina\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|postventa|integral|tiempoEspera|msisdn|tipo|estadoLinea|tiempoEsperaFinal|atributo|valorAtributo|\\n|\\\"http://10.69.60.140:8280/portal/CRMPortal\\\"|\\\"SM1152457543\\\"|\\\"Tigo.2020*\\\"|\\\"Consulta Posventa\\\"|\\\"Consulta Integral\\\"|\\\"3\\\"|\\\"3015169697\\\"|\\\"Prepago\\\"|\\\"Activo\\\"|\\\"5\\\"|\\\"style\\\"|\\\"height: 4777px\\\"|\\n\"\n" +
                "    ],\n" +
                "    \"nameFeature\": [\n" +
                "        \"ESC001_ Consultar Estado de Linea\"\n" +
                "    ],\n" +
                "    \"contentProperties\": [\n" +
                "        \"|User=id:username|Password=id:password|Submit=name:login|Consultas=linkText:Consultas|Nueva pantalla unica=linkText:Nueva Pantalla Unica Clientes|transaccion crm portal=id:iframe|Msisdn=xpath://*[@id='j_id15:j_id26']|Buscar=//*[@id='j_id15:j_id27']|label tipo=id:j_id135:j_id166|estado linea=//*[@id='j_id135:j_id183']|Activacion=id:j_id373:menu:j_id374:j_id421|Impreso HLR=id:j_id373:menu:j_id374:j_id421:j_id424:icn|HLR=//textarea[@class='iceInpTxtArea' and contains(.,'HLR')]|Prepago=id:j_id373:menu:j_id374:j_id376|Resumen=id:j_id373:menu:j_id374:j_id376:j_id377:icn|\"\n" +
                "    ],\n" +
                "    \"allowsTrace\": \"0\",\n" +
                "    \"browser\": \"chrome\",\n" +
                "    \"aplicationType\": [\n" +
                "        \"Web\"\n" +
                "    ],\n" +
                "    \"aplication\": [\n" +
                "        \"CRM\"\n" +
                "    ],\n" +
                "    \"process\": [\n" +
                "        \" Consultar Estado de Linea\"\n" +
                "    ],\n" +
                "    \"iterations\": [\n" +
                "        1\n" +
                "    ],\n" +
                "    \"appTypeToValidate\": [\n" +
                "        \"1\"\n" +
                "    ],\n" +
                "    \"testError\": false,\n" +
                "    \"stopExecution\":false\n" +
                "}");
    }

//    @Then("^Se obtiene la respuesta de la ejecucion del json$")
//    public void seObtieneLaRespuestaDeLaEjecucionDelJson() throws InterruptedException, Exception {
//        resultAutomation.consultResultOfAutomation();
//        System.out.println("\n\n"+resultAutomation.consultResultOfAutomation()+"\n\n");
//        //resultAutomation.testTestlink();
//    }

}
