public class Klient {
    public static void main(String[] args){
        char[] bitAlf = {'0','1'};
        int[] bitAksept = {2};
        int[][] bitNeste = {{1,3}, {1,2}, {2,3}, {3,3}};


        Automat bit = new Automat(bitAlf, bitAksept, bitNeste);

        char[] bitstreng = {};
        char[] bitstreng2 = {'0','1','0'};
        char[] bitstreng3 = {'1','1','1'};
        char[] bitstreng4 = {'0','1','0','1','1','0'};
        char[] bitstreng5 = {'0','0','1','0','0','0'};

        System.out.println("Tomme strengen: " + bit.sjekkInput(bitstreng));
        System.out.println("010: " + bit.sjekkInput(bitstreng2));
        System.out.println("111: " + bit.sjekkInput(bitstreng3));
        System.out.println("010110: " + bit.sjekkInput(bitstreng4));
        System.out.println("001000: " + bit.sjekkInput(bitstreng5));


        char[] abAlf = {'a','b'};
        int[] abAksept = {2};
        int[][] abNeste = {{1,3}, {4,2}, {2,2}, {2,4}, {4,4}};


        Automat ab = new Automat(abAlf, abAksept, abNeste);

        char[] streng = {'a','b','b','b'};
        char[] streng2 = {'a','a','a','b'};
        char[] streng3 = {'b','a','b','a','b'};

        System.out.println("abbb: " + ab.sjekkInput(streng));
        System.out.println("aaab: " + ab.sjekkInput(streng2));
        System.out.println("babab: " + ab.sjekkInput(streng3));
    }
}
