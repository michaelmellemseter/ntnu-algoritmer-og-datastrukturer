public class Node {
    String element;
    Node neste;

    public Node(String s, Node n) {
        element = s;
        neste = n;
    }

    public String finnElement() {
        return element;
    }

    public Node nesteNode() {
        return neste;
    }
}
