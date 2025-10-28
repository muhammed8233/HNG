package Task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitTest {
    SumOfDigit number = new SumOfDigit();

    @Test
    void testSum(){
       int result = number.sum(123);
       assertEquals(6, result);
    }

}