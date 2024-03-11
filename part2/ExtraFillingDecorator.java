package sandwich;

class ExtraFillingDecorator extends SandwichDecorator {
    private String extraFilling;

    public ExtraFillingDecorator(Sandwich decoratedSandwich, String extraFilling) {
        super(decoratedSandwich);
        this.extraFilling = extraFilling;
    }

    @Override
    public double cost() {
        // Additional cost for the extra filling
        return super.cost() + 2.0;
    }

    @Override
    public String description() {
        return super.description() + " with extra filling: " + extraFilling;
    }
}
