package sk.com.ymca.javaStart.lecture2.homework.task2;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        byte input_number1 = number.nextByte();
        byte i = 1;
        if ((input_number1 / 2) == ((input_number1 + 1) / 2)) {
            System.out.println("Число парное");
        } else {
            System.out.println("Число непарное");
        }

        byte input_number2 = number.nextByte();

        if ((input_number2 % 2) == 0) {
            System.out.println("Число парное");
        } else {
            System.out.println("Число непарное");
        }
    }
}
