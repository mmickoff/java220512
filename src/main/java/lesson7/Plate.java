package lesson7;

public class Plate {
    private int putFoodCount; // всего положено в миску
    private int allFoodsEaten; // всего съедено из миски

    public Plate(int putFoodCount) {
        this.putFoodCount = putFoodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске положена порция в размере " + putFoodCount + "."
                ;
    }

    public int getPutFoodCount() {
        return putFoodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
       putFoodCount -= catEatFoodCount;
    }

    public void allFoodsEaten(int catEatFoodCount) {
        allFoodsEaten += catEatFoodCount;
    }

    public int getCatAllFoodsEaten() {
        return allFoodsEaten;
    }
}
