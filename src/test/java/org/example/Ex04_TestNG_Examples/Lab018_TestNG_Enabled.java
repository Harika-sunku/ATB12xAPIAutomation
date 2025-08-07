package org.example.Ex04_TestNG_Examples;

import org.testng.annotations.Test;

public class Lab018_TestNG_Enabled {

    @Test
    public void test_tc1(){
        System.out.println("Hi!!!");

    }
    @Test(enabled = false)
    public void test_tc2(){
        System.out.println("How are you!!!");

    }

    @Test(enabled = true)
    public void test_tc3(){
        System.out.println("Bye");

    }


}
