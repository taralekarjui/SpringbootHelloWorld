package com.example.springboot;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HelloControllerTest {

    @Test
    public void printHello() {
        HelloController helloController = new HelloController();
        String result = helloController.printHello();
        assertEquals(result, "Hello World");
    }
}
