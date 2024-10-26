package labwork4;

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
            System.out.println("4. Выход");
            System.out.print("Выберите опцию: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    Calculator calculator = new Calculator();
                    calculator.performCalculation();
                    break;
                case "2"://Notons que la classe Info ne contient que des variable statique,, pour cela pas obligatoire de faire une instance de la classe
                    Info.showProgramInfo();
                    break;
                case "3":
                    Info.showDeveloperInfo();
                    break;
                case "4":
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

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.displayMainMenu();
    }
}

