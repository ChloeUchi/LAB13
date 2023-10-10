package test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.SumOfDigits;

public class SumOfDigitsTest {

    @Test
    public void testSumOfDigits() {
        // Test case 1: Test with 493193
        int result1 = SumOfDigits.sumOfDigits(5678);
        assertEquals(9, result1);

        // Test case 2: Test with 987654321
        int result2 = SumOfDigits.sumOfDigits(21456);
        assertEquals(3, result2);

        // Test case 3: Test with 0
        int result3 = SumOfDigits.sumOfDigits(22544);
        assertEquals(4, result3);

        // Test case 4: Test with a negative number (-12345)
        int result4 = SumOfDigits.sumOfDigits(-56712);
        assertEquals(3, result4);
    }
}
