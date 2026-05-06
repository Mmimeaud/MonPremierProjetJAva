package lesStructures;

public class For {
    public static void main(String[] args) {
// exercice 12 Boucle for + if
        // Initialisation de la valeur max à 0
        int valeurMax = 0;
        // Initialisation de la valeur min à 99
        int valeurMin = 99 ;

        for (int i = 1; i < 11; i++) {

            double valeur = Math.random();
            int resulat = (int) (valeur * 100);
            // Raccourci corrigé : int valeur = (int) (Math.random() * 100):
            System.out.println("Le tirage numero " + i + " est " + resulat);

            if(resulat > valeurMax){
                valeurMax = resulat;
                System.out.println("Mise a jour de la valeur Max" + resulat);
            }

            if(resulat < valeurMin){
                valeurMin = resulat;
                System.out.println("Mise a jour de la valeur min" + resulat);
            }

        }
        System.out.println("Le plus grand nombre est "  + valeurMax );
        System.out.println("Le plus petit nombre est" + valeurMin);
    }
}
