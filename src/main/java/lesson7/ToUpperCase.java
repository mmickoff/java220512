package lesson7;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите слово - ");
        String a1 = in.next();
        a1 = a1.trim();
        System.out.println(a1.substring(0, 1).toUpperCase() + a1.substring(1).toLowerCase());
    }
}

