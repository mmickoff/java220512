package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '-';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private final static char[][] MAP = new char[SIZE][SIZE];
    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j]=DOT_EMPTY;
            }
        }

        System.out.println(Arrays.toString(MAP));
    }


}
