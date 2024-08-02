package sk.com.ymca.javaStart.lecture8.practice.ex2;

import java.util.Scanner;

public class Ex2 {
    static double dubSum(double inputNum1, double inputNum2){
        return inputNum1 + inputNum2;
    }
    public static void main(String[] args) {
        System.out.println("Enter the first number -");
        Scanner sc = new Scanner(System.in);
        double inputNum1 = sc.nextDouble();

        System.out.println("Enter the second number -");
        double inputNum2 = sc.nextDouble();
        System.out.println(dubSum(inputNum1, inputNum2) );
    }
}
