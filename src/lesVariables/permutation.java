package lesVariables;

public class permutation {

    public static void main(String[] args){


        //Exercise 2 : Permuter des valeurs sans changer les affectation des variables
        System.out.println("Exercise 2 : la permutation de valeur ");
        String montagne1 = "Everest";
        String montagne2 = "Mont Blanc";
        int hauteurEverest = 6700;
        int hauteurMontBlanc = 4800;

        System.out.println("avant permutation  : ");
        System.out.println(" La hauteur du mont " + montagne1 + " est de " + hauteurMontBlanc + " mètres.");
        System.out.println(" La hauteur du mont " + montagne2 + " est de " + hauteurEverest + " mètres.");

        // Permutation =>
        int hauteurASauvegarder = hauteurEverest;
        hauteurEverest = hauteurMontBlanc;
        hauteurMontBlanc = hauteurASauvegarder;


        System.out.println("apres permutation  : ");
        System.out.println(" La hauteur du mont " + montagne1 + " est de " + hauteurMontBlanc + " mètres.");
        System.out.println(" La hauteur du mont " + montagne2 + " est de " + hauteurEverest + " mètres.");
    }
}
