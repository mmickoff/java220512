package lesson7;

public class Plate {
    private int foodCount;
    private int catAllFoodsEaten;

    public Plate(int foodCount) {

        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске положена порция в размере " + foodCount + "."
                ;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
       foodCount -= catEatFoodCount;
    }

    public void allFoodsEaten(int catEatFoodCount) {
        catAllFoodsEaten += catEatFoodCount;
    }

    public int getCatAllFoodsEaten() {
        return catAllFoodsEaten;
    }
}
