public class tlacobdlznika {


    public static void main(String[] args)

    {

        //SIRKA OBDLZNIKA
         int stlpec = 30;

        //VYSKA OBDLZNIKA
         int riadok = 7;

         // VOLAM METODU BEZ POTREBY VRATENIA VYSLEDKU - VOID
         tiskniObdelnik(stlpec,riadok);


    }

    //VOID METODA

    public static void tiskniObdelnik(int stlpec, int riadok) {

        // SPRACOVAVAM RIADKY
        for (int r = 1; r <= riadok; r++) {
            System.out.println(" ");

            // TESTUJM RIADOK PRVY A POSLEDNY. TLACIM HVIEZDICKY.
            if (r == 1 || r == riadok) {
                for (int s = 1; s <= stlpec; s++) {
                    System.out.print("*");
                }

                // TESTUJEM RIADOK DRUHY A PREDPOSLEDNY. TLACIM HVIEZDICKA_MEDZERY_HVIEZDICKA
            }


            if (r > 1 && r < riadok) {
                for (int s = 1; s <= stlpec; s++) {
                    if (s == 1 || s == stlpec) {
                        System.out.print("*");
                    }

                    //NUTNA PODMIENKA KVOLI UDRZANIU SIRKY RIADKU

                    if (s < (stlpec - 1)) {
                        System.out.print(" ");
                    }

                }

            }

        }

    }

}






