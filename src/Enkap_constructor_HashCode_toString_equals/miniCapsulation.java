package Enkap_constructor_HashCode_toString_equals;

public class miniCapsulation extends Encapsulation {
    private int size;

    miniCapsulation(String title, int quantity, int size) {
        super(title, quantity);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Этот обьект является оболочкой наследником";
    }
//    @Override
//    public int hashCode(){
//        return 111;
//    }
}
