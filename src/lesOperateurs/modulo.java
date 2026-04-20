package lesOperateurs;

import java.util.Scanner;

public class modulo {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in); 
    
    System.out.print("Nom de la montagne");
    String montagne = scanner.next();
    
    System.out.print("Hauteur de la montagne ");
    int hauteurMontagne = scanner.nextInt();

    scanner.close();

    System.out.println("La montagne " + montagne + " culmine a " + hauteurMontagne + " metre");

    double testEntier = (double) hauteurMontagne / 2;
    int rest = hauteurMontagne % 2;
    boolean estPaire = rest == 0;

    System.out.println("La hauteur moyenne de la montagne " + montagne + " est de " + testEntier+ " metre");
    System.out.println("La Hauteur de la montagne " + montagne + " est un chiffre paire, c'est " + estPaire);
}


}