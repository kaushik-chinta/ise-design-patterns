package zoo;

public class Elephant implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElephant(this);
    }
}
