package zoo;

public class FeedingVisitor implements Visitor {
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Feeding meat to the lion.");
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Feeding hay to the elephant.");
    }

    @Override
    public void visitPenguin(Penguin penguin) {
        System.out.println("Feeding fish to the penguin.");
    }
}
