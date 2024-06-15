public class Main {
    public static void main(String[] args) {

     Barista neuBarista = new Barista( "Doe", "John");
     //on peut accerder aux attributs ou methodes de la classe Barista
     Kaffee neuKaffee = neuBarista.kaffeeZubereiten( 2, 3);

     //appele de methode kaaffeeZubereiten venant de la surcharge de methode
        Kaffee neuKaffee2 = neuBarista.kaffeeZubereiten();

     AnzahlZuckerZeigen(neuKaffee);
        AnzahlZuckerZeigen(neuKaffee2);
     neuBarista.kaffeeTouil(neuKaffee);// on passe en parametre neuKaffee,parcequ il est de type Kaffee et
                                        // la methode kaffeeTouil declarre dans Barista.java
        // prend en parametre un objet de type Kaffee(type ou classe)
      //  System.out.println("Kaffee Zucker: " + neuKaffee.zuckerAnzahl );
      neuBarista.kaffeeTouil(neuKaffee2);

        AnzahlZuckerZeigen(neuKaffee);
        AnzahlZuckerZeigen(neuKaffee2);
    }
    // Dans le main toutes classe declaree s sont static, donc on peut les appeler directement
     public  static void AnzahlZuckerZeigen(Kaffee neuKaffee){
        System.out.println("Anzahl Zucker in kaffee ist: " + neuKaffee.zuckerAnzahl);
     }


}