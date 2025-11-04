public class Milk extends CoffeeDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + leche";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }
}
