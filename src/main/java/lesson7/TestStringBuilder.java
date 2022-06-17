package lesson7;

import java.util.Arrays;

public class TestStringBuilder {
    public static void main(String[] args) {
     /*   int i=55 ;*/
        int i = 22;
        int[] arr = new int[i/*8i512_000*/];




        System.out.println(convertArrayToString(arr));
    }

//        private static String convertArrayToString(int[] data) {
//        StringBuilder sb = new StringBuilder("[");
//        for (int i = 0; i < data.length; i++) {
//            sb.append(data[i]);
//            if (i != data.length - 1) {
//                sb.append(", ");
//            }
//        }
//        return sb.append("]").toString();
//    }

    private static String convertArrayToString(int[] data) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
//            data[i] = i + 1;
            sb.append(data[i]);

            if (i != data.length - 1) {
                sb.append(", ");

            }
        }

        return sb.append("]").toString();
    }
}
//    private static String convertArrayToString(int[] data) {
//        String str2 = "[";
//        for (int i = 0; i < data.length; i++) {
//            str2 += data[i];
//            if (i != data.length - 1) {
//                str2 += ", ";
//            }
//        }
//        str2 += "]";
//        return str2;
//    }
//}

//    System.out.println(convertArrayToString(data));
//        System.out.println(convArrToStr(data));
//        Arrays.sort(data);
//        System.out.println(Arrays.toString(data));






