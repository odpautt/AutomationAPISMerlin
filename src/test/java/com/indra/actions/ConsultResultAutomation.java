package com.indra.actions;


import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ConsultResultAutomation extends ExecuteServicesRestActions {

    public String token;
    public String idExecution;
    public String resultResponse;
    public String urlEvidenceSerenity;
    public String urlEvidenceEvidenceComplete;
    public String urlEvidenceSox;

    public void consultResultOfAutomation() throws InterruptedException, Exception {

        resultResponse = consultResultsServices(token, idExecution);
        String status = from(resultResponse).get("executionStatus");
        String result;

        while (!status.equals("Terminado")) {
            Thread.sleep(20000);
            resultResponse = consultResultsServices(token, idExecution);

            status = from(resultResponse).get("executionStatus");
        }
        result = from(resultResponse).get("result[0]");
        urlEvidenceSerenity = from(resultResponse).get("urlEvidenceSerenity");
        urlEvidenceEvidenceComplete = from(resultResponse).get("urlEvidenceEvidenceComplete");
        urlEvidenceSox = from(resultResponse).get("urlEvidenceSox");

        if (result.equals("Exitoso")) {
            System.out.println("Finaliza de manera Exitosa");
           // assertThat("Finaliza de manera Exitosa la automatizacion", result, equalTo("Exitoso"));
            TestLinkIntegration.updateResults("test1", null, TestLinkAPIResults.TEST_FAILED);
        }
         else{
        TestLinkIntegration.updateResults("test1",null, TestLinkAPIResults.TEST_FAILED);
            System.out.println("Ejecucion Fallida");
        }

    }

    public void testTestlink() throws TestLinkAPIException {
        TestLinkIntegration.updateResults("calendario1", null, TestLinkAPIResults.TEST_FAILED);
    }

    public void ExecuteAutomation(){
       token = getAuthenticateToken("http://10.69.42.60:8089/api/authenticate-api");
       idExecution = executeAutomationServices("http://10.69.42.60:8089/api/external-automation",token);
    }
}
