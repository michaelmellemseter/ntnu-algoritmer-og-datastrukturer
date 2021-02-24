public class Addisjon {
    public static int addisjon(Lenke lenke1, Lenke lenke2) {
        int sum = 0;
        int minne = 0;
        int gange = 1;
        //int teller = 1;
        //int kondisjon = 0;
        //int kondisjon2 = 0;

        //Lenke summen = new Lenke();

        Lenke lengdeTest = lenke1;
        if (lenke2.finnAntall() > lenke1.finnAntall()){
            lengdeTest = lenke2;
        }


        Iterator iter = new Iterator(lenke1);
        Iterator iter2 = new Iterator(lenke2);

        //Siffer startSiffer1 = lenke1.finnHale();
        //Siffer startSiffer2 = lenke2.finnHale();

        //while (kondisjon == 0 && kondisjon2 == 0 && minne == 1){
        for (int i = 0; i < lengdeTest.finnAntall()+1; i++) {
            /*
            if (teller == 1) {
                minne = 0;
                teller ++;
            }
            */
/*
            if (startSiffer1.finnSiffer() + startSiffer2.finnSiffer() + minne >= 10) {
                sum += (startSiffer1.finnSiffer() + startSiffer2.finnSiffer() + minne - 10) * gange;
                minne = 1;
            } else {
                sum += (startSiffer1.finnSiffer() + startSiffer2.finnSiffer() + minne) * gange;
                minne = 0;
            }
*/
            if (iter.finnElement() + iter2.finnElement() + minne >= 10) {
                sum += (iter.finnElement() + iter2.finnElement() + minne - 10) * gange;
                //sum = (iter.finnElement() + iter2.finnElement() + minne - 10);
                minne = 1;
                //summen.settInnFremst(sum);
            } else {
                sum += (iter.finnElement() + iter2.finnElement() + minne) * gange;
                //sum = (iter.finnElement() + iter2.finnElement() + minne);
                minne = 0;
                //summen.settInnFremst(sum);
            }

            gange *= 10;

            iter.neste();
            iter2.neste();
/*
            if (iter.slutt()) {
                kondisjon = 1;
                iter.getPlass() = new Siffer(0,null,null);
            }
            if (iter2.slutt()) {
                kondisjon2 = 1;
            }
            */
/*
            if (startSiffer1.nesteSiffer() !=  null) {
                startSiffer1 = startSiffer1.nesteSiffer();
            }else {
                startSiffer1 = new Siffer(0, null, null);
            }

            if (startSiffer2.nesteSiffer() !=  null) {
                startSiffer2 = startSiffer2.nesteSiffer();
            }else {
                startSiffer2 = new Siffer(0, null, null);
            }
*/
            //System.out.println(startSiffer1.finnSiffer() + " " + startSiffer2.finnSiffer());

        }
        //return summen;
        return sum;
    }

    public static void main(String[] args){
        int[] tabell = {9,6};
        int[] tabell2 = {9,9,9};

        Lenke lenke1 = new Lenke();
        Lenke lenke2 = new Lenke();

        for (int i = 0; i < tabell.length; i++) {
            lenke1.settInnFremst(tabell[i]);
        }

        for (int i = 0; i < tabell2.length; i++) {
            lenke2.settInnFremst(tabell2[i]);
        }

        int sum = addisjon(lenke1,lenke2);

        //Lenke summen = addisjon(lenke1, lenke2);
        //Iterator iterator = new Iterator(summen);
/*
        for (int i = 0; 0 < summen.finnAntall(); i++) {
            int siffer = iterator.finnElement();
            System.out.println(siffer);
            iterator.neste();
        }
*/
        System.out.println(sum);
    }
}
