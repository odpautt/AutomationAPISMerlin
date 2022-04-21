package com.indra.actions;


import com.indra.pojoApis.RequestAuthenticateApi;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;

public class ExecuteServicesRestActions {



    public String getAuthenticateToken(String URL){
        String token =
                 given()
                         .contentType(ContentType.JSON)
                         .body("{\n" +
                                "    \"username\": \"Orlando.Pautt\",\n" +
                                "    \"password\": \"OrlandoDar.12*\"\n" +
                                "}")
                         .post(URL)
                         .then()
                         .statusCode(200)
                         .extract().body().asString();

        /** optiene el valor del token y lo retorna */
        token = from(token).get("token");

        return token;
    }

    public String executeAutomationServices(String URL, String token){
        String response =
                given().auth().oauth2(token)
                        .contentType(ContentType.JSON)
                        .body("{\n" +
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
                                "}")
                        .post(URL)
                        .then()
                        .statusCode(200)
                        .extract().body().asString();

        /** optiene el valor del token y lo retorna */
        String idExecution = from(response).get("idexecution");

        return idExecution;
    }

    public String consultResultsServices(String token,String idExecution){
        String response =
                given().auth().oauth2(token)
                .contentType(ContentType.JSON)
                .param("idexecution",idExecution)
                .get("http://10.69.42.60:8089/api/execution-result")
                .then()
                .statusCode(200)
                .extract().body().asString();

        return response;
    }

    public void getAuthenticateTokenAPI(String URL){
        RequestAuthenticateApi requestAuthenticateApi = new RequestAuthenticateApi();
        requestAuthenticateApi.setUsername("Orlando.Pautt");
        requestAuthenticateApi.setPassword("OrlandoDar.12*");
        URL="http://10.69.42.60:8089/api/authenticate-api";

        String token =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestAuthenticateApi)
                        .post(URL)
                        .then()
                        .statusCode(200)
                        .extract()
                        .body()
                        .as();
    }

}
