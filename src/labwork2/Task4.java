package labwork2;

import java.util.Scanner;

public class Task4 {
    public static float checkNumber(float number) {
        if (number > 0) {
            return 1; // Retourne 1 si le nombre est positif
        } else if (number == 0) {
            return 0; // Retourne 0 si le nombre est nul
        } else {
            return -1; // Retourne -1 si le nombre est négatif
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose a number PlEase:");
        float x = sc.nextFloat();
        System.out.println("checknumber("+x+") = " + checkNumber(x));
    }
}
