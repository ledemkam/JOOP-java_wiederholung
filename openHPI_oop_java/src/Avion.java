public class Avion extends Vehicule{
    @Override
    public void demarrer() {
        System.out.println("Le reacteur démarre et brûle du kérosène");
    }

    @Override
    public void arreter() {
        System.out.println("Le reacteur s'arrête et ne brûle plus de kérosène");
    }

    }

