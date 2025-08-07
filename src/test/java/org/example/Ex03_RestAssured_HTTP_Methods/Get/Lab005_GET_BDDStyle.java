package org.example.Ex03_RestAssured_HTTP_Methods.Get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab005_GET_BDDStyle {

    @Test
    public void test_GET_POSITIVE(){
        String pincode = "560058";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }



}
