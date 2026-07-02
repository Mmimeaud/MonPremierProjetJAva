package POO.JavaBnB;

import POO.JavaBnB.logements.Batiment;
import POO.JavaBnB.logements.Logement;
import POO.JavaBnB.utilisateurs.Personne;

public class Main {
    public static void main(String[] args) {
    // TP 3 Création des clients via la class Client
        Personne client1;
        Personne client2;
        Personne client3;

        client1 = new Personne("marjorie", "Mimeaud", 35);
        client2 = new Personne("charles", "Martell", 45);
        client3 = new Personne("Edith", "Piaf", 50);

       // client1.afficher();
      //  client2.afficher();
     //   client3.afficher();

        // TP4 - creation de logement via la class Logement :
        Logement logement1;
        Logement logement2;
        Logement logement3;

        Batiment batiment1;
        Batiment batiment2;
        Batiment batiment3;

        batiment1 = new Batiment(20,"location","C");
        batiment2 = new Batiment(5,"AirBnb","B");
        batiment3 = new Batiment(10, "location", "A");


        logement1 = new Logement("Les Hirondelles", 50, "157 Boulevard de la Liberté, Lille", 70, 5,batiment1);
        logement2 = new Logement("Les Pies", 150, "39 Boulevard de Thouars, Bordeaux", 200, 15, batiment2);
        logement3 = new Logement("Les Colombes", 30, "7 rue de la chaume, Jonzac", 25, 2, batiment3);

 // utilisation du setter sur Batiment
        batiment1.SetAgeBati(17);

        logement1.afficher();
      //  logement2.afficher();
      //  logement3.afficher();


        // Utilisaton du getter
        System.out.println("Test getter " + logement3.getNom());


    }


    }

