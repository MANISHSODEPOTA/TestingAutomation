
package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;

        int result = a - b;

        Assert.assertEquals(result, 6);
        System.out.println("TestNG Test Passed!");
    }
}
