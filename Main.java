public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("Car");
        if (car != null) {
            car.start();
            car.stop();
        }

        Vehicle motorcycle = VehicleFactory.createVehicle("Motorcycle");
        if (motorcycle != null) {
            motorcycle.start();
            motorcycle.stop();
        }
    }
}