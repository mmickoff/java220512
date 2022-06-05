package lesson3;

import java.util.concurrent.ThreadLocalRandom;

public class Lesson3_1_countApple2 {

    public static void main(String[] args) {
        int countApple2 = 100;

        while (countApple2 > 3) {
            countApple2 = eatApple2(countApple2);
            System.out.println("Яблок осталось " + countApple2);
        }

    }

    private static int eatApple2(int countApple2) {
        return countApple2 - 1 - ThreadLocalRandom.current().nextInt(2);
//        return countApple2;
    }
}
