abstract class Vehicle {
    protected String type;

    public String getType() {
        return type;
    }

    abstract void start();
    abstract void stop();
}