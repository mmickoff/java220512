package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {


    private String name; // имя кота
    private int EatFoodAtaTime; // это количество съедает кот за раз
    private int saturationFood; // столько съел кот всего на данный момент - приращивается на EatFoodAtaTime
    private int fullSaturation; // столько нужно еды до полной сытости
    private boolean satietyOrNo; // сыт кот или нет?


    public Cat(String name, int fullSaturation) {
        this.name = name;
        this.fullSaturation = fullSaturation;
        this.saturationFood = 0;
        this.satietyOrNo = false;
    }

    public void eat(Plate plate) {
        EatFoodAtaTime = ThreadLocalRandom.current().nextInt();
        plate.decreaseFood(EatFoodAtaTime);
        System.out.printf("Котик %s съел корма в количестве %s.%n", name, EatFoodAtaTime);

    }

    public void allFoodsEaten(Plate plate) {

        plate.allFoodsEaten(EatFoodAtaTime);
        System.out.printf("Котик %s съел за всё время корма в количестве %s.%n", name, saturationFood);
    }


}
