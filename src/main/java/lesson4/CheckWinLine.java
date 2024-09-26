package lesson4;

import java.util.Scanner;

public class CheckWinLine<playGame> {

    private static Scanner in = new Scanner(System.in);
    private static int linesPic = 1;
    private static int winLinesPic;


    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '-';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private final static char[][] MAP = new char[SIZE][SIZE];

//    private playGame;

    int rowNumber;
    int columnNumber;
    int LastRowTurn = rowNumber;
    int LastColumnTurn = columnNumber;


    public static void main(String[] args) {

        System.out.print("Введите номер строки: ");
        winLinesPic = in.nextInt();
        FindDiagonalPlusRowPlusColumns();


    }

    private static boolean FindDiagonalPlusRowPlusColumns() {



        int n = linesPic;
        ;
        int LastRowTurn;
        int LastColumnTurn;

        for (n = 1; n <= winLinesPic ; n++) {
            int rowNumber = 0;
            int columnNumber;
//            if (MAP[rowNumber][columnNumber] != DOT_HUMAN && (rowNumber))
                for (int i = 0; i < SIZE; i++) {

                }
        }


        return false;
    }
}
