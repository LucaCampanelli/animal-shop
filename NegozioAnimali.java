import java.util.Scanner;

public class NegozioAnimali {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totaleComplessivo = 0.0;
        boolean ancora = true;

        do {
            System.out.print("Vuoi acquistare per un cane (C) o per un gatto (G)? ");
            char animale = input.next().toUpperCase().charAt(0);

            switch(animale) {
                case 'C':
                    Cane mioCane = new Cane();
                    double totaleCane = mioCane.mostraProdotti();
                    totaleComplessivo += totaleCane;
                    break;
                case 'G':
                    Gatto mioGatto = new Gatto();
                    double totaleGatto = mioGatto.mostraProdotti();
                    totaleComplessivo += totaleGatto;
                    break;
                default:
                    System.out.println("Codice digitato errato!");
            }

            System.out.print("Desidera effettuare altri acquisti (S/N)? ");
            String altri = input.next().toUpperCase();

            if (!altri.equals("S")) {
                ancora = false;
            }

        } while(ancora);

        System.out.println();
        System.out.println("****** Scontrino fiscale ******");
        System.out.println("Totale da pagare: " + totaleComplessivo + " euro");
        System.out.println("Grazie, arrivederci!");
        input.close();
    }

}