package zoo;

public class Lion implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLion(this);
    }
}
