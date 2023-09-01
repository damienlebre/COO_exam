package concret_component;

import interfaces.TeslaModelYInterface;

public class BaseTeslaModelY implements TeslaModelYInterface {


    @Override
    public String getPhotoInterieur() {
        return "lien vers l'intérieur noir par défaut -> " + "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PBSB,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
    }

    @Override
    public String getPhotoExterieur() {
        return "lien vers l'extérieur blanc nacré par défaut -> " + "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PPSW,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
    }

    @Override
    public int getTailleJantes() {
        return 19;
    }

    @Override
    public boolean aAutopilot() {
        return false;
    }

    @Override
    public double getPrix() {
        return 44000;
    }

    @Override
    public int getAutonomie() {
        return 455;
    }

    @Override
    public String getDescription() {
        return "Tesla Model Y propulsion de base";
    }
}
