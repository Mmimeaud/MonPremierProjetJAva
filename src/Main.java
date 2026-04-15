import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        // 10/04/2026 Exercise 1
        System.out.println("Exercise 1 : Les string ");
        String montagne = "Everest";
        int hauteur = 1500;

        System.out.println("La hauteur du mont " + montagne + " est de " + hauteur + " mètres.");

        //Exercise 2
        System.out.println("Exercise 2 : la permutation de valeur ");
        String montagne1 = "Everest";
        String montagne2 = "Mont Blanc";
        int hauteurEverest = 6700;
        int hauteurMontBlanc = 4800;

        System.out.println("avant permutation  : ");
        System.out.println(" La hauteur du mont " + montagne1 + " est de " + hauteurMontBlanc + " mètres.");
        System.out.println(" La hauteur du mont " + montagne2 + " est de " + hauteurEverest + " mètres.");

        // Permutation
        int hauteurASauvegarder = hauteurEverest;
        hauteurEverest = hauteurMontBlanc;
        hauteurMontBlanc = hauteurASauvegarder;


        System.out.println("apres permutation  : ");
        System.out.println(" La hauteur du mont " + montagne1 + " est de " + hauteurMontBlanc + " mètres.");
        System.out.println(" La hauteur du mont " + montagne2 + " est de " + hauteurEverest + " mètres.");

    }
}
