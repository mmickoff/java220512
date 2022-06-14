package lesson5;


public class Pl_00_Shablon {
    private final String nn;
    private int rang;
    private int pointsss;
    private String colorsss;

    /*public Pl_00_Shablon(String nn, int rang, int points, String colorsss){

    }
    */

    public Pl_00_Shablon(String nn, int rang, int pointsss, String colorsss) {
        this.nn = nn;
        this.rang = rang;
        this.pointsss = pointsss;
        this.colorsss = colorsss;
    }

    public Pl_00_Shablon(String nn){
        this(nn, 3, 155, "white");
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

       public String toString() {
        return String.format("Участник %s, имеющий ранг %d и %d очков окрашивается в цвет %s/%n", nn, rang, pointsss, colorsss);
           /*System.out.printf("Участник %s, имеющий ранг %d и %d очков окрашивается в цвет %s/%n", nn, rang, pointsss, colorsss);*/
    }

    public void pointsLimitPrintData(){
        if (pointsss > 160){
            printInfo();
//            toString();
        }
    }

    public String getNn() {
        return nn;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public int getPointsss() {
        return pointsss;
    }

    public void setPointsss(int pointsss) {
        this.pointsss = pointsss;
    }

    public String getColorsss() {
        return colorsss;
    }

    public void setColorsss(String colorsss) {
        this.colorsss = colorsss;
    }


}
