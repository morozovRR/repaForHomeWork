package Homework02;

public class HomeWork02 {
    public static void main(String[] args) {
        within10and20(7,8);
        isPositiveOrNegative(-1);
        isNegative(0);
        printWordNTimes("Java", 3);
       // leapYear(4);


    }
    //Задание 1
    public static boolean within10and20(int a, int b) {
        if ((a+b)>=10 && (a+b)<=20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return false;
    }
    //Задание 2
    public static void isPositiveOrNegative(int x) {
        if (x>=0) {
            System.out.println(x + " число положительное");
        } else {
            System.out.println(x + " число отрицательное");
        }
    }
    //Задание 3
    public static boolean isNegative(int x) {
        if (x<0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return false;
    }
    //Задание 4
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
    /*
    //Задание 5
    public static boolean leapYear(int x) {
        if(x / 4 == 0 || x / 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        } return false;
    }
    */
}
