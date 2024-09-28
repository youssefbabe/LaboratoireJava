package labwork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Input!
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите 3 числа!");
        System.out.println("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();
        System.out.println("Введите третье число: ");
        double z = scanner.nextDouble();

        if ((x > y && y > z )||(z > y && y > x )){
            System.out.println("Среднее число:;" +y);
        } else if ((x > z && z > y)||(y > z && z > x)) {
            System.out.println("Среднее число:" + z);
        } else if( (z > x && x > y)||(y > x && x > z)) {
            System.out.println("Среднее число:" + x);
        } else if (x == y || x == z || y == z) {
            System.out.println("Числа не должны быть равны.! ");
        }else {
            System.out.println("Произошла ошибка");
        }
        scanner.close();

    }
}
