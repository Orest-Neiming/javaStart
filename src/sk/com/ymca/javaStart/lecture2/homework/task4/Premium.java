package sk.com.ymca.javaStart.lecture2.homework.task4;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        System.out.println("Давайте узнаем вашу премию. \n Сколько лет вы у нас работаете?");
        Scanner sc = new Scanner(System.in);
        byte user_work_years = sc.nextByte();

        System.out.println("Какая у вас зарплата?");
        int user_salary = sc.nextInt();

        float[] premium_percent = {0.1f, 0.15f, 0.25f, 0.35f, 0.45f, 0.50f};
        float premium = 0f;
        for (int i = 25, j = 5; i >= 0; i -= 5, --j) {
            if (user_work_years >= i){
                premium = user_salary * premium_percent[j];
                System.out.println("Ваша премия составляет: " + premium);
                break;
            }
        }
    }
}
