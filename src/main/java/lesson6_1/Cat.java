package lesson6_1;

import java.util.Random;

public class Cat extends Animal {
    private int runningLimitForACat;


    Random random = new Random();

    public Cat(String nickname, String animalType,  int runningLimitForACat, int runningTrack/*, int swimmingTrack*/) {
        super(nickname, animalType, runningTrack);
        this.runningLimitForACat = runningLimitForACat;
    }

    public Cat(String nickname) {
        Random random = new Random(runningLimitForACat);
        int runningTrack = random.nextInt(runningLimitForACat);
        this(nickname, "Кот", 150, runningTrack);

    }

    @Override
    public void doAction() {
        super.doRun();
    }
}
