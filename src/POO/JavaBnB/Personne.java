/**
 * class Personne qui définit une personne
 */
package POO.JavaBnB;

public class Personne {
    /**
     * Attribut qui réprésente le prénom de l'enfant
     */
    private String prenom ;
    /**
     * Attribut qui réprésente le nom de l'enfant
     */
    private  String nom;
    /**
     * Attribut qui réprésente le age de l'enfant
     */
    private int age;

    /**
     * Constructeur des clients Personne, avec trois paramêtres
     * @param pPrenom : le prenom du client
     * @param pNom : Le nom de famille de la personne
     * @param pAge : L'âge du client
     */
    public Personne(String pPrenom, String pNom, int pAge) {
    prenom = pPrenom;
    nom = pNom;
    age = pAge;
}

    /**
     * Methode qui permet d'afficher les infos sur clients
     */
    void afficher(){
    System.out.println(nom +"  " + prenom +"   (" + age + " ans )");
}
}