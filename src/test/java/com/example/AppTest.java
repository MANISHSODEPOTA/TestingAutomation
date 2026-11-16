
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        int a = 4;
        int b = 6;

        int result = a + b;

        assertEquals(10, result);
    }
}
