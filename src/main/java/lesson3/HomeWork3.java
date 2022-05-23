package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        fillArray2();
        initValue();
        fillDiagonal();
        finMax(z);
        finMin(z);
        checkBalance(new int[]{2, 5, 4, 4, 7, 7});
        arrayShift();
    }


    // задача 1 - Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void invertArray() {
        int[] a = new int[10];  // создаём пустой массив
        System.out.print("a[10] - ");  // ставим в начало наименование массива
        for (int i = 0; i < a.length; i++) {  // проходим по массиву циклом
            if (i % 2 == 0) {  // определяем ячейки с 0м
                a[i] = 1;  // присваиваем им 1.
            } else {  // определяем ячейки с 1й
                a[i] = 0;  // присваиваем им 0.
            }
        }
        String s = Arrays.toString(a); // печать в консоль
        System.out.println(s);
    }
    // задача 2 - Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void fillArray() {
        int[] b = new int[100];  // создаём пустой массив на 100яч.
        for (int i = 0; i < b.length; i++) {  // проходим по массиву
            b[i] = i + 1;  // присваиваем ячейкам значения
        }
        String s = Arrays.toString(b); // печать в консоль
        System.out.println(s);
    }
    // задача 3 - Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void fillArray2() {
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  // определяем массив
        {
            for (int i = 0; i < b.length; i++) {  // проходим циклом по массиву
                if (b[i] < 6) {  // находим числа меньше 6
                    b[i] *= 2;  // умножаем найденные числа на 6
                }
            }
        }
        String s = Arrays.toString(b); // печать в консоль
        System.out.println(s);
    }

    // задача 4 - Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    // одинаковое), и с
    // помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну
    //  из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по
    // следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillDiagonal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину стороны равностороннего массива: ");
        int leng = sc.nextInt(); // вводим длину строки
        int i = leng; // задаём переменную, опред. длинну строки
        int j = i; // приравниваем стороны массива
        int[][] a = new int[i][j]; // задаём массив
        for (i = 0; i < leng; i++) { // прохродим в начало строки
            System.out.println(); // переходим на сл.строку
            for (j = 0; j < leng; j++) { // проходим вдоль строк(и)
                if (i == j || (leng - 1 - i) == j) { // находим, яч.для единиц
                    System.out.print("  1");
                } else {
                    System.out.printf("  *"); //  "%2d", a[i][j]
                }
            }
        }
        System.out.println();
    }

    // задача 5 - Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    private static void initValue() {
        Scanner sc = new Scanner(System.in); // создали сканер
        System.out.print("Введите длину массива: "); // запрос длины строки
        int len = sc.nextInt(); // вводим длину массива
        System.out.print("Введите значение ячейки: "); // запрос знач.яч.
        int initialValue = sc.nextInt(); // вводим значеник в ячейке
        int i = len; // создаём переменную для длины строки
        int[] d = new int[i]; // создаём массив
        for (i = 0; i < len; i++) { // проходим по массиву
            d[i] = initialValue; // присваиваем значения яч-м
        }
        String h = Arrays.toString(d); // печать в консоль
        System.out.println(h);
    }
    // задача 6* - Задать одномерный массив и найти в нем минимальный и максимальный элементы

    public static int z[] = {8, 44, 6, -11, 4, 2, -8, 6, 29, 30, 34, 3, 6, -9};

    public static void finMax(int[] z) { // создаём метод поиска максим.знач. с аргументом массив
        int max = z[0];
        for (int i = 0; i < z.length; i++) {
            if (z[i] > max) {
                max = z[i];
            }
        }
        System.out.println("Максимальное значение массива = " + max + ".");
    }

    public static void finMin(int[] z) { // создаём метод поиска миним.знач. с аргументом массив
        int min = z[0];
        for (int i = 0; i < z.length; i++) {
            if (z[i] < min) {
                min = z[i];
            }
        }
        System.out.println("Миниимальное значение массива = " + min + ".");
    }


    // Задача 7** - Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

    public static boolean checkBalance(int[] k) {
        int sum = 0;
        for (int i = 0; i < k.length; i++) {
            sum = sum + k[i];
        }
        if (sum % 2 == 0) {
            int leftSum = 0;
            for (int i = 0; i < k.length; i++) {
                if (leftSum == sum / 2) {
                }
            }
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

// Задача 8*** - Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.  Для усложнения задачи нельзя пользоваться вспомогательными массивами.   Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2   (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
//

    private static void arrayShift() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int i1 = scanner.nextInt();
        int[] b = new int[i1];
        System.out.println("Введите смещение");
        int a1 = -scanner.nextInt();
        for (int i = 0; i < b.length; i++) {
            int a2 = a1 % i1;
            b[i] = i + a2;
            if (b[i] > b.length - 1) {
                b[i] = b[i] - b.length;
            }
            if (b[i] < 0) {
                b[i] = b[i] + b.length;
            }
            System.out.print(b[i] + "; ");
//            System.out.println();
        }

    }
}


