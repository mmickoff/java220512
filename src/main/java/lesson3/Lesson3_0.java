package lesson3;

public class Lesson3_0 {

    public static void main(String[] args) {

        multiply(3, 4);
        multiply(3.45, 4.5);
        multiply(34);
    }

    private static void multiply(int a, int b) {
        int multiply = a * b;
        System.out.printf ("Произведение %d и %d равно %d%n", a, b, multiply);

    }

    private static void multiply(double a, double b) {
        double multiply = a * b;
        System.out.printf ("Произведение %2f и %2f равно %2f%n", a, b, multiply);

    }

    private static void multiply(int a) {
        int multiply = a * a;
        System.out.printf ("Квадрат %d равен %d%n", a, multiply);

    }
}
