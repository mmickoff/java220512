package lesson6;

public class Knight extends Player {
    private String swordTitle;

    public Knight(String nickname, int point, String swordTitle) {
        super(nickname, point, "Рыцарь");
        this.swordTitle = swordTitle;
    }



    /*public Knight(String nickmame, int point, String russianProfessionTitle, String swordTitle){
        this(nickmame, point, swordTitle);
    }*/


    public void doAction() {
        System.out.printf("%s %s машет мечом %s", getRussianProfessionTitle(), getNickname(), getSwordTitle() );
        System.out.println();
        super.doAction();
    }


    @Override
    public String toString() {
        return super.toString() + " и меч " + swordTitle;
    }

    public String getSwordTitle() {
        return swordTitle;
    }

    public void setSwordTitle(String swordTitle) {
        this.swordTitle = swordTitle;
    }
}

