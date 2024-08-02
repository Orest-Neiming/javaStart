package sk.com.ymca.javaStart.lecture8.practice.ex1;

import java.util.Scanner;

public class SayToMy {
//    static void sayHello (String name) throws InterruptedException {
//        String helloUser = name + ", вітаю";
//        for (int i = 0; i < helloUser.length(); i++) {
//            System.out.print(helloUser.charAt(i));
//            Thread.sleep(200);
//        }
//            System.out.println();
//    }
//    static void sayBye (String name, String userSaid) throws InterruptedException {
//        if (userSaid.toLowerCase().equals("папа")) {
//            String helloUser = "Папа, " + name;
//            for (int i = 0; i < helloUser.length(); i++) {
//                System.out.print(helloUser.charAt(i));
//                Thread.sleep(200);
//            }
//        }
//    }
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Введите ваше имя -");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        Thread.sleep(500);
//        sayHello(name);
//
//        String userSaid = sc.nextLine();
//        sayBye(name, userSaid);
//    }
    static String sayHello(String name){
        return "Hello " + name;
    }
    static String sayBye (){
        return "Bye bye";
    }
    public static void main(String[] args) {
        System.out.println("Enter your name -");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(sayHello(name) + "\n" + sayBye());
    }
}
