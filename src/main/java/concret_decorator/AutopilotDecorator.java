package concret_decorator;

import decorator.TeslaModelYDecorator;
import interfaces.TeslaModelYInterface;

public class AutopilotDecorator  extends TeslaModelYDecorator {


    public AutopilotDecorator(TeslaModelYInterface teslaModelYs) {
        super(teslaModelYs.aAutopilot(), teslaModelYs);
    }

    @Override
    public boolean aAutopilot(){
        return true;
    };

    @Override
    public double getPrix() {
        return super.getPrix() + 3800;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Autopilote amélioré";
    }
}
