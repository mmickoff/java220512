package lesson6_1;

import java.util.Random;


public abstract class Animal {
    private String animalType;
    private String nickname;
    private int runningTrack; // дистанция забега
    private int swimmingTrack; // дистаниция заплыва

    Random random = new Random();

    public Animal(String nickname, String animalType, int runningTrack, int swimmingTrack) {
        this.animalType = animalType;
        this.nickname = nickname;
        this.runningTrack = runningTrack;
//          this.swimmingTrack = swimmingTrack;
        this.swimmingTrack = swimmingTrack;

    }


    public abstract void doAction();

    public void doRun() {
        runningTrack = random.nextInt();
        System.out.printf("%s %s пробежал %s метров%n", animalType, nickname, runningTrack);
    }

    public void doSwim() {
        swimmingTrack = random.nextInt();
        System.out.printf("%s %s проплыл %s метров%n", animalType, nickname, swimmingTrack);
    }

   /* public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(animalType +
                nickname +
                "пробежал" + runningTrack +
                '}');
    }*/


    public String getAnimalType() {
        return animalType;
    }

    public String getNickname() {
        return nickname;
    }

//    public int getTrackLength() {
//        return trackLength;
//    }

    public int getRunningTrack() {
        return runningTrack;
    }

    public int getSwimmingTrack() {
        return swimmingTrack;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

//    public void setTrackLength(int trackLength) {
//        this.trackLength = trackLength;
//    }

    public void setRunningTrack() {
        this.runningTrack = runningTrack;
    }

    public void setSwimmingTrack(int swimmingTrack) {
        this.swimmingTrack = swimmingTrack;
    }


}
