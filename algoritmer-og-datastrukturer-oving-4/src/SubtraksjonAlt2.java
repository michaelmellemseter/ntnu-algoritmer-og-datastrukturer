import java.util.Random;

public class SubtraksjonAlt2 {
    public static Lenke subtraksjon(Lenke lenke1, Lenke lenke2) {
        int diff = 0;
        int test = 0;
        boolean minne = false;

        Lenke differansen = new Lenke();

        Lenke lengdeTest = lenke1;
        if (lenke2.finnAntall() > lenke1.finnAntall()){
            lengdeTest = lenke2;
        }

        Iterator iter = new Iterator(lenke1);
        Iterator iter2 = new Iterator(lenke2);

        for (int i = 0; i < lengdeTest.finnAntall()+1; i++) {
            int tall = iter.finnElement();

            if (minne) {
                if (iter.finnElement() == 0) {
                    --tall;
                    test = 1;
                }else {
                    --tall;
                    test = 0;
                }
            }

            if (tall < iter2.finnElement() && !iter.slutt()) {
                diff = (10 - test + iter.finnElement() - iter2.finnElement());
                minne = true;
                differansen.settInnFremst(diff);
            } else {
                diff = (tall - iter2.finnElement());
                minne = false;
                differansen.settInnFremst(diff);
            }
            iter.neste();
            iter2.neste();
        }
        return differansen;
    }

    public static void main(String[] args){
        int[] tabell = {4,0,0};
        int[] tabell2 = {2,5,0};
/*
        int[] tabell = new int[30];
        int[] tabell2 = new int[30];

        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            tabell[i] = rand.nextInt(10);
        }
        for (int i = 0; i < 30; i++) {
            tabell2[i] = rand.nextInt(10);
        }
*/
        Lenke lenke1 = new Lenke();
        Lenke lenke2 = new Lenke();

        for (int i = 0; i < tabell.length; i++) {
            lenke1.settInnFremst(tabell[i]);
        }

        for (int i = 0; i < tabell2.length; i++) {
            lenke2.settInnFremst(tabell2[i]);
        }

        Lenke differansen = subtraksjon(lenke1, lenke2);
        Iterator iterator = new Iterator(differansen);

        while (!iterator.slutt()) {
            int siffer = iterator.finnElement();
            System.out.println(siffer);
            iterator.neste();
        }
    }
}
