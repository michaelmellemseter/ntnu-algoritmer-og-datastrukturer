import java.util.Date;

public class Oppg3 {
    public static void main(String[] args){
        System.out.println(Math.pow(1.001, 5000));
        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            double r = Math.pow(5000, 1.001);
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. runde:" + tid);
    }
}
