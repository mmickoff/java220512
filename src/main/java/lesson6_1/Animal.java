package lesson6_1;

public abstract class Animal {
    private String animalType;
    private String nickname;
    private int trackLength;
    private int runTrack;
    private int swimmingTrack;

    public Animal(String nickname, String animalType, int trackLength, int runTrack) {
        this.animalType = animalType;
        this.nickname = nickname;
        this.trackLength = trackLength;
        this.runTrack = runTrack;
        /*  this.swimmingTrack = swimmingTrack;*/
//        int swimmTrack;
    }


    public abstract void doAction();

    public void doRun() {
        System.out.printf("%s %s пробежал %s метров%n", animalType, nickname, runTrack);
    }

    public void doSwimm() {
        int swimTrack;
        System.out.printf("%s %s проплыл %s метров%n", animalType, nickname);
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(animalType +
                nickname +
                "пробежал" + runTrack +
                '}');
    }


    public String getAnimalType() {
        return animalType;
    }

    public String getNickname() {
        return nickname;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public int getRunTrack() {
        return runTrack;
    }

//    public int getSwimmTrack() {
//        return swimmTrack;
//    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public void setRunTrack(int runTrack) {
        this.runTrack = runTrack;
    }

//    public void setSwimmTrack(int swimmTrack) {
//        this.swimmTrack = swimmTrack;
//    }
}
