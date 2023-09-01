package concret_decorator;

import decorator.TeslaModelYDecorator;
import interfaces.TeslaModelYInterface;

public class ExteriorColorDecorator extends TeslaModelYDecorator {

    private String couleurExterieur;
    private double prixSupplement;
    private String lienPhotoExterieur;

    public ExteriorColorDecorator(TeslaModelYInterface teslaModelYs, String couleurExterieur) {
        super(teslaModelYs);
        this.couleurExterieur = couleurExterieur;
        this.prixSupplement = calculerPrixSupplement();
        this.lienPhotoExterieur = determinerLienPhotoExterieur();
    }

    private double calculerPrixSupplement() {
        double prixSupplement = 0.0;
        // Logique pour calculer le prix supplémentaire en fonction de la couleur extérieure
        if ("noir".equals(couleurExterieur)) {
            prixSupplement = 0;
        } else if ("bleuMetal".equals(couleurExterieur)) {
            prixSupplement = 1600;
        } else if ("quicksilver".equals(couleurExterieur)) {
            prixSupplement = 3000;
        } else if ("midnightCherryRed".equals(couleurExterieur)) {
            prixSupplement = 3200;
        }
        return prixSupplement;
    }

    private String determinerLienPhotoExterieur() {
        // Déterminez le lien vers la photo extérieure en fonction de la couleur extérieure
        if ("noir".equals(couleurExterieur)) {
            return "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PBSB,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
        } else if ("bleuMetal".equals(couleurExterieur)) {
            return "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PPSB,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
        } else if ("quicksilver".equals(couleurExterieur)) {
            return "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PN00,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
        } else if ("midnightCherryRed".equals(couleurExterieur)) {
            return "https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$PR00,$WY19B,$INPW0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&";
        } else {
            return "Lien par défaut si la couleur n'est pas reconnue";
        }
    }

    @Override
    public String getPhotoExterieur() {
        return lienPhotoExterieur;
    }

    @Override
    public double getPrix() {
        return super.getPrix() + prixSupplement;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Couleur extérieure : " + couleurExterieur;
    }
}
