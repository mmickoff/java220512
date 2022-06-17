package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {


    private String name; // имя кота
    private int eatFoodAtaTime; // это количество съедает кот за раз
    private int saturationFood; // столько съел кот всего на данный момент - приращивается на EatFoodAtaTime
    private int fullSaturation; // столько нужно еды до полной сытости
    private boolean satiety; // наелся кот или нет?


    public Cat(String name, /*int eatFoodAtaTime, */int fullSaturation) {
        this.name = name;
        this.eatFoodAtaTime = eatFoodAtaTime();
        this.fullSaturation = fullSaturation;
        this.saturationFood = 0; // кот еще ничего не ел - насыщение = 0
        this.satiety = false; // кот не сытый = сытость =  false
    }

    public int eatFoodAtaTime(){
       this.eatFoodAtaTime = ThreadLocalRandom.current().nextInt(fullSaturation) + 2;
        return eatFoodAtaTime;
    }

    public void eat(Plate plate) {
        if (this.satiety){
            return;
        }
        if(plate.decreaseFood(this.eatFoodAtaTime)) {
            eatFoodAtaTime();
            allFoodsEaten();
            ;
//        int allFoodsEaten = plate.getAllFoodsEaten();

           /* System.out.printf("Котик %s за всё время съел корма в количестве %s.%n", name, *//*eatFoodAtaTime, *//**//*allFoodsEaten*//*saturationFood);*//*%s съел сейчас %s корма и*/
        }
    }

    public boolean satietyOrNo(){
        return satiety;
    }

    public int allFoodsEaten() {
        eatFoodAtaTime();
        saturationFood += eatFoodAtaTime;
        System.out.printf("Котик %s сейчас съел %s шт порций корма и за всё время порций корма в количестве %s шт.%n", name, eatFoodAtaTime, saturationFood);
        return saturationFood;
    }

//    public int getSaturationFood() {
//        return saturationFood;
//    }

//    public void setSaturationFood(int saturationFood) {
//        this.saturationFood = saturationFood;
//    }

    public String getName() {
        return name;
    }

    public int getEatFoodAtaTime() {
        return eatFoodAtaTime;
    }

    public int getFullSaturation() {
        return fullSaturation;
    }

    public boolean isSatiety() {
        return satiety;
    }

}

