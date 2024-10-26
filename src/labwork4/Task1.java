package labwork4;

public class Task1 {
    private double[][] matrix; // Tableau bidimensionnel pour stocker les éléments de la matrice

    // Constructeur qui initialise la matrice
    public Task1(double[][] matrix) {
        this.matrix = matrix;
    }

    // Méthode pour obtenir le nombre d'éléments dans la matrice
    public int getElementCount() {
        int count = 0;
        for (double[] row : matrix) {
            count += row.length; // Ajoute le nombre d'éléments de chaque ligne
        }
        return count;
    }

    // Méthode pour calculer la somme de tous les éléments de la matrice
    public double getSum() {
        double sum = 0;
        for (double[] row : matrix) {
            for (double value : row) {
                sum += value; // Ajoute chaque valeur à la somme totale
            }
        }
        return sum;
    }

    // Méthode pour multiplier la matrice par un nombre
    public void multiplyByNumber(double number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= number; // Multiplie chaque élément par le nombre
            }
        }
    }

    // Méthode pour ajouter un nombre à tous les éléments de la matrice
    public void addNumber(double number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += number; // Ajoute le nombre à chaque élément
            }
        }
    }

    // Méthode pour afficher la matrice
    public void printMatrix() {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " "); // Affiche chaque valeur
            }
            System.out.println(); // Nouvelle ligne après chaque ligne de la matrice
        }
    }

    // Méthode principale pour démontrer le fonctionnement de la classe
    public static void main(String[] args) {
        double[][] data = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        Task1 matrix = new Task1(data);

        // Affichage de la matrice
        System.out.println("Matrice initiale :");
        matrix.printMatrix();

        // Nombre d'éléments dans la matrice
        System.out.println("Nombre d'éléments : " + matrix.getElementCount());

        // Somme de tous les éléments
        System.out.println("Somme de tous les éléments : " + matrix.getSum());

        // Multiplier la matrice par 2
        matrix.multiplyByNumber(2);
        System.out.println("Matrice après multiplication par 2 :");
        matrix.printMatrix();

        // Ajouter 3 à tous les éléments
        matrix.addNumber(3);
        System.out.println("Matrice après ajout de 3 :");
        matrix.printMatrix();
    }
}
