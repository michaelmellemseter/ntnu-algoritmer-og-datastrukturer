import java.util.Random;

public class AddisjonAlt2 {
    public static Lenke addisjon(Lenke lenke1, Lenke lenke2) {
        int sum = 0;
        int minne = 0;

        Lenke summen = new Lenke();

        Lenke lengdeTest = lenke1;
        if (lenke2.finnAntall() > lenke1.finnAntall()){
            lengdeTest = lenke2;
        }

        Iterator iter = new Iterator(lenke1);
        Iterator iter2 = new Iterator(lenke2);

        for (int i = 0; i < lengdeTest.finnAntall()+1; i++) {
            if (iter.finnElement() + iter2.finnElement() + minne >= 10) {
                sum = (iter.finnElement() + iter2.finnElement() + minne - 10);
                minne = 1;
                summen.settInnFremst(sum);
            } else {
                sum = (iter.finnElement() + iter2.finnElement() + minne);
                minne = 0;
                summen.settInnFremst(sum);
            }
            iter.neste();
            iter2.neste();
        }
        return summen;
    }

    public static void main(String[] args){
        int[] tabell = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        int[] tabell2 = {2,5,0};
/*
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

        Lenke summen = addisjon(lenke1, lenke2);
        Iterator iterator = new Iterator(summen);

        while (!iterator.slutt()) {
            int siffer = iterator.finnElement();
            System.out.println(siffer);
            iterator.neste();
        }
    }
}
