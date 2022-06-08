package lesson5;

public class Pl_01_Objects {
    public static void main(String[] args) {
        Pl_00_Shablon pl1 = new Pl_00_Shablon("Sergo");
        Pl_00_Shablon pl2 = new Pl_00_Shablon("Vano");
        Pl_00_Shablon pl3 = new Pl_00_Shablon("Mickle");
        Pl_00_Shablon pl4 = new Pl_00_Shablon("Alex");
        Pl_00_Shablon pl5 = new Pl_00_Shablon("Nick");

        pl1.setPointsss(165);
        pl2.setPointsss(140);
        pl3.setPointsss(155);
        pl4.setPointsss(170);
        pl5.setPointsss(130);

        Pl_00_Shablon[] arrObjects = {pl1, pl2, pl3, pl4, pl5};
        for (Pl_00_Shablon arrr : arrObjects) {
            arrr.pointsLimitPrintData();
        }
    }

}
