package sandwich;

class BasicSandwich implements Sandwich {
    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String description() {
        return "Basic Sandwich";
    }
}
