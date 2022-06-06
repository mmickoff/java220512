package lesson5;

import java.util.Arrays;

public class EmployeesInfo {
    public static void main(String[] args) {

        Employee person1 = new Employee("Иванов Иван Иванович");
        Employee person2 = new Employee("Петров Пётр Петрович");
        Employee person3 = new Employee("Петров Иван Петрович");
        Employee person4 = new Employee("Иванов Пётр Петрович");
        Employee person5 = new Employee("Петров Иван Иванович");
        Employee person6 = new Employee("Иванов Пётр Иванович");

        person1.setPosition("Коммерческий директор");
        person2.setEmail("mail21@mail.ru");
        person3.setEmail("mail24@mail.ru");
        person4.setEmail("mail27@mail.ru");
        person5.setEmail("mail29@mail.ru");
        person6.setEmail("mail31@mail.ru");
        person1.setMoney(155000);
        person1.setAge(33);
        person2.setAge(30);
        person5.setAge(37);


        Employee[] persArray = {person1, person2, person3, person4, person5, person6};
        for (Employee employee : persArray) {
            employee.ageLimitForPrintData();
        }
     }
}




