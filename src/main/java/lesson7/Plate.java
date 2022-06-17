package lesson7;

public class Plate {
    private int putFoodCount; // всего положено в миску
    private int allFoodsEaten; // всего съедено из миски
    private int eatFoodAtaTime;

    public Plate(int putFoodCount) {
        this.putFoodCount = putFoodCount;
        this.allFoodsEaten = 0;
        this.eatFoodAtaTime = eatFoodAtaTime;
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

    public int allFoodsEaten() {
        return allFoodsEaten++;
//        decreaseFood(eatFoodAtaTime);
    }

    public int getPutFoodCount() {
        return putFoodCount;
    }

    public int getAllFoodsEaten() {
        return allFoodsEaten;
    }
}

//    public int getEatFoodAtaTime() {
//        return eatFoodAtaTime;
//    }
//}
