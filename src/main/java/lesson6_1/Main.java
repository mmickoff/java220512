package lesson6_1;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Cat catMarsiсk = new Cat("Марсик");
        Cat catFuntick = new Cat("Фунтик");

        Dog dogBobiсk = new Dog("Бобик");
        Dog dogTuziсk = new Dog("Тузик");

       /* catMarsiсk.setRunningTrack(random.nextInt());
        catFuntick.setRunningTrack(random.nextInt());*/


//        catMarsiсk.printInfo();
//        catFuntick.printInfo();
        catMarsiсk.doAction();
        catFuntick.doAction();

//        dogBobiсk.printInfo();
//        dogTuziсk.printInfo();
        dogBobiсk.doAction();
        dogTuziсk.doAction();

        System.out.println();
        Animal[] animals = {catFuntick, catMarsiсk, dogBobiсk, dogTuziсk};
        /* for (int i = 0; i < animals.length; i++) {*/
        System.out.printf("В соревнованиях участвовало всего " + animals.length + " зверюг:%n");
        for (int i = 0; i < animals.length; i++) {
            System.out.printf(i + 1 + ") " + animals[i]);
            System.out.println();
        }

        System.out.printf("...или...%n");

        int i = 0;
        for (Animal animal : animals) {
//            i++;
            System.out.printf(++i + ") ");
            animal.printInfo();
        }

    }
}


