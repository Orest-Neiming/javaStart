package sk.com.ymca.javaStart.lecture2.homework.task1;


public class UniversetyExems {
    public static void main(String[] args) {
        boolean[][] students_test_result = {{true, true}, {false, true}, {false, false}};
        String[] students_number = {"Первый", "Второй", "Третий"};
        for (int i = 0; i < 3; i++) {
            if ((students_test_result[i][0] & students_test_result[i][1]) == true) {
                System.out.println(students_number[i] + " студент поступил в первый вуз");
            } else if (students_test_result[i][0] == !false) {
                System.out.println(students_number[i] + " студент поступил во второй вуз");
            } else {
                System.out.println(students_number[i] + " студент поступил в третий вуз");
            }
        }
    }
}
