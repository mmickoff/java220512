package lesson6_1;

import java.util.Random;

public class Dog extends Animal {
    /*private int swimmingTrack;*/
    private int runningLimitForADog;
    private int swimmingLimitForADog;

    Random random = new Random();

    public Dog(String nickname, String animalType,  int runningLimitForADog, int swimmingLimitForADog, int runningTrack, int swimmingTrack) {
        super(nickname, animalType, runningTrack, swimmingTrack);
//        this.swimmingTrack = swimmingTrack;
        this.runningLimitForADog = runningLimitForADog;
        this.swimmingLimitForADog = swimmingLimitForADog;
//        = random.nextInt(runningLimitForADog)
//        = random.nextInt(swimmingLimitForADog);
    }

    public Dog(String nickname) {
        Random random = new Random();
        /*int runningTrack = random.nextInt(runningLimitForADog);
        int swimmingTrack = random.nextInt(swimmingLimitForADog);*/
        this(nickname, "Пёс", /*runningTrack*/ random.nextInt(runningLimitForADog), /*swimmingTrack*/ random.nextInt(swimmingLimitForADog), 500, 10);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public void doAction() {

        super.doRun();
        super.doSwim();
    }

    public int getRunningLimitForADog() {
        return runningLimitForADog;
    }

    public void setRunningLimitForADog(int runningLimitForADog) {
        this.runningLimitForADog = runningLimitForADog;
    }

    public int getSwimmingLimitForADog() {
        return swimmingLimitForADog;
    }

    public void setSwimmingLimitForADog(int swimmingLimitForADog) {
        this.swimmingLimitForADog = swimmingLimitForADog;
    }
}
