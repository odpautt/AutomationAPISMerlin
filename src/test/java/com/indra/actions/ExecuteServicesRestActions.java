package com.indra.actions;


import com.indra.pojoApis.RequestAuthenticateApi;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;

public class ExecuteServicesRestActions {



    public String getAuthenticateToken(String URL){
        System.out.println("\n\nSe ejecuta API de Generacion del Token\n\n");
        String token =
                 given()
                         .contentType(ContentType.JSON)
                         .body("{\n" +
                                "    \"username\": \"Natalia.Rios\",\n" +
                                "    \"password\": \"NataliaRio.11-\"\n" +
                                "}")
                         .post(URL)
                         .then()
                         .statusCode(200)
                         .extract().body().asString();

        /** optiene el valor del token y lo retorna */
        token = from(token).get("token");

        return token;
    }

    public String executeAutomationServices(String URL, String token,String request){
        System.out.println("\n\nSe ejecuta API Automatización\n\n");
        String response =
                given().auth().oauth2(token)
                        .contentType(ContentType.JSON)
                        .body(request)
                        .post(URL)
                        .then()
                        .statusCode(200)
                        .extract().body().asString();

        /** optiene el valor del token y lo retorna */
        String idExecution = from(response).get("idexecution");

        return idExecution;
    }

    public String consultResultsServices(String token,String idExecution){
        System.out.println("\n\n Se ejecuta API de Consulta de Resultado \n\n");
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



}
