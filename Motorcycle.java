class Motorcycle extends Vehicle {
    public Motorcycle() {
        this.type = "Motorcycle";
    }

    @Override
    void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle stopped");
    }
}
