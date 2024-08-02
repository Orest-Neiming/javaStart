package sk.com.ymca.javaStart.lecture8.homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (; ;) {
            System.out.println("\nEnter first number-");
            double inputNum1 = sc.nextDouble();

            System.out.println("Enter second number-");
            double inputNum2 = sc.nextDouble();

            System.out.println("Enter operation(one of ( +, -, *, / )-");
            String inputOperation = sc.next();

            switch (inputOperation) {
                case "+":
                    System.out.println(inputNum1 + inputNum2);
                    break;
                case "-":
                    System.out.println(inputNum1 - inputNum2);
                    break;
                case "*":
                    System.out.println(inputNum1 * inputNum2);
                    break;
                case "/":
                    if (inputNum2 != 0){
                        System.out.println(inputNum1 / inputNum2);
                    } else {
                        System.out.println("Second number is not correct");
                    }
                    break;
                default:
                    System.out.println("nun");
            }
        }
    }
}
