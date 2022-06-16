package lesson7;

public class StringCreateExample {

    public static void main(String[] args) {

        String s1 = "Java";
        String sn = s1;
        String s2 = new String("Java");

        String s3 = new String( );
        String s4 = new String(String.valueOf(sn));

        String s6 = """
              строка 1
              строка 2
              строка 3 \
              строка 3 тоже
              """;

        String s5 = new String(new byte[] {65, 66, 67});

        System.out.printf(" s1 = %s%n s2 = %s%n s3 = %s%n s4 = %s%n s5 = %s%n s6 = %s%n", s1, s2, s3, s4, s5, s6);

    }
}
