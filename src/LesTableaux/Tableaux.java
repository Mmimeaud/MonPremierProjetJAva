package LesTableaux;

import java.util.Arrays;
import java.util.Scanner;

public class Tableaux {
    public static void main(String[] args) {

// exercice 16 Tableau dans une suite de Fibonaci :
  /*   int[] tableauFibo ;
        int rang = 20;
     tableauFibo = new int[rang];


     int fibo0 = 0;
     int fibo1 =1;

     int  fiboN = -1;

     tableauFibo[0] = fibo0;
     tableauFibo[1]= fibo1;


        for (int n = 2; n < rang  ; n++) {

            tableauFibo[n] = tableauFibo[n - 1] + tableauFibo[n -2];
            //System.out.println(Arrays.toString(tableauFibo));

        }
        System.out.println("le tableau de Fibo jusqu'au rang " + rang);
        for (int n = 0; n < rang ; n++) {
            System.out.print( tableauFibo[n] + "  " );
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println( "quel rang ? ");
        rang = scanner.nextInt();
        for (int n = 2; n < rang  ; n++) {

            tableauFibo[n] = tableauFibo[n - 1] + tableauFibo[n -2];
            //System.out.println(Arrays.toString(tableauFibo));

        }

        System.out.println("au rang" + rang  + " la réponse est " + tableauFibo[rang - 1 ]);
        scanner.close();

}}*/

    // Exercixce tableau a deux dimension

        int[][] tableau = new int[6][4];
// Remplir
        for (int ligne = 1; ligne < 5; ligne++) {
            for (int col = 1; col < 3; col++) {
                tableau[ligne][col] = ligne + col; // juste un exemple
            }
        }
// Afficher

        for (int ligne = 0; ligne < 5 ;  ligne++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(tableau[ligne][col] + " ");
            }
            System.out.println(); // retour à la ligne après chaque ligne
        }
    }}
