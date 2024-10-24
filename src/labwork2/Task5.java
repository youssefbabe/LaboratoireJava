package labwork2;
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
        }

        // Méthode pour effectuer le calcul
        public static void performCalculation() {




                    Scanner scanner = new Scanner(System.in);
                    boolean exit = false;

                    while (!exit) {
                        // Affichage du menu
                        System.out.println("\nГлавное меню программы:");
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
                        double num1 = scanner.nextDouble();
                        System.out.print("Введите второе число: ");
                        double num2 = scanner.nextDouble();
                        scanner.nextLine(); // Pour capturer le saut de ligne après l'entrée des nombres

                        // Effectuer le calcul selon l'option choisie
                        switch (option) {
                            case "1":
                                System.out.println("Сумма: " + (num1 + num2));
                                break;
                            case "2":
                                System.out.println("Разница: " + (num1 - num2));
                                break;
                            case "3":
                                System.out.println("Произведение: " + (num1 * num2));
                                break;
                            case "4":
                                if (num2 != 0) {
                                    System.out.println("Частное: " + (num1 / num2));
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

        // Метод для отображения информации о программе
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
                    "Язык программирования: PHP\n" +
                    "Фреймворк: Laravel\n" +
                    "Мобильное приложение: Flutter\n" +
                    "База данных: MySQL");
        }



}
