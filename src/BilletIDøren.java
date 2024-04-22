public class BilletIDøren implements Billet {
    private final String billetType = "Standard billet - døren";
    private int billetPris = 150;
    private int billetID;
    private static int nextBilletID = 100;//statisk sammentællingsvariabel så billetID bliver unik (fortløbende)



    //Constructor
    public BilletIDøren(){
        this.billetID = nextBilletID++;
    }


    @Override
    public void beregnBilletPris() {

    }

    @Override
    public void udskrivBillet() {

    }

    @Override
    public String toString() {
        return  "BilletID: " + billetID + " ,BilletType: " + billetType + ", billetPris:" + billetPris + " kr.";
    }
}



