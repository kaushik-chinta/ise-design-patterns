package zoo;

public class ZooManagementClient {
    public static void main(String[] args) {
        // Creating animals
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal penguin = new Penguin();

        // Creating visitors
        Visitor feedingVisitor = new FeedingVisitor();
        Visitor healthCheckVisitor = new HealthCheckVisitor();
        Visitor entertainmentVisitor = new EntertainmentVisitor();

        // Performing operations
        lion.accept(feedingVisitor);
        elephant.accept(healthCheckVisitor);
        penguin.accept(entertainmentVisitor);
    }
}
