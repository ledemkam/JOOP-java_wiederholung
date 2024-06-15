public abstract class Vehicule {
    protected String modele;
    protected String marque;

    public int annee;

    public String type;
    public String typeMoteur;

    public abstract   void demarrer();
    public abstract   void arreter();

}