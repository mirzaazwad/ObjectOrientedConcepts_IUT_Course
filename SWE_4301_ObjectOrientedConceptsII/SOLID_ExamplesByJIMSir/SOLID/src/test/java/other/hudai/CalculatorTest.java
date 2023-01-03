package other.hudai;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 24/10/22
 * Time: 10:00 PM
 */

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5), "multiplication should work");
        assertNotNull(calculator.multiply(3, 2), "Should not be null");
        assertTrue(5 > 2, "You can write in lambda");
    }

    @RepeatedTest(3)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero(){
        assertEquals(0, calculator.multiply(0, 5), "multiply with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "multiply with zero should be zero");
    }

    @Test
    void groupAssertionTesting(){
        assertAll("All assertion testing",
                () -> assertEquals("Dhur", calculator.simpleMessage()),
                () -> assertEquals("Hi", calculator.simpleMessage())
        );
    }
}