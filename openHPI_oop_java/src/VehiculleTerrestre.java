public  abstract class VehiculleTerrestre extends  Vehicule{
    @Override
    public void demarrer() {
        System.out.println("Le moteur démarre et brüle de l'essence");
    }

    @Override
    public void arreter() {
        System.out.println("Le moteur s'arrête et ne brûle plus d'essence");
    }
}
