package lesson6;

public class Main {
    public static void main(String[] args) {

        Wizard wizard = new Wizard("Артём", 16267);
        Knight knight = new Knight("Борис", 123534, "Экскалибур");

        wizard.printInfo();
        knight.printInfo();

        wizard.doAction();
        knight.doAction();

    }
}
