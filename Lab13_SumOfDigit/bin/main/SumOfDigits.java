package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int number) {
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
        
        
        for (String step : steps) {
            System.out.println(step);
        }
        
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        int result = sumOfDigits(inputNumber);
        System.out.println("Final result: " + result);
    }
}