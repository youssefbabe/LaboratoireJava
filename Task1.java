package labwork3;

public class Task1 {

        public static void afficherElementsAlternes(int[] array) {
            int i = 0; // début
            int j = array.length - 1; // fin

            while (i <= j) {
                System.out.print(array[i] + " ");  // afficher l'élément à gauche
                if (i != j) {
                    System.out.print(array[j] + " ");  // afficher l'élément à droite
                }
                i++;
                j--;
            }
        }

        public static void main(String[] args) {
            int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
            afficherElementsAlternes(A);
        }
    }


