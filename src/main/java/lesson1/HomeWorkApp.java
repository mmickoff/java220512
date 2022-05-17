package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSig();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple ");
    }

    public static void checkSumSig() {
        int a = 4;
        int b = -10;
        if ((a + b) > 0) {
            System.out.println("Сумма чисел положительна");
        } else if ((a + b) < 0) {
            System.out.println("Сумма чисел отрицательна");
        } else {
            System.out.println("Сумма чисел равна нулю");
        }
    }

    public static void printColor() {
        int value = 125;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зелёный");
        } else {
            System.out.println("Жёлтый");
        }
    }

    public static void compareNumbers() {
        int a = 4;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


}
