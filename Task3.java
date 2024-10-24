package labwork3;

public class Task3 {

        public static void main(String[] args) {
            // Exemple d'utilisation
            int[] A = {1, 2, 3, 4, 5}; // Définir un tableau A
            int[] B = formateArray(A); // Appeler la méthode pour créer le tableau B

            // Afficher les éléments du tableau B
            for (int value : B) {
                System.out.print(value + " "); // Affiche chaque élément de B
            }
        }

        // Méthode statique pour créer le tableau B
        public static int[] formateArray(int[] A) {
            int N = A.length; // Obtenir la taille du tableau A
            int[] B = new int[N]; // Créer un nouveau tableau B de la même taille que A

            // Calculer la somme en partant de la fin du tableau A
            for (int k = N - 1; k >= 0; k--) { // Parcourir A de la fin vers le début
                if (k == N - 1) { // Si c'est le dernier élément
                    B[k] = A[k]; // B[k] est juste A[k]
                } else {
                    B[k] = B[k + 1] + A[k]; // B[k] est la somme de B[k + 1] et A[k]
                }
            }
            return B; // Retourner le tableau B
        }


}
