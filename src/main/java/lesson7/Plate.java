package lesson7;

public class Plate {
    private int putFoodCount; // всего положено в миску
    private int allFoodsEaten; // всего съедено из миски

    public Plate(int putFoodCount) {
        this.putFoodCount = putFoodCount;

        this.allFoodsEaten = 0;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске положена порция в размере " + putFoodCount + "."
                ;
    }

    public void decreaseFood(int eatFoodAtaTime) {
       putFoodCount -= eatFoodAtaTime;
    }

    public void allFoodsEaten(int eatFoodAtaTime) {

       allFoodsEaten += eatFoodAtaTime;
    }

    public int getPutFoodCount() {
        return putFoodCount;
    }

    public int getAllFoodsEaten() {
        return allFoodsEaten;
    }


}
