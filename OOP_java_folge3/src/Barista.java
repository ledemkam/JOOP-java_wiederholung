public class Barista {
    public String nom;
    public String prenom;


// constructeur
    public Barista(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

// ici de la ligne 10 a 16 on a deux methodes kaffeeZubereiten, mais avec des parametres differents
//on a affaire a une surcharge de methode
    public Kaffee kaffeeZubereiten(){
        return kaffeeZubereiten(0, 0);
    }
// methode mit parameter
    public  Kaffee kaffeeZubereiten(Integer zuckerAnzahl, Integer milchDichte){
        Kaffee neuKaffee = new Kaffee( zuckerAnzahl, milchDichte);
        return neuKaffee;
    }

    // exemple de reference appliquee a une methode mit parameter(hier parameter est un objet de type Kaffee)
    public Kaffee kaffeeTouil(Kaffee kaffees){
        System.out.println("barista mischt " +this.nom + " Zucker und " + this.prenom + " Milch" + kaffees.zuckerAnzahl + " und " + kaffees.milchDichte);
        kaffees.zuckerAnzahl = 1000;
        return kaffees;

    }
}
