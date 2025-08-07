package org.example.Ex03_RestAssured_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab010_PATCH_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_patch_non_bdd() {

        String bookinid="1343";
        String token="692357bb19c2420";
        String payload="{\n" +
                "    \"firstname\" : \"Nandu\",\n" +
                "    \"lastname\" : \"Sunku\"\n" +
                "}";


        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookinid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();


        response=r.when().log().all().patch();

        vr=response.then().log().all().statusCode(200);








    }


}
