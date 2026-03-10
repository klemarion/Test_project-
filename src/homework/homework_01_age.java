package homework;
import java.util.Scanner;


public class homework_01_age {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть вік:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Доступ дозволено.");
        } else {
            System.out.println("Доступ заборонено.");
        }

    }
}