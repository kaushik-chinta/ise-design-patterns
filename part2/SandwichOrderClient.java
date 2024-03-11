package sandwich;

public class SandwichOrderClient {
    public static void main(String[] args) {
        // Order a basic sandwich
        Sandwich basicSandwich = new BasicSandwich();
        System.out.println("Cost: $" + basicSandwich.cost() + ", Description: " + basicSandwich.description());

        // Order a sandwich with toppings and sauce
        Sandwich customSandwich = new SauceDecorator(new ToppingDecorator(new BasicSandwich(), "Tomatoes"),
                "Mayonnaise");
        System.out.println("Cost: $" + customSandwich.cost() + ", Description: " + customSandwich.description());

        // Order a sandwich with extra filling
        Sandwich deluxeSandwich = new ExtraFillingDecorator(new BasicSandwich(), "Avocado");
        System.out.println("Cost: $" + deluxeSandwich.cost() + ", Description: " + deluxeSandwich.description());
    }
}