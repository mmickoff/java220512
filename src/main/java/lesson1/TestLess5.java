package lesson1;

import lesson5.Player;

public class TestLess5 {
    public static void main(String[] args) {
        Player p1 = new Player("nn");
        Player p2 = new Player("no", 700, 3, 56, "yellow", 55);

        p1.setColor("green");
        p1.setLevel(240);
        p1.setMoney(250);
        p1.printInfo();
        p2.setSpeed(12);
        System.out.print(p1.toString());
        System.out.print(p2.toString());
    }
}
