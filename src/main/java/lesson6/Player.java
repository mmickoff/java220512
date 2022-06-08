package lesson6;

public class Player {

    private String nickname;
    private int point;
    private String russianProfession;


    public Player(String nickname, int point, String russianProfession) {
        this.nickname = nickname;
        this.point = point;
        this.russianProfession = russianProfession;
    }

    public Player(){

    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return russianProfession + " {" + "nickname='" + nickname + '\'' + ", point=" + point + '}';
    }

    public void doAction() {
        System.out.println(russianProfession + " " + nickname + " совершает действие");
    }


}
