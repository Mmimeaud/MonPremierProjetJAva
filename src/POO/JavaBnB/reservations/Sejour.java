package POO.JavaBnB.reservations;

import POO.JavaBnB.logements.Logement;
import POO.JavaBnB.outils.Utiles;
/**
 * Import de la class Date via la JRE
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sejour {

    // Etape 1 Attribut
    private LocalDate dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;



    // Etape 2 Constructeur + initialisation

    public Sejour (LocalDate dateArrivee,  int nbNuits, Logement logement, int nbVoyageurs){
       this.dateArrivee = dateArrivee;
        this.nbNuits = nbNuits;
        this.logement = logement;
        this.nbVoyageurs = nbVoyageurs;
    }
    // Etape 3 Getter / Setter


    // Etape 4 Autres methodes
    // Methode transférer en static dans la class Utiles
  /*  public int calculTarif(){
        int tarifTotal =  nbNuits * logement.getTarifParNuit();
        return tarifTotal;
    }*/


    public void afficherSejour(){

        /**
         *  Changer le format de la date ENG en FR, methode mise dans la classe Utiles par la suite
          */
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       // String dateFormate = dateArrivee.format(formatter);


        logement.afficher();
        System.out.println("La date d'arriver est le " + Utiles.formaterDate(dateArrivee) + " pour " + nbNuits + " nuit" +
                (nbNuits > 1 ? "s" :"."));
        System.out.println(" le prix par nuit est de " + logement.getTarifParNuit() + "€");
        //System.out.println(" Le prix total de ce séjour est de " +calculTarif() + "€");
        System.out.println(" Test methode Utiles :  Le prix total de ce séjour est de " + Utiles.montantTotal(nbNuits,logement.getTarifParNuit()) + "€");

    }

}
