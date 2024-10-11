package labwork2;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        // la saisie utilisateur
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un entier N : ");
        int N = sc.nextInt();

        double somme = 0.0;

        // Boucle pour calculer la somme de la série
        for (int i = 1; i <= N; i++) {
            somme += 1.0 / Math.sqrt(i);
        }

        // Affichage du résultat
        System.out.println("La somme de la série est : " + somme);

        // Fermeture du scanner
        sc.close();
    }
}

