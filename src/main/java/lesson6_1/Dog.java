package lesson6_1;

public class Dog extends Animal {
    private int runningLimitForADog;
    private int swimmingLimitForADog;

    public Dog(String animalTipe, String nickname, int runTrack, int swimmTrack) {
        super("Пёс", nickname, runTrack, swimmTrack, runningLimitForADog, swimmingLimitForADog);
        this.runningLimitForADog = runningLimitForADog;
        this.swimmingLimitForADog = swimmingLimitForADog;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void doAction(){
        if(getRunTrack() < runningLimitForADog)
    System.out.printf("Пёс %s пробежал %s метров.%n", getNickname(), getRunTrack());
}

}
