package lesStructure;

import java.util.Scanner;

public class Switch {

    public static void main (String[] args){
        // Exercice 11 : Switch
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Le nom de la Montagne ? ");
        String montagne = scanner.nextLine();

        System.out.print("La hauteur de" + montagne + " ? " );
        int hauteur = scanner.nextInt();

        int valeur = hauteur/1000;
        switch (valeur) {
            case 0 :
                System.out.println(" Le " + montagne + " culmine entre 0 et 999 mètres ");
                break;
            case 1 :
                System.out.println(" Le " + montagne + " culmine entre 1000 et 1999 mètres ");
                break;
            case 2 :
                System.out.println(" Le " + montagne + " culmine entre 2000 et 2999 mètres ");
            case 3 :
                System.out.println(" Le " + montagne + " culmine entre 3000 et 3999 mètres ");
            case 4 :
                System.out.println(" Le " + montagne + " culmine entre 4000 et 4999 mètres ");
                break;
            case 5:
                System.out.println(" Le " + montagne + " culmine a plus de 5000 mèrtes ");
                break;
        }
                scanner.close();



    }
}
