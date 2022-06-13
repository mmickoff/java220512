package lesson6_1;

import java.util.Random;

public class Dog extends Animal { // создаём класс Dog - наследника от Animal
    /*private int runningTrack;*/
    private int swimmingTrack; // длина заплыва
    private int runningLimit; // лимит возможностей собаки для бега
    private int swimmingLimit; // лимит возможностей собаки для заплыва

    Random random = new Random();

    public Dog(String nickname, String animalType, int runningLimit, int swimmingLimit, int runningTrack, int swimmingTrack) { // создаём конструктор с перечнем свойств собаки
        super(nickname, animalType, runningLimit, runningTrack/*, swimmingTrack*/); // импорт конструктора из super.class
        /*this.runningTrack = runningTrack;*/
        this.swimmingTrack = swimmingTrack;  // длина заплыва - привязка
        this.swimmingLimit = swimmingLimit; // лимит возможностей собаки для заплыва - привязка
//       runningTrack = random.nextInt(runningLimitForADog);
//       swimmingTrack = random.nextInt(swimmingLimitForADog);
    }


    public Dog(String nickname) { // создаю конструктор собаки, вызывающий конструктор с перечнем свойств, для присвоения этим свойствам значений, или управлением свойствами
//        Random random = new Random(); // ввёл сюда рандом, т.к. из класса он не принимается, а выдаёт тут (ниже) ошибку
        //      runningTrack = random.nextInt(runningLimitForADog); // пробовал рандомизировать дистанцию забега, чтобы присвоить в конструкторе это значение, но выдаёт ошибку. Пробовал рандомизировать так, потму-что и по др.не получается.
//        this.runningTrack = runningTrack;
//        this.swimmingTrack = swimmingTrack; // пробовал рандомизировать дистанцию заплыва, чтобы присвоить в конструкторе это значение, но выдаёт ошибку
        this(nickname, "Пёс", 500, 10, 150, 50);
        /* getRunningTrack(),*/ /*random.nextInt(runningLimitForADog())*/
        /* swimmingTrack*/ /*random.nextInt(swimmingLimitForADog()))*/
        // присваиваются значения типа животного - собака,- и лимитов возможностей, но ни как рандом, ни как просто название параметра? без ошибки не принимает. А мне нужно, чтобы я рандомизировал выбор дистанции, которую пытается преодолеть животное, и которое должно быть указно в выводе, сколько оно сделало. Конечные цифры тоже не принимает.

    }

   /* public String toString() {
        return super.toString();
    }*/

    @Override
    public void doAction() {  // метод для описания собачьих достижений
        int runningTrack = random.nextInt(runningLimit);
        int swimmingTrack = random.nextInt(swimmingLimit);
        super.doRun(runningTrack); // собачий бег
        doSwim(swimmingTrack); // собачье плавание
    }

    public void doSwim(int swimmingTrack) { // метод плавание - для обоих животных
        swimmingTrack = random.nextInt(); // рандомизируем длину заплыва
        System.out.printf("%s %s проплыл %s метров%n", getAnimalType(), getNickname(), swimmingTrack); // выводим, сколько проплыло животное
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
