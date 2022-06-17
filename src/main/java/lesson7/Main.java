package lesson7;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Мурзик", 35);
        Plate plate = new Plate(50);

        plate.printInfo();

        cat.eat(plate);

        cat.allFoodsEaten();

        while (plate.getPutFoodCount() > 0) {
            cat.eat(plate);
            plate.allFoodsEaten(plate.getAllFoodsEaten());
            plate.printInfo();
            Thread.sleep(1000);

        }
        if(plate.getPutFoodCount() <= 0 ) {
//            cat.eat(plate) -= plate.getPutFoodCount();
            System.out.println("Еда в миске закончилась, коты не сыты - положите ещё...");
        }



    }

}
