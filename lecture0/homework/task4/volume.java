package sk.com.ymca.javaStart.lecture0.homework.task4;

public class volume {
    public static void main(String[] args) {
        final double PI = Math.PI;
        int r = 30;
        int h = 55;
        double v = 2 * PI * Math.pow(r, 2) * h;
        double s = (2 * PI * Math.pow(r, 2) * h) + (2 * PI * Math.pow(r, 2) * h);
        System.out.println("Об'єм циліндра:" + v + "\n" + "Радіус циліндра:" + s);
    }
}
