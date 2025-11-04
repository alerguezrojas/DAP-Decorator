public class SimpleCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Café solo";
    }

    @Override
    public double cost() {
        return 1.00; // precio base
    }
}
