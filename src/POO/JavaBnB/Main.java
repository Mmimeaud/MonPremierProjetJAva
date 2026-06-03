package POO.JavaBnB;

public class Main {
    public static void main(String[] args) {

        Personne client1;
        Personne client2;
        Personne client3;

        client1 = new Personne("marjorie", "Mimeaud", 35);
        client2 = new Personne("charles", "Martell", 45);
        client3 = new Personne("Edith", "Piaf", 50);

        client1.afficher();
        client2.afficher();
        client3.afficher();
    }
    }

