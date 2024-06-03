package WithStrategyPattern.Strategy;

import WithStrategyPattern.Strategy.DriveStrategy;

public class SpecialDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal drive");
    }
}
