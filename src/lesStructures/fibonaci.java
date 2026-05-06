package lesStructures;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Suite de Fibonaci ");

        // Exercice 1  Afficher le rang de Fibonaci
      /*  int fibo0 = 0;
        int fibo1 = 1;
        System.out.println("Rang 0 est " + fibo0 + " rang1 est  " + fibo1);
        // Regle de calcul :  int fiboN = fiboN-1 + fiboN-2;
        // Je commence par calculer Fibo2, j'initialise les variable
        // fibo2 = fibo0 + fibo1;

        int fiboN1 = fibo1;
        int fiboN2 = fibo0;

        for (int n = 2; n <= 10 ; n++) {
            int fiboN = fiboN1 + fiboN2;
            System.out.println(fiboN + " ");
            fiboN1 = fiboN;
            fiboN2 = fiboN1;

        }*/

        // Exercice 2  Utilisateur choisi son rang :

        int fibo0 = 0;
        int fibo1 = 1;

        System.out.println(" Quel rang voulez vous ?  ");
        int rang = scanner.nextInt();

        int fiboN1 = fibo1;
        int fiboN2 = fibo0;
        int fiboN = -1;

        for (int n = 2; n <= rang ; n++) {
            fiboN = fiboN1 + fiboN2;
            fiboN1 = fiboN;
            fiboN2 = fiboN1;

        }

        System.out.println("\nFibo au rang " + rang + " est de " + fiboN  );






        scanner.close();
    }
}
