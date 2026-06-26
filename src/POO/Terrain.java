// SECTION 7 : Présensation de la POO
package POO;
// classe terrain qui définit un terrain
public class Terrain {
    // définition des attributs de la classe pour réprésenter ce qu'est un terrain
    int largeur;
    int longueur;

    Terrain() {
        largeur = 0;
        longueur = 0;
    }

    Terrain(int paramLargeur, int paramLongueur) {
        largeur = paramLargeur;
        longueur = paramLongueur;
    }

    // définir le comportement du terrain ce qu'il sait faire,
    // définir une methode
    int superficie() {
        int laSuperficieTerrain = largeur * longueur;
        return laSuperficieTerrain;
    }

    void afficher() {
        System.out.println("Terrain de taille : " + largeur + " x  " + longueur + superficie() + "m²");
    }

    boolean taillePlusque(int valeur) {
        if (superficie() > valeur) {
            return true;
        } else {
            return false;
        }
    }

}
