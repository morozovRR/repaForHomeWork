package Homework03;

public class HomeWork03 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        retArr(50,100);
        //minMax(10);
    }
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (i==0) {
                i=1;
            } else {
                i=0;
            }
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
    }
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i]*=2;
            }
        }
    }
    public static void fillDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i]=1;
            arr[i][arr.length-1-i]=1;
        }
    }

    public static int retArr(int len, int initValue) {
        int[] retArr = new int[len];

        for (int i = 0; i < retArr.length; i++) {
            retArr[i] = initValue;
        }

        return retArr[initValue];
    }

    public static int minMax(int[] arr) {
        int min=arr[0];
        int max=arr[10];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            } else max=arr[i];
        }
        return min;//&&max;
        //return max;
    }

}


