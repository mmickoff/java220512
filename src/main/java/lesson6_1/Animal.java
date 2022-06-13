package lesson6_1;

import java.util.Random;


public abstract class Animal {
    private String animalType; // тип животного - Собака или Кот
    private String nickname; // имя зверюшки
    private int runningTrack; // дистанция забега
    /*private int swimmingTrack;*/ // дистаниция заплыва - вводим её только в Dog, чтобы не передавать в Cat
    private int runningLimit;

    Random random = new Random(); // рандомизатор в классе


    public Animal(String nickname, String animalType, int runningLimit, int runningTrack/*, int swimmingTrack*/) { //конструктор
        this.animalType = animalType;
        this.nickname = nickname;
        this.runningLimit = runningLimit;
        this.runningTrack = runningTrack;

//      this.swimmingTrack = swimmingTrack; // оставляем для появления в Dog

    }


    public abstract void doAction(); // метод, обязательный для обоих классов/животных

    public void doRun(int runningTrack) { // метод бег - для обоих животных
        this.runningTrack = random.nextInt(runningLimit); // рандомизируем длину пробежки
        System.out.printf("%s %s пробежал %s метров%n", animalType, nickname, this.runningTrack); // выводим, сколько пробежало животное
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

    // создаём геттеры и сеттеры на тип, имя животного и длину пробежки
    public String getAnimalType() {
        return animalType;
    }

    public String getNickname() {
        return nickname;
    }

    public int getRunningTrack() {
        return runningTrack;
    }

//    public int getSwimmingTrack() {
//        return swimmingTrack;
//    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public void setRunningTrack() {
        this.runningTrack = runningTrack;
    }


}
