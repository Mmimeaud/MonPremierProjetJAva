package lesStructure;

import java.util.Scanner;

public class conditionnelle {

public static void main(String[] args){

    // Exercice 8  les condition avec if
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nom de la montagne 1 ");
    String montagne = scanner.next();

    System.out.print("Hauteur de " + montagne + " est ");
    int hauteurMontagne = scanner.nextInt();

    System.out.print("Nom de la montagne 2 ");
    String montagne2 = scanner.next();

    System.out.print("Hauteur de " + montagne2 + " est ");


    int hauteurMontagne2 = scanner.nextInt();

    if (hauteurMontagne > hauteurMontagne2){
        System.out.println(" La montagne "  + montagne + " est plus grande que " + montagne2) ;
    }
    if (hauteurMontagne < hauteurMontagne2){
        System.out.println(" La montagne "  + montagne + " est plus petite que " + montagne2) ;
    }

    if (hauteurMontagne == hauteurMontagne2){
        System.out.println(" La montagne "  + montagne + " est plus petite que " + montagne2) ;
    }



    // Execice 9 if else :
    Scanner scanner = new Scanner(System.in);
  // Montagne 1
    System.out.print("Nom de la montagne 1 ");
    String montagne = scanner.next();
    System.out.print("Hauteur de " + montagne + " est ");
    int hauteurMontagne = scanner.nextInt();
// Montagne 2
    System.out.print("Nom de la montagne 2 ");
    String montagne2 = scanner.next();
    System.out.print("Hauteur de " + montagne2 + " est ");
    int hauteurMontagne2 = scanner.nextInt();

// Montagne 3
    System.out.print("Nom de la montagne 3 ");
    String montagne3 = scanner.next();
    System.out.print("Hauteur de " + montagne3 + " est ");
    int hauteurMontagne3 = scanner.nextInt();


    if(hauteurMontagne > hauteurMontagne2 && hauteurMontagne > hauteurMontagne3) {
        System.out.println("La montagne 1 est la plus grande ");
        }else {
           if(hauteurMontagne2 > hauteurMontagne3){
               System.out.println("La montagne 2 est la plus grande ");
           }else {
               System.out.println("La montagne 3 est la plus grande ");

        }
    }

// Exercice 10 else if
    if(hauteurMontagne > hauteurMontagne2 && hauteurMontagne > hauteurMontagne3) {
        System.out.println("La montagne 1 est la plus grande ");
    }else if(hauteurMontagne2 > hauteurMontagne3){

            System.out.println("La montagne 2 est la plus grande ");
        }else {
            System.out.println("La montagne 3 est la plus grande ");

        }
    scanner.close();
    }
}



