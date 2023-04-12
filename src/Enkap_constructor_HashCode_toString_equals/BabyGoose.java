package Enkap_constructor_HashCode_toString_equals;

public class BabyGoose extends Goose {


    public BabyGoose(String colour, String name, String skill, int height) {
        super(colour, name, skill, height);
    }

    @Override
    public boolean equals(Object obj) {
        BabyGoose2 babyGoose2 = (BabyGoose2) obj;

        return getHeight() <= babyGoose2.getHeight();
    }
}
