package lesson6_1;

public class Cat extends Animal {


    public Cat(String nickname, String animalType, int runningLimit, int runningTrack) {
        super(nickname, animalType, runningLimit, runningTrack);
    }

    public Cat(String nickname) {
        this(nickname, "Кот", 200, 0);

    }

    @Override
    public void doAction() {  // метод для описания собачьих достижений
        super.doRun();
    }

}
