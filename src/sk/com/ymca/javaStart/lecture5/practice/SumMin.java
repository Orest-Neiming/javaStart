package sk.com.ymca.javaStart.lecture5.practice;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte(), b = sc.nextByte(), result = 0;
        while (a < b-1) {
            a++;
            result += a;
            if (a < b-1) continue;
            System.out.println(result);
        }
    }
}
