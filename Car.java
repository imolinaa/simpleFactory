class Car extends Vehicle {
    public Car() {
        this.type = "Car";
    }

    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }
}