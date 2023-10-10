package main;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SumOfDigits {

    private final String errorMessage = "ตัวเลขต้องมีสองหลัก";

    public String computeSumOfDigits(int number) {
        if (number < 10) {
            return errorMessage;
        }

        List<String> steps = new ArrayList<>();
        while (number >= 10) {
            int sum = 0;
            String step = "";
            while (number > 0) {
                int digit = number % 10;
                sum += digit;      
                step = digit + " + " + step; 
                number /= 10;      
            }
            steps.add(step.substring(0, step.length() - 3) + " = " + sum);
            number = sum;
        }
        steps.add(Integer.toString(number));
        
        StringBuilder output = new StringBuilder();
        for (String s : steps) {
            output.append(s).append("\n");
        }
        return output.toString().trim();
    }

    public static void main(String[] args) {
        SumOfDigits sod = new SumOfDigits();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        String result = sod.computeSumOfDigits(inputNumber);
        System.out.println(result);
    }
}