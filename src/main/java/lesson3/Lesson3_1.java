package lesson3;

import java.util.concurrent.ThreadLocalRandom;

//        import java.util.Arrays;
//        import java.util.Scanner;
//        import java.util.concurrent.ThreadLocalRandom;

public class Lesson3_1 {

    public static void main(String[] args) {
        int countApple = 100;

        while (countApple > 0) {
            countApple = eatApple(countApple);
            System.out.println("Яблок стало меньше - осталось " + countApple);
        }
    }

    private static int eatApple(int countApple) {
        return countApple - ThreadLocalRandom.current().nextInt(3);
    }
}

