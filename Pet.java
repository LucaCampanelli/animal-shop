import java.util.ArrayList;
import java.util.Scanner;

public class Pet {
    String[] prod;
    double[] prez;

    public double cassa(String[] prod, double[] prez) {
       
        this.prod = prod;
        this.prez = prez;
        boolean ancora = true;
        double totaleParziale = 0.0, totale = 0.0;
        String altri = "";
        Scanner input = new Scanner(System.in);
        ArrayList<String> Carrello;
        Carrello = new ArrayList<String>();

        do {
            System.out.print("Digitare il codice del prodotto desiderato: ");
            int codice = input.nextInt()-1; 

            switch(codice) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    System.out.print("Digitare la quantita' di " + prod[codice] + " desiderati: ");
                    int quanti = input.nextInt();
                    totaleParziale = prez[codice]*quanti;
                    totale += totaleParziale;
                    Carrello.add("Prodotto: " + prod[codice] + " - Quantita': " + quanti + " - Prezzo: " + totaleParziale + " euro");
                    input.nextLine();
                    System.out.print("Desidera altri prodotti (S/N)? ");
                    altri = input.next().toUpperCase();
                    break;
                default:
                    System.out.println("Codice digitato errato!");
            }

            if(!altri.equals("S")) { 
                ancora = false;
            }

        } while(ancora);

        System.out.println();
        System.out.println("****** Articoli nel carrello ******");

        for (String lettore : Carrello) {
            System.out.println(lettore);
        }
        return totale;
    }
}