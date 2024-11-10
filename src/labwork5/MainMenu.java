package labwork5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private boolean exit = false;

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("\nГлавное меню программы:");
            System.out.println("1. Выполнить расчет");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("4. Демонстрация полиморфизма");
            System.out.println("5. Выход");
            System.out.print("Выберите опцию: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    Calculator calculator = new Operations();
                    calculator.performCalculation();
                    break;
                case "2":
                    Info.showProgramInfo();
                    break;
                case "3":
                    Info.showDeveloperInfo();
                    break;
                case "4":
                    demonstratePolymorphism(scanner);
                    break;
                case "5":
                    exit = true;
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Неправильный ввод. Пожалуйста, выберите правильную опцию.");
                    break;
            }
        }
        scanner.close();
    }

    private void demonstratePolymorphism(Scanner scanner) {
        List<Calculator> calculators = new ArrayList<>();
        String continueInput = ""; // Initialize continueInput with an empty string

        do {
            Operations calc = new Operations(); // Directly use Operations
            System.out.print("Введите первое число: ");
            calc.param1 = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Введите второе число: ");
            calc.param2 = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.println("Выберите операцию: add, subtract, multiply, divide, modulus");
            String operation = scanner.nextLine();

            double result;
            switch (operation) {
                case "add":
                    result = calc.add();
                    break;
                case "subtract":
                    result = calc.subtract();
                    break;
                case "multiply":
                    result = calc.multiply();
                    break;
                case "divide":
                    result = calc.divide();
                    break;
                case "modulus":
                    result = calc.modulus();
                    break;
                default:
                    System.out.println("Неправильный ввод. Пожалуйста, выберите правильную опцию.");
                    continue;
            }
            System.out.println("Результат: " + result);
            calculators.add(calc);

            System.out.print("Хотите ввести еще одну операцию? (да/нет): ");
            continueInput = scanner.nextLine();
        } while (continueInput.equalsIgnoreCase("да"));
    }

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.displayMainMenu();
    }
}