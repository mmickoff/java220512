package lesson6_1;

import java.util.Random;

public class Dog extends Animal {
    private int swimmingTrack;
    private int runningLimitForADog;
    private int swimmingLimitForADog;

    public Dog(String nickname, String animalType, int trackLength, int runTrack, int swimmingTrack, int runningLimitForADog, int swimmingLimitForADog) {
        super(nickname, animalType, trackLength, runTrack);
        this.swimmingTrack = this.swimmingTrack;
        this.runningLimitForADog = runningLimitForADog;
        this.swimmingLimitForADog = swimmingLimitForADog;
    }

    public Dog(String nickname) {
        this(nickname, "Пёс", 1, 1, 1, 500, 10);
    }

  /*  public Dog(String nickname, String animalTip, int trackLength, int runTrack) {
        super(nickname, animalTip, trackLength, runTrack); }*/

    public String toString() {
        return super.toString();
    }

    @Override
    public void doAction() {
        Random random = new Random();
        int runTrack = random.nextInt(runningLimitForADog);
        if (runTrack < runningLimitForADog) {
            System.out.printf("Пёс %s пробежал %s метров.%n", getNickname(), runTrack);
        }
        int sw
        
    }


}
