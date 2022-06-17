package lesson7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = {
                new Cat("Murzik", 4),
                new Cat("Barsik", 3),
                new Cat("Markiz", 5),
                new Cat("Graf", 6),
                new Cat("Flash", 3),
                new Cat("Vasiliy", 5),
        };
        System.out.println("Положите еду в миску в количестве (указать, сколько порций в штуках):");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Plate plate = new Plate(a);
        Thread.sleep(1000);

        for (Cat catsis : cats) {
            while (!catsis.satietyOrNo() && plate.getPutFoodCount() >= catsis.getEatFoodAtaTime()) {
                for (Cat catsis : cats){ catsis.eat(plate);}
                plate.printInfo();

            }
        }
        for (Cat catsis : cats) {
            if (catsis.satietyOrNo()) {
                System.out.printf("%s сытый.", catsis.getName());
                System.out.println();
            } else {
                System.out.println("Еда в миске закончилась, коты не сыты - положите ещё...");
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


