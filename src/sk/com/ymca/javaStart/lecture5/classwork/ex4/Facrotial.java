package sk.com.ymca.javaStart.lecture5.classwork.ex4;

public class Facrotial {
    public static void main(String[] args) {
        int counter = 4;
        int factorial = 1;
        do {
            factorial *= counter--;
        } while (counter > 0);
        System.out.println(factorial);
    }
}
