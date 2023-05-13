package Test_site_example.PATTERNS.Prototip;

public class PineTree extends Tree{
    @Override
    public Tree copy() {
        return  new PineTree();
    }
}
