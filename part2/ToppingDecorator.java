package sandwich;

class ToppingDecorator extends SandwichDecorator {
    private String topping;

    public ToppingDecorator(Sandwich decoratedSandwich, String topping) {
        super(decoratedSandwich);
        this.topping = topping;
    }

    @Override
    public double cost() {
        // Additional cost for the topping
        return super.cost() + 1.5;
    }

    @Override
    public String description() {
        return super.description() + " with " + topping + " topping";
    }
}

