package POO.JavaBnB.logements;

import java.time.LocalDate;

public class Batiment {
    // Etape 1 Déclaration des attributs
    /**
     * Date de construction du batiment
     * Le batiment peut être entreprise, location annuelle, AirBnb
     * La classe energie A,B,C,D selon le DPE réalisé pour la mise en ligne
     */
    private int anneeConstruction;

    private ClasseEnergie classEnergie;

// Etape 2 le constructeur : j'ajoute une valeur à mes attributs =>  initialisation

    public Batiment (int anneeConstruction, ClasseEnergie classEnergie){
        this.anneeConstruction = anneeConstruction;
        this.classEnergie = classEnergie;
    }

    // Etape 3 Getter et Setter si besoin
    public int getAgeBati() {
        return anneeConstruction;
    }


    public ClasseEnergie getClassEnergie(){
        return classEnergie;
    }

    public int getAnneeConstruction() {
        return anneeConstruction;
    }


    // Etape 4 Autre methode
    public void afficherBati(){
        System.out.println("le bâtiment a été construit en  "+ anneeConstruction + "il a donc " + ageDuBatiment() + "  ans et son DPE est classé " + classEnergie);
       // System.out.println("le bâtiment a été construit il y a  " + ageBati + "  ans et son DPE est classé " + classEnergie + " il est de type " + type);
        //System.out.println("le bâtiment " +  getType().getNom());
    }

    /**
     * Methode pour calculer l'âge du batiment
     * utilisation de la class LocalDate + la methode now + accesseur getYear = l'année actuelle
     * * @return l'âge du batiment
     */
    public int ageDuBatiment(){
      return   LocalDate.now().getYear() - anneeConstruction;
    }
    //Dire à Java que Object (la classe parente de toutes les classes)
    // a déjà une méthode toString(). Je ne suis pas en train d'en créer une nouvelle par accident —
    // je remplace volontairement celle qui existe."
    @Override
    public String toString(){
        return ("getter du batiment ");
    }
}
