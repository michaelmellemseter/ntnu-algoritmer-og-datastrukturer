public class Iterator {
    private Siffer plass;
    public Iterator(Lenke l) {
        plass = l.finnHode();
    }

    public boolean slutt(){
        return plass == null;
    }

    public int finnElement(){
        if (!slutt()) {
            return plass.finnSiffer();
        }else {
            return 0;
        }
    }

    public void neste() {
        if (!slutt()) {
            plass = plass.nesteSiffer();
        }
    }

    public void forrige() {
        if (!slutt()) {
            plass = plass.forrigeSiffer();
        }
    }

    public Siffer getPlass() {
        return plass;
    }
}
