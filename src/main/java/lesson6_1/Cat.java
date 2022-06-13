package lesson6_1;

import java.util.Random;

public class Cat extends Animal {
//    private int runningLimit;


    Random random = new Random();

    public Cat(String nickname, String animalType, int runningLimit, int runningTrack) {
        super(nickname, animalType, runningLimit, runningTrack);
//        this.runningLimit = runningLimit;
    }


    public Cat(String nickname) {
        this(nickname, "Кот", 150, 25);
    }
        @Override
        public void doAction() {
            int runningTrack = random.nextInt(runningLimit);
            super.doRun(runningTrack);


    }

   /* @Override
    public void doAction() {
        super.doRun(runningTrack);
    }*/
}
