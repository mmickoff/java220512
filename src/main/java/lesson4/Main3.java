package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main3 {

    private static Scanner in = new Scanner(System.in);
    private static int size = mapVolume();
    private static int winLine = winLineVolume();
    private static final char DOT_EMPTY = '-';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private final static char[][] MAP = new char[size][size];
    private static final String HEADER_FIRST_SYMBOL = "*";
    private static final String SPACE_MAP = " ";

    private static Random random = new Random();
    private static int turnsCount = 0;

    private static int lastRowNumber;
    private static int lastColumnNumber;

    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static int mapVolume() {
        System.out.println("Введите размер игрового поля:");
        size = in.nextByte();
        return size;
    }

    private static int winLineVolume() {
        System.out.println("Введите размер длины победной линии:");
        winLine = in.nextByte();
        return winLine;
    }

    private static void initMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + SPACE_MAP);
        }
        System.out.println();
    }

    private static void printMapBody() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + SPACE_MAP);
            for (int j = 0; j < size; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }
            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("Ход человека!");
        int rowNumber;
        int columnNumber;
        while (true) {
            System.out.println("Введите номер строки: ");
            rowNumber = in.nextInt() - 1;
            while (rowNumber < 0 || rowNumber > size - 1) {
                System.out.println("Это значение располагается вне игрового поля... Снова введите номер строки: ");
                rowNumber = in.nextInt() - 1;
            }
            System.out.println("Введите номер столбца: ");
            columnNumber = in.nextInt() - 1;
            while (columnNumber < 0 || columnNumber > size - 1) {
                System.out.println("Это значение располагается вне игрового поля... Снова введите номер строки: ");
                columnNumber = in.nextInt() - 1;
            }
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            } else {
                System.out.printf("Ячейка с координатами: %d:%d занята. Переходите. ", rowNumber + 1, columnNumber + 1);
            }
        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
        lastRowNumber = rowNumber;
        lastColumnNumber = columnNumber;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println(("Ура! Вы победили!"));
            } else {
                System.out.println("Восстание машин близко - победил ИИ...");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("Увы.... никто не победил. Попробуйте ещё раз... ");
            return true;
        }
        return false;
    }

    private static boolean checkWin(char symbol) {

        int n = 0;
        int lastRowNumberLeft = lastRowNumber--;
        int lastColumnNumberLeft = lastColumnNumber--;
        int lastRowNumberRight = lastRowNumber++;
        int lastColumnNumberRight = lastColumnNumber++;
        do {
            if (MAP[lastRowNumber][lastColumnNumber] == symbol) {
                lastRowNumberLeft--;
                lastColumnNumberLeft--;
                n++;
            } else {
                lastRowNumberRight++;
                lastColumnNumberRight++;
                n++;
            }
        } while (n < winLine);

        do {
            if (MAP[lastRowNumber][lastColumnNumber] == symbol) {
                lastRowNumber--;
                lastColumnNumber++;
                n++;
            } else {
                lastRowNumber++;
                lastColumnNumber--;
                n++;
            }
        } while (n < winLine);

        do {
            if (MAP[lastRowNumber][lastColumnNumber] == symbol) {
                lastRowNumber--;
                n++;
            } else {
                lastRowNumber++;
                n++;
            }
        } while (n < winLine);

        do {
            if (MAP[lastRowNumber][lastColumnNumber] == symbol) {
                lastColumnNumber++;
                n++;
            } else {
                lastColumnNumber--;
                n++;
            }
        } while (n < winLine);

        return false;
    }



       /* private static boolean checkWin(char symbol) {
        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
            return true;
        }
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        return false;
    }*/


    private static boolean checkDraw() {

        return turnsCount >= size * size;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void aiTurn() {
        System.out.println("Ход компьютера!");
        int rowNumber;
        int columnNumber;
        /*} while (true) {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }*/
        do {
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);
        } while (!isCellFree(rowNumber, columnNumber));
        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }
}