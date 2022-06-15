package lesson6_1;

import java.util.Random;


public abstract class Animal {
    private String animalType; // тип животного - Собака или Кот
    private String nickname; // имя зверюшки
    private int runningLimit;

    Random random = new Random(); // рандомизатор в классе


    public Animal(String nickname, String animalType, int runningLimit/*, int runningTrack*//*, int swimmingTrack*/) { //конструктор
        this.animalType = animalType;
        this.nickname = nickname;
        this.runningLimit = runningLimit;

    }

    public void doAction() {
        doRun(/*runningTrack*/);

    }

    public void doRun() { // метод бег - для обоих животных
        int runningTrack = random.nextInt(runningLimit) + 100; // рандомизируем длину пробежки
        if (runningTrack < runningLimit) {
            System.out.printf("%s %s пробежал %s метров%n", animalType, nickname, runningTrack); // выводим, сколько пробежало животное
        } else {
            System.out.printf("%s %s не мог пробежать %s метров%n", animalType, nickname, runningTrack);
        }
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(animalType +
                nickname + ".");
    }

    // создаём геттеры и сеттеры на тип и имя животного
    public String getAnimalType() {
        return animalType;
    }

    public String getNickname() {
        return nickname;
    }


}
