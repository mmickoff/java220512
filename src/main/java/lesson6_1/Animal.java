package lesson6_1;

import java.util.Random;


public abstract class Animal<runningTrack> {
    private String animalType; // тип животного - Собака или Кот
    private String nickname; // имя зверюшки
    private int runningLimit;
    private int runningTrack; // дистанция забега
    /*private int swimmingTrack;*/ // дистаниция заплыва - вводим её только в Dog, чтобы не передавать в Cat

    Random random = new Random(); // рандомизатор в классе


    public Animal(String nickname, String animalType, int runningLimit, int runningTrack/*, int swimmingTrack*/) { //конструктор
        this.animalType = animalType;
        this.nickname = nickname;
        this.runningLimit = runningLimit;
        this.runningTrack = runningTrack;
//      this.swimmingTrack = swimmingTrack; // оставляем для появления в Dog

    }

    public void doAction() {
        doRun(/*runningTrack*/);
        /*runningTrack = random.nextInt(runningLimit);*/
    }


    public void doRun() { // метод бег - для обоих животных
        runningTrack = random.nextInt(runningLimit) + 100; // рандомизируем длину пробежки
        if (this.runningTrack < runningLimit) {
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

    // создаём геттеры и сеттеры на тип b имя животного
    public String getAnimalType() {
        return animalType;
    }

    public String getNickname() {
        return nickname;
    }


}
