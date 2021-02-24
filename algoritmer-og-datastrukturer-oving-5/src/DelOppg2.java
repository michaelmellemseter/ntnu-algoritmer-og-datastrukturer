import java.util.Date;
import java.util.Random;
import java.util.HashMap;

public class DelOppg2 {
    //Hasher heltallet
    private static int hashfunk(int k, int m) {
        return k % m;
    }

    private static int hashfunk2(int k, int m) {
        return (7-(k%7));
    }

    //Gjør om heltall til hashed verdi og legger det inn i hashtabell
    private static int legginn    (Integer tall, Integer[] ht){
        int m = ht.length;
        int h = hashfunk(tall, m );
        int h2;
        for(int i = 0; i < m; ++i){
            if(ht[h] == null) {
                ht[h] = tall;
                return h;
            }
            h2 = hashfunk2(tall,m);
            h = (h + (i + h2)) % m;
        }
        return -1;
    }
    public static void main(String[] args) {
        Integer[] ht = new Integer[5125000];
        Integer[] tall = new Integer[5000000];
        Random rand = new Random();

        for (int i = 0; i < tall.length; i++) {
            tall[i] = rand.nextInt(10000000);
        }

        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            for(int i = 0; i < tall.length; i++) {
                legginn(tall[i], ht);
            }
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. runde:" + tid);

        System.out.println("-----Hash.Map-----");

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        Date start1 = new Date();
        int runder1 = 0;
        double tid1;
        Date slutt1;
        do {
            for (int i = 0; i < tall.length; i++) {
                hmap.put(i, tall[i]);
            }
            slutt1 = new Date();
            ++runder1;
        } while (slutt1.getTime()-start1.getTime() < 1000);
        tid1 = (double)
                (slutt1.getTime()-start1.getTime()) / runder1;
        System.out.println("Millisekund pr. runde:" + tid1);
    }
}