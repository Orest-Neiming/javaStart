package sk.com.ymca.javaStart.lecture5.practice;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        byte input_number1 = sc.nextByte();

        System.out.println("Введите второе число");
        byte input_number2 = sc.nextByte();

        sc.close();

        byte log_number1 = 0, log_number2 = 0;
        if (input_number1 < input_number2) {
            log_number1 = input_number1;
            log_number2 = input_number2;
        } else if (input_number1 > input_number2) {
            log_number1 = input_number2;
            log_number2 = input_number1;
        } else {
            System.out.println("Вы ввели одинаковые числа \n Результат: 0" );
        }
        byte sum_result = 0, parity_sum_result = 0;

        for (int change_number = log_number1 + 1; change_number < log_number2; change_number++) {
            sum_result += change_number;
        }
        System.out.println("Сумма чисел между введенными: " + sum_result);

        for (int change_number = log_number1 + 1; change_number < log_number2; change_number++) {
            if ((change_number % 2) == 0){
                parity_sum_result += change_number;
            }
        }
        System.out.println("Сумма парних чисел между введенными: " + parity_sum_result);
    }
}
