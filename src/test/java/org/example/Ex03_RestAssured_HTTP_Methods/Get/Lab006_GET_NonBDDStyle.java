package org.example.Ex03_RestAssured_HTTP_Methods.Get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab006_GET_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;

    @Test
    public void test_GET_NON_BDD_STYLE(){
        pincode="560048";

        //given
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        //when
        response=r.when().log().all().get();
        System.out.println(response.asString());

        //Then
        vr=response.then().log().all().statusCode(200);


    }


    @Test
    public void test_GET_NON_BDD_STYLE_Negative(){
        pincode="@";

     r=RestAssured.given();
     r.baseUri("https://api.zippopotam.us");
     r.basePath("/IN/" + pincode);

     response=r.when().log().all().get();
        System.out.println(response.asString());

        vr=response.then().log().all();
        vr.statusCode(404);






    }



}
