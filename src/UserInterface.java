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
                    break;
                }
                case 2: {
                    System.out.println("her kommer forespørgsel på pris");
                    //prisForespørgsel();
                    break;
                }
                case 3: {
                    System.out.println("her kommer oprettelse af ny billet");
                    //opretBillet();
                    break;
                }
                case 4: {
                    System.out.println("Her kommer udskrift af billet");
                    //udskrivBillet();
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

    public void prisForespørgsel(int dageTilEvent, int studiekortID){

    }




}
