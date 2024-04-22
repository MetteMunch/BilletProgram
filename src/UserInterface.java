import java.util.Scanner;

public class UserInterface {
    SolgteBilletter sb;
    Scanner sc;

    //constructor

    public UserInterface(){
        sb = new SolgteBilletter();
        sc = new Scanner(System.in);
        eventBilletProgram();

    }

    //Metoder

    public void eventBilletProgram(){
        boolean SENTINEL = false;

        System.out.println("EVENT A - BILLETDATA");
        System.out.println("------------------------------------------------ ");
        System.out.println(" ");
        System.out.println("Vælg nummer på menupunkt: ");
        System.out.println("1. Se liste med samlet antal solgte billetter.");
        System.out.println("2. Tjek pris dags dato.");
        System.out.println("3. Sælg/opret billet.");
        System.out.println("4. Udskriv billet fra billet-id.");
        System.out.println("5. Se liste med alle studiekort id.");
        System.out.println("6. Afslut programmet.");


        while (!SENTINEL) {
            int userInput = sc.nextInt();
            switch (userInput){
                case 1: {
                    printSamletListe();
                    salgFordeltPåType();
                    break;
                }
                case 2: {
                    prisForespørgsel();
                    break;
                }
                case 3: {
                    System.out.println("her kommer oprettelse af ny billet");
                    //opretBillet();
                    break;
                }
                case 4: {
                    printBillet();
                    break;
                }
                case 5: {
                    System.out.println("Her kommer sorteret liste med studiekort id");
                    //listeStudiekortID();
                    break;
                }
                case 6: {
                    System.out.println("Tak for denne gang.");
                    SENTINEL = true;
                    break;
                }
                default: {
                    System.out.println("Du kan kun vælge menupunt mellem 1-6.");
                }

            }
        }

    }

    public void printSamletListe(){
        for(Billet billetter : sb.getSolgteBilletter()){
            System.out.println(billetter.toString());
        }
    }

    public void printBillet(){
        System.out.println("Angiv billetID på billetten, som skal udprintes: ");
        int billetID = sc.nextInt();

        for(Billet billetter : sb.getSolgteBilletter()){
            if(billetter instanceof BilletForsalg && billetID==billetter.getBilletID()) {
                System.out.println(billetter.toStringBillet());
                if(billetter.getStudiekortID()!=0){
                    System.out.println("Husk at medbringe dit studiekort sammen med billetten.");
                }
            }

        }
    }

    public void salgFordeltPåType() {
        int solgteIForsalg = sb.antalSolgteIForsalg();
        int solgteIDøren = sb.antalSolgteIDøren();
        System.out.println(" ");
        System.out.println("Der er samlet solgt: " + solgteIForsalg + " billetter i forsalg.");
        System.out.println("Der er samlet solgt: " + solgteIDøren + " billetter i døren.");
    }

    public void prisForespørgsel(){
        System.out.println("Hvor mange dage er der til event start?");
        int dageTilEvent = sc.nextInt();
        System.out.println("Angiv studiekort nummer eller 0, hvis ikke studerende?");
        int studiekortID = sc.nextInt();

        double pris = sb.prisForespørgsel(dageTilEvent,studiekortID);
        if(pris != -1){
            System.out.println("Prisen for billetten er: " +pris + " kr.");
        } else {
            System.out.println("Ugyldig forespørgsel");
        }

    }

}
