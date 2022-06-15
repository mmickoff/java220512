package lesson6_1;

public class Cat extends Animal {

    public Cat(String nickname, String animalType) {
        super(nickname, animalType, 200);
    }

    public Cat(String nickname) {
        this(nickname, "Кот");

    }

    @Override
    public void doAction() {  // метод для описания собачьих достижений
        super.doRun();
    }

}
