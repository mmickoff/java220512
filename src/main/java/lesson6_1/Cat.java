package lesson6_1;

import java.util.Random;

public class Cat extends Animal {
    private int runningLimitForACat;


    Random random = new Random();

    public Cat(String nickname, String animalType,  int runningTrack, int swimmingTrack, int runningLimitForACat) {
        super(nickname, animalType, runningTrack, swimmingTrack);
        this.runningLimitForACat = runningLimitForACat;
    }

    public Cat(String nickname) {
        Random random = new Random();
        /*int runningTrack = random.nextInt(getRunningLimitForACat);*/
        this(nickname, "Кот", random.nextInt(getRunningLimitForACat), 200);
    }

    @Override
    public void doAction() {
        super.doRun();
    }
}
