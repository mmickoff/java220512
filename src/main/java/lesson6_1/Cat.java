package lesson6_1;

public class Cat extends Animal {
    private int runningLimitForACat;
//    private int swimmingLimitForACat;

    public Cat(String nickname, String animalType, int trackLength, int runTrack, int runningLimitForACat) {
        super(nickname, animalType, trackLength, runTrack);
        this.runningLimitForACat = runningLimitForACat;

    }

//        this.swimmingLimitForACat = swimmingLimitForACat;
//    , int swimmingLimitForACat

    public Cat(String nickname) {
        this(nickname, "Кот", 1, 1, 200)
    ;}


    @Override
    public void doAction() {

    }
}
