package decorator;

import interfaces.TeslaModelYInterface;

public class TeslaModelYDecorator implements TeslaModelYInterface {
    private final TeslaModelYInterface teslaModelYs;
    public TeslaModelYDecorator(TeslaModelYInterface teslaModelYs){this.teslaModelYs= teslaModelYs;}

    public TeslaModelYDecorator(boolean b, TeslaModelYInterface teslaModelYs) {
        this.teslaModelYs = teslaModelYs;
    }


    @Override
    public String getPhotoInterieur() {
        return teslaModelYs.getPhotoInterieur();
    }

    @Override
    public String getPhotoExterieur() {
        return teslaModelYs.getPhotoExterieur();
    }

    @Override
    public int getTailleJantes() {
        return teslaModelYs.getTailleJantes();
    }

    @Override
    public boolean aAutopilot() {
        return teslaModelYs.aAutopilot();
    }

    @Override
    public double getPrix() {
        return teslaModelYs.getPrix();
    }

    @Override
    public int getAutonomie() {
        return teslaModelYs.getAutonomie();
    }

    @Override
    public String getDescription() {
        return teslaModelYs.getDescription();
    }

}
