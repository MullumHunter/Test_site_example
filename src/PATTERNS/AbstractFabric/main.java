package Test_site_example.PATTERNS.AbstractFabric;

import Test_site_example.PATTERNS.AbstractFabric.interfece.Cup;
import Test_site_example.PATTERNS.AbstractFabric.interfece.KitchenwareFactory;
import Test_site_example.PATTERNS.AbstractFabric.interfece.Spoon;

public class main {
    public static void main(String[] args) {
        KitchenwareFactory factory = new CoffeeKitchenwareFactory();
        Cup cup = factory.createCup();
        Spoon spoon = factory.createSpoon();

        System.out.println("Созданы чашка и ложка для кофе в стиле \"кофейный\":");
        System.out.println(cup);
        System.out.println(spoon);

        KitchenwareFactory factory2= new EnglishKitchenwareFactory();
        Cup cup2 = factory2.createCup();
        Spoon spoon2 = factory2.createSpoon();

        System.out.println("Созданы чашка и ложка для кофе в стиле \"кофейный\":");
        System.out.println(cup2);
        System.out.println(spoon2);

    }
}
