public class Subtraksjon {
    public static int subtraksjon(Lenke lenke1, Lenke lenke2) {
        int diff = 0;
        boolean minne = false;
        int gange = 1;

        Lenke lengdeTest = lenke1;
        if (lenke2.finnAntall() > lenke1.finnAntall()){
            lengdeTest = lenke2;
        }

        Iterator iter = new Iterator(lenke1);
        Iterator iter2 = new Iterator(lenke2);

        for (int i = 0; i < lengdeTest.finnAntall()+1; i++) {
            int tall = iter.finnElement();

            if (minne) {
                --tall;
            }

            if (tall < iter2.finnElement() && !iter.slutt()) {
                diff += (10 + iter.finnElement() - iter2.finnElement()) * gange;
                minne = true;
            } else {
                diff += (tall - iter2.finnElement()) * gange;
                minne = false;
            }

            gange *= 10;

            iter.neste();
            iter2.neste();
        }
        return diff;
    }

    public static void main(String[] args){
        int[] tabell = {3,3,3};
        int[] tabell2 = {7,2,6};

        Lenke lenke1 = new Lenke();
        Lenke lenke2 = new Lenke();

        for (int i = 0; i < tabell.length; i++) {
            lenke1.settInnFremst(tabell[i]);
        }

        for (int i = 0; i < tabell2.length; i++) {
            lenke2.settInnFremst(tabell2[i]);
        }

        int diff = subtraksjon(lenke1, lenke2);
        System.out.println(diff);
    }
}
