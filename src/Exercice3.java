import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args){
        //Exercise 3
        System.out.println("Exercise 3 : Utilisation du scanner");

        Scanner scanner = new Scanner(System.in);
        System.out.println("le nom de la montagne : ");
        String nomDeLaMontagne = scanner.next();

        System.out.println(" La Hauteur du  "+ nomDeLaMontagne + ": ");
        int hauteurDeLaMontagne = scanner.nextInt();

        System.out.println("Le " + nomDeLaMontagne + " culminate a " + hauteurDeLaMontagne + " metres." );

        scanner.close();

    }
}
