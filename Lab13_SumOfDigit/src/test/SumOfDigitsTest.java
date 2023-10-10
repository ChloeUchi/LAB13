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
		num4 = new SumOfDigits(057);
		num5 = new SumOfDigits(05);
		num6 = new SumOfDigits(0);
		num7 = new SumOfDigits(1);
		num8 = new SumOfDigits(9);
	}

    @Test
    public void testSumOfDigits() {
        assertEquals(8, num1);
        assertEquals(4, num2);
        assertEquals(8, num3);
        assertEquals(1, num4);
        assertEquals(5, num5);
        assertEquals(0, num6);
        assertEquals(0, num7);
        assertEquals(0, num8);
    }
}
