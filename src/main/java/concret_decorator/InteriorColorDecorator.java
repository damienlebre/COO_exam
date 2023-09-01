package concret_decorator;

import decorator.TeslaModelYDecorator;
import interfaces.TeslaModelYInterface;

public  class InteriorColorDecorator  extends TeslaModelYDecorator {

    private String couleurInterieur;
    private double prixSupplement;

    public InteriorColorDecorator(TeslaModelYInterface teslaModelYs, String couleurInterieur) {
        super(teslaModelYs);
        this.couleurInterieur = couleurInterieur;
        this.prixSupplement = calculerPrixSupplement();
    }

    private double calculerPrixSupplement() {
        double prixSupplement = 0.0;
        // Logique pour calculer le prix supplémentaire en fonction de la couleur intérieure
        if ("interieurWhite".equals(couleurInterieur)) {
            prixSupplement = 1190;
        } else if ("noir".equals(couleurInterieur)) {
            prixSupplement = 1234; // Ajoutez la logique pour d'autres couleurs intérieures ici
        }
        return prixSupplement;
    }

    @Override
    public double getPrix() {
        return super.getPrix() + prixSupplement;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Couleur intérieure : " + couleurInterieur;
    }

}
