import concret_component.BaseTeslaModelY;
import concret_decorator.AutopilotDecorator;
import concret_decorator.ExteriorColorDecorator;
import concret_decorator.InteriorColorDecorator;
import concret_decorator.WheelSizeDecorator;
import interfaces.TeslaModelYInterface;

public class Main {
    public static void main(String[] args) {
        TeslaModelYInterface tesla = new BaseTeslaModelY();
        System.out.println("----------------test tesla 1----------------");
        System.out.println("Couleur extérieur : " + tesla.getPhotoExterieur());
        System.out.println("Couleur intérieur : " + tesla.getPhotoInterieur());
        System.out.println("Autopilote amélioré : " + tesla.aAutopilot());
        System.out.println("Jante "+ tesla.getTailleJantes()+ " pouces");
        System.out.println("(Autonomie : " + tesla.getAutonomie()+" km )");
        System.out.println("tarif :" + tesla.getPrix());
        System.out.println(tesla.getDescription());

        TeslaModelYInterface tesla2 =  new ExteriorColorDecorator(new InteriorColorDecorator(new WheelSizeDecorator( new AutopilotDecorator(new BaseTeslaModelY())),"noir"), "midnightCherryRed");
        System.out.println("----------------test tesla 2----------------");
        System.out.println("Couleur extérieur : " + tesla2.getPhotoExterieur());
        System.out.println("Couleur intérieur : " + tesla2.getPhotoInterieur());
        System.out.println("Autopilote amélioré : " + tesla2.aAutopilot());
        System.out.println("(Autonomie : " + tesla2.getAutonomie()+" km )");
        System.out.println("tarif :" + tesla2.getPrix());
        System.out.println(tesla2.getDescription());






    }
}
