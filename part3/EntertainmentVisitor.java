package zoo;

public class EntertainmentVisitor implements Visitor {
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Organizing a roaring show for the lion.");
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Arranging a water-splashing performance for the elephant.");
    }

    @Override
    public void visitPenguin(Penguin penguin) {
        System.out.println("Hosting a playful sliding competition for the penguin.");
    }
}
