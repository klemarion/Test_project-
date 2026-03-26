package homeworks;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть перше число: ");
            double a = scanner.nextDouble();

            System.out.print("Введіть операцію (+, -, *, /): ");
            String operation = scanner.next();

            System.out.print("Введіть друге число: ");
            double b = scanner.nextDouble();
            a
            double result;

            switch (operation) {
                case "+":
                    result = a + b;
                    System.out.println("Результат: " + result);
                    break;
                case "-":
                    result = a - b;
                    System.out.println("Результат: " + result);
                    break;
                case "*":
                    result = a * b;
                    System.out.println("Результат: " + result);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("На нуль ділити не можна");
                    } else {
                        result = a / b;
                        System.out.println("Результат: " + result);
                    }
                    break;
                default:
                    System.out.println("Невірна операція");
            }

        } catch (Exception e) {
            System.out.println("Помилка: потрібно ввести число");
        }
    }
}
