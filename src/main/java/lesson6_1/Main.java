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

    }

}

