package sandwich;

class SauceDecorator extends SandwichDecorator {
    private String sauce;

    public SauceDecorator(Sandwich decoratedSandwich, String sauce) {
        super(decoratedSandwich);
        this.sauce = sauce;
    }

    @Override
    public double cost() {
        // Additional cost for the sauce
        return super.cost() + 0.75;
    }

    @Override
    public String description() {
        return super.description() + " with " + sauce + " sauce";
    }
}
