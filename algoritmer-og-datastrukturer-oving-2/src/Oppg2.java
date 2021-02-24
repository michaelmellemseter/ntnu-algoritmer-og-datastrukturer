import java.util.Date;

public class Oppg2 {
    public static double oppg2(int n, double x){
        if (n <= 0){
            return 1;
        }
        else if (n%2 == 0){
            return oppg2(n/2, x*x);
        }
        else {
            return x * oppg2((n-1)/2, x*x);
        }
    }
    public static void main(String[] args){
        System.out.println(oppg2(5000, 1.001));
        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            double r = oppg2(5000, 1.001);
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. runde:" + tid);
    }
}
