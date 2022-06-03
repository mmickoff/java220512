package lesson5;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Виталий", 1000, 80, 10560);
        Player player2 = new Player("Николай", 2100, 78, 21560);

        player1.money = 9999;
        player2.point = 1000;

        System.out.println(player1.money);
        System.out.println(player2.point);

        System.out.println(player1);
        player1.printInfo();
        player2.printInfo();



    }

}
