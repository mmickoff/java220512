package lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '-';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private final static char[][] MAP = new char[SIZE][SIZE];

    private static final String HEADER_FIRST_SYMBOL = "*";
    private static final String SPACE_MAP = " ";

    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        playGame();
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(/*SPACE_MAP + */i + 1 + SPACE_MAP);
        }
        System.out.println();
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + SPACE_MAP);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
//        конец игры;

            aiTurn();
            printMap();
//        конец игры;
        }


    }

    private static void humanTurn() {
        System.out.println("Ход человека!");

        int rowNumber;
        int columnNumber;

        System.out.println("Введите номер строки: "); 
        rowNumber = in.nextInt() - 1;
        
        System.out.println("Введите номер столбца: "); 
        columnNumber = in.nextInt() - 1;

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
    }


    private static void aiTurn() {

    }

}
