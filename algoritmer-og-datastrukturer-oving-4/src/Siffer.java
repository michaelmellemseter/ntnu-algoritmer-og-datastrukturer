public class Siffer {
    int siffer;
    Siffer neste;
    Siffer forrige;

    public Siffer(int s, Siffer n, Siffer f) {
        siffer = s;
        neste = n;
        forrige = f;
    }

    public int finnSiffer() {
        return siffer;
    }

    public Siffer nesteSiffer() {
        return neste;
    }

    public Siffer forrigeSiffer() {
        return forrige;
    }
}
