import java.util.Date;
import java.util.Random;

public class Oving4 {
    public  static void main(String[] args){
        Oving3 konstruktor = new Oving3();
        Random rand = new Random();

        for (int i = 100; i < 1000000; i *= 10) {
            Date start = new Date();
            int runder = 0;
            double tid;
            Date slutt;
            do {
                int [] tabell = new int[i];
                for (int j = 0; j < tabell.length; j++){
                    tabell[j] = rand.nextInt(1000000) + 1;
                }
                konstruktor.quicksort(tabell, 0, tabell.length - 1);
                slutt = new Date();
                ++runder;
            } while (slutt.getTime() - start.getTime() < 1000);
            tid = (double)
                    (slutt.getTime() - start.getTime()) / runder;
            System.out.println(i + " elementer: Millisekund pr. runde:" + tid);

            if (i <= 100){
                //System.out.println(java.util.Arrays.toString(tabell));
            }
        }

        int [] tabell5 = new int[10000];
        int [] tabell6 = new int[10000];

        for (int i = 0; i < tabell5.length; i++){
            tabell5[i] = i;
        }

        for (int i = 0; i < tabell6.length; i++){
            if (i%2 == 0){
                tabell6[i] = 1;
            }else{
                tabell6[i] = 2;
            }
        }

        Date start5 = new Date();
        int runder5 = 0;
        double tid5;
        Date slutt5;
        do {
            konstruktor.quicksort(tabell5, 0, tabell5.length-1);
            slutt5 = new Date();
            ++runder5;
        } while (slutt5.getTime()-start5.getTime() < 1000);
        tid5 = (double)
                (slutt5.getTime()-start5.getTime()) / runder5;
        System.out.println("10000 elementer sortert: Millisekund pr. runde:" + tid5);

        Date start6 = new Date();
        int runder6 = 0;
        double tid6;
        Date slutt6;
        do {
            konstruktor.quicksort(tabell6, 0, tabell6.length-1);
            slutt6 = new Date();
            ++runder6;
        } while (slutt6.getTime()-start6.getTime() < 1000);
        tid6 = (double)
                (slutt6.getTime()-start6.getTime()) / runder6;
        System.out.println("10000 elementer annenhver: Millisekund pr. runde:" + tid6);


        //Heapsort

        System.out.println("\nMed Heapsort:\n");


        Heapsort heapsort = new Heapsort();

        for (int i = 100; i < 1000000; i *= 10) {
            Date start = new Date();
            int runder = 0;
            double tid;
            Date slutt;
            do {
                int [] tabell = new int[i];
                for (int j = 0; j < tabell.length; j++){
                    tabell[j] = rand.nextInt(1000000) + 1;
                }
                /*heap.lag_heap();
                for (int j = 0; j < i; j++) {
                    heap.sett_inn(rand.nextInt(1000000) + 1);
                }
                heap.heapsort();*/

                int [] sortertHeap = heapsort.sorter(tabell, 0, tabell.length);
                slutt = new Date();
                ++runder;
            } while (slutt.getTime() - start.getTime() < 1000);
            tid = (double)
                    (slutt.getTime() - start.getTime()) / runder;
            System.out.println(i + " elementer: Millisekund pr. runde:" + tid);
        }

        int [] tabell7 = new int[10000];
        int [] tabell8 = new int[10000];

        for (int i = 0; i < tabell7.length; i++){
            tabell7[i] = i;
        }

        for (int i = 0; i < tabell8.length; i++){
            if (i%2 == 0){
                tabell8[i] = 1;
            }else{
                tabell8[i] = 2;
            }
        }

        Date start7 = new Date();
        int runder7 = 0;
        double tid7;
        Date slutt7;
        do {
            int [] sortertHeap = heapsort.sorter(tabell7, 0, tabell7.length);
            slutt7 = new Date();
            ++runder7;
        } while (slutt7.getTime()-start7.getTime() < 1000);
        tid7 = (double)
                (slutt7.getTime()-start7.getTime()) / runder7;
        System.out.println("10000 elementer sortert: Millisekund pr. runde:" + tid7);

        Date start8 = new Date();
        int runder8 = 0;
        double tid8;
        Date slutt8;
        do {
            int [] sortertHeap = heapsort.sorter(tabell8, 0, tabell8.length);
            slutt8 = new Date();
            ++runder8;
        } while (slutt8.getTime()-start8.getTime() < 1000);
        tid8 = (double)
                (slutt8.getTime()-start8.getTime()) / runder8;
        System.out.println("10000 elementer annenhver: Millisekund pr. runde:" + tid8);
    }
}
