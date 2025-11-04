public class Sugar extends CoffeeDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + azúcar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
