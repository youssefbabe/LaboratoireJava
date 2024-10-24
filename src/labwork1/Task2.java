package labwork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Input!
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите значение X (от -0.5 до 0.5):");
        double x = scanner.nextDouble();

        if (x >= -0.5 && x <= 0.5) {
            double arcCos = Math.acos(x);
            double arcSin = Math.asin(2 * x);
            double arctan = Math.atan(3 * x);
//        Calcul Y
            double y = arcCos + arcSin + arctan;
//        the result:
            System.out.println("Y =" + y + "Радиан.");

        } else {
            System.out.println("Значение x находится вне допустимых границ (-0,5 до 0,5)! ;(");
        }
        scanner.close();

    }
}
