public class tlacobdlznika {


    public static void main(String[] args)

    {

        //SIRKA OBDLZNIKA
         int stlpec = 30;

        //VYSKA OBDLZNIKA
         int riadok = 30;

        if (stlpec==riadok){
            System.out.println();
            System.out.println("---Obdlznik ma nespravny pomer stran---");
            System.exit(1);
        }

         // VOLAM METODU BEZ POTREBY VRATENIA VYSLEDKU - VOID
         tiskniObdelnik(stlpec,riadok);


    }

    //VOID METODA

    public static void tiskniObdelnik(int stlpec, int riadok) {

        // SPRACOVAVAM RIADKY/VYSKU

        for (int r = 1; r <= riadok; r++) {
            System.out.println(" ");

            // TESTUJEM RIADOK PRVY A POSLEDNY. TLACIM HVIEZDICKY DO STLPCOV

            if (r == 1 || r == riadok) {
                for (int s = 1; s <= stlpec; s++) {
                    System.out.print("*");
                }


            }

            // TESTUJEM RIADOK DRUHY A PREDPOSLEDNY. TLACIM HVIEZDICKA_MEDZERY_HVIEZDICKA DO STLPCOV

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






