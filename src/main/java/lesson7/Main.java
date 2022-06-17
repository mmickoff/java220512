package lesson7;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Мурзик", 25);
        Plate plate = new Plate(50);

        plate.printInfo();

        cat.eat(plate);

        cat.allFoodsEaten(plate);

        while (plate.getPutFoodCount() > 0) {
            cat.eat(plate);
            cat.allFoodsEaten(plate);
            plate.printInfo();
            Thread.sleep(1000);

        }
        if(plate.getPutFoodCount() <= 0 ) {
            System.out.println("Еда в миске закончилась, коты не сыты - положите ещё...");
        }



    }

}
