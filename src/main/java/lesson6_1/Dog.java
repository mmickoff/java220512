package lesson6_1;

import java.util.Random;

public class Dog extends Animal { // создаём класс Dog - наследника от Animal
       private int swimmingTrack; // длина заплыва
       private int swimmingLimit; // лимит возможностей собаки для заплыва
    Random random = new Random();

    public Dog(String nickname, int swimmingLimit/*, int runningTrack*//*, int swimmingTrack*/) { // создаём конструктор с перечнем свойств собаки,
        super(nickname, "Пёс", 500/*, runningTrack*/);
//
        this.swimmingLimit = swimmingLimit; // лимит возможностей собаки для заплыва - привязка

    }

    public Dog(String nickname) {
        this(nickname, 150/*, 0*/);

    }

    @Override
    public void doAction() {  // метод для описания собачьих достижений
        super.doRun(); // собачий бег
        doSwim(); // собачье плавание
          }

    public void doSwim() { // метод плавание - для обоих животных
        swimmingTrack = Math.abs(random.nextInt(swimmingLimit)) + 25; // рандомизируем длину заплыва
        if (this.swimmingTrack < swimmingLimit) {
            System.out.printf("%s %s проплыл %s метров%n", getAnimalType(), getNickname(), this.swimmingTrack); // выводим, сколько проплыло животное
        } else {
            System.out.printf("%s %s не может проплыть %s метров%n", getAnimalType(), getNickname(), this.swimmingTrack);
        }
    }

}
