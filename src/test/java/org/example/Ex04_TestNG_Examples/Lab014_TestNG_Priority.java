package org.example.Ex04_TestNG_Examples;

import org.testng.annotations.Test;

public class Lab014_TestNG_Priority {


    @Test(priority = 0)
    public void test_tc1(){
        System.out.println("A");
    }
    @Test(priority = 4)
    public void test_tc2(){
        System.out.println("E");
    }
    @Test(priority = 1)
    public void test_tc3(){
        System.out.println("B");
    }
    @Test(priority = 3)
    public void test_tc4(){
        System.out.println("D");
    }
    @Test(priority = 2)
    public void test_tc5(){
        System.out.println("C");
    }

}
