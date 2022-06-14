package lesson5;

public class Main1 {
    public static void main(String[] args) {
        Player player1 = new Player("Виталий", 1000, 80, 10560, "black", 100);
        Player player2 = new Player("Николай", 2100, 78, 21560, "red", 154);
        Player player3 = new Player("Pavel");


        /*player1.money = 9999;
        player1.color = "white";
        player2.point = 1000;
        player2.speed = 175;

        System.out.println(player1.money);
        System.out.println(player2.point);*/

//        System.out.println(player1);
        System.out.print(player1.toString());
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();

player1.setPoint(5000);

    }

}
