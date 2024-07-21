package sk.com.ymca.myCode;

import java.util.Scanner;

public class ConsoleCalculator {
    static char[] AddToEndArray(char[] arr, char item_for_add_to_arr){
        char[] arr_for_add_to_arr = new char[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            arr_for_add_to_arr[i] = arr[i];
        }
        arr_for_add_to_arr[arr.length] = item_for_add_to_arr;
        return arr_for_add_to_arr;
    }

    static int[] AddToEndArray(int[] arr, int item_for_add_to_arr){
        int[] arr_for_add_to_arr = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            arr_for_add_to_arr[i] = arr[i];
        }
        arr_for_add_to_arr[arr.length] = item_for_add_to_arr;
        return arr_for_add_to_arr;
    }

    static double[] AddToEndArray(double[] arr, double item_for_add_to_arr) {
        double[] arr_for_add_to_arr = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr_for_add_to_arr[i] = arr[i];
        }
        arr_for_add_to_arr[arr.length] = item_for_add_to_arr;
        return arr_for_add_to_arr;
    }
    static int[] AddToArray(int[] arr, int item_for_add_to_arr, int slot) {
        int[] arr_for_add_to_arr = new int[arr.length + 1];
        if (slot > -1) {
            int i = 0;
            for (; i < slot; i++) {
                arr_for_add_to_arr[i] = arr[i];
            }
            arr_for_add_to_arr[i] = item_for_add_to_arr;

            for (; i < arr.length; i++) {
                arr_for_add_to_arr[i + 1] = arr[i];
            }
            return arr_for_add_to_arr;
        } else {
            return arr;
        }
    }
    static char[] AddToArray(char[] arr, char item_for_add_to_arr, int slot) {
        char[] arr_for_add_to_arr = new char[arr.length + 1];
        if (slot > -1) {
            int i = 0;
            for (; i < slot; i++) {
                arr_for_add_to_arr[i] = arr[i];
            }
            arr_for_add_to_arr[i] = item_for_add_to_arr;

            for (; i < arr.length; i++) {
                arr_for_add_to_arr[i + 1] = arr[i];
            }
            return arr_for_add_to_arr;
        } else {
            return arr;
        }
    }
    static int[] DeleteFromArray(int[] arr, int slot) {
        int[] arr_for_set_arr = new int[arr.length - 1];
        int i = 0;
        if (slot < arr.length & slot > -1) {
            for (; i < slot; i++) {
                arr_for_set_arr[i] = arr[i];
            }
            for (; i < arr.length - 1; i++) {
                arr_for_set_arr[i] = arr[i + 1];
            }
            return arr_for_set_arr;
        } else {
            return arr;
        }
    }
    static char[] DeleteFromArray(char[] arr, int slot) {
        char[] arr_for_set_arr = new char[arr.length - 1];
        int i = 0;
        if (slot < arr.length & slot > -1) {
            for (; i < slot; i++) {
                arr_for_set_arr[i] = arr[i];
            }
            for (; i < arr.length - 1; i++) {
                arr_for_set_arr[i] = arr[i + 1];
            }
            return arr_for_set_arr;
        } else {
            return arr;
        }
    }
    static double[] DeleteFromArray(double[] arr, int slot) {
        double[] arr_for_set_arr = new double[arr.length - 1];
        int i = 0;
        if (slot < arr.length & slot > -1) {
            for (; i < slot; i++) {
                arr_for_set_arr[i] = arr[i];
            }
            for (; i < arr.length - 1; i++) {
                arr_for_set_arr[i] = arr[i + 1];
            }
            return arr_for_set_arr;
        } else {
            return arr;
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите математический пример(допустмые символы: 0-9, '.', '+', '-', '*',' /', '(', ')';");
        char[] all_nubmers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] all_math_opetators = {'.', '+', '-', '*', '/', '(', ')'};
        for (; ;) {
            Scanner sc = new Scanner(System.in);
            String input_mathematical_exemple = sc.nextLine();
            char[] input_mathematical_exemple_as_chars = input_mathematical_exemple.toCharArray();
            double[] operations_numbers = {};
            int num_number = -1;
            boolean create_new_num = true;
            boolean num_is_double = false;
            int double_log_num = 10;

            int[] number_subsequence = {};
            char[] operators_subsequence = {};
            int[] low_priority_operators_subsequence = {0};
            int[] height_priority_operators_subsequence = {0};
            int quantity_parenthesis = 0;
            for (int i = 0; i < input_mathematical_exemple_as_chars.length; i++) {
                for (int j = 0; j < 10; j++) {
                    if (input_mathematical_exemple_as_chars[i] == all_nubmers[j]) {
                        if (create_new_num == true) {
                            operations_numbers = AddToEndArray(operations_numbers, j);
                            num_number++;
                            create_new_num = false;
                            break;
                        } else if (num_is_double == true) {
                            operations_numbers[num_number] = operations_numbers[num_number] + (double) j / double_log_num;
                            double_log_num *= 10;
                            break;
                        } else {
                            operations_numbers[num_number] = operations_numbers[num_number] * 10 + j;
                            break;
                        }
                    }
                }
                if (input_mathematical_exemple_as_chars[i] == '.') {
                    num_is_double = true;
                    continue;
                } else {
                    for (int j = 1; j < all_math_opetators.length - 2; j++) {
                        if (input_mathematical_exemple_as_chars[i] == all_math_opetators[j]) {
                            create_new_num = true;
                            num_is_double = false;
                            double_log_num = 10;
                        }
                    }
                }
                if (input_mathematical_exemple_as_chars[i] == '+') {
                    number_subsequence = AddToArray(number_subsequence, num_number, low_priority_operators_subsequence[quantity_parenthesis]);
                    operators_subsequence = AddToArray(operators_subsequence, '+', low_priority_operators_subsequence[quantity_parenthesis]);
                    for (int j = 0; j <= quantity_parenthesis; j++) {
                        low_priority_operators_subsequence[j]++;
                        height_priority_operators_subsequence[j]++;
                    }
                    height_priority_operators_subsequence[quantity_parenthesis]--;
                } else if (input_mathematical_exemple_as_chars[i] == '-') {
                    number_subsequence = AddToArray(number_subsequence, num_number, low_priority_operators_subsequence[quantity_parenthesis]);
                    operators_subsequence = AddToArray(operators_subsequence, '-', low_priority_operators_subsequence[quantity_parenthesis]);
                    for (int j = 0; j <= quantity_parenthesis; j++) {
                        low_priority_operators_subsequence[j]++;
                        height_priority_operators_subsequence[j]++;
                    }
                    height_priority_operators_subsequence[quantity_parenthesis]--;
                } else if (input_mathematical_exemple_as_chars[i] == '*') {
                    number_subsequence = AddToArray(number_subsequence, num_number, height_priority_operators_subsequence[quantity_parenthesis]);
                    operators_subsequence = AddToArray(operators_subsequence, '*', height_priority_operators_subsequence[quantity_parenthesis]);
                    for (int j = 0; j <= quantity_parenthesis; j++) {
                        low_priority_operators_subsequence[j]++;
                        height_priority_operators_subsequence[j]++;
                    }
                } else if (input_mathematical_exemple_as_chars[i] == '/') {
                    number_subsequence = AddToArray(number_subsequence, num_number, height_priority_operators_subsequence[quantity_parenthesis]);
                    operators_subsequence = AddToArray(operators_subsequence, '/', height_priority_operators_subsequence[quantity_parenthesis]);
                    for (int j = 0; j <= quantity_parenthesis; j++) {
                        low_priority_operators_subsequence[j]++;
                        height_priority_operators_subsequence[j]++;
                    }
                } else if (input_mathematical_exemple_as_chars[i] == '(') {
                    quantity_parenthesis++;
                    if (!(low_priority_operators_subsequence.length > quantity_parenthesis)) {
                        low_priority_operators_subsequence = AddToEndArray(low_priority_operators_subsequence, 0);
                        height_priority_operators_subsequence = AddToEndArray(height_priority_operators_subsequence, 0);
                    }
                } else if (input_mathematical_exemple_as_chars[i] == ')') {
                    quantity_parenthesis--;
                }
            }
            for (int i = 0; i < number_subsequence.length; i++) {
                if (operators_subsequence[i] == '+'){
                    operations_numbers[number_subsequence[i]] += operations_numbers[number_subsequence[i] + 1];
                    operations_numbers = DeleteFromArray(operations_numbers,number_subsequence[i] + 1);
                    for (int j = 1; i + j < number_subsequence.length; j++) {
                        if (number_subsequence[i] < number_subsequence[j + i]) {
                            number_subsequence[j + i]--;
                        }
                    }
                } else if (operators_subsequence[i] == '-') {
                    operations_numbers[number_subsequence[i]] -= operations_numbers[number_subsequence[i] + 1];
                    operations_numbers = DeleteFromArray(operations_numbers,number_subsequence[i] + 1);
                    for (int j = 1; i + j < number_subsequence.length; j++) {
                        if (number_subsequence[i] < number_subsequence[j + i]) {
                            number_subsequence[j + i]--;
                        }
                    }
                } else if (operators_subsequence[i] == '*') {
                    operations_numbers[number_subsequence[i]] *= operations_numbers[number_subsequence[i] + 1];
                    operations_numbers = DeleteFromArray(operations_numbers,number_subsequence[i] + 1);
                    for (int j = 1; i + j < number_subsequence.length; j++) {
                        if (number_subsequence[i] < number_subsequence[j + i]) {
                            number_subsequence[j + i]--;
                        }
                    }
                } else if (operators_subsequence[i] == '/') {
                    operations_numbers[number_subsequence[i]] /= operations_numbers[number_subsequence[i] + 1];
                    operations_numbers = DeleteFromArray(operations_numbers,number_subsequence[i] + 1);
                    for (int j = 1; i + j < number_subsequence.length; j++) {
                        if (number_subsequence[i] < number_subsequence[j + i]) {
                            number_subsequence[j + i]--;
                        }
                    }
                }
            }
            System.out.println("Результат: " + operations_numbers[0] + "\n Можете ввести следующий пример:");
        }
    }
}


