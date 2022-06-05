package lesson5;

public class EmployeesInfo {
    public static void main(String[] args) {

        Employee person1 = new Employee("Иванов Иван Иванович");
        Employee person2 = new Employee("Петров Пётр Петрович");
        Employee person3 = new Employee("Петров Иван Петрович");
        Employee person4 = new Employee("Иванов Пётр Петрович");
        Employee person5 = new Employee("Петров Иван Иванович");
        Employee person6 = new Employee("Иванов Пётр Иванович");

        Employee[] persArray = {person1, person2, person3, person4, person5, person6};

        person1.setPosition("Коммерческий директор");
        person1.setEmail("mail21@mail.ru");
        person1.setMoney(155000);





        /*persArray[0] = person1;
        persArray[1] = person2;
        persArray[2] = person3;
        persArray[3] = person4;
        persArray[4] = person5;
        persArray[5] = person6;*/

//    newPerson1 = Employee("Иванов Иван Петрович");

        /*persArray[0] = newPerson1("Иванов Иван Петрович");
        persArray[1] = newPerson2("Иванов Иван Петрович");
        persArray[2] = newPerson3("Иванов Иван Петрович");
        persArray[3] = newPerson4("Иванов Иван Петрович");
        persArray[4] = newPerson5("Иванов Иван Петрович");
        persArray[5] = newPerson6("Иванов Иван Петрович");*/

    }



}
