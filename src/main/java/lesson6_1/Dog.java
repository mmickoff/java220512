package lesson6_1;

import java.util.Random;

public class Dog extends Animal { // создаём класс Dog - наследника от Animal
    /*private int runningTrack;*/
    private int swimmingTrack; // длина заплыва
    private int runningLimit; // лимит возможностей собаки для бега
    private int swimmingLimit; // лимит возможностей собаки для заплыва

    Random random = new Random();

    public Dog(String nickname, String animalType, int runningLimit, int swimmingLimit, int runningTrack, int swimmingTrack) { // создаём конструктор с перечнем свойств собаки
        super(nickname, animalType, runningLimit, runningTrack);
        this.swimmingTrack = swimmingTrack;  // длина заплыва - привязка
        this.swimmingLimit = swimmingLimit; // лимит возможностей собаки для заплыва - привязка

    }


    public Dog(String nickname) {
        this(nickname, "Пёс", 500, 150, 1, 1);
    }

    @Override
    public void doAction() {/*  // метод для описания собачьих достижений
        int runningTrack = random.nextInt(runningLimit);*/
        int swimmingTrack = random.nextInt(swimmingLimit) + 65;
        super.doRun(/*runningTrack*/); // собачий бег
        doSwim(swimmingTrack); // собачье плавание
    }

    public void doSwim(int swimmingTrack) {/* // метод плавание - для обоих животных
//        swimmingTrack = random.nextInt(); // рандомизируем длину заплыва*/
        if (swimmingTrack < swimmingLimit) {
            System.out.printf("%s %s проплыл %s метров%n", getAnimalType(), getNickname(), swimmingTrack); // выводим, сколько проплыло животное
        } else {
            System.out.printf("%s %s не может проплыть %s метров%n", getAnimalType(), getNickname(), swimmingTrack);
        }
    }



    public int getRunningLimit() {
        return runningLimit;
    }

    public void setRunningLimit(int runningLimit) {
        this.runningLimit = runningLimit;
    }

    public int getSwimmingLimit() {
        return swimmingLimit;
    }

    public void setSwimmingLimit(int swimmingLimit) {
        this.swimmingLimit = swimmingLimit;
    }



}
