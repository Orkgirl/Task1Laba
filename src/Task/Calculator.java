package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public int calculator() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        while (true)
            try {

                System.out.println("Enter the first number: ");
                int firstNumber = Integer.parseInt(reader.readLine());

                System.out.println("Enter the operation (+ , - , * , /): ");
                String operation = reader.readLine();

                System.out.println("Enter the second number: ");
                int secondNumber = Integer.parseInt(reader.readLine());
                if (operation.equals("/") == true && secondNumber == 0) {
                    System.out.println("Error! Division by zero");
                }

                if (operation.equals("+")) {
                    result = add(firstNumber, secondNumber);
                } else if (operation.equals("-")) {
                    result = sub(firstNumber ,secondNumber);
                } else if (operation.equals("*")) {
                    result = mult(firstNumber, secondNumber);
                } else if (operation.equals("/")) {
                    result = div(firstNumber, secondNumber);
                } else {
                    System.out.println("Unknown operation");
                }
                break;

            } catch (NumberFormatException ex) {
                System.out.println("Enter the number, please");
            }
        System.out.println("Result: " + result);
        return result;
    }


    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();
        calc.calculator();
    }

}
