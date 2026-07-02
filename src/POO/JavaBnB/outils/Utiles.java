package POO.JavaBnB.outils;

import POO.JavaBnB.logements.Logement;
import POO.JavaBnB.reservations.Sejour;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;



public class Utiles {

public static String formaterDate(LocalDate date){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return date.format(formatter);
}

public static int montantTotal(int ttNuit, int prixNuit){
    return ttNuit * prixNuit;
}

}
