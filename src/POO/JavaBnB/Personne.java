package POO.JavaBnB;

public class Personne {

private String prenom ;
private  String nom;
private int age;


public Personne(String pPrenom, String pNom, int pAge) {
    prenom = pPrenom;
    nom = pNom;
    age = pAge;

}

void afficher(){
    System.out.println(nom +"  " + prenom +"   (" + age + " ans )");
}


}