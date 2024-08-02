package sk.com.ymca.javaStart.lecture7.practice;

import java.util.Scanner;

public class Ex1 {
    static int sum(int number1, int number2){
        return number1 + number2;
    }

    static int minus(int number1, int number2){
        return number1 - number2;
    }

    static int multiplication(int number1, int number2){
        return number1 * number2;
    }

    static int division(int number1, int number2){
        if (number2 == 0){
            System.out.println("error");
            return 0;
        } else {
            return number1 / number2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int input_num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int input_num2 = sc.nextInt();

        System.out.println("Выберите операцию. Введите один из следующих символов: \"+\", \"-\", \"*\", \"/\";");

        String input_operation = sc.next();
        int result = 0;
        if (input_operation.equals("+")){
            result = sum(input_num1, input_num2);
        } else if (input_operation.equals("-")){
            result = sum(input_num1, input_num2);
        } else if (input_operation.equals("*")){
            result = sum(input_num1, input_num2);
        } else if (input_operation.equals("/")){
            result = sum(input_num1, input_num2);
        } else {
            System.out.println("Символ введен некоректно");
        }
        System.out.println(result);
    }
}
