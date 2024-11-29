package labwork9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public abstract class Calculator implements Cloneable {
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

    @Override
    public Calculator clone() throws CloneNotSupportedException {
        return (Calculator) super.clone();
    }

    public void performCalculation() {
        Scanner scanner = new Scanner(System.in);
        List<Double> inputs = new LinkedList<>(); // Использование LinkedList для повышения производительности при частых вставках и удалениях

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
            inputs.add(scanner.nextDouble());
            System.out.print("Введите второе число: ");
            inputs.add(scanner.nextDouble());
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