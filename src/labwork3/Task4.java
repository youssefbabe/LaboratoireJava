package labwork3;

public class Task4 {

        public static void main(String[] args) {
            int[][] A = {
                    { 1, 2, 3, 4, 5 },
                    { 16, 17, 18, 19, 6 },
                    { 15, 24, 25, 20, 7 },
                    { 14, 23, 22, 21, 8 },
                    { 13, 12, 11, 10, 9 }
            };

            printSpiral(A);
        }

        // Méthode pour imprimer la matrice en spirale
        public static void printSpiral(int[][] A) {
            int top = 0;
            int bottom = A.length - 1;
            int left = 0;
            int right = A[0].length - 1;

            while (top <= bottom && left <= right) {

                for (int i = left; i <= right; i++) {
                    System.out.print(A[top][i] + " ");
                }
                top++;


                for (int i = top; i <= bottom; i++) {
                    System.out.print(A[i][right] + " ");
                }
                right--;

                // Vérifier si nous avons encore des lignes à parcourir
                if (top <= bottom) {
                    // Parcourir la ligne inférieure de droite à gauche
                    for (int i = right; i >= left; i--) {
                        System.out.print(A[bottom][i] + " ");
                    }
                    bottom--; // Déplacer la limite inférieure vers le haut
                }

                // Vérifier si nous avons encore des colonnes à parcourir
                if (left <= right) {
                    // Parcourir la colonne de gauche de bas en haut
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(A[i][left] + " ");
                    }
                    left++; // Déplacer la limite gauche vers la droite
                }
            }

            // Si M est impair, afficher le centre de la matrice
            int centerRow = A.length / 2;
            int centerCol = A[0].length / 2;
            System.out.print(A[centerRow][centerCol] + " ");
        }


}
