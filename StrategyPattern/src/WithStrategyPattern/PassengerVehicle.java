package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
