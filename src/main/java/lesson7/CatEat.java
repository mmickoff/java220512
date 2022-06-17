package lesson7;

public class CatEat {

    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Мурзик", 6, 50);
        Plate plate = new Plate(50);

        plate.printInfo();

        cat.eat(plate);

        cat.allFoodsEaten(plate);

        while (plate.getFoodCount() > 0) {
            cat.eat(plate);
            cat.allFoodsEaten(plate);
            plate.printInfo();
            Thread.sleep(1000);

        }



    }

}
