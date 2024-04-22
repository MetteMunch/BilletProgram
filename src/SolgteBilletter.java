import java.util.ArrayList;

public class SolgteBilletter {
    //Attributter
    private final ArrayList<Billet> solgteBilletter;


    //Constructor
    public SolgteBilletter() {
        solgteBilletter = new ArrayList<>();
        tilføjSolgteBilletter();
    }


    //Metoder

    public void tilføjSolgteBilletter(){
        Billet billet1 = new BilletForsalg(12, 25);
        Billet billet2 = new BilletForsalg(5, 28);
        Billet billet3 = new BilletForsalg(30, 0);
        Billet billet4 = new BilletForsalg(8, 0);
        Billet billet5 = new BilletForsalg(23, 117);
        Billet billet6 = new BilletIDøren();
        Billet billet7 = new BilletIDøren();
        Billet billet8 = new BilletIDøren();
        solgteBilletter.add(billet1);
        solgteBilletter.add(billet2);
        solgteBilletter.add(billet3);
        solgteBilletter.add(billet4);
        solgteBilletter.add(billet5);
        solgteBilletter.add(billet6);
        solgteBilletter.add(billet7);
        solgteBilletter.add(billet8);

    }
    public void hentAlleStudiekortId(){
        //skal være sorteret med mindste nummer først
    }

    public double prisForespørgsel (int dageTilEvent,int studiekortID){
        Billet billet = new BilletForsalg(dageTilEvent,studiekortID);
        billet.beregnBilletPris();
        return billet.getBilletPris();
    }

    public int antalSolgteIForsalg() {
        int result = 0;
        for(Billet billettype : solgteBilletter){
            if(billettype instanceof BilletForsalg){
                result++;
            }
        } return result;

    }

    public int antalSolgteIDøren() {
        int result = 0;
        for(Billet billettype : solgteBilletter){
            if(billettype instanceof BilletIDøren){
                result++;
            }
        } return result;

    }

    public ArrayList<Billet> getSolgteBilletter() {
        return solgteBilletter;
    }




}
