package sk.com.ymca.javaStart.lecture5.classwork.ex6;

public class CycleBreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            if (i == 3) continue;
            System.out.println(i);
            if (i == 5) break;
        }
    }
}
