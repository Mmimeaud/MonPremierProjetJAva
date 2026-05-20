package LesTableaux;

import java.util.Arrays;
import java.util.Scanner;

public class tableauEtMethode {
    // ¨POur que toutes les méthodes puisse acceder a mon scanner le déclarer en static
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // Créer un tableau de note à partir de données choisi.
        System.out.println( "Le nombre de notes ? ");
        int nbrNote = scanner.nextInt();

        int[] tblNote = new int[nbrNote];

        for (int i = 0; i < nbrNote; i++) {
            // Je récupère direct le return de ma méthode dans ma variable note
            int note = saisirNote("Saisir la note de l'élève ? ");

            // Remplacer par la methode saisirNote
            //System.out.println(("Saisir la note de l'élève ? "));
            // int note =  scanner.nextInt();

            tblNote[i] = note ;
        }

        // Remplacer par la méthode calculEntier
     /*   int total =  0;
       for (int i = 0; i < nbrNote; i++) {
           total += tblNote[i];
        }*/
      //  System.out.println(" le total des " + nbrNote + " notes est de " + total);


        // Calculer la moyenne et la somme du tableau
        // Remplacer par la méthode moyenne ou calculEntier
       /* double moyenne = 0;
        moyenne = (double)total / nbrNote;
        System.out.println(" la moyenne est de " + moyenne);*/

        // en utilisant la methode :
        //double notemoyenne = moyenne(total,nbrNote);
        double notemoyenne = calculEntier(tblNote);

        // afficher les textes en fonctions de la moyenne
        if (notemoyenne > 15){
            System.out.println("Félicitation");
        } else if (notemoyenne > 10 && notemoyenne < 15) {
            System.out.println("Continue comme ca !! ");

        } else {
            System.out.println("Ca demande encore du travail  ");
    }

        afficherTableau(tblNote);
        //main est le point d'entrée et de sortie de ton programme donc ici on ferme le scanner
        scanner.close();

    }

    // déclaration des méthodes
    // Méthode pour afficher le tableau de note
    static void afficherTableau(int[] leTableau) {
          System.out.println( "le Tableau de note" + Arrays.toString(leTableau));

    }

    // Methode pour demander la saisie d'une note '
    static int saisirNote(String message){
        System.out.println(message);
        int maNote = scanner.nextInt();
        return maNote;
    }

    // Methode pour calculer une moyenne à partir de deux infos
    static double moyenne (int total, int nbrNote){
       double noteMoyen = (double)total / nbrNote;
        System.out.println(" la moyenne est de " + noteMoyen);
        return noteMoyen;
    }
    // Idem mais en utilisant seulement le tableau de note
    static double calculEntier(int[] tblnote ){
        int total = 0;
        for (int i = 0; i < tblnote.length; i++) {
            total += tblnote[i];
        }
        double calcul = (double)total / tblnote.length;
        System.out.println(" le total des " + tblnote.length + " notes est de " + total);
        System.out.println(" la moyenne est de " + calcul);
        return calcul;


    }

}
