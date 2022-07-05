package com.indra.actions;

import com.indra.pojoApis.RequestAuthenticateApi;
import com.indra.pojoApis.ResponseAuthenticateApi;
import com.indra.pojoApis.ResultsAPIResponse;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;

public class ApisTestPojo {
    public String getAuthenticateTokenAPI(String URL){
        RequestAuthenticateApi requestAuthenticateApi = new RequestAuthenticateApi();
        requestAuthenticateApi.setUsername("Natalia.Rios");
        requestAuthenticateApi.setPassword("NataliaRio.11-");
        URL="http://10.69.42.60:8089/api/authenticate-api";

        ResponseAuthenticateApi responseAuthenticateApi =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestAuthenticateApi)
                        .post(URL)
                        .then()
                        .statusCode(200)
                        .extract()
                        .body()
                        .as(ResponseAuthenticateApi.class);

        return responseAuthenticateApi.getToken();
    }

    public String executeAutomationServices(String URL, String token){
        String response =
                given().auth().oauth2(token)
                        .contentType(ContentType.JSON)
                        .body("")
                        .post(URL)
                        .then()
                        .statusCode(200)
                        .extract().body().asString();

        /** optiene el valor del token y lo retorna */
        String idExecution = from(response).get("idexecution");

        return idExecution;
    }



    public ResultsAPIResponse consultResultsServices(String token, String idExecution, String URL){
        ResultsAPIResponse apiResponse =
                given().auth().oauth2(token)
                        .contentType(ContentType.JSON)
                        .param("idexecution",idExecution)
                        .get(URL)
                        .then()
                        .statusCode(200)
                        .extract()
                        .body()
                        .as(ResultsAPIResponse.class);

        return apiResponse;
    }
}
