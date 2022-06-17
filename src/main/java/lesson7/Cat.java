package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {


    private String name; // имя кота
    private int satietey; // уровень сытости кота
    private int catEatFoodCount; // съедает кот за раз

    private int catAllFoodsEaten; // всего съел кот


    public Cat(String name, int satietey, int catAllFoodsEaten) {

        this.name = name;
        this.satietey = satietey;
        this.catAllFoodsEaten = catAllFoodsEaten;

    }

    public void eat(Plate plate) {
        catEatFoodCount = ThreadLocalRandom.current().nextInt(satietey);
        plate.decreaseFood(catEatFoodCount);
        System.out.printf("Котик %s съел корма в количестве %s.%n", name, catEatFoodCount);

    }

    public void allFoodsEaten(Plate plate) {
//        catEatFoodCount = ThreadLocalRandom.current().nextInt(satietey);
//        int catEatFoodCount = this.catEatFoodCount;
//        catAllFoodsEaten =
        plate.allFoodsEaten(catEatFoodCount);
        System.out.printf("Котик %s съел за всё время корма в количестве %s.%n", name, catAllFoodsEaten);
    }

    public void satietyOfCat () {


    }

    public int getSatietey() {
        return satietey;
    }

    public int getCatEatFoodCount() {
        return catEatFoodCount;
    }
}
