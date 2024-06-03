package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class SportVehicle extends Vehicle {
    SportVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
