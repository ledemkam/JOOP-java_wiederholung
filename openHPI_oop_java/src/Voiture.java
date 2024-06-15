public class Voiture extends  VehiculleTerrestre implements Testinterface{

    private int puissance;
  public Voiture(String marque, String modele, int puissance) {
        this.marque    = marque;
        this.modele    = modele;
        this.puissance = puissance;
  }
    public int getPuissance() {
        return this.puissance;
    }
    public void setPuissance(int newPuissance) {
    if (newPuissance < 0) {
            System.out.println("INVALID !! ,La puissance ne peut pas être négative");
    }else {
            this.puissance = newPuissance;
    }
    }



    @Override
    public void testLog() {
        
    }
}
