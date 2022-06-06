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

        Employee[] persArray = {person1, person2, person3, person4, person5, person6};

        person1.setPosition("Коммерческий директор");
        person1.setEmail("mail21@mail.ru");
        person1.setMoney(155000);

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
        person4.printInfo();
        person5.printInfo();
        person6.printInfo();

        System.out.printf(Arrays.toString(persArray));

        /*public static void printInfoFirm(Employee){
            Employee.employees[];
            for (int i = 0; i < persArray.length; i++) {
                if (age < 40) {
                    System.out.printf(Arrays.toString(persArray));
                }else{
                }
            }
        }*/
    }
}


//        printInfoFirm(Employee[]persArray);
//        public static String printInfoFirm(Employee[]persArray){

/*persArray[0] = person1;
        persArray[1] = person2;
        persArray[2] = person3;
        persArray[3] = person4;
        persArray[4] = person5;
        persArray[5] = person6;*/

        /*persArray[0] = newPerson1("Иванов Иван Петрович");
        persArray[1] = newPerson2("Иванов Иван Петрович");
        persArray[2] = newPerson3("Иванов Иван Петрович");
        persArray[3] = newPerson4("Иванов Иван Петрович");
        persArray[4] = newPerson5("Иванов Иван Петрович");
        persArray[5] = newPerson6("Иванов Иван Петрович");*/

/*    }

    private static void printInfo() {

    }

    public static void printInfoFirm(String[] persArray){
    Employee[] persArray = new Employee[];

    *//*for (int i = 0; i < persArray.length; i++) {
        if(age < 40){
            printInfo()
        }
    }*//**/


