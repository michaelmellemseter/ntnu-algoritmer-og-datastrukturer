public class Lenke {
    private Siffer hode = null;
    private int antElementer = 0;
    private Siffer hale = null;

    public int finnAntall() {
        return antElementer;
    }

    public void settInnFremst(int siffer) {
        hode = new Siffer(siffer, hode, null);
        if(hale == null) {
            hale = hode;
        }else{
            hode.neste.forrige = hode;
        }
        ++antElementer;
    }


    public void settInnBakerst(int siffer) {
        Siffer ny = new Siffer(siffer, null, hale);
        if (hale != null) {
            hale.neste = ny;
        }else{
            hode = ny;
        }
        hale = ny;
        ++antElementer;
    }

    public Siffer finnHale(){
        return hale;
    }

    public Siffer finnHode(){
        return hode;
    }
}
