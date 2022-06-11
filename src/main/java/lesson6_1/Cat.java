package lesson6_1;

public class Cat extends Animal{
    private int runningLimitForACat;
    private int swimmingLimitForACat;

    public Cat(String nickname, int age, int trackLength, int runningLimitForADog, int swimmingLimitForADog){
        super(nickname, trackLength);
        this.runningLimitForACat = runningLimitForADog;
        this.swimmingLimitForACat = swimmingLimitForADog;
    }


}
