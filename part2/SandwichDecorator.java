package sandwich;

abstract class SandwichDecorator implements Sandwich {
    protected Sandwich decoratedSandwich;

    public SandwichDecorator(Sandwich decoratedSandwich) {
        this.decoratedSandwich = decoratedSandwich;
    }

    @Override
    public double cost() {
        return decoratedSandwich.cost();
    }

    @Override
    public String description() {
        return decoratedSandwich.description();
    }
}
