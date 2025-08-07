package org.example.Ex03_RestAssured_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab009_PUT_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_put_non_bdd() {

        String bookinid="3019";
        String token="294a8a302f80ede";
        String payload="{\n" +
                "    \"firstname\" : \"Nandana\",\n" +
                "    \"lastname\" : \"Sunku\",\n" +
                "    \"totalprice\" : 400,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2020-01-01\",\n" +
                "        \"checkout\" : \"2021-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookinid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();


        response=r.when().log().all().put();

        vr=response.then().log().all().statusCode(200);






    }



}
