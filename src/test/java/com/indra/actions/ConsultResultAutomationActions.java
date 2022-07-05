package com.indra.actions;


import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ConsultResultAutomationActions extends ExecuteServicesRestActions {

    public String token;
    public String idExecution;
    public String resultResponse;
    public String urlEvidenceSerenity;
    public String urlEvidenceEvidenceComplete;
    public String urlEvidenceSox;


    public List<String> consultResultOfAutomation() throws InterruptedException, Exception {
        List<String> stringList = new ArrayList<>();
        int pendiente = 0;
        int  contador = 0;
        resultResponse = consultResultsServices(token, idExecution);
        String status = from(resultResponse).get("executionStatus");
        String result;


        while (!status.equals("Terminado") && !(pendiente == 1)) {
            Thread.sleep(9990);
            resultResponse = consultResultsServices(token, idExecution);

            status = from(resultResponse).get("executionStatus");

            if (contador == 91) {
                pendiente = 1;
            }
        }

        result = from(resultResponse).get("result[0]");
        urlEvidenceSerenity = from(resultResponse).get("urlEvidenceSerenity");
        urlEvidenceEvidenceComplete = from(resultResponse).get("urlEvidenceEvidenceComplete");
        urlEvidenceSox = from(resultResponse).get("urlEvidenceSox");

        if (result.equals("Exitoso")) {

            assertThat("Finaliza de manera Exitosa la automatizacion", result, equalTo("Exitoso"));
            System.out.println("\n\nFinaliza de manera Exitosa\n\n");
            //TestLinkIntegration.updateResults("test1", null, TestLinkAPIResults.TEST_FAILED);
        }
         else{

        //TestLinkIntegration.updateResults("test1",null, TestLinkAPIResults.TEST_FAILED);
            System.out.println("\n\nEjecucion Fallida\n\n");
            assertThat("Finaliza de manera Exitosa la automatizacion", result, equalTo("Exitoso"));
        }
         stringList.add(idExecution);
         stringList.add(urlEvidenceSerenity);
         stringList.add(urlEvidenceEvidenceComplete);
         stringList.add(urlEvidenceSox);

         return stringList;
    }

    public void testTestlink() throws TestLinkAPIException {
        TestLinkIntegration.updateResults("calendario1", null, TestLinkAPIResults.TEST_PASSED);
    }

    public void ExecuteAutomation(String request){
       token = getAuthenticateToken("http://10.69.42.60:8089/api/authenticate-api");
       idExecution = executeAutomationServices("http://10.69.42.60:8089/api/external-automation",token,request);
    }
}
