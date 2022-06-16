package lesson7;

public class TestStringBuilder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(convertArrayToString(arr));
    }

    private static String convertArrayToString(int[] data) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            if (i != data.length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
