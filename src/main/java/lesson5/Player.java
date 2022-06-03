package lesson5;

public class Player {
    String nickname;
    int point;
    int level;
    int money;


    public Player(String nickname, int point, int level, int money) {
        this.nickname = nickname;
        this.point = point;
        this.level = level;
        this.money = money;
    }



    void printInfo() {
        System.out.printf("Игрок %s(lvl. %d) имеет %d очков и %d монет%n", nickname, level, point, money);

    }
}
