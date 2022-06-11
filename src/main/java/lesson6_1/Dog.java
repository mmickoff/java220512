package lesson6_1;

import java.util.Random;

public class Dog extends Animal {
    private int swimmingTrack;
    private final int runningLimitForADog;
    private final int swimmingLimitForADog;

    Random random = new Random();

    public Dog(String nickname, String animalType, int trackLength, int runningTrack, int swimmingTrack, int runningLimitForADog, int swimmingLimitForADog) {
        super(nickname, animalType, trackLength, runningTrack);
        this.swimmingTrack = this.swimmingTrack;
        this.runningLimitForADog = runningLimitForADog;
        this.swimmingLimitForADog = swimmingLimitForADog;
        runningTrack = random.nextInt(runningLimitForADog);
        swimmingTrack = random.nextInt(swimmingLimitForADog);
    }

    public Dog(String nickname) {
        this(nickname, "Пёс", 1, getRunningTrack(), swimmingTrack, 500, 10);
    }


  /*  public Dog(String nickname, String animalTip, int trackLength, int runTrack) {
        super(nickname, animalTip, trackLength, runTrack); }*/

    public String toString() {
        return super.toString();
    }

    @Override
    public void doAction() {

        super.doRun();
        super.doSwim();
    }
        /*Random random = new Random();
        int runTrack = random.nextInt(runningLimitForADog);
        if (runTrack < runningLimitForADog) {
            System.out.printf("Пёс %s пробежал %s метров.%n", getNickname(), runTrack);
        }
        int sw*/




}
