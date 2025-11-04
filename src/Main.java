public class Main {
    public static void main(String[] args) {
        Beverage coffee = new SimpleCoffee();                 // Café solo
        System.out.println(coffee.getDescription() + " -> " + coffee.cost() + "€");

        coffee = new Milk(coffee);                            // Añadimos leche
        System.out.println(coffee.getDescription() + " -> " + coffee.cost() + "€");

        coffee = new Sugar(coffee);                           // Añadimos azúcar
        System.out.println(coffee.getDescription() + " -> " + coffee.cost() + "€");

        // Otro ejemplo: dos azúcares
        Beverage custom = new Sugar(new Sugar(new SimpleCoffee()));
        System.out.println(custom.getDescription() + " -> " + custom.cost() + "€");
    }
}
