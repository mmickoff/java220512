package lesson5;

public class Player {
    private final String nickname;
    private  int point;
    private int level;
    private int money;
    private String color;
    private int speed;

    public Player(String nickname, int point, int level, int money, String color, int speed) {
        this.level = level;
        this.money = money;
        this.color = color;
        this.speed = speed;
        this.nickname = nickname;
        this.point = point;
        System.out.printf("%s: Я родился.%n", nickname);
    }

    public Player(String nickname) {
        this (nickname, 0, 1, 100, "white", 156);
    }

    public void printInfo() {
        System.out.print(this.toString());
        /*System.out.printf("Игрок %s(lvl. %d), цветом  %s и двигающийся со скоростью %d, имеет %d очков и %d монет%n", nickname, level, color, speed, point, money);*/
    }

      public String toString() {
        return String.format("Игрок %s(lvl. %d), цветом  %s и двигающийся со скоростью %d, имеет %d очков и %d монет%n", nickname, level, color, speed, point, money);
    }


    public String getNickname() {
        return nickname;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
