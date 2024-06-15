import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<Vehicule> vehicules = new ArrayList<Vehicule>();

        Voiture maVoiture = new Voiture("Peugeot", "208",500);

        maVoiture.setPuissance(-2000);
        System.out.println("Puissance de la voiture : " + maVoiture.getPuissance());

    }
}