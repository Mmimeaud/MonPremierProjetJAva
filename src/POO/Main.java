package POO;

public class Main {
    public static void main(String[] args){
       // 1 => déclaration des objets de type Terrain
        Terrain monTerrain1;
       Terrain monTerrain2;

       // 2=> Initialisation des objets via le constructeur
        monTerrain2 = new Terrain(45,15);
        monTerrain1 =new Terrain();

        // initialisation des attributs
        // utilisation constructeur simple
        monTerrain1.longueur = 8;
        monTerrain1.largeur = 12;

        // utilisation constructeur avec données
       // monTerrain2.longueur = 45;
       // monTerrain2.largeur = 15;

        // utilisation des méthodes
        int totalM2 = monTerrain1.superficie();
        System.out.println(" Superficie du Terrain 1  est de " + totalM2 + "m²");
        System.out.println("Superficie du terrain 2  est de " + monTerrain2.superficie() + "m²");

        if(monTerrain1.taillePlusque(400)){

        } else {
            System.out.println("Mon terrain 1  est plus petit que 400m²");
        }


    }
}
