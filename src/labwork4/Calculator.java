package labwork4;

import java.util.Scanner;

public class Calculator {
    private boolean exit = false;

    public void performCalculation() {
        Scanner scanner = new Scanner(System.in);
        double[] inputs = new double[2]; // Stocke les valeurs utilisateur

        while (!exit) {
            System.out.println("\nМеню расчетов:");
            System.out.println("1. Сумма");
            System.out.println("2. Разница");
            System.out.println("3. Произведение");
            System.out.println("4. Частное");
            System.out.println("5. Выход");
            System.out.print("Выберите опцию: ");
            String option = scanner.nextLine();

            if (option.equals("5")) {
                exit = true;
                System.out.println("Выход из программы...");
                continue;
            }

            System.out.print("Введите первое число: ");
            inputs[0] = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            inputs[1] = scanner.nextDouble();
            scanner.nextLine(); // Pour éviter les erreurs de lecture

            switch (option) {
                case "1":
                    System.out.println("Сумма: " + Operations.add(inputs));
                    break;
                case "2":
                    System.out.println("Разница: " + Operations.subtract(inputs));
                    break;
                case "3":
                    System.out.println("Произведение: " + Operations.multiply(inputs));
                    break;
                case "4":
                    if (inputs[1] != 0) {
                        System.out.println("Частное: " + Operations.divide(inputs));
                    } else {
                        System.out.println("Ошибка: деление на ноль невозможно.");
                    }
                    break;
                default:
                    System.out.println("Неправильный ввод. Пожалуйста, выберите правильную опцию.");
                    break;
            }
        }
    }
}
