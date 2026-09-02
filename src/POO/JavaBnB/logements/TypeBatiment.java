package POO.JavaBnB.logements;

public enum TypeBatiment {
  HABITATION("Habitation"), IMMEUBLE("Immeuble"), COMMERCE("Commerce") ;

  private final String nom;

  private TypeBatiment(String pNom){
      nom = pNom;
  }

    public String getNom() {
        return nom;
    }
}
