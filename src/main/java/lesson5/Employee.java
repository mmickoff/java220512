package lesson5;

public class Employee {

    private final String fullName;
    private String position;
    private String email;
    private String telephoneNumber;
    private int money;
    private int age;


    public Employee(String fullName, String position, String email, String telephoneNumber, int money, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.money = money;
        this.age = age;
    }

    public Employee(String fullName) {
        this(fullName, "Офисный работник", "mail@mail.ru", "89034563456", 120000, 43);
    }

    public void printInfo() {
        System.out.print(this.toString());
    }

    public String toString() {
        return String.format("Гражданин %s, возраст %s г/л, состоящий на должности %s, доступный по @-mail %s и т.ф. %s, получает зарплату %d%n", fullName, age, position, email, telephoneNumber, money);
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
