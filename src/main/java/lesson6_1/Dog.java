package lesson6_1;

import java.util.Random;

public class Dog extends Animal { // создаём класс Dog - наследника от Animal
       private int swimmingTrack; // длина заплыва
       private int swimmingLimit; // лимит возможностей собаки для заплыва
    Random random = new Random();

    public Dog(String nickname, int swimmingLimit, int runningTrack/*, int swimmingTrack*/) { // создаём конструктор с перечнем свойств собаки,
        super(nickname, "Пёс", 500, runningTrack);
//        this.swimmingTrack = swimmingTrack;  // длина заплыва - привязка
        this.swimmingLimit = swimmingLimit; // лимит возможностей собаки для заплыва - привязка

    }

    public Dog(String nickname) {
        this(nickname, 150, 0);
        /*this.runningTrack = random.nextInt(runningLimit);*/
        /*this.swimmingTrack = random.nextInt(swimmingLimit);*/
    }

    @Override
    public void doAction() {  // метод для описания собачьих достижений
        super.doRun(/*runningTrack*//*runningTrack*/); // собачий бег
        doSwim(); // собачье плавание
        // /*int runningTrack = random.nextInt(runningLimit);*/
        /*swimmingTrack = random.nextInt(swimmingLimit) + 65;*/
    }

    public void doSwim() { // метод плавание - для обоих животных
        swimmingTrack = Math.abs(random.nextInt(swimmingLimit)) + 25; // рандомизируем длину заплыва
        if (this.swimmingTrack < swimmingLimit) {
            System.out.printf("%s %s проплыл %s метров%n", getAnimalType(), getNickname(), this.swimmingTrack); // выводим, сколько проплыло животное
        } else {
            System.out.printf("%s %s не может проплыть %s метров%n", getAnimalType(), getNickname(), this.swimmingTrack);
        }
    }

    public int getSwimmingLimit() {
        return swimmingLimit;
    }

    public void setSwimmingLimit(int swimmingLimit) {
        this.swimmingLimit = swimmingLimit;
    }

}
