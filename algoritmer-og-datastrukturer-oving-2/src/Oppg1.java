import java.util.Date;

public class Oppg1 {
    public static double oppg(int n, double x){
        if (n <= 0){
            return 1;
        }
        else {
            return x * oppg(n-1, x);
        }
    }
    public static void main(String[] args){
        System.out.println(oppg(5000, 1.001));
        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            double r = oppg(5000, 1.001);
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. runde:" + tid);
    }
}