package org.example.Ex01_Rest_Concepts;

import io.restassured.RestAssured;

public class Lab002_RestExample {

    public static void main(String[] args) {


        RestAssured.given()
                .baseUri("https://api.postalpincode.in/pincode/560045")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }


}
