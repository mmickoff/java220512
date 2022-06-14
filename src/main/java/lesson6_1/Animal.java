package lesson6_1;

public abstract class Animal {
    private String animalTipe;
    private String nickname;
    private int trackLength;
    private int runTrack;
    private int swimmTrack;

    public Animal(String animalTipe, String nickname, int trackLength, int runTrack, int swimmTrack) {
        this.animalTipe = animalTipe;
        this.nickname = nickname;
        this.trackLength = trackLength;
        this.runTrack = runTrack;
        this.swimmTrack = swimmTrack;
    }

    public abstract void doRun();
    public abstract void doSwimm();

    public void doAction(){

    }

    public void printInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(animalTipe +
                nickname +
                "пробежал" + runTrack +
                '}');
    }

    public abstract void toRun();
    public abstract void toSwimm();


    public String getAnimalTipe() {
        return animalTipe;
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

    public int getSwimmTrack() {
        return swimmTrack;
    }

    public void setAnimalTipe(String animalTipe) {
        this.animalTipe = animalTipe;
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

    public void setSwimmTrack(int swimmTrack) {
        this.swimmTrack = swimmTrack;
    }
}
