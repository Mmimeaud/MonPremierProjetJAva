package lesOperateurs;

import java.util.Scanner;

public class operateur

 {public static void main(String[] args){

     // Exercice 5 : oprateur relationnels

     Scanner scanner = new Scanner(System.in);
     System.out.print("Nom de la montagne");
     String montagne = scanner.next();

     System.out.print("Hauteur de la montagne ");
     int hauteurMontagne = scanner.nextInt();

     int valeurReference = 3000;
     boolean hauteur = hauteurMontagne >= valeurReference;
     System.out.println("La hauteur de " + montagne + " est elle plus grande que " + valeurReference + " metres ? ");
     System.out.println(hauteur);
     scanner.close();

     // Racourci
     System.out.println("La hauteur de " + montagne + " dépasse les 3000 mètres ?  " + (hauteurMontagne >= 3000));

     // Exercice 6 : Opérateur de logique :  && et //

    System.out.println("La Hauteur de la montagne " + montagne + " se situe entre 3000 et 4000 mètres ? ");
    boolean supA3000 = hauteurMontagne >= 3000;
    boolean infA4000 = hauteurMontagne <= 4000;
    boolean moyenne = supA3000 && infA4000;

    // Racourci :
     boolean entre3000et4000 = hauteurMontagne > 3000 && hauteurMontagne < 4000;
     System.out.println(moyenne);
 }
}
