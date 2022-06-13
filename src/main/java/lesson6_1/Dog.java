package lesson6_1;

import java.util.Random;

public class Dog extends Animal {
    /*private int runningTrack;*/
    private int swimmingTrack;
    private int runningLimitForADog;
    private int swimmingLimitForADog;

    Random random = new Random();

    public Dog(String nickname, String animalType, int runningLimitForADog, int swimmingLimitForADog, int runningTrack, int swimmingTrack) {
        super(nickname, animalType, runningTrack/*, swimmingTrack*/);
        /*this.runningTrack = runningTrack;*/
        this.swimmingTrack = swimmingTrack;
        this.runningLimitForADog = runningLimitForADog;
        this.swimmingLimitForADog = swimmingLimitForADog;
//       runningTrack = random.nextInt(runningLimitForADog);
//       swimmingTrack = random.nextInt(swimmingLimitForADog);
    }

    public Dog(String nickname) {
//        this.runningTrack = runningTrack;
//        this.swimmingTrack = swimmingTrack;
        this(nickname, "Пёс", 500, 10, getRunningTrack(), /*random.nextInt(runningLimitForADog())*/ swimmingTrack /*random.nextInt(swimmingLimitForADog())*/);

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

    @Override
    public int getSwimmingTrack() {
        return swimmingTrack;
    }

    @Override
    public void setSwimmingTrack(int swimmingTrack) {
        this.swimmingTrack = swimmingTrack;
    }
}
