package Test_site_example.PATTERNS.Prototip;

public class main {
    public static void main(String[] args) {

        PlasticTree h = new PlasticTree();
        PlasticTree j = (PlasticTree) h.copy();
        System.out.println(h.equals(j));
        System.out.println(h.hashCode());
        System.out.println(j.hashCode());


    }
}
