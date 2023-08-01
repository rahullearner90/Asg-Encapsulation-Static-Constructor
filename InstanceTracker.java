public class InstanceTracker {
    // Static variable to keep track of the number of instances created
    private static int numberOfInstances = 0;

    // Constructor
    public InstanceTracker() {
        // Increment the number of instances when a new object is created
        numberOfInstances++;
    }

    // Static method to get the number of instances
    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

    public static void main(String[] args) {
        // Create instances of InstanceTracker
        InstanceTracker instance1 = new InstanceTracker();
        InstanceTracker instance2 = new InstanceTracker();
        InstanceTracker instance3 = new InstanceTracker();

        // Get the number of instances created
        int numberOfInstances = InstanceTracker.getNumberOfInstances();
        System.out.println("Number of instances created: " + numberOfInstances);
    }
}
