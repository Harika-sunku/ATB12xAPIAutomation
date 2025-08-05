package org.example.Ex01_Rest_Concepts;

import io.restassured.RestAssured;

public class Lab01_RestExample {

    public static void main(String[] args) {


        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(201);


    }

}
