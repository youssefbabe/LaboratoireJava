package labwork1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Эта программа вычисляет площадь круга.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        if (scanner.hasNextDouble()) {


            double r = scanner.nextDouble();
            if (r < 0) {
                System.out.println("Erreur : Le rayon ne peut pas être négatif.");
                return; // Arrête l'exécution du programme
            }


            double air = Math.PI * Math.pow(r, 2);

            System.out.printf("Площадь круга с радиусом %.2f равна %.2f.%n", r, air);

            scanner.close();


        }else{
            System.out.println("Ошибка: Пожалуйста, введите корректное число.");
        }
    }

}
