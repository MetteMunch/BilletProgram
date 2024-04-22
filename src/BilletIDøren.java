public class BilletIDøren implements Billet {
    private final String billetType = "Standard billet - døren";
    private int billetPris;
    private int billetID;
    private int studiekortID = 0;
    private static int nextBilletID = 100;//statisk sammentællingsvariabel så billetID bliver unik (fortløbende)



    //Constructor
    public BilletIDøren(){
        this.billetID = nextBilletID++;
        billetPris = 150;
    }


    @Override
    public void beregnBilletPris() {

    }

    @Override
    public void udskrivBillet() {

    }
    public double getBilletPris() {
        return billetPris;
    }

    @Override
    public int getStudiekortID() {
        return getStudiekortID();
    }

    @Override
    public int getBilletID() {
        return billetID;
    }

    @Override
    public String toString() {
        return  "BilletID: " + billetID + " ,BilletType: " + billetType + ", billetPris:" + billetPris + " kr.";
    }

    public String toStringBillet() {
        return "BilletType: " + billetType + "\n" + "Pris:" + billetPris + " kr." + "\n" + "StudiekortID: ";
    }
}



