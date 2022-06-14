package lesson6_1;

import java.util.Random;


public abstract class Animal<runningTrack> {
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

    public void doAction(){
        /*int runningTrack = random.nextInt(runningLimit) + 105;*/
        doRun(/*random.nextInt(runningLimit)*//*runningTrack*/runningTrack);
    }; // метод, обязательный для обоих классов/животных


    public void doRun(/*runningTrack*/int runningTrack) { // метод бег - для обоих животных
        /*runningTrack = random.nextInt(runningLimit);*/ // рандомизируем длину пробежки
        if (this.runningTrack < runningLimit) {
            System.out.printf("%s %s пробежал %s метров%n", animalType, nickname, this.runningTrack); // выводим, сколько пробежало животное
        }else{
            System.out.printf("%s %s не мог пробежать %s метров%n", animalType, nickname, this.runningTrack);
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


    public void setRunningTrack(int i) {
        this.runningTrack = runningTrack;
    }


}
