public class Gatto extends Pet {
    String[] prodotti = {
        "1. Cibo secco 5kg",
        "2. Cibo secco 1kg",
        "3. Cibo umido 500g",
        "4. Cibo umido 80g",
        "5. Frontline gatto 3 pipette",
        "6. Ciotola",
        "7. Tiragraffi",
        "8. Spazzola",
        "9. Cesta"
    };
    double[] prezzi = {30.00, 6.50, 4.50, 0.80, 19.00, 3.00, 8.00, 6.00, 12.00};

    public double mostraProdotti() {
        System.out.println("****** Articoli disponibili per gatto ******");

        for (int i = 0; i < prodotti.length; i++) {
            System.out.println(prodotti[i] + ": " + prezzi[i] + " euro cad.");
        }

        System.out.println();
        double totale = cassa(prodotti, prezzi); // passo al metodo due interi array
        return totale;
    }
    
}