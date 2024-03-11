package zoo;

public class HealthCheckVisitor implements Visitor {
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Conducting health checkup for the lion.");
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Conducting health checkup for the elephant.");
    }

    @Override
    public void visitPenguin(Penguin penguin) {
        System.out.println("Conducting health checkup for the penguin.");
    }
}

