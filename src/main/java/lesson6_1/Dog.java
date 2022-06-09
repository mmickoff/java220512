package lesson6_1;

public class Dog  extends Animal{
    private int runningLimitForADog;
    private int swimmingLimitForADog;

public Dog(String nickname, int age, String breed, String color, int trackLength, int runningLimitForADog, int swimmingLimitForADog){
super(nickname, age, breed, color, trackLength);
    this.runningLimitForADog = runningLimitForADog;
    this.swimmingLimitForADog = swimmingLimitForADog;
}

}
