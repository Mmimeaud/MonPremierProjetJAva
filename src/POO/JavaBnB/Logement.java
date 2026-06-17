package POO.JavaBnB;

public class Logement {
    //  Etape 1 Déclaration des attributs (de quoi est fait mon Logement)
        private String nom ;
        private int tarifParNuit ;
        private String adresse;
        private int superficie;
        private int nbVoyageursMax;

        // Etape 2 LE CONSTRUCTEUR :  j'ajoute une valeur à mes attributs : initialisation
        public Logement (String nom, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
            this.nom = nom;
            this.tarifParNuit = tarifParNuit;
            this.adresse = adresse;
            this.superficie = superficie;
            this.nbVoyageursMax = nbVoyageursMax;

        }
        // etape 3 ; je choisi de créer des méthodes getter ou setter
        public String getNom(){
            return nom;
        }

        public int getTarifParNuit(){
            return tarifParNuit;
        }

        public String getAdresse(){
            return adresse;
        }

        public int getSuperficie(){
            return superficie;
        }

        public int getNbVoyageursMax() {
            return nbVoyageursMax;
        }

        // etape 4 Methode pour dire se fait Logement, comme elles sont dans ma déclaration de class, je peux utiliser directement des attribut sans passer ar les getter
        public void afficher(){
            System.out.println(" Le logement " + nom + "est situé " + adresse);
            System.out.println("La superficie est de " + superficie);
        }
    }




