public class BilletForsalg implements Billet {
    private String billetType;
    private double billetPris;
    private int studiekortID;
    private int dageTilEvent;
    private int billetID;
    private static int nextBilletID = 1;//statisk sammentællingsvariabel så billetID bliver unik (fortløbende)

    //Constructor
    public BilletForsalg(int dageTilEvent, int studiekortID){
        this.dageTilEvent = dageTilEvent;
        this.studiekortID = studiekortID;
        beregnBilletPris();
        this.billetID = nextBilletID++;
    }


    @Override
    public void beregnBilletPris() {
        //hvis studerende mindre end 10 dage til event pris = 90 kr.
        //hvis studerende mere end 10 dage til 76,5
        //alm forsalgspris mindre end 10 dage til event = 120 kr.
        //alm forsalgspris mere end 10 dage til 102 kr.

        if(dageTilEvent >= 10){
            if(studiekortID == 0) {
                billetType = "Standardbillet-forsalg-early bird";
                billetPris = 102.00;
            } else {
                billetType = "Studiebillet-forsalg-early bird";
                billetPris = 76.50;
            }
        } else {
            if(studiekortID == 0) {
                billetType = "Standardbillet-forsalg";
                billetPris = 120.00;
            } else {
                billetType = "Studiebillet-forsalg";
                billetPris = 90.00;
            }

        }
    }

    @Override
    public void udskrivBillet() {

    }

    public String getBilletType() {
        return billetType;
    }

    public void setBilletType(String billetType) {
        this.billetType = billetType;
    }

    public double getBilletPris() {
        return billetPris;
    }

    public void setBilletPris(double billetPris) {
        this.billetPris = billetPris;
    }

    public int getStudiekortID() {
        return studiekortID;
    }

    public void setStudiekortID(int studiekortID) {
        this.studiekortID = studiekortID;
    }

    public int getDageTilEvent() {
        return dageTilEvent;
    }

    public void setDageTilEvent(int dageTilEvent) {
        this.dageTilEvent = dageTilEvent;
    }

    public int getBilletID() {
        return billetID;
    }

    public void setBilletID(int billetID) {
        this.billetID = billetID;
    }

    @Override
    public String toString() {
        return "BilletID: " + billetID + ", BilletType: " + billetType + ", StudiekortID: " +studiekortID + ", Pris:" + billetPris + " kr.";
    }

    public String toStringBillet() {
        String result = "";
        result += "BilletType: " + billetType + "\n" + "Pris:" + billetPris + " kr." + "\n" + "StudiekortID: " +studiekortID;
        return result;
    }
}



