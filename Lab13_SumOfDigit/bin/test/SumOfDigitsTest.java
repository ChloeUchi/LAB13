package test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.SumOfDigits;

public class SumOfDigitsTest {

    @Test
    public void testSumOfDigits() {
        
        int result1 = SumOfDigits.sumOfDigits(5678);
        assertEquals(8, result1);

        int result2 = SumOfDigits.sumOfDigits(67474);
        assertEquals(1, result2);

        int result3 = SumOfDigits.sumOfDigits(22544);
        assertEquals(8, result3);

        int result4 = SumOfDigits.sumOfDigits(56712);
        assertEquals(3, result4);
    }
}
