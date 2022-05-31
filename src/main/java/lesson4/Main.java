package lesson4;
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
    private static int turnsCount = 0;

    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
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
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + SPACE_MAP);
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
            while (rowNumber < 0 || rowNumber > 2) {
                System.out.println("Это значение располагается вне игрового поля... Снова введите номер строки: ");
                rowNumber = in.nextInt() - 1;
            }
            System.out.println("Введите номер столбца: ");
            columnNumber = in.nextInt() - 1;
            while (columnNumber < 0 || columnNumber > 2) {
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
    }




    private static boolean checkDraw() {
       /* for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return false;*/
        return turnsCount >= SIZE * SIZE;
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
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber, columnNumber));
        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }
}