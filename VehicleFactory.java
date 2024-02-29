class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        }
        return null;
    }
}
