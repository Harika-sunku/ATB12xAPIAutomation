package org.example.Ex04_TestNG_Examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab017_TestNG_Parameter {

   @Parameters("browser")
    @Test
    public void test_parameter_exam(String value){
        System.out.println("Hi i am demo");

        if(value.equalsIgnoreCase("Chrome")){
            System.out.println("Start the chrome!");
        }

        if(value.equalsIgnoreCase("Firefox")){
            System.out.println("Start the Firefox!");
        }

    }



}
