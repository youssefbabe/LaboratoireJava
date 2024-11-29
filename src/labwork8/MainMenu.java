// -*- coding: utf-8 -*-
package labwork8;

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
            System.out.println("5. Показ��ть обобщенные методы");
            System.out.println("6. Показать обобщенные классы");
            System.out.println("7. Выход");
            System.out.print("Выберите опцию: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    Calculator calculator = new Operations();
                    calculator.performCalculation();
                    break;
                case "2":
                    showProgramInfo();
                    break;
                case "3":
                    showDeveloperInfo();
                    break;
                case "4":
                    demonstratePolymorphism(scanner);
                    break;
                case "5":
                    demonstrateGenericMethods();
                    break;
                case "6":
                    demonstrateGenericClass();
                    break;
                case "7":
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
            try {
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
            } catch (InvalidOperationException | ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

            System.out.print("Хотите ввести еще одну операцию? (да/нет): ");
            continueInput = scanner.nextLine();
        } while (continueInput.equalsIgnoreCase("да"));
    }

    private void demonstrateGenericMethods() {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("A", "B", "C");

        System.out.println("Integer List:");
        GenericMethods.printArray(intList);

        System.out.println("String List:");
        GenericMethods.printArray(strList);
    }

    private void demonstrateGenericClass() {
        GenericClass<Integer> intObj = new GenericClass<>(10);
        System.out.println("Integer Value: " + intObj.getValue());

        GenericClass<String> strObj = new GenericClass<>("Hello");
        System.out.println("String Value: " + strObj.getValue());
    }

    private void showProgramInfo() {
        System.out.println("Эта программа помогает выполнять основные арифметические операции между двумя числами: " +
                "- Сложение\n" +
                "- Умножение\n" +
                "- Вычитание\n" +
                "- Деление\n" +
                "Кроме того, программа предоставляет информацию о себе и о разработчике.");
    }

    private void showDeveloperInfo() {
        System.out.println("Разработчик: Меисса Юссуф.\n" +
                "Язык программирования: Java\n" +
                "Фреймворк: None\n" +
                "Мобильное приложение: None\n" +
                "База данных: None");
    }

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.displayMainMenu();
    }
}