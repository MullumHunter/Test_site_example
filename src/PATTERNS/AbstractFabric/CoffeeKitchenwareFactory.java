package Test_site_example.PATTERNS.AbstractFabric;

import Test_site_example.PATTERNS.AbstractFabric.interfece.Cup;
import Test_site_example.PATTERNS.AbstractFabric.interfece.KitchenwareFactory;
import Test_site_example.PATTERNS.AbstractFabric.interfece.Spoon;

class CoffeeKitchenwareFactory implements KitchenwareFactory {
    @Override
    public Cup createCup() {
        return new CoffeeCup();
    }

    @Override
    public Spoon createSpoon() {
        return new CoffeeSpoon();
    }
}
