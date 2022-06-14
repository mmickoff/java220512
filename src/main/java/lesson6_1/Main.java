package lesson6_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat catMarsiсk = new Cat("Марсик");
        Cat catFuntick = new Cat("Фунтик");

        Dog dogBobiсk = new Dog("Бобик");
        Dog dogTuziсk = new Dog("Тузик");

//        catMarsiсk.printInfo();
//        catFuntick.printInfo();
        catMarsiсk.doAction();
        catFuntick.doAction();

//        dogBobiсk.printInfo();
//        dogTuziсk.printInfo();
        dogBobiсk.doAction();
        dogTuziсk.doAction();

        Animal[] animals = {catFuntick, catMarsiсk, dogBobiсk, dogTuziсk};
        /* for (int i = 0; i < animals.length; i++) {*/

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


