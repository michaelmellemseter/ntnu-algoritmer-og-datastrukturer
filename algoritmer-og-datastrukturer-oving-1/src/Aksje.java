import java.util.Random;
import java.util.Date;
public class Aksje {
    public static void finnVerdier(int n){
        int[] kursForandring = new int[n];
        int salgsdag = 0;
        int kjopsdag = 0;
        int diff = 0;
        int kurs = 0;
        int currentDiff = 0;
        int[] kurs1 = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++){
            kursForandring[i] = rand.nextInt(21) - 10;
            kurs =+ kursForandring[i];
            kurs1[i] = kurs;
        }

        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (kurs1[i] < kurs1[j]){
                    diff = kurs1[j]-kurs1[i];
                    if(diff > currentDiff) {
                        currentDiff = diff;
                        salgsdag = i+1;
                        kjopsdag = j+1;
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(kurs1) + " " + salgsdag + ", " + kjopsdag);
    }

    public static void main(String[] args){
        //finnVerdier(9);
        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            finnVerdier(10000);
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. runde:" + tid);
    }
}

/*
1-2 T(n) = n^2 => T(n) e ø(n^2)
1-3 T(100) = 0.030201
    T(1000) = 2.134328
    T(10 000) = 218.6
*/