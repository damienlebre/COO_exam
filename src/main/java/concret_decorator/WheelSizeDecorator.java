package concret_decorator;

import decorator.TeslaModelYDecorator;
import interfaces.TeslaModelYInterface;

public class WheelSizeDecorator extends TeslaModelYDecorator {


    public WheelSizeDecorator(TeslaModelYInterface teslaModelYs) {
        super(teslaModelYs);
    }

    @Override
    public int getAutonomie() {
        return 430;
    }
    @Override
    public double getPrix(){
        return super.getPrix()+ 2100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Jantes " + 20 + " pouces, autonomie : 430 km";
    }
}
