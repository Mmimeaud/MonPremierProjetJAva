package lesStructure;

import java.util.Scanner;

public class While {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Ici il est necessaire d'initialiser une valeur pour que la boucle se lance
        // car Le code s'exécute seulement si la condition est vraie dès le départ donc il nous faut une valeur qui
        // "lance" la boucle .
      /*  int valeur = -1;

        while( valeur < 0 || valeur > 10){
            System.out.println("Saisir ton entier ? ");
            valeur = scanner.nextInt();
        }

        System.out.println("Ton entier est compris entre 0 et 10 c'est " + valeur);


        // deuxième cas avec Do ..... while ou on a pas besoin d'initialiser une valeur de base
        // le Do permet d'exécuter le code  au moins une fois, PUIS vérifie la condition.
        do {
            System.out.println("Saisir ton entier ? ");
            valeur = scanner.nextInt();
        }while ( valeur < 0 || valeur > 10);
        System.out.println("Ton entier est compris entre 0 et 10 c'est " + valeur);*/

        // exercice 13 While
/*
        int nbreMystere = (int) (Math.random() * 100 );
        System.out.println("Le nombre mystere est " + nbreMystere);

        boolean trouve = false;
        int compteur = 0;

         while (!trouve){
             System.out.println("Saisir un entier :  ");
             int monNombre = scanner.nextInt();
             compteur ++;

             int distance ;
             if (monNombre > nbreMystere) {
                 distance = monNombre - nbreMystere;
             } else {
                 distance = nbreMystere - monNombre;
             }

            if(distance > 20 ){
                System.out.println("c'est froid ");
            }else if (distance > 5 ){
                System.out.println("c'est tiéde");
            }else if (distance > 0 ){
                    System.out.println("c'est chaud ");
                }else {
                System.out.println("C'est gagné en " + compteur + " tentatives");
                trouve = true;
            }




    }*/
         // Exercice 14 Do ... While
        System.out.println("Saisir un nombre entre 0-50 : ");
        int nbreDevine = scanner.nextInt();
        int compteur =  0 ;
        int nbreOrdi ;

        int tentativeMax = 0;
        int tentativeMin = 99 ;

        do {
            nbreOrdi = (int) (Math.random() * (tentativeMax - tentativeMin + 1) + tentativeMin);
            System.out.println("L'ordinateur tente  " + nbreOrdi);
            compteur ++;
            if(nbreOrdi == nbreDevine ){
                System.out.println("L'ordinateur a gagné en " + compteur +  " tentatives ");

            } else if (nbreOrdi < nbreDevine) {
                System.out.println("C'est trop petit  ");
                tentativeMin = nbreOrdi;
            }else {
                System.out.println("C'est trop grand "); }
                tentativeMax = nbreOrdi;
        } while(nbreDevine != nbreOrdi);








       scanner.close();
    }}

