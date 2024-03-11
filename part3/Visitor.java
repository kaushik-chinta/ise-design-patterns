package zoo;

interface Visitor {
    void visitLion(Lion lion);
    void visitElephant(Elephant elephant);
    void visitPenguin(Penguin penguin);
}
