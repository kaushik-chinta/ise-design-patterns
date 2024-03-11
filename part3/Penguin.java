package zoo;

public class Penguin implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPenguin(this);
    }
}
