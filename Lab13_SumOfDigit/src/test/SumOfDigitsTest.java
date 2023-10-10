package test;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import main.SumOfDigits;

public class SumOfDigitsTest {	
	SumOfDigits num1;
	SumOfDigits num2;
	SumOfDigits num3;
	SumOfDigits num4;
	SumOfDigits num5;
	SumOfDigits num6;
	SumOfDigits num7;
	SumOfDigits num8;
	
	@BeforeEach
	public void setup() {
		num1 = new SumOfDigits(26);
		num2 = new SumOfDigits(157);
		num3 = new SumOfDigits(260);
		num4 = new SumOfDigits(57);
		num5 = new SumOfDigits(5);
		num6 = new SumOfDigits(0);
		num7 = new SumOfDigits(1);
		num8 = new SumOfDigits(9);
	}

    @Test
    public void testSumOfDigits() {
        assertEquals(8, num1.calculateSumOfDigits());
        assertEquals(13, num2.calculateSumOfDigits());
        assertEquals(8, num3.calculateSumOfDigits());
        assertEquals(12, num4.calculateSumOfDigits());
        assertEquals(0, num5.calculateSumOfDigits());
        assertEquals(0, num6.calculateSumOfDigits());
        assertEquals(0, num7.calculateSumOfDigits());
        assertEquals(0, num8.calculateSumOfDigits());
    }
}
