package labwork3;

public class Task2 {

        public static int compterSegmentsCroissants(int[] arr) {
            if (arr.length < 2) {
                return 0;
            }

            int count = 0;
            int i = 0;

            while (i < arr.length - 1) {
                if (arr[i] < arr[i + 1]) {
                    count++; // Nouveau segment strictement croissant trouvé
                    // Parcourir le segment croissant jusqu'à ce qu'il s'arrête
                    while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                        i++;
                    }
                }
                i++; // Passer à l'élément suivant
            }

            return count;
        }

        public static void main(String[] args) {
            int[] A = {1, 2, 2, 3, 5, 4, 6, 7, 2, 3};
            int resultat = compterSegmentsCroissants(A);
            System.out.println("Nombre de segments strictement croissants : " + resultat);
        }


}
