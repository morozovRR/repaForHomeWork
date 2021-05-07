package Homework01;

// Задание 1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }
    // Задание 2
    public static void printThreeWords() {
        String a="Orange", b="Banana", c="Apple";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    // Задание 3
    public static void checkSumSign() {
        int a=500, b=-278, c = a + b;
        System.out.println("500+-278="+c);
        if (c<=0) {
            System.out.println("Сумма отрицательная");
        } else System.out.println("Сумма положительная");

    }
    // Задание 4
    public static void printColor() {
        int value=101;
        if (value <=0)
            System.out.println("RED");
        else if (value >=1 && value<=100)
            System.out.println("YELLOW");
        else
            System.out.println("GREEN");

    }
    // Задание 5
    public static void compareNumbers() {
        int a=50, b=100;
        if (a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
    // Задание 6. Не получается обратиться к методам 2-5 из main
}
