package test;
import main.SumOfDigits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumOfDigitsTest {

    @Test
    public void testComputeSumOfDigits_ErrorForSingleDigit() {
        SumOfDigits sod = new SumOfDigits();
        String result = sod.computeSumOfDigits(5);
        assertEquals("ตัวเลขต้องมีสองหลัก", result);
    }

    @Test
    public void testComputeSumOfDigits_ValidNumber() {
        SumOfDigits sod = new SumOfDigits();
        String result = sod.computeSumOfDigits(123);
        String expected = "1 + 2 + 3 = 6\n6";
        assertEquals(expected, result);
    }

    @Test
    public void testComputeSumOfDigits_NumberWithMultipleReductions() {
        SumOfDigits sod = new SumOfDigits();
        String result = sod.computeSumOfDigits(999);
        String expected = "9 + 9 + 9 = 27\n2 + 7 = 9\n9";
        assertEquals(expected, result);
    }

    @Test
    public void testComputeSumOfDigits_TwoDigitNumber() {
        SumOfDigits sod = new SumOfDigits();
        String result = sod.computeSumOfDigits(47);
        String expected = "4 + 7 = 11\n1 + 1 = 2\n2";
        assertEquals(expected, result);
    }
}