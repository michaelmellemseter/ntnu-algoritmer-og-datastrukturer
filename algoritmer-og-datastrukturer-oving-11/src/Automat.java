public class Automat {
    private char[] inputAlf;
    private int[] akseptTilstand;
    private int[][] nesteTilstand;

    public Automat(char[] inputAlf, int[] akseptTilstand, int[][] nesteTilstand){
        this.inputAlf = inputAlf;
        this.akseptTilstand = akseptTilstand;
        this.nesteTilstand = nesteTilstand;
    }

    public boolean sjekkInput(char[] input) {
        int currentTilstand = 0;
        int indeks = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < inputAlf.length; j++) {
                if (input[i] == inputAlf[j]) {
                    indeks = j;
                }
            }
            //System.out.println(indeks);
            currentTilstand = nesteTilstand[currentTilstand][indeks];
            //System.out.println(currentTilstand);
        }
        for (int i = 0; i < akseptTilstand.length; i++) {
            if (currentTilstand == akseptTilstand[i]) {
                return true;
            }
        }
        return false;
    }
}
