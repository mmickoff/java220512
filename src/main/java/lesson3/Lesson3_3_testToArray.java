package lesson3;

import java.util.Arrays;

public class Lesson3_3_testToArray {

    public static void main(String[] args) {
        testTwoArray();
    }

    private static void testTwoArray() {

        int[][] arr1 = new int[8][6];
        int a = 1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = a++ * 2;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr1));
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%2d ", arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int[] deepDatum : arr1){
            for (int num : deepDatum){
                System.out.printf ("%2d ", num);
            }
            System.out.println();
        }

    }

}
