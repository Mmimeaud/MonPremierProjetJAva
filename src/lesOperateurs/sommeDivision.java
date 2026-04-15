package lesOperateurs;

import java.util.Scanner;

public class sommeDivision {

    public static void main(String[] args){
 // Exemple
       // int monPremierEntier = 42;
       // int monDeuxiemeEntier = 26;

       // La règle :
        // int + int => int
       // double / double =>  double
       // double / int => double

   // Exercice 1 : Somme et division

    String premiereMontagne = "Mont-Blanc";
    double hauteurMontagne = 4809;
    String deuxiemeMOntagne = "Mont-Ventoux";
    double hauteurMontVentoux = 1910;



    double sommeMontagne = hauteurMontagne + hauteurMontVentoux;
    double moyenneMontagne = sommeMontagne / 2;

    System.out.println("Nom de la première Montagne : " + premiereMontagne);
    System.out.println("Hauteur du Mont Blanc : " + hauteurMontagne);
    System.out.println("Nom de la deuxime Montagne : " + deuxiemeMOntagne);
    System.out.println("Hauteur du Mont Ventoux : " + hauteurMontVentoux);
    System.out.println("A elles deux, les deux montagne font  : " + sommeMontagne);
    System.out.println("La moyenne des deux montagne est de  : " + moyenneMontagne);


    // exercice 2 en utilisant le scanner et le transtypage
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nom de la première montagne : ");
        String nomMontagne1 = scanner.nextLine();

        System.out.print("Hauteur de la première montagne : ");
        int hauteurMontagne1 = scanner.nextInt();
        // Tjrs Nettoyé le scanner apres nextInt()
        scanner.nextLine();

        System.out.print("Nom de la deuxième montagne : ");
        String nomMontagne2 = scanner.nextLine();

        System.out.print("Hauteur de la deuxieme montagne : ");
        int hauteurMontagne2 = scanner.nextInt();
        scanner.nextLine();

        int sommeMontagne2 = hauteurMontagne1 + hauteurMontagne2;
        System.out.println("A elles deux, les deux montagne font  : " + sommeMontagne2);

        // Opération de transtypage pour changer une variable typée int en double
        double moyenne = (double)sommeMontagne2 / 2;
        System.out.println("La moyenne des deux montagne est de  : " + moyenne);


    scanner.close();
    }
}
