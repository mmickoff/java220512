package lesson6_1;

import java.util.Random;

public class Cat extends Animal {
    private int runningLimit;
    private int runningTrack;


    Random random = new Random();

    public Cat(String nickname, String animalType, int runningLimit, int runningTrack) {
        super(nickname, animalType, runningLimit, runningTrack);
        this.runningLimit = runningLimit;
        this.runningTrack = runningTrack;
    }


    public Cat(String nickname) {
        this(nickname, "Кот", 200, 100
        );
        /*runningTrack = random.nextInt(runningLimit);*/
    }

    @Override
    public void doAction() {  // метод для описания собачьих достижений
       /* runningTrack = random.nextInt(runningLimit);*/
        super.doRun(/*random.nextInt(runningLimit*/runningTrack);

    }

}
