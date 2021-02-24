public class Lenke {
    private Node hode = null;
    private int antElementer = 0;
    private Node hale = null;

    public int finnAntall() {
        return antElementer;
    }

    public void settInnFremst(String verdi) {
        hode = new Node(verdi,hode);
        ++antElementer;
    }


    public void settInnBakerst(String verdi) {
        if (hode != null) {
            Node denne = hode;
            while (denne.neste!=null) {
                denne = denne.neste;
            }
        }else{
            hode = new Node(verdi,null);
        }
        ++antElementer;
    }

    public Node finnHale(){
        return hale;
    }

    public Node finnHode(){
        return hode;
    }
}
