package lesson6_1;

import java.util.Random;

public class Cat extends Animal {
    private int runningLimitForACat;
//    private int swimmingLimitForACat;

    Random random = new Random();

    public Cat(String nickname, String animalType, int trackLength, int runningTrack, int runningLimitForACat) {
        super(nickname, animalType, trackLength, runningTrack);
        this.runningLimitForACat = runningLimitForACat;
        runningTrack = random.nextInt(runningLimitForACat);
    }

    public Cat(String nickname) {
        /*int runningTrack = random.nextInt(runningLimitForACat);*/
        this(nickname, "Кот", 1, super.getRunningTrack(), 200);
    }

    @Override
    public void doAction() {
        super.doRun();
    }
}
