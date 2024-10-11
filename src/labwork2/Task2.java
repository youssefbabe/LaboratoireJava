package labwork2;

import java.util.Scanner;

public class Task2 {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static double cosApproximation(double x, int n) {
        double result = 1.0;
        for (int i = 1; i <= n; i++) {
            result += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений X и N
        System.out.print("Введите значение X: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение N (> 0): ");
        int n = scanner.nextInt();

        // Вычисление приближённого значения косинуса
        double cosX = cosApproximation(x, n);

        // Вывод результата
        System.out.printf("Приближённое значение cos(%.2f) = %.5f\n", x, cosX);
    }
}
