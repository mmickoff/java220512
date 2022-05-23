package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Lesson3_4_testRandom {

    public static void main(String[] args) {
//        testRandom();
//        testR1();
        testR1();
//        testConsoleInput();
    }

    private static void testConsoleInput() {


    }

    private static void testRandom() {
        int[] data = new int[40];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(777);

        }
        System.out.println(Arrays.toString(data));
    }

    private static void testR1() {
        int[] r1 = new int[15];
        int[] r2 = new int[15];
        int[] r3 = new int[35];
        double[] r4 = new double[15];
        Random rndm = new Random();

        for (int i = 0; i < r1.length; i++) {
            r1[i] = rndm.nextInt(65);
            r2[i] = rndm.nextInt(63) + 7;
            r3[i] = rndm.nextInt(89, 155);
            r4[i] = rndm.nextDouble(12.1, 45.9);

            r1[i] = (int) (Math.random() * 1500);

        }
        System.out.println(Arrays.toString(r1));
        System.out.println(Arrays.toString(r2));
        System.out.println(Arrays.toString(r3));
        System.out.printf(Arrays.toString(/*"%2f", */r4));
//        System.out.printf("%2f", r4);
    }

}
