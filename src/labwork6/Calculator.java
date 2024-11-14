package labwork6;

import java.util.Scanner;

public class Calculator {
    protected double result;
    protected double param1;
    protected double param2;
    private boolean exit = false;

    public double calculate() {
        // Default implementation, can be overridden
        return result;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "result=" + result +
                ", param1=" + param1 +
                ", param2=" + param2 +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Calculator that = (Calculator) obj;
        return Double.compare(that.result, result) == 0 &&
                Double.compare(that.param1, param1) == 0 &&
                Double.compare(that.param2, param2) == 0;
    }

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

            try {
                switch (option) {
                    case "1":
                        System.out.println("Сумма: " + ((Operations) this).add());
                        break;
                    case "2":
                        System.out.println("Разница: " + ((Operations) this).subtract());
                        break;
                    case "3":
                        System.out.println("Произведение: " + ((Operations) this).multiply());
                        break;
                    case "4":
                        try {
                            System.out.println("Частное: " + ((Operations) this).divide());
                        } catch (ArithmeticException e) {
                            System.out.println("Ошибка: деление на ноль невозможно.");
                        }
                        break;
                    default:
                        System.out.println("Неправильный ввод. Пожалуйста, выберите правильную опцию.");
                        break;
                }
            } catch (InvalidOperationException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        scanner.close(); // Close the scanner
    }
}