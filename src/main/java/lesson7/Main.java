package lesson7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = {
                new Cat("Murzik", 12),
                new Cat("Barsik", 13),
                new Cat("Markiz", 15),
                new Cat("Graf", 16),
                new Cat("Flash", 13),
                new Cat("Vasiliy", 15),
        };
        System.out.println("Положите еду в миску в количестве (указать, сколько порций в штуках):");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Plate plate = new Plate(a);
        Thread.sleep(1000);

        for (Cat catsis : cats) {
            while (!catsis.satietyOrNo() && plate.getPutFoodCount() >= catsis.getEatFoodAtaTime()) {
                plate.printInfo();
                catsis.eat(plate);
            }
        }
        for (Cat catsis : cats) {
            if (catsis.satietyOrNo()) {
                System.out.printf("Кот %s сытый.", catsis.getName());
                System.out.println();
            } else {
                System.out.printf("Еда в миске закончилась, кот %s не сыт - положите ещё...%n", catsis.getName());
            }
        }
//        plate.getPutFoodCount();
//            cat.allFoodsEaten(/*plate*//*.getAllFoodsEaten()*/);
//
//            if (plate.getPutFoodCount() > 0) {
//                cat.eat(plate);
//                cat.allFoodsEaten(/*plate.getAllFoodsEaten()*/);
//                plate.printInfo();


    }

}


