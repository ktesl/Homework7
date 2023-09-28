package homework;

import org.testng.annotations.Test;

import java.util.Scanner;

public class CalculatorTest {

    @Test
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value a");
        double a = scan.nextDouble();

        System.out.println("Enter the operation");
        String operation = scan.next();

        System.out.println("Enter the value b");
        double b = scan.nextDouble();

        System.out.println("The result of your operation " + a + " " + operation + " " + b + " = ");

        if ("+".equals(operation)) {
            System.out.println(calculator.plus(a, b));
        } else if ("-".equals(operation)) {
            System.out.println(calculator.minus(a, b));
        } else if ("*".equals(operation)) {
            System.out.println(calculator.multiplication(a, b));
        } else if ("/".equals(operation)) {
            if (b != 0) {
                System.out.println(calculator.division(a, b));
            } else System.out.println("Сan't divide by zero!");
        } else System.out.println("Error: unknown operation");

    }

}
