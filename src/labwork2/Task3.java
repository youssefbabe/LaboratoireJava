package labwork2;
import java.util.Scanner;
public class Task3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // saisir un nombre entier N
            System.out.print("Введите целое число N (> 0): ");
            int N = scanner.nextInt();

            // Initiai..
            int sum = 0;
            int count = 0;

            // Boucle pour calculer la somme et le nombre de chiffres
            while (N > 0) {
                int digit = N % 10;
                sum += digit;
                count++;
                N /= 10;
            }

            // Affiche les résultats
            System.out.println("Количество цифр: " + count);
            System.out.println("Сумма цифр: " + sum);
        }


}
