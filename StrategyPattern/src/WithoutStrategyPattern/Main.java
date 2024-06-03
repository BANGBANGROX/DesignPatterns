package WithoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        PassengerVehicle passengerVehicle = new PassengerVehicle();
        SportVehicle sportVehicle = new SportVehicle();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();

        passengerVehicle.drive();
        sportVehicle.drive();
        offRoadVehicle.drive();
    }
}
