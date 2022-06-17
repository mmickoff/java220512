package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {


    private String name; // имя кота
    private int eatFoodAtaTime; // это количество съедает кот за раз
    private int saturationFood; // столько съел кот всего на данный момент - приращивается на EatFoodAtaTime
    private int fullSaturation; // столько нужно еды до полной сытости
    private boolean satietyOrNo; // наелся кот или нет?


    public Cat(String name, int fullSaturation) {
        this.name = name;
        this.fullSaturation = fullSaturation;
        this.saturationFood = 0;
        this.satietyOrNo = false;
    }

    public void eat(Plate plate) {
        eatFoodAtaTime = ThreadLocalRandom.current().nextInt(fullSaturation) + 8;
        plate.decreaseFood(eatFoodAtaTime);
        allFoodsEaten();
        System.out.printf("Котик %s съел сейчас %s корма и за всё время корма в количестве %s.%n", name, eatFoodAtaTime, saturationFood);

    }

    public int allFoodsEaten() {
        /*saturationFood += */eatFoodAtaTime ++;
        return saturationFood;
//        System.out.printf("Котик %s съел за всё время корма в количестве %s.%n", name, saturationFood);
    }

    public int getSaturationFood() {
        return saturationFood;
    }

    public void setSaturationFood(int saturationFood) {
        this.saturationFood = saturationFood;
    }

    public String getName() {
        return name;
    }

    public int getEatFoodAtaTime() {
        return eatFoodAtaTime;
    }

    public int getFullSaturation() {
        return fullSaturation;
    }

    public boolean isSatietyOrNo() {
        return satietyOrNo;
    }
}
