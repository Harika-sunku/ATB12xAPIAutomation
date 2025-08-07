package org.example.Ex02_TestNG;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab004_TestCase {


    String pincode = "110048";
    @Test
    public void test_GET_POSITIVE_TC1(){
        pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

      @Test
    public void test_GET_NEGATIVE_TC2(){
          pincode = "@";
          RestAssured
                  .given()
                  .baseUri("https://api.zippopotam.us")
                  .basePath("/IN/" + pincode)
                  .when()
                  .get()
                  .then()
                  .log().all().statusCode(404);
      }







}
