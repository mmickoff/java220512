package lesson2;

public class HomeWork2 {


    public static void main(String[] args) { // точка входа
        System.out.println(within10and20(0, 12)); // метод пределов суммы
        negativOrPozitiveNumber1(5); //  метод проверки положительности числа
        System.out.println(number2(5)); //
        String s = "Hello, world!"; // передаём значение ы в метод print1
        ptintWordN(s, 6); //
        int y1 = 600; //
        leapYear(y1); //
        System.out.println(leapYear(y1)); //
    }

    public static boolean within10and20(int i, int i1) { // метод прделов суммы
        int sum = i + i1; // вычисление суммы
        return (sum >= 10 && sum <= 20); // получение подтверждения верности выражения true
    }

    public static void negativOrPozitiveNumber1(int x) { // метод полжительности числа
        if (x < 0) { // формула определения отрицательности числа
            System.out.println(x + " - число отрицательное");
        } else { // иначе , если больше нуля
            System.out.println(x + " - число положительное");
        }
    }

    public static boolean number2(int y) { // метод подтверждения отрицательности числа
        return (y < 0); // возврат тру, если число отрицательное, и подразумевает обратное
    }

    public static void ptintWordN(String s, int n) { // создаём метод количества строк
        for (int i = 0; i < n; i++) { // считаем, сколько раз напечатать строку
            System.out.println(s); // печатаем строку
        }
    }
    public static boolean leapYear(int y1) { //метод високосность
        return (y1 % 4 == 0 & y1 % 100 != 0 | y1 % 400 == 0 );
        // формула определения високосности - если да, то тру, если нет, то подразумевает фолс
    }

}
