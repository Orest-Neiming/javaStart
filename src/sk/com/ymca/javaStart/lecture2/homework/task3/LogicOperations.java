package sk.com.ymca.javaStart.lecture2.homework.task3;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        System.out.println("Начальные значения - x=" + x + ", y=" + y + ", z=" + z);
        x += y >> x++ * z;
        System.out.println("При x += y >> x++ * z | x=" + x);
        z = ++x & y * 5;
        System.out.println("При z = ++x & y * 5 | x=" + z);
        y /= x + 5 | z;
        System.out.println("При y /= x + 5 | z | x=" + y);
        z = x++ & y * 5;
        System.out.println("При z = x++ & y * 5 | x=" + z);
        x = y << x++ ^ z;
        System.out.println("При x = y << x++ ^ z | x=" + x);
        System.out.println("Резльтат подсчетов - x=" + x + ", y=" + y + ", z=" + z);
    }
}
