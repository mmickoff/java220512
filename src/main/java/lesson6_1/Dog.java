package lesson6_1;

import java.util.Random;

public class Dog extends Animal { // создаём класс Dog - наследника от Animal
    private int runningTrack;
    private int swimmingTrack; // длина заплыва
    private int runningLimit; // лимит возможностей собаки для бега
    private int swimmingLimit; // лимит возможностей собаки для заплыва

    Random random = new Random();

    public Dog(String nickname, String animalType, int runningLimit, int swimmingLimit, int runningTrack, int swimmingTrack) { // создаём конструктор с перечнем свойств собаки,
        super(nickname, animalType, runningLimit, runningTrack);
        this.swimmingTrack = swimmingTrack;  // длина заплыва - привязка
        this.swimmingLimit = swimmingLimit; // лимит возможностей собаки для заплыва - привязка

    }


    public Dog(String nickname) {
        this(nickname, "Пёс", 500, 150, 200, 15);
        /*this.runningTrack = random.nextInt(runningLimit);
        this.swimmingTrack = random.nextInt(swimmingLimit);*/
    }

    @Override
    public void doAction() {  // метод для описания собачьих достижений
        /*int runningTrack = random.nextInt(runningLimit);*/
        /*swimmingTrack = random.nextInt(swimmingLimit) + 65;*/
        super.doRun(/*runningTrack*/runningTrack); // собачий бег
        doSwim(); // собачье плавание
    }

    public void doSwim() { // метод плавание - для обоих животных
        /*int swimmingTrack = random.nextInt();*/ // рандомизируем длину заплыва
        if (this.swimmingTrack < swimmingLimit) {
            System.out.printf("%s %s проплыл %s метров%n", getAnimalType(), getNickname(), this.swimmingTrack); // выводим, сколько проплыло животное
        } else {
            System.out.printf("%s %s не может проплыть %s метров%n", getAnimalType(), getNickname(), this.swimmingTrack);
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
