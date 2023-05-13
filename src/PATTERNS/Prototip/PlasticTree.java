package Test_site_example.PATTERNS.Prototip;

public class PlasticTree extends Tree{

    @Override
    public Tree copy() {
        return new PlasticTree();
    }
}
