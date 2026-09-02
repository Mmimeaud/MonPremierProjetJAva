package POO.JavaBnB.logements;

public class Batiment {
    // Etape 1 Déclaration des attributs
    /**
     * Date de construction du batiment
     * Le batiment peut être entreprise, location annuelle, AirBnb
     * La classe energie A,B,C,D selon le DPE réalisé pour la mise en ligne
     */
    private int ageBati ;
    private TypeBatiment type;
    private ClasseEnergie classEnergie;

// Etape 2 le constructeur : j'ajoute une valeur à mes attributs =>  initialisation

    public Batiment (int ageBati, TypeBatiment type, ClasseEnergie classEnergie){
        this.ageBati = ageBati;
        this.type = type;
        this.classEnergie = classEnergie;
    }

    // Etape 3 Getter et Setter si besoin
    public int getAgeBati() {
        return ageBati;
    }

    public TypeBatiment getType(){
        return type;
    }

    public ClasseEnergie getClassEnergie(){
        return classEnergie;
    }

    public void SetAgeBati(int ageBati) {
        this.ageBati = ageBati;
    }

    // Etape 4 Autre methode
    public void afficherBati(){
       // System.out.println("le batiment a été construit il y a  " + ageBati + "  ans et son DPE est classé " + classEnergie + " il est de type " + type);
        System.out.println("le batiment " +  getType().getNom());
    }
}
