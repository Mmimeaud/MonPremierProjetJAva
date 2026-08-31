package POO.JavaBnB.outils;

import POO.JavaBnB.logements.Logement;
import POO.JavaBnB.reservations.Sejour;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/* À chaque fois que tu appelles formaterDate(...),
 Java recrée un nouvel objet DateTimeFormatter en analysant le pattern "dd/MM/yyyy" depuis zéro.
Si tu appelles cette méthode 1000 fois (par exemple pour formater une liste de réservations),
Java refait ce travail 1000 fois, alors que le résultat est toujours identique.
Donc extrait le DateTimeFormatter en constante statique pour éviter de le recréer à chaque appel*/

public class Utiles {
    /* Constructeur Utiles */
    private Utiles(){}
 /**
  * Methode pour formater une date au format Fr.
 * @param date = date d'arrivée des voyageurs
 * @return  la date au format JJ/MM/AAAA
 * */
    public static String formaterDate(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
    /**
    * Methode pour calculer prix total des nuits
    * @param ttNuit = total des nuits réservé
    * @param prixNuit =  prix pour une nuit
    * @return  le montant total pour la réservation
    * */
    public static int montantTotal(int ttNuit, int prixNuit){
        return ttNuit * prixNuit;
    }

}
