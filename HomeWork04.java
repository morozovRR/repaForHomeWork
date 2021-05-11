package Homework04;
import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = SIZE - 1;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Ты победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил ИИ!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        } System.out.println("GAME OVER");

    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i=0; i<SIZE; i++)
            for (int j=0; j<SIZE; j++) {
                map [i][j] = DOT_EMPTY;
            }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        } System.out.println();
        for (int i=0; i<SIZE; i++) {
            System.out.print((i+1) + " ");
            for (int j=0; j<SIZE; j++) {
                System.out.print(map[i][j] + " ");
            } System.out.println();
        } System.out.println();
    }
    public static boolean isMapFull() {
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        } return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x<0 && x>=SIZE && y<0 && y>=SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }
    public static boolean emptyField(int y, int x) {
        return map[y][x] == DOT_EMPTY;
    }
    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Ваш ход от 1 до " + SIZE + " : ");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;

        } while (!isCellValid(y, x) || !emptyField(y, x));
        map[y][x] = DOT_X;
        System.out.println("Вы пошли: [" + (x + 1) + ":" + (y + 1) + "]");
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
            System.out.println("ИИ походил в точку [" + (x+1) + ":" + (y+1) + "]");
            map [y][x] = DOT_O;
    }
    public static boolean checkWin (char win) {
        int hor, ver, di1, di2;
        hor = 0;
        ver = 0;
        di1 = 0;
        di2 = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == win) {
                    hor++;
                } else if (map[i][j] != win && hor < DOTS_TO_WIN) {
                    hor = 0;
                }
                if (map[j][i] == win) {
                    ver++;
                }   else if (map[j][i] != win && ver < DOTS_TO_WIN) {
                    ver = 0;
                }
            }
            if (hor >= DOTS_TO_WIN || ver >= DOTS_TO_WIN) {
                return true;
            }
        }
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                int k = j + i;
                if (k < SIZE) {
                    if (map[i][k] == win) {
                        di1++;
                    } else if (map[i][k] != win && di1 < DOTS_TO_WIN) {
                        di1 = 0;
                    }
                }
                if (di1 >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        for (int j = 1; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                int k = j + i;
                if (k < SIZE) {
                    if (map[k][i] == win) {
                        di1++;
                    } else if (map[k][i] != win && di1 < DOTS_TO_WIN) {
                        di1 = 0;
                    }
                }
                if (di1 >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                int k = (SIZE - 1) - i;
                int l = j + i;
                if (k >= 0 && l < SIZE) {
                    if (map[l][k] == win) {
                        di2++;
                    } else if (map[l][k] != win && di2 < DOTS_TO_WIN) {
                        di2 = 0;
                    }
                }
                if (di2 >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        for (int j = 1; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                int k = (SIZE - 1) - j - i;
                if (k >= 0) {
                    if (map[i][k] == win) {
                        di2++;
                    } else if (map[i][k] != win && di2 < DOTS_TO_WIN) {
                        di2 = 0;
                    }
                }
                if (di2 >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }
}











