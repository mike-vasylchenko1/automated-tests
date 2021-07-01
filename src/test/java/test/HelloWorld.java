package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld {

    @Test
    public void helloWorldTest() {
        System.out.println("Hello World!");
        Assert.assertTrue(true);
    }
}