package lesson3;

import java.util.Arrays;

public class Lesson3_2_testArray {

    static final int ARRAY_SIZE = 8;

    public static void main(String[] args) {
        testOneArray();
        testTwoArray();
//        System.out.println(convertArrayToString(data));
    }

    private static void testOneArray() {
        int[] data = new int[ARRAY_SIZE];
        int[] data2 = {1, 2, 3, 4, 5};
        data[0] = 3;
        data[2] = 345;
        data[data.length - 1] = 56;

//        System.out.println(data[0]);
//        System.out.println(data[1]);
//        System.out.println(data[2]);
//        System.out.println(data[3]);
//        System.out.println(data[4]);

//        for (int i = 0; i < data.length; i++) {
//            data[i] *= 2;
//        }
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + ", ");
//        }
        System.out.println(convertArrayToString(data));
//        System.out.println(convArrToStr(data));
//        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

    }

    private static String convArrToStr(int[] data) {
        String str2 = "[";
        for (int i = 0; i < data.length; i++) {
            str2 += data[i];
            if (i != data.length - 1) {
                str2 += ", ";
            }
        }
        str2 += "]";
        return str2;
    }

    private static void testTwoArray() {
        int[][] deepData = new int[5][7];

        int n = 1;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = n++;
            }
        }
        System.out.println(Arrays.deepToString(deepData));

    }

//        System.out.println(Arrays.toString());

    private static String convertArrayToString(int[] data) {
        String str = "[";
        for (int i = 0; i < data.length; i++) {
            str += data[i];
            if (i != data.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}

