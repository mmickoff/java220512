package lesson6_1;

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


