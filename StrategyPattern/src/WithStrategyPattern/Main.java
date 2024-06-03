package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDrive;
import WithStrategyPattern.Strategy.SpecialDrive;

public class Main {
    public static void main(String[] args) {
        NormalDrive normalDrive = new NormalDrive();
        SpecialDrive specialDrive = new SpecialDrive();
        PassengerVehicle passengerVehicle = new PassengerVehicle(normalDrive);
        SportVehicle sportVehicle = new SportVehicle(specialDrive);
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle(specialDrive);

        passengerVehicle.drive();
        sportVehicle.drive();
        offRoadVehicle.drive();
    }
}
