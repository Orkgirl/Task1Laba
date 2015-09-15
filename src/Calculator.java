import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Olha_Krasko on 9/14/2015.
 * The class includes a calculator function summation, subtraction, division and multiplication of two numbers
 */
public class Calculator {

    public void calculator() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double result;
        while (true)
            try {

                System.out.println("Enter the first number: ");
                double firstNumber = Double.parseDouble(reader.readLine());

                System.out.println("Enter the operation (+ , - , * , /): ");
                String operation = reader.readLine();

                System.out.println("Enter the second number: ");
                double secondNumber = Double.parseDouble(reader.readLine());

                if (operation.equals("+")) {
                    result = firstNumber + secondNumber;
                    System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                } else if (operation.equals("-")) {
                    result = firstNumber - secondNumber;
                    System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                } else if (operation.equals("*")) {
                    result = firstNumber * secondNumber;
                    System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                } else if (operation.equals("/")) {
                    result = firstNumber / secondNumber;
                    System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                } else {
                    System.out.println("Unknown operation");
                }
                break;

            } catch (NumberFormatException ex) {
                System.out.println("Enter the number, please");
            }
    }

}