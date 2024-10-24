package labwork3;

import java.util.Scanner;
public class Task5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                // Affichage du menu
                System.out.println("\nГлавное меню программы:");
                System.out.println("1. Выполнить расчет");
                System.out.println("2. Информация о программе");
                System.out.println("3. Информация о разработчике");
                System.out.println("4. Выход");
                System.out.print("Выберите опцию: ");

                // Lecture de l'option de l'utilisateur
                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        performCalculation();
                        break;
                    case "2":
                        showProgramInfo();
                        break;
                    case "3":
                        showDeveloperInfo();
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

        // Méthode pour effectuer le calcul
        public static void performCalculation() {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            double[] results = new double[5]; // Tableau pour stocker les résultats
            double[] inputs = new double[2]; // Tableau pour stocker les entrées utilisateur

            while (!exit) {
                // Affichage du menu
                System.out.println("\nМеню расчетов:");
                System.out.println("1. Сумма");
                System.out.println("2. Разница");
                System.out.println("3. Произведение");
                System.out.println("4. Частное");
                System.out.println("5. Выход");
                System.out.print("Выберите опцию: ");

                // Lecture de l'option de l'utilisateur
                String option = scanner.nextLine();

                // Si l'utilisateur choisit de sortir du programme
                if (option.equals("5")) {
                    exit = true;
                    System.out.println("Выход из программы...");
                    continue;
                }

                // Demander à l'utilisateur d'entrer deux nombres
                System.out.print("Введите первое число: ");
                inputs[0] = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                inputs[1] = scanner.nextDouble();
                scanner.nextLine(); // Pour capturer le saut de ligne après l'entrée des nombres

                // Effectuer le calcul selon l'option choisie
                switch (option) {
                    case "1":
                        results[0] = add(inputs);
                        System.out.println("Сумма: " + results[0]);
                        break;
                    case "2":
                        results[1] = subtract(inputs);
                        System.out.println("Разница: " + results[1]);
                        break;
                    case "3":
                        results[2] = multiply(inputs);
                        System.out.println("Произведение: " + results[2]);
                        break;
                    case "4":
                        if (inputs[1] != 0) {
                            results[3] = divide(inputs);
                            System.out.println("Частное: " + results[3]);
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

        // Méthodes pour effectuer des opérations
        public static double add(double[] inputs) {
            return inputs[0] + inputs[1];
        }

        public static double subtract(double[] inputs) {
            return inputs[0] - inputs[1];
        }

        public static double multiply(double[] inputs) {
            return inputs[0] * inputs[1];
        }

        public static double divide(double[] inputs) {
            return inputs[0] / inputs[1];
        }

        // Méthode pour afficher des informations sur le programme
        public static void showProgramInfo() {
            System.out.println("Эта программа помогает выполнять основные арифметические операции между двумя числами: " +
                    "- Сложение\n" +
                    "- Умножение\n" +
                    "- Вычитание\n" +
                    "- Деление\n" +
                    "Кроме того, программа предоставляет информацию о себе и о разработчике.");
        }

        // Méthode pour afficher des informations sur le développeur
        public static void showDeveloperInfo() {
            System.out.println("Разработчик: Меисса Юссуф.\n" +
                    "Язык программирования: Java\n" +
                    "Фреймворк: None\n" +
                    "Мобильное приложение: None\n" +
                    "База данных: None");
        }


}
